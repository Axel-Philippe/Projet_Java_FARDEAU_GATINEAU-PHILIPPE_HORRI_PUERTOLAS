package jeu;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Bonus extends Objet{
	private int nombreCookieBonus;
	private Zone zone;
	private Carte carte;

	public Bonus(String n, ImageView i, boolean b, Position p, int nb, Zone z, Carte carte) {
		super(n, i, b, p);
		nombreCookieBonus = nb;
		this.carte = carte;
		this.zone = z;
	}
	
	public Carte getCarte() {
		return this.carte;
	}

	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}
	
	
}
   