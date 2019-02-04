package jeu;

import java.util.ArrayList;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Ingredient extends Objet{
	private static ArrayList<Ingredient> listeIngredients = new ArrayList<Ingredient>();
	private boolean present;

	public Ingredient(String n, ImageView i, boolean p, Position pos) {
		super(n, i, pos);
		listeIngredients.add(this);
		present = p;
	}

}
