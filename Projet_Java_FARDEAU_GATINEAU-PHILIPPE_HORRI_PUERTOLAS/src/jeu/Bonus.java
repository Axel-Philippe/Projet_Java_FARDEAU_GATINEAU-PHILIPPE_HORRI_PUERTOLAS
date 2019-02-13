package jeu;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Bonus extends Objet{
	private int nombreCookieBonus;
	private Zone zone;

	public Bonus(String n, ImageView i, boolean b, Position p, int nb, Zone z) {
		super(n, i, b, p);
		nombreCookieBonus = nb;
		zone = z;
	}

}
   