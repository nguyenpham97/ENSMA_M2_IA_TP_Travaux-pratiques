/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package fr.ensma.Jeu;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Plateau.
 * 
 * @author Dell
 */
public class Plateau {
	/**
	 * Description of the property largeur.
	 */
	public int largeur = 0;

	/**
	 * Description of the property nMystere.
	 */
	public int nMystere = 0;

	/**
	 * Description of the property amulettes.
	 */
	public HashSet<Amulette> amulettes = new HashSet<Amulette>();

	/**
	 * Description of the property nPairs.
	 */
	public int nPairs = 0;

	/**
	 * Description of the property pairs.
	 */
	public HashSet<Pair> pairs = new HashSet<Pair>();

	/**
	 * Description of the property hauteur.
	 */
	public int hauteur = 0;

	// Start of user code (user defined attributes for Plateau)

	// End of user code

	/**
	 * The constructor.
	 */
	public Plateau() {
		// Start of user code constructor for Plateau)
		super();
		// End of user code
	}

	/**
	 * Description of the method afficherTout.
	 * @param idJoueur 
	 */
	public void afficherTout(String idJoueur) {
		// Start of user code for method afficherTout
		// End of user code
	}

	/**
	 * Description of the method melanger.
	 */
	public void melanger() {
		// Start of user code for method melanger
		// End of user code
	}

	/**
	 * Description of the method Repositioner.
	 * @param ListPairIDgagne 
	 */
	public void Repositioner(String ListPairIDgagne) {
		// Start of user code for method Repositioner
		// End of user code
	}

	/**
	 * Description of the method RepositionerAmulette.
	 */
	public void RepositionerAmulette() {
		// Start of user code for method RepositionerAmulette
		// End of user code
	}

	// Start of user code (user defined methods for Plateau)

	// End of user code
	/**
	 * Returns largeur.
	 * @return largeur 
	 */
	public int getLargeur() {
		return this.largeur;
	}

	/**
	 * Sets a value to attribute largeur. 
	 * @param newLargeur 
	 */
	public void setLargeur(int newLargeur) {
		this.largeur = newLargeur;
	}

	/**
	 * Returns nMystere.
	 * @return nMystere 
	 */
	public int getNMystere() {
		return this.nMystere;
	}

	/**
	 * Sets a value to attribute nMystere. 
	 * @param newNMystere 
	 */
	public void setNMystere(int newNMystere) {
		this.nMystere = newNMystere;
	}

	/**
	 * Returns amulettes.
	 * @return amulettes 
	 */
	public HashSet<Amulette> getAmulettes() {
		return this.amulettes;
	}

	/**
	 * Returns nPairs.
	 * @return nPairs 
	 */
	public int getNPairs() {
		return this.nPairs;
	}

	/**
	 * Sets a value to attribute nPairs. 
	 * @param newNPairs 
	 */
	public void setNPairs(int newNPairs) {
		this.nPairs = newNPairs;
	}

	/**
	 * Returns pairs.
	 * @return pairs 
	 */
	public HashSet<Pair> getPairs() {
		return this.pairs;
	}

	/**
	 * Returns hauteur.
	 * @return hauteur 
	 */
	public int getHauteur() {
		return this.hauteur;
	}

	/**
	 * Sets a value to attribute hauteur. 
	 * @param newHauteur 
	 */
	public void setHauteur(int newHauteur) {
		this.hauteur = newHauteur;
	}

}
