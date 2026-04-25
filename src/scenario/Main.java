package scenario;

import personnages.Gaulois;
import produit.Poisson;
import produit.Sanglier;
import villageGaulois.Etal;
import villageGaulois.IEtal;

public class Main {

	public static void main(String[] args) {
		IEtal[] etals = new IEtal[3];

		Etal<Sanglier> etalSanglier = new Etal<>();

		etals[0] = etalSanglier;
		etals[0].occuperEtal(new Gaulois("Ordralfabétix", 12), new Poisson("lundi"), 10);

		System.out.println("Test terminé. Le programme compile et a mis du poisson sur un étal de sanglier !");
	}
}