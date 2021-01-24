package fr.ensma.a3.ia;

import java.util.logging.Logger;

import fr.ensma.a3.ia.AgentPlateau.PlateauPresentation;

public class JeuMemoryPresent {
	
	private JeuMemoryVue vue;
	private JeuMemoryModele mod;
	private PlateauPresentation monPlateau;
	private int currentPlayer;
	
	private static Logger LOGGER = Logger.getLogger(JeuMemoryPresent.class.getName());
	
	public JeuMemoryPresent(JeuMemoryVue mV) {
		
		this.vue = mV;
		this.currentPlayer = 1;
		this.monPlateau = mV.getmonPlateau();
	}
	
	public void ResetCurrentPlayer() {
		this.currentPlayer=1;
	}
	
	public void changePlayer() {
		if(currentPlayer==1) {
			currentPlayer=0;
		} else {
			currentPlayer=1;
		}
	}
	
	public int getCurrentPlayer() {
		return currentPlayer;
	}
	
	public void actionReset() {
		this.monPlateau.actionReset();
		LOGGER.info("JeuMVPtest: Reset the game !!!");
	}
	
}
