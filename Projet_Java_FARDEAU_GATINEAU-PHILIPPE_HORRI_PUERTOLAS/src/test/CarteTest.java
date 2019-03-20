package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
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
	void ajouterPersonnageTest() throws FileNotFoundException {
		Ingredient i = new Ingredient("test", imv, false, position);
		Personnage personnage = new Personnage("test", position, imv, i, carte, zone);
		
		carte.ajouterPersonnage(personnage);
		assertTrue(carte.getLesPersonnages().get(0)==personnage);
	}
	
	@Test
	void ajouterBonusTest() throws FileNotFoundException{
		Bonus bonus = new Bonus("Bonus", imv, false, position, 1, zone, carte);
		
		carte.ajouterBonus(bonus);
		assertTrue(carte.getLesBonus().get(0)==bonus);
	}
	
	
	@Test
	void ajouterZoneTest() throws FileNotFoundException{		
		carte.ajouterZone(zone);
		assertTrue(carte.getLesSorties().get(0)==zone);
	}
	
	@Test
	void personnageVisibleTest() throws FileNotFoundException {
		Ingredient i = new Ingredient("test", imv, false, position);
		Personnage personnage = new Personnage("test", position, imv, i, carte, zone);
		
		carte.ajouterPersonnage(personnage);
		carte.personnageVisible();
		assertTrue(personnage.getImage().isVisible());
	}
	
	@Test
	void bonusVisibleTest() throws FileNotFoundException {
		Bonus bonus = new Bonus("Bonus", imv, false, position, 1, zone, carte);
		
		carte.ajouterBonus(bonus);
		carte.bonusVisible();
		assertTrue(bonus.getImageView().isVisible());
	}
	
	@Test
	void getNomTest() {
		assertTrue(carte.getNom()=="carte");
	}
	
	@Test
	void getImageTest() {
		assertTrue(carte.getImage()==imv);
	}
	
	@Test
	void getLesSorties() {
		carte.ajouterZone(zone);
		assertTrue(carte.getLesSorties().get(0) == zone);
	}
	
	@Test
	void getLesBonus() {
		Bonus bonus = new Bonus("Bonus", imv, false, position, 1, zone, carte);
		carte.ajouterBonus(bonus);
		
		assertTrue(carte.getLesBonus().get(0)==bonus);
	}
	
	@Test 
	void getLesPersonnages() {
		Ingredient i = new Ingredient("test", imv, false, position);
		Personnage personnage = new Personnage("test", position, imv, i, carte, zone);
		carte.ajouterPersonnage(personnage);
		assertTrue(carte.getLesPersonnages().get(0) == personnage);	
	}
}
