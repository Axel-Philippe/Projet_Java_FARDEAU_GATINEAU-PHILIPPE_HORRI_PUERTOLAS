package jeu;

/**
 * Classe Personne, super classe de Personnage et Joueur. Elle contient les méthodes générales relatives au personnages du jeu et au joueur.
 *
 */
public class Personne {
	private String nom;
	protected Position position;
	private Carte map;
	
	/**
	 * Constructeur de Personne
	 * @param n
	 * @param p
	 * @param map
	 */
	public Personne(String n, Position p, Carte map)
	{
		super();
		nom = n; 
		position = p;
		this.map = map;
	}

	/**
	 * Méthode qui permet d'attribuer une carte à une personne.
	 * @param map
	 */
	public void setCarte(Carte map) {
		this.map = map;
	}

	/**
	 * Méthode qui permet de récupérer le nom de la personne.
	 * @return nom
	 */
	public String getNom() {
		return this.nom;
	}
	
	/**
	 * Méthode qui permet de récuperer la carte sur laquelle est présente la personne.
	 * @return map
	 */
	public Carte getCarte() {
		return map;
	}

	/**
	 * Méthode qui permet de récuperer la position d'une personne.
	 * @return position
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * Méthode qui permet de positionner une personne.
	 * @param position
	 */
	public void setPosition(Position position) {
		this.position = position;
	}
	
}  