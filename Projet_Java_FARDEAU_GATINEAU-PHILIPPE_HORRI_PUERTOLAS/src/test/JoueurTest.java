/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.temporal.JulianFields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import jeu.Bonus;
import jeu.Carte;
import jeu.Joueur;
import jeu.Position;
import jeu.Zone;

/**
 * @author Axel1
 *
 */
class JoueurTest {
	private FileInputStream village;
	private FileInputStream julia;
	private Image imVillage;
	private Image imJulia;
	private ImageView ivVillage;
	private ImageView ivJulia;
	private Carte carteVillage;
	private Joueur joueurJulia;
	private Bonus bFouet;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {

		village = new FileInputStream("./images/maps/centre.png");
		julia = new FileInputStream("./images/personnages/julia.png");
		imVillage = new Image(village);
		imJulia = new Image(julia);
		ivVillage = new ImageView();
		ivJulia = new ImageView();
		ivVillage.setImage(imVillage);
		ivJulia.setImage(imJulia);
		carteVillage = new Carte("Place du village", ivVillage, 0, 0);
		joueurJulia = new Joueur(10, "Julia", new Position(100, 100), carteVillage, ivJulia);
		
		bFouet = new Bonus("Fouet", new ImageView(), false, new Position(100, 100), 5, new Zone(new Position(50, 50), new Position(150,150)), carteVillage);
		Carte.ajouterBonus(bFouet);
	}

	/**
	 * Test method for {@link jeu.Joueur#deplacementHaut()}.
	 * 
	 * @throws FileNotFoundException
	 */
	@Test
	void testDeplacementHaut() throws FileNotFoundException {
		joueurJulia.deplacementHaut();
		assertEquals(95, joueurJulia.getPosition().getY());
		joueurJulia.setPosition(new Position(440, 515));
		joueurJulia.deplacementHaut();
		assertEquals(515, joueurJulia.getPosition().getY());
	}

	/**
	 * Test method for {@link jeu.Joueur#deplacementBas()}.
	 * 
	 * @throws FileNotFoundException
	 */
	@Test
	void testDeplacementBas() throws FileNotFoundException {
		joueurJulia.deplacementBas();
		assertEquals(105, joueurJulia.getPosition().getY());
		joueurJulia.setPosition(new Position(440, 515));
		joueurJulia.deplacementBas();
		assertEquals(515, joueurJulia.getPosition().getY());
	}

	/**
	 * Test method for {@link jeu.Joueur#deplacementGauche()}.
	 * 
	 * @throws FileNotFoundException
	 */
	@Test
	void testDeplacementGauche() throws FileNotFoundException {
		joueurJulia.deplacementGauche();
		assertEquals(95, joueurJulia.getPosition().getX());
		joueurJulia.setPosition(new Position(440, 515));
		joueurJulia.deplacementGauche();
		assertEquals(440, joueurJulia.getPosition().getX());
	}

	/**
	 * Test method for {@link jeu.Joueur#deplacementDroite()}.
	 * 
	 * @throws FileNotFoundException
	 */
	@Test
	void testDeplacementDroite() throws FileNotFoundException {
		joueurJulia.deplacementDroite();
		assertEquals(105, joueurJulia.getPosition().getX());
		joueurJulia.setPosition(new Position(440, 515));
		joueurJulia.deplacementDroite();
		assertEquals(440, joueurJulia.getPosition().getX());
	}

	/**
	 * Test method for {@link jeu.Joueur#ramasser(jeu.Objet)}.
	 */
	@Test
	void testRamasser() {
		joueurJulia.setPosition(new Position(100,100));
		assertEquals(0, joueurJulia.tailleSac());
		joueurJulia.ramasser(bFouet);
		assertEquals(1, joueurJulia.tailleSac());
	}
}
