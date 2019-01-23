package jeu;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Personnage extends Personne {
	
	private Activite activite;
	private ImageView image;
	
	public Personnage (Activite a, String n, Position p, ImageView i) {
		super(n, p); 
		image = i;
		activite = a; 
	}
	
	public String parler(Joueur j) {
		return null;
	}
	
	public ImageView getImage(){
		return this.image;
	}
}
