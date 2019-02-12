package jeu;

public class Zone {

	private Position p1;
	private Position p2;
	private Deplacement d; 
	
	
	public Zone( Position p1, Position p2, Deplacement d) {
		super();
		this.p2 = p2;
		this.p1 = p1;
		this.d = d;
	}
}
