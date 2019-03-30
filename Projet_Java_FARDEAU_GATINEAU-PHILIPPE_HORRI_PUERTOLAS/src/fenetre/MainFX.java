package fenetre;

import javafx.application.Application;
import javafx.stage.Stage;
import jeu.Jeu;

public class MainFX extends Application {

	public MainFX() {
		super();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage stage) throws Exception {
		Jeu.demarrerJeu(stage);
		
	}

}
