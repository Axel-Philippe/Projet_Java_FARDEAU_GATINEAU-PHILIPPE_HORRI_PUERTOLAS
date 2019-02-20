package jeu;

public class Activite {
	private String nom;
	private boolean estReussi;
	private Ingredient ingredient;
	
	
	public Activite(String n) {
		super();
		nom = n;
		estReussi = false; 
	}


	public void setReussi()
	{
		estReussi = true; 
	}

	public void lancerActivite() {
		
	}
	
	public boolean getReussi() {
		return this.estReussi;
	}
	
	public Ingredient getIngredient() {
		return this.ingredient;
	}
	 
}
