/**
 * 
 */
package test.jeu;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import jeu.Activite;
import jeu.Ingredient;
import jeu.Position;

/**
 * @author Axel1
 *
 */
class ActiviteTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void setReussiTest() {
		Activite activite = new Activite("test");
		activite.setReussi();
		
		assertTrue(activite.getReussi());
	}
	
	@Test
	void getReussiTest() {
		Activite activite = new Activite ("test");
		
		assertFalse(activite.getReussi()); // elle est par défaut false
	}
	
	@Test
	void getSetIngredientTest() throws FileNotFoundException {
		FileInputStream file = new FileInputStream("./images/divers/test.png");
		Image image = new Image(file);
		ImageView imv = new ImageView(image);
		
		Position position = new Position(0,0);
		
		Activite activite = new Activite("test");
		Ingredient i = new Ingredient("test", imv, false, position);
		activite.setIngredient(i);
		
		assertTrue(activite.getIngredient() == i);
	}
	

}
