package jeu;

import java.util.ArrayList;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class Map {
	private String nom;
	private ImageView image;
	private int x;
	private int y;
	private ArrayList<Zone> lesSorties;
	
	public Map(String n, ImageView i, int x, int y) {
		nom = n;
		image = i;
	}
}
