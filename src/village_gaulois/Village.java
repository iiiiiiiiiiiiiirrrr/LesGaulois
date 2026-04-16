package village_gaulois;

import personnages.Gaulois;

public class Village {
	private String nom;
	private int nbVillageois=0;
	private Gaulois chef;
	private Gaulois[] villageois;
	
	public Village(String nom, int nbVillageois, Gaulois chef) {
		this.nom=nom;
		this.chef=chef;
		this.villageois=new Gaulois[nbVillageois];
		this.chef.setVillage(this);
	}
	
	public Gaulois getChef() {
		return chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void ajouterVillageois(Gaulois gaulois) {
		if (nbVillageois<villageois.length) {
			villageois[nbVillageois] = gaulois;
			nbVillageois++;
		}
	}
	
	public Gaulois trouverVillageois(int numVillageois) {
		if (numVillageois > 0 && numVillageois <= nbVillageois) {
			return villageois[numVillageois - 1];
		}
		System.out.println("Il n'y a pas autant d'habitants dans notre village !");
		return null;
	}
	
	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Gaulois obelix = new Gaulois("Obélix", 25);
		Gaulois doublepolemix = new Gaulois("Doublepolémix", 4);
		Village village = new Village("Village des Irréductibles", 30, abraracourcix);
		
		village.trouverVillageois(30);
		
		Gaulois asterix = new Gaulois("Astérix", 8);
		
		village.ajouterVillageois(asterix);
		village.ajouterVillageois(obelix);
		
		village.afficherVillageois();
		
		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
		
		abraracourcix.sePresenter();
		asterix.sePresenter();
		doublepolemix.sePresenter();
		
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village \"" + nom + " du chef " + chef.getNom() + "vivent les légendaires gaulois :");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + villageois[i].getNom());
		}
	}
}
