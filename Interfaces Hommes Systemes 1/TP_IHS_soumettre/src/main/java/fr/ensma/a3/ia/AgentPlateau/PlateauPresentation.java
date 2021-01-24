package fr.ensma.a3.ia.AgentPlateau;

import fr.ensma.a3.ia.tictactoeTest;
import fr.ensma.a3.ia.AgentCase.CasePresentation;

public class PlateauPresentation {
	
	private PlateauModele mod;
	private PlateauVue vue;
	
	private tictactoeTest monTest;
	private int currentPlayer;
	
	public PlateauPresentation(tictactoeTest mJ) {
		
		this.monTest = mJ;
		this.mod = new PlateauModele(this);
		this.vue = new PlateauVue(this);
		this.currentPlayer = this.monTest.getCurrentPlayer();
	}
	
	public PlateauVue getVue() {
		return this.vue;
	}
	
	public void ResetCurrentPlayer() {
		
		this.monTest.ResetCurrentPlayer();
	}
	
	public void changePlayer() {
		
		this.monTest.changePlayer();
	}
	
	public int getCurrentPlayer() {
		
		return this.monTest.getCurrentPlayer();
	}
	
	public void actionReset() {
		
		this.vue.ResetAll();
	}
}
