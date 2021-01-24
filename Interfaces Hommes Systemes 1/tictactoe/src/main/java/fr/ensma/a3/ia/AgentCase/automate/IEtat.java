package fr.ensma.a3.ia.AgentCase.automate;

public interface IEtat {
	void toucheX() throws CaseTransitionException;
	void toucheO() throws CaseTransitionException;
	void reset() throws CaseTransitionException;
}
