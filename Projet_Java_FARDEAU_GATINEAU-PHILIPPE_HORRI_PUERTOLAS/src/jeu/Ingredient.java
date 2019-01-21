package jeu;

import java.util.ArrayList;

import javafx.scene.image.Image;

public class Ingredient extends Objet{
	private static ArrayList<Ingredient> listeIngredients = new ArrayList<Ingredient>();
	private boolean present;

	public Ingredient(String n, Image i, boolean p) {
		super(n, i);
		listeIngredients.add(this);
		present = p;
	}

}
