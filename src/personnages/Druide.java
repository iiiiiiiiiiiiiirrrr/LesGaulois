package personnages;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron;
	
	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public void fabriquerPotion(int quantite, int forcePotion) {
		.remplirChaudron(quantite, forcePotion);
	}
	
	public booster(Gaulois gaulois) {
		
	}
}
