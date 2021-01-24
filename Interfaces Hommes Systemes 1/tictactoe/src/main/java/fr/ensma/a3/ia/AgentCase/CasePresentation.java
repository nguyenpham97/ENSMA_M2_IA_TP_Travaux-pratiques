package fr.ensma.a3.ia.AgentCase;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import fr.ensma.a3.ia.JeuMemoryMVPtestCase;
import fr.ensma.a3.ia.AgentCase.automate.CaseTransitionException;
import fr.ensma.a3.ia.AgentCase.automate.EtatCroix;
import fr.ensma.a3.ia.AgentCase.automate.EtatRond;
import fr.ensma.a3.ia.AgentCase.automate.EtatVide;
import fr.ensma.a3.ia.AgentCase.automate.IEtat;
import fr.ensma.a3.ia.AgentPlateau.PlateauPresentation;
import javafx.scene.image.ImageView;

public class CasePresentation {
	
	// Need to erase later
	private int currentPlayer;
	private PlateauPresentation monPlateau;
	
	private CaseVue vue;
	private CaseModele mod;
	
	private IEtat etatCourant;
	private IEtat etatVide = new EtatVide(this);
	private IEtat etatCroix = new EtatCroix(this);
	private IEtat etatRond = new EtatRond(this);
	
	private static Logger LOGGER = Logger.getLogger(CasePresentation.class.getName());
	
	//List<ICasePresentation> mesObserveurs;
	//ICasePresentation Observeur;
	
	public CasePresentation(final PlateauPresentation mP) {
		this.mod = new CaseModele(this);
		this.vue = new CaseVue(this);
		this.monPlateau = mP;
		this.misaJourCurrentPlayer();
		//mesObserveurs = new ArrayList<ICasePresentation>();
		//Observeur = new CaseVue(this);
		// ??
		etatCourant = etatVide;
	}
	
	public CaseVue getVue() {
		return vue;
	}
	
	public CaseModele getModele() {
		return mod;
	}
	
	public ImageView getCaseImageView() {
		return mod.getCaseImageView();
	}
	
	public void actionReset() {
		try {
			etatCourant.reset();
			this.mod.setImageView("vide.png");
			this.vue.miseAJour();
			LOGGER.info("CasePre: Reset the game !!!");
			monPlateau.ResetCurrentPlayer();
		} catch (CaseTransitionException e) {
			LOGGER.severe("Arggghh ... ça ne doit pas se produire !!");
		}
	}
	
	public void actionCase() throws CaseTransitionException {
		// 1:X and 0:O
		this.misaJourCurrentPlayer();
		
		if(this.currentPlayer == 1) {
			etatCourant.toucheX();
			this.mod.setImageView("croix.png");
			this.vue.miseAJour();
			LOGGER.info("CasePre: Turn to X !!!");
			monPlateau.changePlayer();
		} else {
			etatCourant.toucheO();
			this.mod.setImageView("rond.png");
			this.vue.miseAJour();
			LOGGER.info("CasePre: Turn to O !!!");
			monPlateau.changePlayer();
		}
	}
	
	//public void actionCaseO() throws CaseTransitionException
	
	public void misaJourCurrentPlayer() {
		this.currentPlayer = this.monPlateau.getCurrentPlayer();
	}
	
	public void setEtatCourant(final IEtat e) {
		etatCourant = e;
	}
	
	public IEtat getEtatCourant() {
		return etatCourant;
	}
	
	public IEtat getEtatVide() {
		return etatVide;
	}
	
	public IEtat getEtatCroix() {
		return etatCroix;
	}
	
	public IEtat getEtatRond() {
		return etatRond;
	}
}
