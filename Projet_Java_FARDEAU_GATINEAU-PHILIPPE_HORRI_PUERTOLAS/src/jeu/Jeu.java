package jeu;

public class Jeu {
	private Personne personne;
	private Carte map;
	
	
	public Jeu(Personne p, Carte m) {
		super();
		personne = p;
		map = m;
	}

	public void demarrerJeu() {}
	
	public String afficherMenu(){
		return null;
	}
	
	public void quitter() {}
	
	public void reset() {}
}
