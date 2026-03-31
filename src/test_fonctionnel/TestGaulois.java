package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;
import objets.Chaudron;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 16);
		Romain brutus = new Romain("Brutus", 14);
		Druide panoramix = new Druide("Panoramix", 2);
		Chaudron chaudron = new Chaudron();
		
		panoramix.fabriquerPotion(4, 3);
		panoramix.booster(obelix);
		panoramix.booster(asterix);
		
		for (int i = 0; i < 3; i++) {
			asterix.frapper(brutus);
		}
	}

}