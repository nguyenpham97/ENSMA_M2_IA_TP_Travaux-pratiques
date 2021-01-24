package fr.ensma.a3.ia.AgentCase.automate;

import fr.ensma.a3.ia.AgentCase.CasePresentation;

public abstract class AbstractEtatAdapter implements IEtat {
	
	protected CasePresentation pres;
	
	public AbstractEtatAdapter (CasePresentation p) {
		this.pres = p;
	}
	
	@Override
	public void toucheX() throws CaseTransitionException {
		throw new CaseTransitionException();
	}
	
	@Override
	public void toucheO() throws CaseTransitionException {
		throw new CaseTransitionException();
	}
	
	@Override
	public void reset() throws CaseTransitionException {
		throw new CaseTransitionException();
	}
}
