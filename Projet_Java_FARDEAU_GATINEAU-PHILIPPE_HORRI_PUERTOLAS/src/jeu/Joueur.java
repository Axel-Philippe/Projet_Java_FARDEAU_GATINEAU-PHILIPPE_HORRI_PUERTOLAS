package jeu;

import java.util.ArrayList;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

public class Joueur extends Personne {
	private ArrayList<Objet> sac;
	private int capaciteSac;
	private ImageView image;

	public Joueur(int c, String n, Position p, Carte map, ImageView image) {
		super(n, p, map);
		capaciteSac = c;
		sac = new ArrayList<Objet>();
		this.image = image;
		this.image.setX(p.getX());
		this.image.setY(p.getY());
	}

	@Override
	public void setPosition(Position p) {
		this.position = p;
		this.setPositionImage(p);
		System.out.println(p.getX()+ " "+p.getY());
	}

	public void setPositionImage(Position p) {
		this.image.setX(p.getX());
		this.image.setY(p.getY());
	}

	public Carte seDeplacer(KeyEvent event) {
		switch (event.getCode()) {
		case UP:
			if (this.getPosition().getX() < 536 && this.getPosition().getX() > -6 && this.getPosition().getY() > 0
					&& this.getPosition().getY() < 395) {
				this.setPosition(new Position(this.getPosition().getX(), this.getPosition().getY() - 5));
				this.setPositionImage(this.getPosition());
			}
			return null;
		case DOWN:
			if (this.getPosition().getX() < 536 && this.getPosition().getX() > -6 && this.getPosition().getY() > -6
					&& this.getPosition().getY() < 380) {
				this.setPosition(new Position(this.getPosition().getX(), this.getPosition().getY() + 5));
				this.setPositionImage(this.getPosition());
			}
			return null;
		case LEFT:
			if (this.getPosition().getX() < 536 && this.getPosition().getX() > 0 && this.getPosition().getY() > -6
					&& this.getPosition().getY() < 395) {
				this.setPosition(new Position(this.getPosition().getX() - 5, this.getPosition().getY()));
				this.setPositionImage(this.getPosition());
			}
			return null;
		case RIGHT:
			if (this.getPosition().getX() < 530 && this.getPosition().getX() > -6 && this.getPosition().getY() > -6
					&& this.getPosition().getY() < 395) {
				this.setPosition(new Position(this.getPosition().getX() + 5, this.getPosition().getY()));
				this.setPositionImage(this.getPosition());
			}
			return null;
		case E:
			Carte m = this.getCarte();
			ArrayList<Objet> l = this.getCarte().getLesBonus();
			Objet o;
			for (int i = 0; i < l.size(); i++) {
				o = l.get(i);
				if (this.getPosition().getX() > o.getZoneObjet().getP1().getX()
						&& this.getPosition().getX() < o.getZoneObjet().getP2().getX()
						&& this.getPosition().getY() > o.getZoneObjet().getP1().getY()
						&& this.getPosition().getY() < o.getZoneObjet().getP2().getY()) {
					this.ramasser(o);
					o.setPresent(true);
					o.getImageView().setVisible(false);
				}
			}

			return null;
		case A:
			
			Carte map = this.getCarte();
			ArrayList<Zone> zones = new ArrayList<Zone>();
			zones = map.getLesSorties();
			Zone c;
			for (int i = 0; i < zones.size(); i++) {
				c = zones.get(i);
				if (this.getPosition().getX() > c.getP1().getX() && this.getPosition().getX() < c.getP2().getX()
						&& this.getPosition().getY() > c.getP1().getY()
						&& this.getPosition().getY() < c.getP2().getY()) {
					switch(c.getDeplacement()) {
					case DROITE:
						this.setPosition(new Position(50, 200));
						break;
					case GAUCHE:
						this.setPosition(new Position(450, 200));
						break;
					case HAUT:
						this.setPosition(new Position(220, 380));
						break;
					case BAS:
						this.setPosition(new Position(220, 0));
						break;
					}
					return c.getCarte();

				}
			}
			return null;
		}
		return null;
	}

	public String afficherContenu() {
		String s = "";
		for (Objet o : sac) {
			s = s + o.toString();
		}
		return s;
	}

	public void ramasser(Objet o) {
		if (o != null)
			sac.add(o);
		return;
	}

	public void proposerSolution(Enigme e, String sol) {
		if (e.getSolution() == sol) {
			e.setReussi();

		}
	}

	public ImageView getImage() {
		return image;
	}

}