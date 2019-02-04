package jeu;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Bonus extends Objet{
	private int nombreCookieBonus;
	private Zone zone;

	public Bonus(String n, ImageView i, Position p, int nb, Zone z) {
		super(n, i, p);
		nombreCookieBonus = nb;
		zone = z;
	}

}
