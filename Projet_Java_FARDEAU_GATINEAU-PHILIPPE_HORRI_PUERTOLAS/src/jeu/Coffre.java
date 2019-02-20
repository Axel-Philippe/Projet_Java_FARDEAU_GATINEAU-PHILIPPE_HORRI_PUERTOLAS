package jeu;

import java.util.ArrayList;

import javafx.scene.image.ImageView;

public class Coffre {

	private static ArrayList<Bonus> lesBonus;
	private static ArrayList<Ingredient> lesIngredients;
	private static Zone zone;
	private static ImageView image;

	public Coffre(Position p1, Position p2, ImageView i) {
		lesBonus = new ArrayList<Bonus>();
		lesIngredients = new ArrayList<Ingredient>();
		zone = new Zone(p1, p2);
		image = i;
		image.setVisible(false);
	}

	public static void ajouterObjets(ArrayList<Objet> l) {
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

	public static Zone getZone() {
		return zone;
	}

	public static void setZone(Zone zone) {
		Coffre.zone = zone;
	}

	public static boolean estPlein() {
		return lesIngredients.size() == 5;
	}
	
	public static ImageView getImageView() {
		return image;
	}

	public static int getPoints() {
		if (estPlein())
			return lesIngredients.size() + lesBonus.size();
		else
			return 0;
	}

}
