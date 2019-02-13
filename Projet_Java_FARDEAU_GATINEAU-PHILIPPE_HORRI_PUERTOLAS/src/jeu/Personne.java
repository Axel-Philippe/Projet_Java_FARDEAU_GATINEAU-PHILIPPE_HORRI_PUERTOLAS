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

	public void setMap(Carte map) {
		this.map = map;
	}

	public Carte getMap() {
		return map;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
}  