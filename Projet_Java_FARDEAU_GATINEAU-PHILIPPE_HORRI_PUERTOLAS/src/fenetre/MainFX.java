package fenetre;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import jeu.Activite;
import jeu.Bonus;
import jeu.Carte;
import jeu.Deplacement;
import jeu.Enigme;
import jeu.Ingredient;
import jeu.Joueur;
import jeu.MapAnnexe;
import jeu.MapPrincipale;
import jeu.Objet;
import jeu.Personnage;
import jeu.Position;
import jeu.Zone;

public class MainFX extends Application {

	public MainFX() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	/**
	 * Méthode permettant d'initialiser les éléments graphiques
	 * @throws FileNotFoundException
	 */
	public static void initialiser(Stage stage) throws FileNotFoundException {
		// Initialisation des fichiers des cartes
		FileInputStream village = new FileInputStream("./images/maps/centre.png");
		FileInputStream lac = new FileInputStream("./images/maps/lac.png");
		FileInputStream mine = new FileInputStream("./images/maps/mine.png");
		FileInputStream ferme = new FileInputStream("./images/maps/ferme.png");
		FileInputStream maison = new FileInputStream("./images/maps/maison.png");
		FileInputStream foret = new FileInputStream("./images/maps/foret.png");
		
		// Initialisation des fichiers des personnages et du joueur
		FileInputStream julia = new FileInputStream("./images/personnages/julia.png");
		FileInputStream bucheron = new FileInputStream("./images/personnages/bucheron.png");
		FileInputStream fermiere = new FileInputStream("./images/personnages/fermiere.png");
		FileInputStream pecheur = new FileInputStream("./images/personnages/pecheur.png");
		FileInputStream quies1 = new FileInputStream("./images/personnages/quies1.png");
		FileInputStream quies2 = new FileInputStream("./images/personnages/quies2.png");
		FileInputStream quies3 = new FileInputStream("./images/personnages/quies3.png");
		FileInputStream quiesMaire = new FileInputStream("./images/personnages/quiesMaire.png");
		
		// Initialisation des ingrédients
		FileInputStream beurre = new FileInputStream("./images/ingredients/beurre.png");
		FileInputStream chocolat = new FileInputStream("./images/ingredients/chocolat.png");
		FileInputStream farine = new FileInputStream("./images/ingredients/farine.png");
		FileInputStream oeufs = new FileInputStream("./images/ingredients/oeufs.png");
		FileInputStream sucre = new FileInputStream("./images/ingredients/sucre.png");
		
		// Initialisation des bonus
		FileInputStream fouet = new FileInputStream("./images/bonus/fouet.png");
		FileInputStream maryse = new FileInputStream("./images/bonus/maryse.png");
		FileInputStream papier = new FileInputStream("./images/bonus/papier.png");
		FileInputStream plaque = new FileInputStream("./images/bonus/plaque.png");
		FileInputStream saladier = new FileInputStream("./images/bonus/saladier.png");
		
		// Initialisation des images
		Image imVillage = new Image(village);
		Image imLac = new Image(lac);
		Image imMine = new Image(mine);
		Image imFerme = new Image(ferme);
		Image imMaison = new Image(maison);
		Image imForet = new Image(foret);
		
		Image imJulia = new Image(julia);
		Image imBucheron = new Image(bucheron);
		Image imFermiere = new Image(fermiere);
		Image imPecheur = new Image(pecheur);
		Image imQuies1 = new Image(quies1);
		Image imQuies2 = new Image(quies2);
		Image imQuies3 = new Image(quies3);
		Image imQuiesMaire = new Image(quiesMaire);
		
		Image imBeurre = new Image(beurre);
		Image imChocolat = new Image(chocolat);
		Image imFarine = new Image(farine);
		Image imOeufs = new Image(oeufs);
		Image imSucre = new Image(sucre);
		
		Image imFouet = new Image(fouet);
		Image imMaryse = new Image(maryse);
		Image imPapier = new Image(papier);
		Image imPlaque= new Image(plaque);
		Image imSaladier = new Image(saladier);

		// Initialisation des imageViews	
		ImageView ivVillage = new ImageView();
		ImageView  ivLac = new ImageView();
		ImageView  ivMine = new ImageView();
		ImageView  ivFerme = new ImageView();
		ImageView  ivMaison = new ImageView();
		ImageView  ivForet = new ImageView();
		
		ImageView  ivJulia = new ImageView();
		ImageView  ivBucheron = new ImageView();
		ImageView  ivFermiere = new ImageView();
		ImageView  ivPecheur = new ImageView();
		ImageView  ivQuies1 = new ImageView();
		ImageView  ivQuies2 = new ImageView();
		ImageView  ivQuies3 = new ImageView();
		ImageView  ivQuiesMaire = new ImageView();
		
		ImageView  ivBeurre = new ImageView();
		ImageView  ivChocolat = new ImageView();
		ImageView  ivFarine = new ImageView();
		ImageView  ivOeufs = new ImageView();
		ImageView  ivSucre = new ImageView();
		
		ImageView  ivFouet = new ImageView();
		ImageView  ivMaryse = new ImageView();
		ImageView  ivPapier = new ImageView();
		ImageView  ivPlaque= new ImageView();
		ImageView  ivSaladier = new ImageView();
		
		//Initialisation des imageViews
		ivVillage.setImage(imVillage);
		ivLac.setImage(imLac);
		ivMine.setImage(imMine);
		ivFerme.setImage(imFerme);
		ivMaison.setImage(imMaison);
		ivForet.setImage(imForet);
		
		ivJulia.setImage(imJulia);
		ivBucheron.setImage(imBucheron);
		ivFermiere.setImage(imFermiere);
		ivPecheur.setImage(imPecheur);
		ivQuies1.setImage(imQuies1);
		ivQuies2.setImage(imQuies2);
		ivQuies3.setImage(imQuies3);
		ivQuiesMaire.setImage(imQuiesMaire);
				
		ivBeurre.setImage(imBeurre);
		ivChocolat.setImage(imChocolat);
		ivFarine.setImage(imFarine);
		ivOeufs.setImage(imOeufs);
		ivSucre.setImage(imSucre);
		
		ivFouet.setImage(imFouet);
		ivMaryse.setImage(imMaryse);
		ivPapier.setImage(imPapier);
		ivPlaque.setImage(imPlaque);
		ivSaladier.setImage(imSaladier);
		
		// Initialisation des cartes 		
		Carte carteVillage = new MapPrincipale("Place du village", ivVillage, 0, 0);
		Carte carteLac = new MapAnnexe("Lac", ivLac, 0, 0);
		Carte carteMine = new MapAnnexe("Mine", ivMine, 0, 0);
		Carte carteFerme = new MapAnnexe("Ferme", ivFerme, 0, 0);
		Carte carteMaison = new MapAnnexe("Maison", ivMaison, 0, 0);
		Carte carteForet = new MapAnnexe("Forêt", ivForet, 0, 0);
		
		// Initialisation des positions main
		Position positionMainHaut1 = new Position(50,-6);
		Position positionMainHaut2 = new Position(490,50);
		Position positionMainBas1 = new Position(40,355);
		Position positionMainBas2 = new Position(500,416);
		Position positionMainGauche1 = new Position(-6,80);
		Position positionMainGauche2 = new Position(45,360);
		Position positionMainDroite1 = new Position(500,80);
		Position positionMainDroite2 = new Position(543,360);
		
		// Initialisation des positions
		Position positionJulia = new Position(0,0);
		Position positionBucheron = new Position(400,155);
		Position positionFermiere = new Position(90,125);
		Position positionPecheur = new Position(140,100);
		Position positionQuies1 = new Position(130,110);
		Position positionQuies2 = new Position(350,90);
		Position positionQuies3 = new Position(110,250);
		Position positionMaire = new Position(245,210);
		
		Position positionBeurre = new Position(0,0);
		Position positionChocolat = new Position(0,0);
		Position positionFarine = new Position(0,0);
		Position positionOeufs = new Position(0,0);
		Position positionSucre = new Position(0,0);
		
		Position positionFouet = new Position(430,10);
		Position positionMaryse = new Position(20,40);
		Position positionPapier = new Position(370,65);
		Position positionPlaque = new Position(25,260);
		Position positionSaladier = new Position(5,270);
		
		Position positionZoneFouet1 = new Position(430,0);
		Position positionZoneFouet2 = new Position(546,70);
		Position positionZoneMaryse1 = new Position(15,15);
		Position positionZoneMaryse2 = new Position(80,80);
		Position positionZonePapier1 = new Position(340,30);
		Position positionZonePapier2 = new Position(395,90);
		Position positionZonePlaque1 = new Position(5,240);
		Position positionZonePlaque2 = new Position(60,305);
		Position positionZoneSaladier1 = new Position(5,225);
		Position positionZoneSaladier2 = new Position(30,290);
		
		Position positionZoneBucheron1 = new Position(380,125);
		Position positionZoneBucheron2 = new Position(430,205);
		Position positionZoneFermiere1 = new Position(65,90);
		Position positionZoneFermiere2 = new Position(115,170);
		Position positionZonePecheur1 = new Position(125,85);
		Position positionZonePecheur2 = new Position(200,155);
		Position positionZoneQuies11 = new Position(95,125);
		Position positionZoneQuies12 = new Position(150,175);
		Position positionZoneQuies21 = new Position(325,75);
		Position positionZoneQuies22 = new Position(375,155);
		Position positionZoneQuies31 = new Position(85,225);
		Position positionZoneQuies32 = new Position(130,300);
		Position positionZoneMaire1 = new Position(220,220);
		Position positionZoneMaire2 = new Position(265,275);
		
		// Positions des zones du village
		Position positionHautVillage1 = positionMainHaut1;
		Position positionHautVillage2 = positionMainHaut2;
		Position positionBasVillage1 = positionMainBas1;
		Position positionBasVillage2 = positionMainBas2;
		Position positionDroiteVillage1 = positionMainDroite1;
		Position positionDroiteVillage2 = positionMainDroite2;
		Position positionGaucheVillage1 = positionMainGauche1;
		Position positionGaucheVillage2 = positionMainGauche2;
		
		// Position zone du lac
		Position positionBasLac1 = positionMainBas1;
		Position positionBasLac2 = positionMainBas2;
		
		// Position zone de la mine
		Position positionDroiteMine1 = positionMainDroite1;
		Position positionDroiteMine2 = positionMainDroite2;
		
		// Positions des zones de la ferme
		Position positionHautFerme1 = positionMainHaut1;
		Position positionHautFerme2 = positionMainHaut2;
		Position positionDroiteFerme1 = positionMainDroite1;
		Position positionDroiteFerme2 = positionMainDroite2;
		
		// Positions des zones de la maison de Julia
		Position positionHautMaison1 = positionMainHaut1;
		Position positionHautMaison2 = positionMainHaut2;
		Position positionGaucheMaison1 = positionMainGauche1;
		Position positionGaucheMaison2 = positionMainGauche2;
		
		// Positions des zones de la foret
		Position positionGaucheForet1 = positionMainGauche1;
		Position positionGaucheForet2 = positionMainGauche2;
		Position positionBasForet1 = positionMainBas1;
		Position positionBasForet2 = positionMainBas2;
		
		// Zones de déplacement entre les cartes
		Zone zVillageLac = new Zone(positionHautVillage1, positionHautVillage2,Deplacement.HAUT, carteLac);
		carteVillage.ajouterZone(zVillageLac);
		Zone zLacVillage = new Zone(positionBasLac1, positionBasLac2, Deplacement.BAS, carteVillage);
		carteLac.ajouterZone(zLacVillage);
		
		Zone zVillageMine = new Zone(positionGaucheVillage1, positionGaucheVillage2, Deplacement.GAUCHE, carteMine);
		carteVillage.ajouterZone(zVillageMine);
		Zone zMineVillage = new Zone(positionDroiteMine1, positionDroiteMine2, Deplacement.DROITE, carteVillage);
		carteMine.ajouterZone(zMineVillage);
		
		Zone zVillageFerme = new Zone(positionBasVillage1, positionBasVillage2, Deplacement.BAS, carteFerme);
		carteVillage.ajouterZone(zVillageFerme);
		Zone zFermeVillage = new Zone (positionHautFerme1, positionHautFerme2, Deplacement.HAUT, carteVillage);
		carteFerme.ajouterZone(zFermeVillage);
		
		Zone zVillageForet = new Zone (positionDroiteVillage1, positionDroiteVillage2, Deplacement.DROITE, carteForet);
		carteVillage.ajouterZone(zVillageForet);
		Zone zForetVillage = new Zone (positionGaucheForet1, positionGaucheForet2, Deplacement.GAUCHE, carteVillage);
		carteForet.ajouterZone(zForetVillage);
		
		Zone zFermeMaison = new Zone (positionDroiteFerme1, positionDroiteFerme2, Deplacement.DROITE, carteMaison);
		carteFerme.ajouterZone(zFermeMaison);
		Zone zMaisonFerme = new Zone(positionGaucheMaison1, positionGaucheMaison2, Deplacement.GAUCHE, carteFerme);
		carteMaison.ajouterZone(zMaisonFerme);
		
		Zone zForetMaison = new Zone(positionBasForet1, positionBasForet2, Deplacement.BAS, carteMaison);
		carteForet.ajouterZone(zForetMaison);
		Zone zMaisonForet = new Zone(positionHautMaison1, positionHautMaison2, Deplacement.HAUT, carteForet);
		carteMaison.ajouterZone(zMaisonForet);		
		
		// Initialisation des zones 
		Zone zFouet = new Zone(positionZoneFouet1, positionZoneFouet2);
		Zone zMaryse = new Zone(positionZoneMaryse1, positionZoneMaryse2);
		Zone zPapier = new Zone(positionZonePapier1, positionZonePapier2);
		Zone zPlaque = new Zone(positionZonePlaque1, positionZonePlaque2);
		Zone zSaladier = new Zone(positionZoneSaladier1, positionZoneSaladier2);
		
		Zone zBucheron = new Zone(positionZoneBucheron1, positionZoneBucheron2);
		Zone zFermiere = new Zone(positionZoneFermiere1, positionZoneFermiere2);
		Zone zPecheur = new Zone(positionZonePecheur1, positionZonePecheur2);
		Zone zQuies1 = new Zone(positionZoneQuies11, positionZoneQuies12);
		Zone zQuies2 = new Zone(positionZoneQuies21, positionZoneQuies22);
		Zone zQuies3 = new Zone(positionZoneQuies31, positionZoneQuies32);
		Zone zMaire = new Zone(positionZoneMaire1, positionZoneMaire2);

		
		// Initialisation des enigmes
		Enigme actBucheron = new Enigme("Père et fils", "3", "Un père et un fils ont à eux deux 36 ans. Sachant que le père a 30 ans de plus que le fils, quel âge a le fils ?", "6", "3", "5");
		Enigme actMaire= new Enigme("Qui est-ce?", "Quies1", "Mon personnage porte un pantalon, mais n'a pas de t-shirt de la couleur du ciel... Qui est-ce?", "Quies2", "Quies3", "Quies1");
		Enigme actFermiere = new Enigme("Poulets et lapins", "3 lapins, 2 poules", "Dans un enclos, la fermière a des poules et des lapins. Elle y voit 5 têtes et 16 pattes. Combien y a-t-il de poules et de lapins? ", "1 lapin, 4 poules", "2 lapins, 3 poules", "3 lapins, 2 poules");
		Enigme actPecheur = new Enigme("Les nénuphars", "9", "Les nénuphars doublent de nombre chaque nuit. Au bout de 10 nuits le lac est rempli de nénuphars. Combien de jours faut-il pour remplir la moitié du lac ?", "9", "5", "7");
		
		// Initialisation des ingrédients
		Ingredient iBeurre = new Ingredient ("Beurre", ivBeurre, false, positionBeurre);
		Ingredient iChocolat = new Ingredient ("Chocolat", ivChocolat, false, positionChocolat);
		Ingredient iFarine = new Ingredient ("Farine", ivFarine, false, positionFarine);
		Ingredient iOeufs = new Ingredient ("Oeufs", ivOeufs, false, positionOeufs);
		Ingredient iSucre = new Ingredient ("Sucre", ivSucre, false, positionSucre);
		
		// Initialisation des ingrédients		
		Bonus bFouet = new Bonus("Fouet", ivFouet, false, positionFouet, 5, zFouet, carteVillage);
		Bonus bMaryse = new Bonus("Maryse", ivMaryse, false, positionMaryse, 10, zMaryse, carteLac);
		Bonus bPapier = new Bonus("Papier", ivPapier, false, positionPapier, 10, zPapier, carteForet);
		Bonus bPlaque = new Bonus("Plaque", ivPlaque, false, positionPlaque, 5, zPlaque, carteFerme);
		Bonus bSaladier = new Bonus("Saladier", ivSaladier, false, positionSaladier, 15, zSaladier, carteMaison); 
		
		// Initialisation des personnages et du joueur
		Joueur joueurJulia = new Joueur(10, "Julia", positionJulia, carteVillage, ivJulia);
		Personnage persoBucheron = new Personnage(actBucheron, "Bucheron", positionBucheron, ivBucheron, iSucre, carteForet, zBucheron);
		Personnage persoFermiere = new Personnage(actFermiere, "Fermiere", positionFermiere, ivFermiere, iBeurre, carteFerme,  zFermiere);
		Personnage persoPecheur = new Personnage(actPecheur, "Pecheur", positionPecheur, ivPecheur, iOeufs,carteLac, zPecheur);
		Personnage persoQuies1 = new Personnage("Quies1", positionQuies1, ivQuies1, carteVillage, zQuies1);
		Personnage persoQuies2 = new Personnage("Quies2", positionQuies2, ivQuies2, carteVillage, zQuies2);
		Personnage persoQuies3 = new Personnage("Quies3", positionQuies3, ivQuies3, carteVillage, zQuies3);
		Personnage persoMaire = new Personnage(actMaire, "Maire", positionMaire, ivQuiesMaire, iFarine, carteVillage, zMaire);
		Carte.ajouterPersonnage(persoBucheron);
		Carte.ajouterPersonnage(persoFermiere);
		Carte.ajouterPersonnage(persoPecheur);
		Carte.ajouterPersonnage(persoQuies1);
		Carte.ajouterPersonnage(persoQuies2);
		Carte.ajouterPersonnage(persoQuies3);
		Carte.ajouterPersonnage(persoMaire);
		Carte.ajouterBonus(bFouet);
		Carte.ajouterBonus(bMaryse);
		Carte.ajouterBonus(bPapier);
		Carte.ajouterBonus(bPlaque);
		Carte.ajouterBonus(bSaladier);
		carteVillage.personnageVisible();
		carteVillage.bonusVisible();
		
		Group root = new Group();
		
		Scene scene = new Scene(root, 543, 416, Color.WHITE);
		
		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				
				Carte c = null;
				try {
					c = joueurJulia.seDeplacer(event);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(c != null){
					root.getChildren().set(0, c.getImage());
					joueurJulia.setMap(c);
				}
			}
		});
		
		root.getChildren().addAll(carteVillage.getImage(), joueurJulia.getImage(), persoQuies1.getImage(), 
				persoQuies2.getImage(), persoQuies3.getImage(), persoMaire.getImage(), persoBucheron.getImage(),
				persoPecheur.getImage(),persoFermiere.getImage(), bFouet.getImageView(), bMaryse.getImageView(), bPapier.getImageView(), bPlaque.getImageView(), bSaladier.getImageView());
		stage.setTitle("JavaFX Scene Graph Demo");
		stage.setScene(scene);
		stage.show();
				
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		
		initialiser(stage);		
		
	}

}
