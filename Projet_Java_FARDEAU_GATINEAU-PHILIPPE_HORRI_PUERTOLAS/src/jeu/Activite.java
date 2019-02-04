package jeu;

public class Activite {
	private String nom;
	private boolean estReussi;
	private Ingredient ingredient;
	
	
	public Activite(String n) {
		nom = n;
		estReussi = false; 
	}


	public void setReussi()
	{
		estReussi = true; 
	}

	public void lancerActivite() {}
	
}
