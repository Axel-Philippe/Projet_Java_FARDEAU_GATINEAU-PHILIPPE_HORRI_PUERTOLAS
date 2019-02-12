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
import jeu.Ingredient;
import jeu.Joueur;
import jeu.Objet;
import jeu.Personnage;
import jeu.Position;

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
	public static void initialiser() throws FileNotFoundException {
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
		FileInputStream quiesMayor = new FileInputStream("./images/personnages/quiesMayor.png");
		
		// Initialisation des ingrédients
		FileInputStream beurre = new FileInputStream(".images/ingredients/beurre.png");
		FileInputStream chocolat = new FileInputStream(".images/ingredients/chocolat.png");
		FileInputStream farine = new FileInputStream(".images/ingredients/farine.png");
		FileInputStream oeufs = new FileInputStream(".images/ingredients/oeufs.png");
		FileInputStream sucre = new FileInputStream(".images/ingredients/sucre.png");
		
		// Initialisation des bonus
		FileInputStream fouet = new FileInputStream(".images/bonus/fouet.png");
		FileInputStream maryse = new FileInputStream(".images/bonus/maryse.png");
		FileInputStream papier = new FileInputStream(".images/bonus/papier.png");
		FileInputStream plaque = new FileInputStream(".images/bonus/plaque.png");
		FileInputStream saladier = new FileInputStream(".images/bonus/saladier.png");
		
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
		Image imQuiesMayor = new Image(quiesMayor);
		
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
		ImageView  ivQuiesMayor = new ImageView();
		
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
		
		//Set imageViews
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
		ivQuiesMayor.setImage(imQuiesMayor);
				
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
		
		/*
		Position positionJoueur = new Position(0,0);
		Map PlaceVillage = new Map()
		Joueur joueur = new Joueur(10, "Julia", positionJoueur, )
*/
				
	}

	@Override
	public void start(Stage stage) throws Exception {
		Group root = new Group();
		Scene scene = new Scene(root, 543, 416, Color.WHITE);
		/*FileInputStream file2 = new FileInputStream("./images/personnages/julia.png");
		Image image = new Image(file2);*/
		ImageView c = new ImageView();
		c.setImage(image);
		c.setY(100);
		c.setX((scene.getWidth() / 2) - c.getFitWidth() / 2);

		Text t = new Text("Zone\nd'intéraction\n(appuyer sur 'E'\npour intéragir)");
		t.setX(410);
		t.setY(30);

		FileInputStream file3 = new FileInputStream("./images/ingredients/beurre.png");
		Image image3 = new Image(file3);
		
		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				switch (event.getCode()) {
				case UP:
					if (c.getX() < 536 && c.getX() > -6 && c.getY() > 0 && c.getY() < 395)
						c.setY(c.getY() - 5);
					break;
				case DOWN:
					if (c.getX() < 536 && c.getX() > -6 && c.getY() > -6 && c.getY() < 380)
						c.setY(c.getY() + 5);
					break;
				case LEFT:
					if (c.getX() < 536 && c.getX() > 0 && c.getY() > -6 && c.getY() < 395)
						c.setX(c.getX() - 5);
					break;
				case RIGHT:
					if (c.getX() < 530 && c.getX() > -6 && c.getY() > -6 && c.getY() < 395)
						c.setX(c.getX() + 5);
					break;
				case E:
					if (c.getX() > 400 && c.getX() < 546 && c.getY() >= 0 && c.getY() < 100) {
						
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Interaction Objet");
						alert.setHeaderText("Vous avez intéragi avec un objet en pressant la touche 'E'.");
						alert.setContentText("Cliquez sur la croix pour fermer.");
						alert.showAndWait();
					}
					break;
				}
			}
		});

		FileInputStream file = new FileInputStream("./images/maps/centre.png");
		Image image2 = new Image(file);
		ImageView i = new ImageView();
		i.setImage(image2);
		root.getChildren().addAll(i, c, t);
		stage.setTitle("JavaFX Scene Graph Demo");
		stage.setScene(scene);
		stage.show();

	}

}
