package jeu;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class Objet {
	private String nom;
	private ImageView image;
	private Position position;
	private Zone zoneObjet;
	private boolean present;

	
	
	public Objet(String nom, ImageView image, boolean present, Position p) {
		super();
		this.nom = nom;
		this.image = image;
		this.position = p;
		this.present = present;
	}
	
	public Zone getZoneObjet() {
		return zoneObjet;
	}

	public void setZoneObjet(Zone zoneObjet) {
		this.zoneObjet = zoneObjet;
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
	
	public void setPosition(int x, int y){
		this.position.setX(x);
		this.position.setY(y);
	} 
}
