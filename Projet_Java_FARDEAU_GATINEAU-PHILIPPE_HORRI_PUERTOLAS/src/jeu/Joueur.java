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

	public void seDeplacer(KeyEvent event) {
		switch (event.getCode()) {
		case UP:
			if (image.getX() < 536 && image.getX() > -6 && image.getY() > 0 && image.getY() < 395)
				image.setY(image.getY() - 5);
			break;
		case DOWN:
			if (image.getX() < 536 && image.getX() > -6 && image.getY() > -6 && image.getY() < 380)
				image.setY(image.getY() + 5);
			break;
		case LEFT:
			if (image.getX() < 536 && image.getX() > 0 && image.getY() > -6 && image.getY() < 395)
				image.setX(image.getX() - 5);
			break;
		case RIGHT:
			if (image.getX() < 530 && image.getX() > -6 && image.getY() > -6 && image.getY() < 395)
				image.setX(image.getX() + 5);
			break;
		case E:
			if (image.getX() > 400 && image.getX() < 546 && image.getY() >= 0 && image.getY() < 100) {

				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Interaction Objet");
				alert.setHeaderText("Vous avez intéragi avec un objet en pressant la touche 'E'.");
				alert.setContentText("Cliquez sur la croix pour fermer.");
				alert.showAndWait();
			}
			break;
		
		}
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
}