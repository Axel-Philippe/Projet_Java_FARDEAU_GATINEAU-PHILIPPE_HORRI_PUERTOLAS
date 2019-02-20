package jeu;

public class Jeu {
	private Personne personne;
	private Carte map;
	
	
	public Jeu(Personne p, Carte m) {
		super();
		personne = p;
		map = m;
	}

	public void demarrerJeu() {}
	
	public String afficherMenu(){
		return null;
	}
	
	public void quitter() {}
	
	public void reset() {}
	
	public static String msgBienvenue() {
		return "  \n  Bonjour Julia! Comment vas-tu aujourd'hui? \r\n" + 
				"  C'est aujourd'hui que ton mari rentre, n'est-ce pas? J'ai entendu dire que tu voulais cuisiner des cookies, as-tu tous les ingrédients? \r\n" + 
				"  NON? Julia... Tu es une vraie tête en l'air... \r\n" + 
				"  \r\n" + 
				"  ...\r\n" + 
				"  ...\r\n" + 
				"  ...\r\n\n" + 
				"  Bon, les habitants t\'aiment beaucoup, et je suis sûr qu'ils seront ravis de t'aider à récolter ce qu\'il te manque. \r\n" + 
				"  La fermière fait du beurre, le pécheur garde toujours des oeufs avec lui. Je pense que le bûcheron a encore le sucre qu'il avait emprunté à sa grand-mère." + 
				"  \n  Pour les pépites de chocolat... C'est le trésor caché de la mine, donc tu en trouveras là bas. \r\n" + 
				"  Et pour la farine, c\'est moi qui t\'en donnerai, tu n\'auras qu'à venir me trouver sur la place.\r\n" + 
				"  \n  Tu ne sais plus te déplacer???? Julia, enfin... Il te suffit d'utiliser les flèches de ton clavier, ou encore les touches ZQSD." + 
				"  \n  Pour parler à quelqu'un, il te suffit d'utiliser la touche E, et pour ramasser les objets, la touche R." + 
				"  \n  Pour te promener à travers les différents endroits, il faut que tu suives ton plan, et que tu appuies sur A pour changer de zone! \r\n" + 
				"  N'oublie pas: concentre-toi, les ingrédients ne te seront pas donnés comme par magie, il te faudra réfléchir...\r\n" + 
				"  Ballade toi dans chaque nouvel endroit, tu trouveras sûrement quelques objets cachés... \r\n" + 
				"  Tout ce que tu trouveras ou gagneras sera rangé dans ton sac à dos." + 
				"  \n\n  Bon courage!";
	}
}
