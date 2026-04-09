package village_gaulois;

import personnages.Gaulois;

public class Village {
	private String nom;
	private int nbVillageois=0;
	private Gaulois chef;
	private Gaulois[] villageois;
	
	public Village(String nom, int nbVillageois) {
		this.nom=nom;
		this.chef=chef;
		this.villageois=new Gaulois[nbVillageois];
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
}
