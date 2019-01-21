package fenetre;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
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
		Scene scene = new Scene(root, 500, 500, Color.BLACK);
		Circle c = new Circle(0, 0, 50, Color.WHITE);
		
		
		
		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				switch (event.getCode()) {
				case UP:
					c.setCenterY(c.getCenterY()-5);
					break;
				case DOWN:
					c.setCenterY(c.getCenterY()+5);
					break;
				case LEFT:
					c.setCenterX(c.getCenterX()-5);
					break;
				case RIGHT:
					c.setCenterX(c.getCenterX()+5);
					break;
				}
			}
		});
		
		
		root.getChildren().add(c);
		stage.setTitle("JavaFX Scene Graph Demo");
		stage.setScene(scene);
		stage.show();

		

	}

}
