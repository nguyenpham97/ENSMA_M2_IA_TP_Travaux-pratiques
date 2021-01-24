package fr.ensma.a3.ia;

import java.util.logging.Logger;

import fr.ensma.a3.ia.AgentPlateau.PlateauPresentation;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JeuMemoryVue extends Application implements EventHandler<ActionEvent>//, IJeuMemoryPresent
{
	private JeuMemoryPresent pres;
	private PlateauPresentation monPlateau;
	
	private FlowPane root;
	private Button actRestart;
	
	private static Logger LOGGER = Logger.getLogger(JeuMemoryVue.class.getName());
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("TicTacToe");
		root = new FlowPane();
		root.setMinWidth(600);
		root.setAlignment(Pos.CENTER);
		
		monPlateau = new PlateauPresentation(this.pres);
		root.getChildren().addAll(monPlateau.getVue());
		
		actRestart = new Button("Restart !!!");
		actRestart.addEventHandler(ActionEvent.ACTION, this);
		root.getChildren().addAll(actRestart);
		
		Scene scene = new Scene(root, 500, 300);
		primaryStage.setScene(scene);
		primaryStage.setMinWidth(500);
		primaryStage.setMinHeight(300);
		primaryStage.show();
		
		this.pres = new JeuMemoryPresent(this);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public PlateauPresentation getmonPlateau() {
		return this.monPlateau;
	}
	
	@Override
	public void handle(ActionEvent event) {
		if(event.getSource() == actRestart) {
			this.pres.actionReset();
		}
		
	}

}
