package jeu;

import java.util.ArrayList;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Ingredient extends Objet{
	private static ArrayList<Ingredient> listeIngredients = new ArrayList<Ingredient>();

	public Ingredient(String n, ImageView i, boolean z, Position pos) {
		super(n, i, z, pos);
		listeIngredients.add(this);
	}

}
  