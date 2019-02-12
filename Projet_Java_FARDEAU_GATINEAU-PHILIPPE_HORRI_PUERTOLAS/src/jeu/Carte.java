package jeu;

import java.util.ArrayList;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class Carte {
	private String nom;
	private ImageView image;
	private int x;
	private int y;
	private ArrayList<Zone> lesSorties;
	
	public Carte(String n, ImageView i, int x, int y) {
		super();
		nom = n;
		image = i;
		this.lesSorties = new ArrayList<Zone>();
	}
	
	public void ajouterZone(Zone z){
		this.lesSorties.add(z);
	}
}
