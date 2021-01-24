package fr.ensma.a3.ia;

import java.util.logging.Logger;

import fr.ensma.a3.ia.AgentCase.CasePresentation;
import fr.ensma.a3.ia.AgentPlateau.PlateauPresentation;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JeuMemoryMVPtestPlateau extends Application implements EventHandler<ActionEvent> {

	private FlowPane root;
	private PlateauPresentation AgentPlateau;
	
	//private Boolean turn; // turn for 1: X or 0: O player
	private int currentPlayer;
	
	private Button actRestart;
	
	private static Logger LOGGER = Logger.getLogger(JeuMemoryMVPtestPlateau.class.getName());
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("TicTacToe");
		root = new FlowPane();
		root.setMinWidth(600);
		root.setAlignment(Pos.CENTER);
		
		currentPlayer = 1;
		
		AgentPlateau = new PlateauPresentation(this);

		root.getChildren().addAll(AgentPlateau.getVue());
		
		HBox panBouton = new HBox(100);
		panBouton.setAlignment(Pos.CENTER);
		//panBouton.setPrefHeight(100);
		actRestart = new Button("Restart !!!");
		actRestart.addEventHandler(ActionEvent.ACTION, this);
		//Button actNext = new Button("Next !!!");
		//panBouton.getChildren().addAll(actRestart,actNext);
		panBouton.getChildren().addAll(actRestart);
		root.getChildren().addAll(panBouton);
		
		Scene scene = new Scene(root, 600, 100);
		primaryStage.setScene(scene);
		primaryStage.setMinWidth(600);
		primaryStage.setMinHeight(600);
		primaryStage.show();
	}
	
	@Override
	public void handle(ActionEvent event) {
		if(event.getSource() == actRestart) {
			AgentPlateau.actionReset();
			LOGGER.info("JeuMVPtest: Reset the game !!!");
		}
	}
	
	public int getCurrentPlayer() {
		return currentPlayer;
	}
	
	public void ResetCurrentPlayer() {
		this.currentPlayer=1;
	}
	
	public void changePlayer() {
		if(currentPlayer == 1) {
			currentPlayer=0;
		} else {
			currentPlayer=1;
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
