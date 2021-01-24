package fr.ensma.a3.ia;

import java.util.logging.Logger;
import fr.ensma.a3.ia.listeners.EcouteurClavier;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

public class draftTicTacToe extends Application implements EventHandler<ActionEvent> {
	private FlowPane root2;
	private VBox panBouton;
	private Button actConvert;
	private TextField champEntree, champSortie;
	private ComboBox<String> choixSens;
	
	private static Logger LOGGER = Logger.getLogger(draftTicTacToe.class.getName());
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("TicTacToe");
		//root2 = new FlowPane(Orientation.HORIZONTAL,10, 10);
		//root2.setMinWidth(600);
		//root2.setAlignment(Pos.TOP_CENTER);
		VBox root2 = new VBox();
		//root2.setMinWidth(600);
		//root2.setMinHeight(300);
		root2.setAlignment(Pos.CENTER);
		
		// Create image
		Image imgC = new Image("croix.png");
	    ImageView viewC = new ImageView(imgC);
	    viewC.setFitHeight(70);
	    viewC.setFitWidth(70);
	    
	    Image imgR = new Image("rond.png");
	    ImageView viewR = new ImageView(imgR);
	    viewR.setFitHeight(70);
	    viewR.setFitWidth(70);
	    
	    Image imgV = new Image("vide.png");
	    ImageView viewV = new ImageView(imgV);
	    viewV.setFitHeight(70);
	    viewV.setFitWidth(70);
		// Create plateau
		TilePane plateau = new TilePane();
		plateau.setMaxWidth(300);
		plateau.setMaxHeight(300);
		plateau.setHgap(10);
		plateau.setVgap(10);
		// Create button
		Button button1 = new Button();
		button1.setPrefSize(70, 70);
		button1.setGraphic(viewC);
		
		Button button2 = new Button();
		button2.setPrefSize(70, 70);
		//button2.setGraphic(new ImageView("croix.png"));
		
		Button button3 = new Button();
		button3.setPrefSize(70, 70);
		//button3.setGraphic(new ImageView("rond.png"));
		
		Button button4 = new Button();
		button4.setMaxSize(70, 70);
		//button4.setGraphic(new ImageView("vide.png"));
		
		Button button5 = new Button();
		button5.setPrefSize(70, 70);
		button5.setGraphic(viewR);
		
		Button button6 = new Button();
		button6.setPrefSize(70, 70);
		button6.setGraphic(viewV);
		
		Button button7 = new Button();
		button7.setPrefSize(70, 70);
		button7.setGraphic(viewC);
		
		Button button8 = new Button();
		button8.setPrefSize(70, 70);
		button8.setGraphic(viewC);
		
		Button button9 = new Button();
		button9.setPrefSize(70, 70);
		button9.setGraphic(viewC);
		
		plateau.getChildren().addAll(button1, button2, button3, button4, button5,
				button6, button7, button8, button9);
		root2.getChildren().addAll(plateau);
		// Player 1 and 2
		FlowPane paneJoueur = new FlowPane();
		paneJoueur.setAlignment(Pos.CENTER);
		paneJoueur.setMinHeight(200);
		paneJoueur.setMaxWidth(250);
		paneJoueur.setHgap(10);
		paneJoueur.setVgap(10);
		Label lab1 = new Label("Player1:");
		Label lab2 = new Label("Player2:");
		TextField txf1 = new TextField("...");
		TextField txf2 = new TextField("...");
		paneJoueur.getChildren().addAll(lab1, txf1, lab2, txf2);
		root2.getChildren().addAll(paneJoueur);
		
		// HBox for 2 buttons
		HBox panBouton = new HBox(100);
		panBouton.setAlignment(Pos.CENTER);
		panBouton.setPrefHeight(100);
		Button actRestart = new Button("Restart !!!");
		Button actNext = new Button("Next !!!");
		panBouton.getChildren().addAll(actRestart,actNext);
		root2.getChildren().addAll(panBouton);
		
		Scene scene = new Scene(root2, 600, 600);
		/*
		champEntree = new TextField();
		root2.getChildren().add(champEntree);
		panBouton = new VBox(20);
		panBouton.setAlignment(Pos.TOP_CENTER);
		choixSens = new ComboBox<>();	
		choixSens.getItems().addAll("Dollars->Euros","Euros->Dollars");
		choixSens.getSelectionModel().select(0);
		actConvert = new Button("Conversion !!!");
		panBouton.getChildren().addAll(choixSens,actConvert);
		root2.getChildren().addAll(panBouton);
		champSortie = new TextField();
		champSortie.setEditable(false);
		root2.getChildren().addAll(champSortie);
		Scene scene = new Scene(root2, 600, 100);
		//Abonnements:
		/*
		actConvert.addEventHandler(ActionEvent.ACTION, this);
		choixSens.addEventHandler(ActionEvent.ACTION, this);
		root2.addEventFilter(KeyEvent.KEY_TYPED, new EcouteurClavier(this));
		*/
		primaryStage.setScene(scene);
		primaryStage.setMinWidth(600);
		primaryStage.setMinHeight(600);
		primaryStage.show();
	}	
	
	@Override
	public void handle(ActionEvent event) {
		if (event.getSource() == choixSens ) {
			LOGGER.info("Action choisie : " + 
					choixSens.getValue()+ "(" + 
			choixSens.getSelectionModel().getSelectedIndex()  + ")");
		} 
		if (event.getSource() == actConvert ) {
			LOGGER.info("Demande de conversion !");
		}
	}
	
	public void resetChampTexte() {
		champEntree.setText("");
		champSortie.setText("");
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}