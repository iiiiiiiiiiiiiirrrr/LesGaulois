package objets;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	
	public void remplirChaudron(int quantite, int forcePotion) {
		this.quantitePotion = quantite;
		this.forcePotion = forcePotion;
	}
	
	public boolean resterPotion() {
		if (quantitePotion<=0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public int prendreLouche() {
		
	}
}
