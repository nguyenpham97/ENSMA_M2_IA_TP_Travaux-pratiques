package fr.ensma.a3.ia.AgentCase.automate;

import fr.ensma.a3.ia.AgentCase.CasePresentation;

public class EtatVide extends AbstractEtatAdapter {

	public EtatVide(CasePresentation p) {
		super(p);
	}
	@Override
	public void toucheX() {
		pres.setEtatCourant(pres.getEtatCroix());
	}
	
	@Override
	public void toucheO() {
		pres.setEtatCourant(pres.getEtatRond());
	}
	
	@Override
	public void reset() {
		pres.setEtatCourant(pres.getEtatVide());
	}
}
