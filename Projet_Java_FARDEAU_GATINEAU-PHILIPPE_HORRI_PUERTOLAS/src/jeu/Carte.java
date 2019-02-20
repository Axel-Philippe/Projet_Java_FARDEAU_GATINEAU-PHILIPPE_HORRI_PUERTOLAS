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
	private static ArrayList<Bonus> lesBonus;
	private static ArrayList<Personnage> lesPersonnages;
	
	public Carte(String n, ImageView i, int x, int y) {
		super();
		nom = n;
		image = i;
		this.lesSorties = new ArrayList<Zone>();
		lesBonus = new ArrayList<Bonus>();
		lesPersonnages = new ArrayList<Personnage>();
	}
	
	public static void ajouterPersonnage(Personnage p) {
		lesPersonnages.add(p);
	}
	public static void ajouterBonus(Bonus b) {
		lesBonus.add(b);
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
	
	public void bonusVisible() {
		for (Bonus b : lesBonus) {
			if(b.getCarte() == this && !b.isPresent()) {
				b.getImageView().setVisible(true);
			}else {
				b.getImageView().setVisible(false);
			}
		}
	}
	
	public String getNom() {
		return this.nom;
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

	public ArrayList<Bonus> getLesBonus() {
		return lesBonus;
	}
	
	public ArrayList<Personnage> getLesPersonnages(){
		return lesPersonnages;
	}

	public void setLesObjets(ArrayList<Bonus> lesObjets) {
		this.lesBonus = lesObjets;
	}
	
	
	
}
