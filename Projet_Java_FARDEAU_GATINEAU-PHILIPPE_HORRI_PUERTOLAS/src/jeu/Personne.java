package jeu;

public class Personne {
	private String nom;
	private Position position;
	private Carte map;
	
	public Personne(String n, Position p, Carte map)
	{
		super();
		nom = n; 
		position = p;
		this.map = map;
	}
}  