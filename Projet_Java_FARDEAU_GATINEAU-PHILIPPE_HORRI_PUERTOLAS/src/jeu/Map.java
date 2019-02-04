package jeu;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class Map {
	private String nom;
	private ImageView image;
	private int x;
	private int y;
	
	public Map(String n, ImageView i, int x, int y) {
		nom = n;
		image = i;
	}
}
