package jeu;

import java.util.ArrayList;

public class Joueur extends Personne {
	private ArrayList<Objet> sac;
	private int capaciteSac;
	
	public Joueur(int c) {
		capaciteSac = c;
		sac = new ArrayList<Objet>();
	}

	public void seDeplacer(Deplacement d) {
	}

	public String afficherContenu() {
		String s = "";
		for (Objet o : sac) {
			s = s + o.toString();
		}
		return s;
	}

	public void ajouter(Objet o)
	{
		if (o != null) 
			sac.add(o);
		return; 
	}
}