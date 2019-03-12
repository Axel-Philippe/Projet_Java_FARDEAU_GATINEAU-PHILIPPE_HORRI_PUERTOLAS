package jeu;

import javafx.scene.image.ImageView;

/**
 * Classe abstraite Objet. Il s'agit de la super classe de tous les objets du jeu (bonus et ingrédients)
 *
 */
public abstract class Objet {
	private String nom;
	private ImageView image;
	private Position position;
	private boolean present;
	private Carte carte;

	
	/**
	 * Constructeur de la classe Objet.
	 * @param nom
	 * @param image
	 * @param present
	 * @param p
	 */
	public Objet(String nom, ImageView image, boolean present, Position p) {
		super();
		this.nom = nom;
		this.image = image;
		this.position = p;
		this.present = present;
		this.setPositionImage(position);
	}

	/**
	 * Méthode qui retourne "true" si l'objet est présent.
	 * @return
	 */
	public boolean isPresent() {
		return present;
	}

	/**
	 * Méthode qui permet de mettre l'objet comme présent.
	 * @param present
	 */
	public void setPresent(boolean present) {
		this.present = present;
	}

	/**
	 * Méthode permettant de récuprer la position de l'objet.
	 * @return position
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * Méthode permettant de placer l'objet sur la carte.
	 * @param position
	 */
	public void setPosition(Position position) {
		this.position = position;
	}

	/**
	 * Méthode permettant de récuperer le nom de l'objet.
	 */
	 
	public String getNom() {
		return nom;
	}
	
	/**
	 * Méthode permettant de récuperer l'image de l'objet.
	 * @return image
	 */
	public ImageView getImageView(){
		return this.image;
	}
	
	/**
	 * Méthode permettant de placer la position de l'image de l'objet.
	 * @param p
	 */
	public void setPositionImage(Position p) {
		this.image.setX(p.getX());
		this.image.setY(p.getY());
	}
	
	/**
	 * Méthode permettant de placer l'objet.
	 * @param x
	 * @param y
	 */
	public void setPosition(int x, int y){
		this.position.setX(x);
		this.position.setY(y);
	} 
}
