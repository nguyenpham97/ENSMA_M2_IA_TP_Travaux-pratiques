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
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class tictactoeTest extends Application implements EventHandler<ActionEvent> {

	private VBox root;
	private PlateauPresentation AgentPlateau;
	
	private int currentPlayer;
	
	private Button actRestart;
	
	private static Logger LOGGER = Logger.getLogger(tictactoeTest.class.getName());
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("TicTacToe _ Author: Don-Nguyen PHAM");
		root = new VBox();
		root.setMinWidth(400);
		root.setAlignment(Pos.CENTER);
		
		currentPlayer = 1;
		
		AgentPlateau = new PlateauPresentation(this);

		root.getChildren().addAll(AgentPlateau.getVue());
		
		HBox panBouton = new HBox(50);
		panBouton.setAlignment(Pos.CENTER);
		panBouton.setPrefHeight(100);
		actRestart = new Button("Restart !!!");
		actRestart.addEventHandler(ActionEvent.ACTION, this);
		panBouton.getChildren().addAll(actRestart);
		//actNext = new Button("Next !!!");
		//actNext.addEventHandler(ActionEvent.ACTION, this);
		//panBouton.getChildren().addAll(actNext);
		root.getChildren().addAll(panBouton);
		
		Scene scene = new Scene(root, 400, 500);
		primaryStage.setScene(scene);
		//primaryStage.setMinWidth(500);
		//primaryStage.setMinHeight(500);
		primaryStage.show();
	}
	
	@Override
	public void handle(ActionEvent event) {
		if(event.getSource() == actRestart) {
			AgentPlateau.actionReset();
			LOGGER.info("tictactoeTest: Reset the game !!!");
		}
		/*if(event.getSource() == actNext) {
			LOGGER.info("Oops, This button is still not functionable");
		}*/
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
