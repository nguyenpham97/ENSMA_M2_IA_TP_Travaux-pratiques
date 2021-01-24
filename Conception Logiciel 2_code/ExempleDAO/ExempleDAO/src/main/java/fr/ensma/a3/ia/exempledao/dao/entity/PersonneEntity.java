package fr.ensma.a3.ia.exempledao.dao.entity;

import java.util.Optional;

import fr.ensma.a3.ia.exempledao.dao.AdressePoiDAO;
import fr.ensma.a3.ia.exempledao.dao.IDao;

public class PersonneEntity {
	private int idPer;
	private String nom;
	private String prenom;
	private int idAdd;
	
	private AdresseEntity adresse = new AdresseEntity();
	
	public AdresseEntity getAdr() {
		return adresse;
	}
	
	public void setAdr(final AdresseEntity ad) {
		adresse = ad;
		// idAdd = ad.getIdAdr();
	}
	
	public final int getIdPer() {
		return idPer;
	}

	public final void setIdPer(final int id) {
		idPer = id;
	}

	public final String getNom() {
		return nom;
	}

	public final void setNom(final String n) {
		nom = n;
	}

	public final String getPrenom() {
		return prenom;
	}

	public final void setPrenom(final String pren) {
		prenom = pren;
	}

	public final int getidAdd() {
		return idAdd;
	}

	public final void setidAdd(final int idA) {
		idAdd = idA;
		/* NEW
		IDao<AdresseEntity> adrdao = new AdressePoiDAO();
		this.adresse = adrdao.getById(idA);
		*/
	}

	@Override
	public String toString() {
		IDao<AdresseEntity> adrdao = new AdressePoiDAO();
		Optional<AdresseEntity> res = adrdao.getById(idAdd);
		if(res.isPresent()) {
			return idPer + " : " + nom + " " + prenom + " - " + idAdd + " adresse: " + res.get().toString();
		}
	//this.adresse.toString()
		else {
			return "";
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof PersonneEntity)) {
			return false;
		} else {
			PersonneEntity ad = (PersonneEntity) obj;
			if ((ad.getNom().compareTo(nom) == 0)
					&& (ad.getPrenom().compareTo(prenom) == 0)) {
				return true;
			} else {
				return false;
			}
		}
	}

}
