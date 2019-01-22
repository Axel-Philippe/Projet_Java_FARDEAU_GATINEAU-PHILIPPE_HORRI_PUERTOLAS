package jeu;

import javafx.scene.image.Image;

public class Bonus extends Objet{
	private int nombreCookieBonus;

	public Bonus(String n, Image i, int nb) {
		super(n, i);
		nombreCookieBonus = nb;
	}

}
