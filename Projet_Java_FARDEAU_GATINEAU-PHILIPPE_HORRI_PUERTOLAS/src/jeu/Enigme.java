package jeu;

import java.util.ArrayList;
import java.util.Optional;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
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
			
			Optional<ButtonType> result = alert.showAndWait();
			if (result.get() == buttonTypeOne){
				if(proposition.get(0) == this.solution) {
					this.setReussi();
					i = this.getIngredient();
					i.setPresent(true);
				} else {
					
				}
			} else if (result.get() == buttonTypeTwo) {
				if(proposition.get(1) == this.solution) {
					this.setReussi();
					i = this.getIngredient();
					i.setPresent(true);
				} else {
					
				}
			} else if (result.get() == buttonTypeThree) {
				if(proposition.get(2) == this.solution) {
					this.setReussi();
					i = this.getIngredient();
					i.setPresent(true);
				} else {
					
				}
			}
			
		} 
		
		else if(this.getReussi() == true) {
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Enigme");
			alert.setHeaderText(null);
			alert.setContentText("Vous avez déjà résolu cette énigme !\n");
			//ButtonType buttonTypeCancel = new ButtonType("Quitter", ButtonData.CANCEL_CLOSE);
		}
		
		return i;
	}
}
