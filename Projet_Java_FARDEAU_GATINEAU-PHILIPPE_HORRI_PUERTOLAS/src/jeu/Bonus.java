package jeu;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Classe Bonus qui contient toutes les méthodes concernant les bonus. Les bonus donnent des points en plus à la fin du jeu. 
 * @author all
 *
 */
public class Bonus extends Objet{
	private int nombreCookieBonus;
	private Zone zone;
	private Carte carte;

	/**
	 * Constructeur de la classe Bonus
	 * @param n
	 * @param i
	 * @param b
	 * @param p
	 * @param nb
	 * @param z
	 * @param carte
	 */
	public Bonus(String n, ImageView i, boolean b, Position p, int nb, Zone z, Carte carte) {
		super(n, i, b, p);
		nombreCookieBonus = nb;
		this.carte = carte;
		this.zone = z;
	}
	
	/**
	 * Méthode qui permet de récupérer la carte courante
	 * @return
	 */
	public Carte getCarte() {
		return this.carte;
	}

	/**
	 * Méthode qui permet de récupérer la carte zone courante
	 * @return zone
	 */
	public Zone getZone() {
		return zone;
	}

	/**
	 * Méthode qui permet de mettre la zone du bonus à "this"
	 * @param zone
	 */
	public void setZone(Zone zone) {
		this.zone = zone;
	}
	
	/**
	 * Méthode qui permet de récuperer le nombre de cookies bonus
	 * @return nombreCookieBonus
	 */
	public int getNbCookies() {
		return nombreCookieBonus;
	}
	
	
}
   