package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int coup) {
		this.force-=coup;
		if (this.force<1) {
			this.force=0;
			String annonce = prendreParole() + "J'abandonne !";
			System.out.println(annonce);
		}
		else {
			String annonce = prendreParole() + "Aïe !";
			System.out.println(annonce);
		}

	}

}
