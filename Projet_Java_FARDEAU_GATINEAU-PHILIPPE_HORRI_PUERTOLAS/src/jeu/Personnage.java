package jeu;

import java.util.ArrayList;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Personnage extends Personne {
	
	private Activite activite;
	private Ingredient ingredient;
	private ImageView image;
	private Zone zone;
	
	public Personnage (Activite a, String n, Position p, ImageView i, Ingredient in, Carte map, Zone zone) {
		super(n, p, map); 
		image = i;
		activite = a; 
		ingredient = in;
		this.zone = zone;
		this.setPositionImage(p);
	}
	
	public Personnage (String n, Position p, ImageView i, Ingredient in, Carte map, Zone zone) {
		super(n, p, map); 
		image = i;
		ingredient = in;
		this.zone = zone;
		this.setPositionImage(p);
	}
	
	public Personnage (String n, Position p, ImageView i, Carte map, Zone zone) {
		super(n, p, map); 
		image = i;
		this.zone = zone;
		this.setPositionImage(p);
	}
	
	public String parler(Joueur j) {
		return null;
	}
	
	public ImageView getImage(){
		return this.image;
	}
	  
	
	public void setPositionImage(Position p) {
		this.image.setX(p.getX());
		this.image.setY(p.getY());
	}
	
}
