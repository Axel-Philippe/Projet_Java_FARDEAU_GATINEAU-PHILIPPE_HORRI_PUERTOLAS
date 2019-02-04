package jeu;

public class Jeu {
	private Personne personne;
	private Map map;
	
	
	public Jeu(Personne p, Map m) {
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
