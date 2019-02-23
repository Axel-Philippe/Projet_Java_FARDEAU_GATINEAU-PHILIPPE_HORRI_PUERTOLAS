package jeu;

import javafx.scene.image.ImageView;

public abstract class Objet {
	private String nom;
	private ImageView image;
	private Position position;
	private boolean present;
	private Carte carte;

	
	
	public Objet(String nom, ImageView image, boolean present, Position p) {
		super();
		this.nom = nom;
		this.image = image;
		this.position = p;
		this.present = present;
		this.setPositionImage(position);
	}

	public boolean isPresent() {
		return present;
	}

	public void setPresent(boolean present) {
		this.present = present;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	@Override 
	public String toString() {
		return nom;
	}
	
	public ImageView getImageView(){
		return this.image;
	}
	
	public void setPositionImage(Position p) {
		this.image.setX(p.getX());
		this.image.setY(p.getY());
	}
	
	public void setPosition(int x, int y){
		this.position.setX(x);
		this.position.setY(y);
	} 
}
