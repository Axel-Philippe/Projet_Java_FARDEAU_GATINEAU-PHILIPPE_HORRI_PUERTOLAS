package jeu;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class Objet {
	private String nom;
	private ImageView image;
	
	
	public Objet(String nom, ImageView image) {
		super();
		this.nom = nom;
		this.image = image;
	}

	@Override 
	public String toString() {
		return nom;
	}
}
