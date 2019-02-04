package jeu;

import java.util.ArrayList;

import javafx.scene.image.ImageView;

public class Joueur extends Personne {
	private ArrayList<Objet> sac;
	private int capaciteSac;
	private ImageView image;
	
	public Joueur(int c, String n, Position p, Map map) {
		super(n, p, map);
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

	public void ramasser(Objet o)
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