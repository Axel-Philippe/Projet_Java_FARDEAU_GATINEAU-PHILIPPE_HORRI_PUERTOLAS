package fenetre;

import javafx.stage.Stage;

public class SceneManager {
	private static AbstractScene sceneCourante = null;
	private static Accueil accueil;
	private static Apropos apropos;
	private static Importer importer;
	private static InsererReponse importerReponse;
	private static InsererModule insererModule;
	private static Generer generer;
	private static Consulter consulter;
	private static AMC amc;
	private static InsererChapitre insererchapitre;
	private static InsererQuestionReponse insererquestionreponse;
	private static FenetreOptionApp fenetreOption;
	
	private SceneManager() {
		super();
	}

	public static FenetreOptionApp getFenetreOoption(Stage s) {
		if (fenetreOption == null)
			fenetreOption = new FenetreOptionApp(1000, 600, s);
		return fenetreOption;
	}

	public static Consulter getConsulter(Stage s) {
		if (consulter == null) {
			consulter = new Consulter(1000, 600, s);
		}
		return consulter;
	}

	public static Accueil getAccueil(Stage s) {
		if (accueil == null) {
			accueil = new Accueil(1000, 600, s);
		}
		return accueil;
	}
	
	public static AMC getAMC(Stage s) {
		if (amc == null) {
			amc = new AMC(1000, 600, s);
		}
		return amc;
	}

	public static InsererModule getInsererModule(Stage s) {
		if (insererModule == null) {
			insererModule = new InsererModule(350, 400, s);
		}
		return insererModule;
	}

	public static Apropos getApropos(Stage s) {
		if (apropos == null) {
			apropos = new Apropos(1000, 600, s);
		}
		return apropos;
	}

	public static Importer getImporter(Stage s) {
		if (importer == null) {
			importer = new Importer(700, 600, s);
		}
		return importer;
	}

	public static InsererReponse getInsererReponse(Stage s) {
		if (importerReponse == null) {
			importerReponse = new InsererReponse(300, 600, s);
		}
		return importerReponse;
	}

	public static InsererQuestionReponse getInsererQuestionReponse(Stage s) {
		if (insererquestionreponse == null) {
			insererquestionreponse = new InsererQuestionReponse(600, 650, s);
		}
		return insererquestionreponse;

	}

	public static Generer getGenerer(Stage s) {
		if (generer == null) {
			generer = new Generer(1000, 600, s);
		}
		return generer;

	}

	public static InsererChapitre getInsererChapitre(Stage s) {
		if (insererchapitre == null) {
			insererchapitre = new InsererChapitre(350, 400, s);
		}
		return insererchapitre;

	}

	public static AbstractScene getSceneCourante() {
		return sceneCourante;
	}

	public static void setSceneCourante(AbstractScene sceneCourante) {
		SceneManager.sceneCourante = sceneCourante;
	}

}
