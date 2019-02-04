package jeu;

import java.util.ArrayList;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Personnage extends Personne {
	
	private Activite activite;
	private ImageView image;
	
	public Personnage (Activite a, String n, Position p, ImageView i, Objet objet, Map map) {
		super(n, p, map); 
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
