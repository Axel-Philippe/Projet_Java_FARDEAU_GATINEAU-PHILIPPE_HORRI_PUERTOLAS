package jeu;

import javafx.scene.image.Image;

public abstract class Objet {
	private String nom;
	private Image image;
	
	
	public Objet(String nom, Image image) {
		super();
		this.nom = nom;
		this.image = image;
	}



	@Override 
	public String toString() {
		return nom;
	}
}
