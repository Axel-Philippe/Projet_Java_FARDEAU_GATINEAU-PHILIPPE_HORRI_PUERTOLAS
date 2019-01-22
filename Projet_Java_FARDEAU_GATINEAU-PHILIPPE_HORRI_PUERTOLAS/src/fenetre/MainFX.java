package fenetre;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainFX extends Application {

	public MainFX() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Group root = new Group();
		Scene scene = new Scene(root, 500, 500, Color.RED);
		Circle c = new Circle(0, 0, 10, Color.GREY);
		Rectangle r = new Rectangle();
		r.setX(400);
		r.setY(0);
		r.setWidth(100);
		r.setHeight(100);
		r.setFill(Color.AQUA);
		
		
		
		Text t = new Text("Zone\nd'intéraction\n(appuyer sur 'E'\npour intéragir)");
		t.setX(410);
		t.setY(30);
		
		
		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				switch (event.getCode()) {
				case UP:
					c.setCenterY(c.getCenterY() - 5);
					break;
				case DOWN:
					c.setCenterY(c.getCenterY() + 5);
					break;
				case LEFT:
					c.setCenterX(c.getCenterX() - 5);
					break;
				case RIGHT:
					c.setCenterX(c.getCenterX() + 5);
					break;
				case E:
					if (c.getCenterX() > 400 && c.getCenterX() < 500 && c.getCenterY() >= 0 && c.getCenterY() < 100) {
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

		root.getChildren().addAll(r, c, t);
		stage.setTitle("JavaFX Scene Graph Demo");
		stage.setScene(scene);
		stage.show();

	}

}
