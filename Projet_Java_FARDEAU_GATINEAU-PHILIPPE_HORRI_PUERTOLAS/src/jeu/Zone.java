package jeu;

/**
 * Classe Zone permettant de définir les zones sur lesquelles sont placés les objets, personnes, ou encore les chemins vers les autres cartes.
 *
 */
public class Zone {


	private Position p1;
	private Position p2;
	private Deplacement d;
	private Carte carte;
	
	/**
	 * Constructeur de Zone.
	 * @param p1
	 * @param p2
	 * @param d
	 * @param carte
	 */
	public Zone( Position p1, Position p2, Deplacement d, Carte carte) {
		super();
		this.p2 = p2;
		this.p1 = p1;
		this.d = d;
		this.carte = carte;
	}

	/**
	 * Constructeur de Zone sans déplacement ni carte.
	 * @param p1
	 * @param p2
	 */
	public Zone( Position p1, Position p2) {
		super();
		this.p2 = p2;
		this.p1 = p1;	
	}

	/**
	 * Méthode qui permet de récuperer la position 1 de la zone (expliquer en détail).
	 * @return p1
	 */
	public Position getP1() {
		return p1;
	}

	/**
	 * Méthode qui permet de définir la position 1 de la zone (expliquer en détail).
	 * @param p1
	 */
	public void setP1(Position p1) {
		this.p1 = p1;
	}

	/**
	 * Méthode qui permet de récuperer la position 2 de la zone (expliquer en détail).
	 * @return p2
	 */
	public Position getP2() {
		return p2;
	}

	/**
	 * Méthode qui permet de définir la position 1 de la zone (expliquer en détail).
	 * @param p2
	 */
	public void setP2(Position p2) {
		this.p2 = p2;
	}
	
	/**
	 * Méthode qui permet de récuperer la carte sur laquelle se trouve la zone.
	 * @return carte
	 */
	public Carte getCarte() {
		return carte;
	}

	/**
	 * Méthode qui permet de récuperer le sens de déplacement de la zone.
	 * @return d
	 */
	public Deplacement getDeplacement() {
		return d;
	}

	/**
	 * Méthode qui permet de définir le sens de déplacement de la zone.
	 * @param d
	 */
	public void setDeplacement(Deplacement d) {
		this.d = d;
	}
	
	
	
}
