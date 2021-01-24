package fr.ensma.a3.ia.AgentCase;

import java.util.logging.Logger;

import fr.ensma.a3.ia.AgentCase.automate.CaseTransitionException;
import fr.ensma.a3.ia.AgentCase.automate.IEtat;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;

public class CaseVue extends VBox implements EventHandler<ActionEvent>//, ICasePresentation
{
	
	private CasePresentation pres;
	//private String symbol;
	private Button Main;
	
	private static Logger LOGGER = Logger.getLogger(CaseVue.class.getName());
	
	public CaseVue(final CasePresentation p) {
		super(80);
		this.setAlignment(Pos.CENTER);
		pres = p;
		
		Main = new Button();
	    Main.setGraphic(this.pres.getCaseImageView());
		Main.addEventHandler(ActionEvent.ACTION, this);
		this.getChildren().addAll(Main);
	}
	
	public void miseAJour() {
		
		Main.setGraphic(this.pres.getCaseImageView());
	}
	
	@Override
	public void handle(ActionEvent event) {
		if(event.getSource() == Main) {
			try {
				pres.actionCase();
			} catch (CaseTransitionException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				LOGGER.severe("CaseVue: Arggghh ... ça ne doit pas se produire !!");
				}
			}
		}
	
}
