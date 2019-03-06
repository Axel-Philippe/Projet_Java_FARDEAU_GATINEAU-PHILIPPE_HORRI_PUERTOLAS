package jeu;

/**
 * Classe Activite, super-classe de Enigme et Jeu. 
 * @author all
 *
 */
public class Activite {
	private String nom;
	private boolean estReussi;
	private Ingredient ingredient;
	
	/**
	 * Constructeur de la classe Activite
	 * @param n
	 */
	public Activite(String n) {
		super();
		nom = n;
		estReussi = false; 
	}


	/**
	 * Méthode permettant de passer "estReussi" à vrai lorsque l'on réussi une énigme 
	 */
	public void setReussi()
	{
		estReussi = true; 
	}

	/**
	 * Méthode qui permet de récuperer la valeur de "estReussi"
	 * @return estReussi
	 */
	public boolean getReussi() {
		return this.estReussi;
	}
	
	/**
	 * Méthode qui permet de récuperer la valeur de l'ingrédient
	 * @return ingredient
	 */
	public Ingredient getIngredient() {
		return this.ingredient;
	}
	 
	/**
	 * Méthode qui permet de mettre l'ingrédient de l'activité "this" à i
	 * @param i
	 */
	public void setIngredient(Ingredient i) {
		this.ingredient = i;
	}
}
