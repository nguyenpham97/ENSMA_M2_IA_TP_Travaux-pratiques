package fr.ensma.a3.ia.AgentPlateau;

import fr.ensma.a3.ia.AgentCase.CasePresentation;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

public class PlateauVue extends TilePane implements IPlateauPresentation
{

	private CasePresentation AgentCase, AgentCase2, AgentCase3, AgentCase4,
							AgentCase5, AgentCase6, AgentCase7, AgentCase8, AgentCase9;
	
	private PlateauPresentation pres;
	
	public PlateauVue(final PlateauPresentation p) {
		super();
		this.pres = p;
		
		this.setMaxWidth(400);
		this.setMaxHeight(400);
		this.setHgap(10);
		this.setVgap(10);
		this.setAlignment(Pos.CENTER);
		
		AgentCase = new CasePresentation(this.getPresentation());
		AgentCase2 = new CasePresentation(this.getPresentation());
		AgentCase3 = new CasePresentation(this.getPresentation());
		AgentCase4 = new CasePresentation(this.getPresentation());
		AgentCase5 = new CasePresentation(this.getPresentation());
		AgentCase6 = new CasePresentation(this.getPresentation());
		AgentCase7 = new CasePresentation(this.getPresentation());
		AgentCase8 = new CasePresentation(this.getPresentation());
		AgentCase9 = new CasePresentation(this.getPresentation());
		
		this.getChildren().addAll(AgentCase.getVue(), AgentCase2.getVue(), AgentCase3.getVue(),
							AgentCase4.getVue(), AgentCase5.getVue(), AgentCase6.getVue(),
							AgentCase7.getVue(), AgentCase8.getVue(), AgentCase9.getVue());
	}
	
	@Override
	public void miseAJour() {
		
	}
	
	public PlateauPresentation getPresentation() {
		return this.pres;
	}
	
	public void ResetAll() {
		AgentCase.actionReset();
		AgentCase2.actionReset();
		AgentCase3.actionReset();
		AgentCase4.actionReset();
		AgentCase5.actionReset();
		AgentCase6.actionReset();
		AgentCase7.actionReset();
		AgentCase8.actionReset();
		AgentCase9.actionReset();
	}
}
