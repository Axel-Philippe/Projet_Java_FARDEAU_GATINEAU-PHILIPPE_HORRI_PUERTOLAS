package jeu;

import java.util.ArrayList;

public class Enigme extends Activite{
	private String solution;
	private String intitule;
	private ArrayList<String> proposition;
	
	public Enigme(String n, String s, String i, String p1, String p2, String p3) {
		super(n);
		solution = s;	
		intitule = i;
		this.proposition = new ArrayList<String>();
		this.proposition.add(p1);
		this.proposition.add(p2);
		this.proposition.add(p3);
	}
	
	public String getSolution()
	{
		return this.solution;
	}
	
	public ArrayList<String> getProposition(){
		return this.proposition;
	}
}
