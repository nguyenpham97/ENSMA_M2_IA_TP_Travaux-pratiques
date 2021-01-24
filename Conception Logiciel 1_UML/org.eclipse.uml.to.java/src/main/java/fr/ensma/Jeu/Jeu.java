/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package fr.ensma.Jeu;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Jeu.
 * 
 * @author Dell
 */
public class Jeu {
	/**
	 * Description of the property tours.
	 */
	public int tours = 0;

	/**
	 * Description of the property nom.
	 */
	public String nom = "";

	/**
	 * Description of the property plateaus.
	 */
	public Plateau plateaus = null;

	/**
	 * Description of the property idJeu.
	 */
	public String idJeu = "";

	/**
	 * Description of the property jeueurs.
	 */
	public HashSet<Joueur> jeueurs = new HashSet<Joueur>();

	// Start of user code (user defined attributes for Jeu)

	// End of user code

	/**
	 * The constructor.
	 */
	public Jeu() {
		// Start of user code constructor for Jeu)
		super();
		// End of user code
	}

	/**
	 * Description of the method setUP.
	 */
	public void setUP() {
		// Start of user code for method setUP
		// End of user code
	}

	/**
	 * Description of the method play.
	 */
	public void play() {
		// Start of user code for method play
		// End of user code
	}

	/**
	 * Description of the method verifierCartes.
	 */
	public void verifierCartes() {
		// Start of user code for method verifierCartes
		// End of user code
	}

	/**
	 * Description of the method verifierAmulette.
	 */
	public void verifierAmulette() {
		// Start of user code for method verifierAmulette
		// End of user code
	}

	/**
	 * Description of the method startGame.
	 */
	public void startGame() {
		// Start of user code for method startGame
		// End of user code
	}

	// Start of user code (user defined methods for Jeu)

	// End of user code
	/**
	 * Returns tours.
	 * @return tours 
	 */
	public int getTours() {
		return this.tours;
	}

	/**
	 * Sets a value to attribute tours. 
	 * @param newTours 
	 */
	public void setTours(int newTours) {
		this.tours = newTours;
	}

	/**
	 * Returns nom.
	 * @return nom 
	 */
	public String getNom() {
		return this.nom;
	}

	/**
	 * Sets a value to attribute nom. 
	 * @param newNom 
	 */
	public void setNom(String newNom) {
		this.nom = newNom;
	}

	/**
	 * Returns plateaus.
	 * @return plateaus 
	 */
	public Plateau getPlateaus() {
		return this.plateaus;
	}

	/**
	 * Sets a value to attribute plateaus. 
	 * @param newPlateaus 
	 */
	public void setPlateaus(Plateau newPlateaus) {
		if (this.plateaus != null) {
			this.plateaus.set(null);
		}
		this.plateaus.set(this);
	}

	/**
	 * Returns idJeu.
	 * @return idJeu 
	 */
	public String getIdJeu() {
		return this.idJeu;
	}

	/**
	 * Sets a value to attribute idJeu. 
	 * @param newIdJeu 
	 */
	public void setIdJeu(String newIdJeu) {
		this.idJeu = newIdJeu;
	}

	/**
	 * Returns jeueurs.
	 * @return jeueurs 
	 */
	public HashSet<Joueur> getJeueurs() {
		return this.jeueurs;
	}

}
