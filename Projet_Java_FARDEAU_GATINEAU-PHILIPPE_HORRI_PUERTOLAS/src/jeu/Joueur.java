package jeu;

import java.util.ArrayList;

public class Joueur extends Personne {
	private ArrayList<Objet> sac;
	private int capaciteSac;
	
	public Joueur(int c, String n, Position p) {
		super(n, p);
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
	
	public void proposerSolution(Enigme e, String sol)
	{
		if (e.getSolution() == sol)
		{
			e.setReussi();
			
		}
	}
}