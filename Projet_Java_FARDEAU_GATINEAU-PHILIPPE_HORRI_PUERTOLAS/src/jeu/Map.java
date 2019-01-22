package jeu;

import javafx.scene.image.Image;

public abstract class Map {
	private String nom;
	private Image image;
	public Map(String n, Image i) {
		nom = n;
		image = i;
	}
}
