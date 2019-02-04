package jeu;

import java.util.ArrayList;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Personnage extends Personne {
	
	private Activite activite;
	private ImageView image;
	private Zone zone;
	
	public Personnage (Activite a, String n, Position p, ImageView i, Objet objet, Map map, Zone zone) {
		super(n, p, map); 
		image = i;
		activite = a; 
		this.zone = zone;
	}
	
	public String parler(Joueur j) {
		return null;
	}
	
	public ImageView getImage(){
		return this.image;
	}
	  
}
