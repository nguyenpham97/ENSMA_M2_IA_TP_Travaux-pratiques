/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package fr.ensma.Jeu;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Pair.
 * 
 * @author Dell
 */
public class Pair {
	/**
	 * Description of the property cartes.
	 */
	public HashSet<Carte> cartes = new HashSet<Carte>();

	/**
	 * Description of the property idPair.
	 */
	public String idPair = "";

	// Start of user code (user defined attributes for Pair)

	// End of user code

	/**
	 * The constructor.
	 */
	public Pair() {
		// Start of user code constructor for Pair)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Pair)

	// End of user code
	/**
	 * Returns cartes.
	 * @return cartes 
	 */
	public HashSet<Carte> getCartes() {
		return this.cartes;
	}

	/**
	 * Returns idPair.
	 * @return idPair 
	 */
	public String getIdPair() {
		return this.idPair;
	}

	/**
	 * Sets a value to attribute idPair. 
	 * @param newIdPair 
	 */
	public void setIdPair(String newIdPair) {
		this.idPair = newIdPair;
	}

}
