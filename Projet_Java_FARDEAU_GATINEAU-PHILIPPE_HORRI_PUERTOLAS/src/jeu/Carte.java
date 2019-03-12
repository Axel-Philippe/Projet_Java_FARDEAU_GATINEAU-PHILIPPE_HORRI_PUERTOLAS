package jeu;

import java.util.ArrayList;
import java.util.Collection;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Classe Carte qui contient toutes les méthodes relatives aux cartes
 * @author all
 *
 */
public class Carte {
	private String nom;
	private ImageView image;
	private int x;
	private int y;
	private ArrayList<Zone> lesSorties;
	private static ArrayList<Bonus> lesBonus;
	private static ArrayList<Personnage> lesPersonnages;
	
	/**
	 * Constructeur de la classe Carte
	 * @param n
	 * @param i
	 * @param x
	 * @param y
	 */
	public Carte(String n, ImageView i, int x, int y) {
		super();
		nom = n;
		image = i;
		this.lesSorties = new ArrayList<Zone>();
		lesBonus = new ArrayList<Bonus>();
		lesPersonnages = new ArrayList<Personnage>();
	}
	
	/**
	 * Méthode qui permet d'ajouter un personnage à la liste static "lesPersonnages" qui contien tous les personnages présents sur la carte.
	 * @param p
	 */
	public static void ajouterPersonnage(Personnage p) {
		lesPersonnages.add(p);
	}
	
	/**
	 * Méthode qui permet d'ajouter un bonus à la liste static "lesBonus" qui contient tous les bonus présents sur la carte.
	 * @param b
	 */
	public static void ajouterBonus(Bonus b) {
		lesBonus.add(b);
	}
	
	
	/**
	 * Méthode permettant de cacher les personnages, c'est-à-dire que si le personnage ne doit pas être sur la carte, il sera invisible. 
	 */
	public void personnageVisible() {
		for (Personnage p : lesPersonnages) {
			if(p.getCarte() == this) {
				p.getImage().setVisible(true);
			}else {
				p.getImage().setVisible(false);
			}
		}
	}
	
	/**
	 * Méthode permettant de cacher les bonus, c'est-à-dire que si le bonus ne doit pas être sur la carte, il sera invisible. 
	 */
	public void bonusVisible() {
		for (Bonus b : lesBonus) {
			if(b.getCarte() == this && !b.isPresent()) {
				b.getImageView().setVisible(true);
			}else {
				b.getImageView().setVisible(false);
			}
		}
	}
	
	/**
	 * Méthode qui permet de récuperer le nom de la carte.	
	 * @return
	 */
	public String getNom() {
		return this.nom;
	}
	
	/**
	 * Méthode qui permet d'ajouter une zone à la carte courante.
	 * @param z
	 */
	public void ajouterZone(Zone z){
		this.lesSorties.add(z);
	}

	/**
	 * Méthode qui permet de récupérer l'image de la carte.
	 * @return image
	 */
	public ImageView getImage() {
		return image;
	}

	/**
	 * Méthode qui permet de récupérer la liste des zones de sortie de la carte.
	 * @return lesSorties
	 */
	public ArrayList<Zone> getLesSorties() {
		return lesSorties;
	}
	
	
	/**
	 * Méthode qui permet de récupérer la liste des bonus présents sur la carte.
	 * @return lesBonus
	 */
	public ArrayList<Bonus> getLesBonus() {
		return lesBonus;
	}
	
	/**
	 * Méthode qui permet de récupérer la liste des personnages présents sur la carte.
	 * @return lesPersonnages
	 */
	public ArrayList<Personnage> getLesPersonnages(){
		return lesPersonnages;
	}

	
	/**
	 * Méthode qui permet d'instancier la liste de bonus de la carte courante avec la liste placée en paramètre.
	 * @param lesObjets
	 */
	public void setLesObjets(ArrayList<Bonus> lesObjets) {
		this.lesBonus = lesObjets;
	}
}
