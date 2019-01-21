package jeu;

public class Personnage extends Personne {
	
	Activite activite;
	
	public Personnage (Activite a, String n, Position p) {
		super(n, p); 
		activite = a; 
	}
	
	public String parler(Joueur j) {
		return null;
	}
}
