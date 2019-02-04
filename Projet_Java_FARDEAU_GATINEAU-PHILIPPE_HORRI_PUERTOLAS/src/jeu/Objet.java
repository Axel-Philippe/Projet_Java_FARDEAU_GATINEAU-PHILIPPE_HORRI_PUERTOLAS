package jeu;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class Objet {
	private String nom;
	private ImageView image;
	private Position position; 
	
	
	public Objet(String nom, ImageView image, Position p) {
		super();
		this.nom = nom;
		this.image = image;
		this.position = p;
	}

	@Override 
	public String toString() {
		return nom;
	}
	
	public ImageView getImageView(){
		return this.image;
	}
	
	public void setPosition(int x, int y){
		this.position.setX(x);
		this.position.setY(y);
	}
}
