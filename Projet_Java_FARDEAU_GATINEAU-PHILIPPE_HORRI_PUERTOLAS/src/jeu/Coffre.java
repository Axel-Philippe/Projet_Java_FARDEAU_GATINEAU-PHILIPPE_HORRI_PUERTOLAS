package jeu;

import java.util.ArrayList;

import javafx.scene.image.ImageView;

/**
 * Classe Coffre, où l'on vient stocker les différents objets du jeu.
 * @author all
 *
 */
public class Coffre {

	private static ArrayList<Bonus> lesBonus;
	private static ArrayList<Ingredient> lesIngredients;
	private static Zone zone;
	private static ImageView image;

	/**
	 * Constructeur de la classe coffre
	 * @param p1
	 * @param p2
	 * @param i
	 */
	public Coffre(Position p1, Position p2, ImageView i) {
		lesBonus = new ArrayList<Bonus>();
		lesIngredients = new ArrayList<Ingredient>();
		zone = new Zone(p1, p2);
		image = i;
		image.setVisible(false);
	}

	/**
	 * Méthode qui permet d'ajouter des objets dans le coffre.
	 * @param l
	 */
	public static void ajouterObjets(ArrayList<Objet> l) {
		lesIngredients.clear();
		lesBonus.clear();
		for (Objet o : l) {
			if (o.getClass() == Bonus.class) {
				lesBonus.add((Bonus) o);
				System.out.println("test class bonus passé");
			} else if (o.getClass() == Ingredient.class) {
				lesIngredients.add((Ingredient) o);
				System.out.println("test class ingrédient passé");
			}
		}
	}
	
	/** 
	 * Méthode qui retourne la zone du coffre.
	 * @return
	 */
	public static Zone getZone() {
		return zone;
	}

	/**
	 * Méthode qui permet d'attriver une zone au coffre.
	 * @param zone
	 */
	public static void setZone(Zone zone) {
		Coffre.zone = zone;
	}

	/**
	 * Méthode qui permet de vérifier si le coffre est plein.
	 * @return true
	 */
	public static boolean estPlein() {
		return lesIngredients.size() == 5;
	}
	
	/**
	 * Méthode qui permet de récupérer l'image du coffre.
	 * @return image
	 */
	public static ImageView getImageView() {
		return image;
	}

	/**
	 * Méthode qui permet de récupérer les points après avoir placé les objets du coffre.
	 * @return
	 */
	public static int getPoints() {
		if (estPlein()) {
			int somme = 0;
			for (Bonus bonus : lesBonus) {
				somme += bonus.getNbCookies();
			}
			return 20 + somme;
		}
		else
			return 0;
	}
	
	/**
	 * Méthode qui permet de récuperer les objets d'une liste 
	 */
	public static ArrayList getLesObjets() {
		ArrayList<Objet> listeObjets = new ArrayList<Objet>();
		for (Bonus bonus : lesBonus) {
			listeObjets.add(bonus);
		}
		for (Ingredient ingredient : lesIngredients) {
			listeObjets.add(ingredient);
		}
		return listeObjets;
	}

	
}
