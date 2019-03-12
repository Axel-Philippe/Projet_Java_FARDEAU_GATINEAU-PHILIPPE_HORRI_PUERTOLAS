package test.jeu;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import jeu.Bonus;
import jeu.Carte;
import jeu.Enigme;
import jeu.Ingredient;
import jeu.Personnage;
import jeu.Position;
import jeu.Zone;

class CarteTest {

	@Test
	void ajouterPersonnageTest() throws FileNotFoundException {
		FileInputStream file = new FileInputStream("./images/divers/test.png");
		Image image = new Image(file);
		ImageView imv = new ImageView(image);

		Position position = new Position(0,0);
		Position posZone1 = new Position(0,0);
		Position posZone2 = new Position(0,0);
		
		Zone zone = new Zone(posZone1, posZone2);
		Ingredient i = new Ingredient("test", imv, false, position);
		Carte carte = new Carte("carte", imv, 0, 0);
		Personnage personnage = new Personnage("test", position, imv, i, carte, zone);
		
		carte.ajouterPersonnage(personnage);
		assertTrue(carte.getLesPersonnages().get(0)==personnage);
	}
	
	@Test
	void ajouterBonusTest() throws FileNotFoundException{
		FileInputStream file = new FileInputStream("./images/divers/test.png");
		Image image = new Image(file);
		ImageView imv = new ImageView(image);

		Position position = new Position(0,0);
		Position posZone1 = new Position(0,0);
		Position posZone2 = new Position(0,0);
		
		Zone zone = new Zone(posZone1, posZone2);
		Carte carte = new Carte("carte", imv, 0, 0);
		Bonus bonus = new Bonus("Bonus", imv, false, position, 1, zone, carte);
		
		carte.ajouterBonus(bonus);
		assertTrue(carte.getLesBonus().get(0)==bonus);
	}
	
	
	@Test
	void ajouterZoneTest() throws FileNotFoundException{
		FileInputStream file = new FileInputStream("./images/divers/test.png");
		Image image = new Image(file);
		ImageView imv = new ImageView(image);

		Position position = new Position(0,0);
		Position posZone1 = new Position(0,0);
		Position posZone2 = new Position(0,0);
		
		Zone zone = new Zone(posZone1, posZone2);
		Carte carte = new Carte("carte", imv, 0, 0);
		
		carte.ajouterZone(zone);
		assertTrue(carte.getLesSorties().get(0)==zone);
	}
	@Test
	void personnageVisibleTest() throws FileNotFoundException {
		FileInputStream file = new FileInputStream("./images/divers/test.png");
		Image image = new Image(file);
		ImageView imv = new ImageView(image);

		Position position = new Position(0,0);
		Position posZone1 = new Position(0,0);
		Position posZone2 = new Position(0,0);
		
		Zone zone = new Zone(posZone1, posZone2);
		Ingredient i = new Ingredient("test", imv, false, position);
		Carte carte = new Carte("carte", imv, 0, 0);
		Personnage personnage = new Personnage("test", position, imv, i, carte, zone);
		
		
	}

}
