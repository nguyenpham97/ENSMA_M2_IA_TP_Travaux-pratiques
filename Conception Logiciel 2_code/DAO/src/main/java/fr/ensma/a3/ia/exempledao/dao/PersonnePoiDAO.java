package fr.ensma.a3.ia.exempledao.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import fr.ensma.a3.ia.exempledao.dao.entity.AdresseEntity;
import fr.ensma.a3.ia.exempledao.dao.entity.PersonneEntity;

public class PersonnePoiDAO extends AbstractPoiDAO<PersonneEntity>{

	private static Logger LOGGER = Logger.getLogger(PersonnePoiDAO.class.getName());
	
	@Override
	public Optional<PersonneEntity> getById(int id) {
		XSSFWorkbook bdd = openBase();
		Sheet tableadr = bdd.getSheet("Personnes");
		Iterator<Row> iterator = tableadr.iterator();
		iterator.next();
		boolean trouve = false;
		PersonneEntity per = null;
		while (iterator.hasNext() && !trouve) {
			Row ligne = iterator.next();
			per = new PersonneEntity();
			if (id == (int)ligne.getCell(0).getNumericCellValue()) {
				per.setIdPer((int)ligne.getCell(0).getNumericCellValue());
				per.setNom(ligne.getCell(1).getStringCellValue());
				per.setPrenom(ligne.getCell(2).getStringCellValue());
				per.setidAdd((int)ligne.getCell(3).getNumericCellValue());
				trouve = true;
			}
		}
		if (trouve) {
			return Optional.of(per);
		}
		return Optional.empty();		
	}
	
	@Override
	public Optional<PersonneEntity> getByValue(PersonneEntity elem) {
		List<PersonneEntity> listtemp = getAll();
		for (PersonneEntity ad : listtemp) {
			if (ad.equals(elem)) {
				return Optional.of(ad);
			}
		}
		return Optional.empty();
	}

	@Override
	public List<PersonneEntity> getAll() {
		XSSFWorkbook bdd = openBase();
		Sheet tableper = bdd.getSheet("Personnes");
		ArrayList<PersonneEntity> listeper = new ArrayList<PersonneEntity>();
		Iterator<Row> iterator = tableper.iterator();
		iterator.next();
		while (iterator.hasNext()) {
			Row ligne = iterator.next();
			PersonneEntity per = new PersonneEntity();
			Iterator<Cell> cellIterator = ligne.iterator();
			Cell cellule = cellIterator.next();
			per.setIdPer((int)cellule.getNumericCellValue());
			per.setNom(ligne.getCell(1).getStringCellValue());
			per.setPrenom(ligne.getCell(2).getStringCellValue());
			per.setidAdd((int)ligne.getCell(3).getNumericCellValue());
			listeper.add(per);
		}
		return listeper;
	}

	@Override
	public void create(PersonneEntity elem) {
		if (getByValue(elem).isEmpty()) {
			//NEW
			IDao<AdresseEntity> adrdao = new AdressePoiDAO();
			adrdao.create(elem.getAdr());
			
			XSSFWorkbook bdd = openBase();
			Sheet tableper = bdd.getSheet("Personnes");
			int lrow = tableper.getLastRowNum();
			int lid = (int) tableper.getRow(lrow).getCell(0).getNumericCellValue();
			elem.setIdPer(lid + 1);
			Row ligne = tableper.createRow(lrow + 1);
			Cell cell = ligne.createCell(0);
			cell.setCellValue(elem.getIdPer());
			cell = ligne.createCell(1);
			cell.setCellValue(elem.getNom());
			cell = ligne.createCell(2);
			cell.setCellValue(elem.getPrenom());
			cell = ligne.createCell(3);
			cell.setCellValue(elem.getAdr().getIdAdr());
			writeBase(bdd);
		} else {
			//TODO : Prévoir une exception ...
			LOGGER.info("Element Deja dans la base ...");
		}
	}

	@Override
	public void update(PersonneEntity elem) {
		XSSFWorkbook bdd = openBase();
		Sheet tableper = bdd.getSheet("Personnes");
		Iterator<Row> iterator = tableper.iterator();
		iterator.next();
		boolean trouve = false;
		while (iterator.hasNext() && !trouve) {
			Row ligne = iterator.next();
			if (elem.getIdPer() == (int) ligne.getCell(0).getNumericCellValue()) {
				trouve = true;
				ligne.getCell(1).setCellValue(elem.getNom());
				ligne.getCell(2).setCellValue(elem.getPrenom());
				ligne.getCell(3).setCellValue(elem.getidAdd());
				writeBase(bdd);
			}
		}
		if (!trouve) {
			//TODO : Prévoir une exception ...
			LOGGER.info("Element absent de la base ...");
		}
	}

	@Override
	public void delete(PersonneEntity elem) {
		XSSFWorkbook bdd = openBase();
		Sheet tableper = bdd.getSheet("Personnes");
		Iterator<Row> iterator = tableper.iterator();
		iterator.next();
		boolean trouve = false;
		while (iterator.hasNext() && !trouve) {
			Row ligne = iterator.next();
			if (elem.getIdPer() == (int) ligne.getCell(0).getNumericCellValue()) {
				trouve = true;
				removeRow(tableper, ligne.getRowNum());
				writeBase(bdd);
			}
		}
		if (!trouve) {
			//TODO : Prévoir une exception ...
			LOGGER.info("Element absent de la base ...");
		}
	}
}

