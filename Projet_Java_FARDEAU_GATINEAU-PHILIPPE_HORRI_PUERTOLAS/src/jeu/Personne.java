package jeu;

public class Personne {
	private String nom;
	private Position position;
	private Map map;
	
	public Personne(String n, Position p, Map map)
	{
		nom = n; 
		position = p;
		this.map = map;
	}
}