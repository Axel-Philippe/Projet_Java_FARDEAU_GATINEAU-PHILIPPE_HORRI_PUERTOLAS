package jeu;

import javafx.scene.image.Image;

public class Personnage extends Personne {
	
	private Activite activite;
	private Image image;
	
	public Personnage (Activite a, String n, Position p, Image i) {
		super(n, p); 
		image = i;
		activite = a; 
	}
	
	public String parler(Joueur j) {
		return null;
	}
}
