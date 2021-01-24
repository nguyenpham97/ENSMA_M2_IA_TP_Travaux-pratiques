package fr.ensma.a3.ia.exempledao.business.api;

import java.util.List;
import java.util.Optional;

import fr.ensma.a3.ia.exempledao.dao.PersonnePoiDAO;
import fr.ensma.a3.ia.exempledao.dao.entity.PersonneEntity;

public interface ICarnetAdresses {
	void ajouter(final String nom, final String prenom, final int numRue, final String nomRue, 
			final String nomVille, final int CodePostal);
	
	void liste();
	
	void rechercher(final String nom, final String prenom);
}
