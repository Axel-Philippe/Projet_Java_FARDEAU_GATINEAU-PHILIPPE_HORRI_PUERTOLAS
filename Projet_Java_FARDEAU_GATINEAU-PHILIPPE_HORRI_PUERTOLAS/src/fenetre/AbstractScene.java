package fenetre;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public abstract class AbstractScene extends Scene {
	protected Stage fenetre;
	protected String titre;
	protected double width;
	protected double height;

	public AbstractScene(double width, double height, Stage s) {
		super(new Group(), width, height);
		fenetre = s;
		titre = "QCM-Builder";
		this.height = height;
		this.width = width;
	}

	public void display() {
		if (SceneManager.getSceneCourante() != null)
			SceneManager.getSceneCourante().vider();
		fenetre.setScene(this);
		fenetre.setTitle(titre);
		fenetre.setWidth(width);
		fenetre.setHeight(height);
		fenetre.show();
		SceneManager.setSceneCourante(this);
	}

	public abstract void vider();

}
