package fr.ensma.a3.ia.listeners;

import java.util.logging.Logger;

import fr.ensma.a3.ia.draftTicTacToe;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

public class EcouteurClavier implements EventHandler<KeyEvent> {
	
		private draftTicTacToe vue;

		private static Logger LOGGER = Logger.getLogger(EcouteurClavier.class.getName());
		
		public EcouteurClavier(final draftTicTacToe v) {
			vue = v;
		}
		
		@Override
		public void handle(KeyEvent event) {
			if (event.getCharacter().compareTo("A")==0) {
				LOGGER.info("Mise à vide des champs texte ...");
				vue.resetChampTexte();
				event.consume();
			}
		}
}
