package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import jeu.Activite;
import jeu.Bonus;
import jeu.Carte;
import jeu.Position;
import jeu.Zone;

class BonusTest {
	private FileInputStream file;
	private Image image;
	private ImageView imv;
	private Position position;
	private Position posZone1;
	private Position posZone2;
	private Zone zone;
	private Carte carte;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		file = new FileInputStream("./images/divers/test.png");
		image = new Image(file);
		imv = new ImageView(image);

		position = new Position(0,0);
		posZone1 = new Position(0,0);
		posZone2 = new Position(0,0);
		
		zone = new Zone(posZone1, posZone2);
		carte = new Carte("carte", imv, 0, 0);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void getCarteTest() throws FileNotFoundException {
		Bonus bonus = new Bonus("Bonus", imv, false, position, 1, zone, carte);
		assertTrue(bonus.getCarte()==carte);
	}
	
	@Test
	void getZoneTest() throws FileNotFoundException {
		Bonus bonus = new Bonus("Bonus", imv, false, position, 1, zone, carte);
		assertTrue(bonus.getZone() == zone);
	}
	
	@Test
	void setZoneTest() throws FileNotFoundException {
		Zone newZone = new Zone(posZone1, posZone2);
		
		Bonus bonus = new Bonus("Bonus", imv, false, position, 1, zone, carte);
		bonus.setZone(newZone);
		
		assertTrue(bonus.getZone() == newZone);
	}

}
