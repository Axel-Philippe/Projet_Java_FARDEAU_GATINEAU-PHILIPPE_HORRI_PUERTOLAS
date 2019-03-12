package test.jeu;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import jeu.Bonus;
import jeu.Carte;
import jeu.Position;
import jeu.Zone;

class BonusTest {

	@Test
	void getCarteTest() throws FileNotFoundException {
		FileInputStream file = new FileInputStream("./images/divers/test.png");
		Image image = new Image(file);
		ImageView imv = new ImageView(image);

		Position position = new Position(0,0);
		Position posZone1 = new Position(0,0);
		Position posZone2 = new Position(0,0);
		
		Zone zone = new Zone(posZone1, posZone2);
		Carte carte = new Carte("carte", imv, 0, 0);
		
		Bonus bonus = new Bonus("Bonus", imv, false, position, 1, zone, carte);
		assertTrue(bonus.getCarte()==carte);
	}
	
	@Test
	void getZoneTest() throws FileNotFoundException {
		FileInputStream file = new FileInputStream("./images/divers/test.png");
		Image image = new Image(file);
		ImageView imv = new ImageView(image);

		Position position = new Position(0,0);
		Position posZone1 = new Position(0,0);
		Position posZone2 = new Position(0,0);
		
		Zone zone = new Zone(posZone1, posZone2);
		Carte carte = new Carte("carte", imv, 0, 0);
		
		Bonus bonus = new Bonus("Bonus", imv, false, position, 1, zone, carte);
		assertTrue(bonus.getZone() == zone);
	}
	
	@Test
	void setZoneTest() throws FileNotFoundException {
		FileInputStream file = new FileInputStream("./images/divers/test.png");
		Image image = new Image(file);
		ImageView imv = new ImageView(image);

		Position position = new Position(0,0);
		Position posZone1 = new Position(0,0);
		Position posZone2 = new Position(0,0);
		
		Zone zone = new Zone(posZone1, posZone2);
		Zone newZone = new Zone(posZone1, posZone2);
		Carte carte = new Carte("carte", imv, 0, 0);
		
		Bonus bonus = new Bonus("Bonus", imv, false, position, 1, zone, carte);
		bonus.setZone(newZone);
		
		assertTrue(bonus.getZone() == newZone);
	}

}
