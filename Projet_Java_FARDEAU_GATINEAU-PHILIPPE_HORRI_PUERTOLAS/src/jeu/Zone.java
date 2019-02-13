package jeu;

public class Zone {


	private Position p1;
	private Position p2;
	private Deplacement d;
	private Carte carte;
	
	
	public Zone( Position p1, Position p2, Deplacement d, Carte carte) {
		super();
		this.p2 = p2;
		this.p1 = p1;
		this.d = d;
		this.carte = carte;
	}

	public Zone( Position p1, Position p2) {
		super();
		this.p2 = p2;
		this.p1 = p1;	
	}

	public Position getP1() {
		return p1;
	}

	public void setP1(Position p1) {
		this.p1 = p1;
	}


	public Position getP2() {
		return p2;
	}


	public void setP2(Position p2) {
		this.p2 = p2;
	}
	
	public Carte getCarte() {
		return carte;
	}
	
}
