package jeu;

public class Enigme extends Activite{
	private String solution;
	private String intitule;
	
	public Enigme(String n, String s, String i) {
		super(n);
		solution = s;	
		intitule = i;
	}

}
