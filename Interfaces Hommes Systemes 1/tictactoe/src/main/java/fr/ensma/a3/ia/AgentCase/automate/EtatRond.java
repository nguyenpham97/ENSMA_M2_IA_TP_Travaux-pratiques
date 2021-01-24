package fr.ensma.a3.ia.AgentCase.automate;

import fr.ensma.a3.ia.AgentCase.CasePresentation;

public class EtatRond extends AbstractEtatAdapter {

	public EtatRond(CasePresentation p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void reset() {
		pres.setEtatCourant(pres.getEtatVide());
	}
	
}
