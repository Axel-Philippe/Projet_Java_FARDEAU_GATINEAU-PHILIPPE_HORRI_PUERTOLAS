package jeu;

import java.util.ArrayList;
import java.util.Collection;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class Carte {
	private String nom;
	private ImageView image;
	private int x;
	private int y;
	private ArrayList<Zone> lesSorties;
	private ArrayList<Objet> lesBonus;
	private static ArrayList<Personnage> lesPersonnages;
	
	public Carte(String n, ImageView i, int x, int y) {
		super();
		nom = n;
		image = i;
		this.lesSorties = new ArrayList<Zone>();
		this.lesBonus = new ArrayList<Objet>();
		lesPersonnages = new ArrayList<Personnage>();
	}
	
	public static void ajouterPersonnage(Personnage p) {
		lesPersonnages.add(p);
	}
	
	public void personnageVisible() {
		for (Personnage p : lesPersonnages) {
			if(p.getCarte() == this) {
				p.getImage().setVisible(true);
			}else {
				p.getImage().setVisible(false);
			}
		}
	}
	
	public void ajouterZone(Zone z){
		this.lesSorties.add(z);
	}

	public ImageView getImage() {
		return image;
	}

	public ArrayList<Zone> getLesSorties() {
		return lesSorties;
	}

	public ArrayList<Objet> getLesBonus() {
		return lesBonus;
	}

	public void setLesObjets(ArrayList<Objet> lesObjets) {
		this.lesBonus = lesObjets;
	}
	
	
	
}
