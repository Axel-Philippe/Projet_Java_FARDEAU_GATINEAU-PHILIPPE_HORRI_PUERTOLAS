package jeu;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Bonus extends Objet{
	private int nombreCookieBonus;

	public Bonus(String n, ImageView i, int nb) {
		super(n, i);
		nombreCookieBonus = nb;
	}

}
