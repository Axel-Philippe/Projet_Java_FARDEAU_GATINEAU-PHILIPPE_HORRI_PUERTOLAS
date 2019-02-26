package jeu;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Optional;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;

public class Enigme extends Activite{
	private String solution;
	private String intitule;
	private ArrayList<String> proposition;
	
	public Enigme(String n, String s, String i, String p1, String p2, String p3) {
		super(n);
		solution = s;	
		intitule = i;
		this.proposition = new ArrayList<String>();
		this.proposition.add(p1);
		this.proposition.add(p2);
		this.proposition.add(p3);
	}
	
	public String getSolution()
	{
		return this.solution;
	}
	
	public ArrayList<String> getProposition(){
		return this.proposition;
	}
	
	
	
	public Ingredient afficher() {
		
		Ingredient i = null;
		
		if(this.getReussi() == false) {
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Enigme");
			alert.setHeaderText(null);
			alert.setContentText(this.intitule + "\n\nChoisissez une réponse :\n");
	
			ButtonType buttonTypeOne = new ButtonType(proposition.get(0));
			ButtonType buttonTypeTwo = new ButtonType(proposition.get(1));
			ButtonType buttonTypeThree = new ButtonType(proposition.get(2));
			ButtonType buttonTypeCancel = new ButtonType("Quitter", ButtonData.CANCEL_CLOSE);
	
			alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo, buttonTypeThree, buttonTypeCancel);
			
			
			Alert alertVie = new Alert(AlertType.CONFIRMATION);
			alertVie.setTitle("Attention");
			alertVie.setHeaderText(null);
			alertVie.setContentText("Vous n'avez plus de vie !");
			/*Button buttonTypeCancelVie = new Button();
			buttonTypeCancelVie.setText("Fermer");
			buttonTypeCancelVie.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					stage.close();
					menu.close();
					try {
						demarrerJeu(stage);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			alertVie.getButtonTypes().setAll(buttonTypeCancelVie);*/
			
			
			Optional<ButtonType> result = alert.showAndWait();
			if (result.get() == buttonTypeOne){
				if(proposition.get(0) == this.solution) {
					this.setReussi();
					i = this.getIngredient();
					i.setPresent(true);
				} else {
					Joueur.setVie(Joueur.getVie() + 1);		
					if(Joueur.getVie() == 3) {
						alertVie.show();
					}
				}
			}
				else if (result.get() == buttonTypeTwo) {
				if(proposition.get(1) == this.solution) {
					this.setReussi();
					i = this.getIngredient();
					i.setPresent(true);
				} else {
					Joueur.setVie(Joueur.getVie() + 1);
					alertVie.show();
				}
			} else if (result.get() == buttonTypeThree) {
				if(proposition.get(2) == this.solution) {
					this.setReussi();
					i = this.getIngredient();
					i.setPresent(true);
				} else {
					Joueur.setVie(Joueur.getVie() + 1);
					alertVie.show();
				}
			}
			
		}
			
		
		else if(this.getReussi() == true) {
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Enigme");
			alert.setHeaderText(null);
			alert.setContentText("Vous avez déjà résolu cette énigme !\n");
			ButtonType buttonTypeCancel = new ButtonType("Fermer", ButtonData.CANCEL_CLOSE);
			alert.getButtonTypes().setAll(buttonTypeCancel);
			alert.showAndWait();
		}
		
		return i;
	}
}
