/**
 * 
 */
package test.jeu;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import jeu.Bonus;
import jeu.Carte;
import jeu.Coffre;
import jeu.Ingredient;
import jeu.Objet;
import jeu.Position;
import jeu.Zone;

/**
 *
 */
class CoffreTest {
	private Position position1;
	private Position position2;
	private FileInputStream file;
	private Image image;
	private ImageView imv;
	private Ingredient ingredient1;
	private Bonus bonus1;
	private ArrayList listeObjetTest;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		position1 = new Position(0,0);
		position2 = new Position(0,0);
		
		file = new FileInputStream("./images/divers/test.png");
		image = new Image(file);
		imv = new ImageView(image);
		
		Zone zone = new Zone(position1, position2);
		Carte carte = new Carte("carte", imv, 0, 0);
		
		bonus1 = new Bonus("Bonus", imv, false, position1, 1, zone, carte);
		ingredient1 = new Ingredient("test", imv, false, position1);
		
		listeObjetTest = new ArrayList<Objet>();	
		listeObjetTest.add(bonus1);
		listeObjetTest.add(ingredient1);
		
		Coffre coffre = new Coffre(position1, position2, imv);
	}

	@Test
	void ajouterObjetsTest() {
		
		Coffre.ajouterObjets(listeObjetTest);
		//assertTrue(coffre.); CREER UNE METHODE GETOBJET DANS COFFRE
		
		
	}

}
