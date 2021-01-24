package fr.ensma.a3.ia.AgentPlateau;

import fr.ensma.a3.ia.JeuMemoryMVPtestPlateau;
import fr.ensma.a3.ia.JeuMemoryPresent;
import fr.ensma.a3.ia.AgentCase.CasePresentation;

public class PlateauPresentation {
	
	private PlateauModele mod;
	private PlateauVue vue;
	
	//private JeuMemoryPresent monJeu;
	private JeuMemoryMVPtestPlateau monTest;
	private int currentPlayer;
	
	public PlateauPresentation(JeuMemoryMVPtestPlateau mJ) {
		//public PlateauPresentation(JeuMemoryPresent mJ)
		
		//this.monJeu = mJ;
		this.monTest = mJ;
		this.mod = new PlateauModele(this);
		System.out.println("Done step PlateauModele");
		this.vue = new PlateauVue(this);
		System.out.println("Done step PlateauVue");
		
		this.currentPlayer = this.monTest.getCurrentPlayer();
	}
	
	public PlateauVue getVue() {
		return this.vue;
	}
	
	public void ResetCurrentPlayer() {
		//this.monJeu.ResetCurrentPlayer();
		this.monTest.ResetCurrentPlayer();
	}
	
	public void changePlayer() {
		//this.monJeu.changePlayer();
		this.monTest.changePlayer();
	}
	
	public int getCurrentPlayer() {
		//return this.monJeu.getCurrentPlayer();
		return this.monTest.getCurrentPlayer();
	}
	
	public void actionReset() {
		this.vue.ResetAll();
	}
}
