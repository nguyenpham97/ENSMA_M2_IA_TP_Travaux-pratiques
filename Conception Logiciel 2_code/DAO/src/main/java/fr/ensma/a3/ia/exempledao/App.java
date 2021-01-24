package fr.ensma.a3.ia.exempledao;

import java.util.List;
import java.util.Optional;

import fr.ensma.a3.ia.exempledao.business.CarnetAdresses;
import fr.ensma.a3.ia.exempledao.business.api.ICarnetAdresses;
import fr.ensma.a3.ia.exempledao.dao.AdressePoiDAO;
import fr.ensma.a3.ia.exempledao.dao.IDao;
import fr.ensma.a3.ia.exempledao.dao.PersonnePoiDAO;
import fr.ensma.a3.ia.exempledao.dao.entity.AdresseEntity;
import fr.ensma.a3.ia.exempledao.dao.entity.PersonneEntity;

public class App
{
    public static void main( String[] args )
    {
    	
    	ICarnetAdresses carnet;
    	
    	carnet = new CarnetAdresses();
    	
    	carnet.ajouter("PHAM", "Nguyen", 32, "Pascal", "Chasseneuil", 86360);
    	System.out.println("___________________________");
    	carnet.liste();
    	System.out.println("___________________________");
    	carnet.rechercher("RICHARD", "Michael");
    	
    	
    	/*
    	// Erase
    	//IDao<AdresseEntity> adrdao = new AdressePoiDAO();
    	//adrdao.delete(adrdao.getById(3).get());
    	IDao<PersonneEntity> perdao = new PersonnePoiDAO();
    	perdao.delete(perdao.getById(3).get());
    	*/
    	
    	/*
    	IDao<AdresseEntity> adrdao = new AdressePoiDAO();
    	
    	List<AdresseEntity> alladr = adrdao.getAll();
    	for(AdresseEntity ad : alladr) {
    		System.out.println(ad);
    	}
    	
    	AdresseEntity adcherche = new AdresseEntity();
    	adcherche.setNumRue(12);
    	adcherche.setNomRue("rue toulent");
    	adcherche.setCodePostal(91000);
    	adcherche.setNomVille("JavaLand");
    	Optional<AdresseEntity> res = adrdao.getByValue(adcherche); 
    	if(res.isPresent()) {
    		System.out.println(res.get());
    	}
    	
    	Optional<AdresseEntity> res2 = adrdao.getById(1);
    	if(res2.isPresent()) {
    		System.out.println(res2.get());
    	}
    	
    	AdresseEntity adrajout = new AdresseEntity();
    	adrajout.setNumRue(10);
    	adrajout.setNomRue("toumoche");
    	adrajout.setCodePostal(97000);
    	adrajout.setNomVille("PitonVille");
    	adrdao.create(adrajout);
    	adrajout.setNomVille("PythonVille");
    	adrdao.update(adrajout);
    	adrdao.delete(adrdao.getById(3).get());
    	*/
    	
    	/*
    	//test
    	IDao<PersonneEntity> perdao = new PersonnePoiDAO();
    	AdresseEntity adrajout = new AdresseEntity();
    	adrajout.setNumRue(10);
    	adrajout.setNomRue("toumoche");
    	adrajout.setCodePostal(97000);
    	adrajout.setNomVille("PitonVille");
    	PersonneEntity perajout = new PersonneEntity();
    	perajout.setNom("PHAM");
    	perajout.setPrenom("Nguyen");
    	perajout.setAdr(adrajout);
    	
    	perdao.create(perajout);
    	*/
    	
    }
}
