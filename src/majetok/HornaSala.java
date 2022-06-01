package majetok;

public class HornaSala {
	private static int maxPocetLudi;
	private static double cenaZaJednehoCloveka;
	
	HornaSala(int maxPocetLudi, double cenaZaJednehoCloveka){
		this.maxPocetLudi = maxPocetLudi;
		this.cenaZaJednehoCloveka = cenaZaJednehoCloveka;
	}
	
	public static  double spravAkciu(int pocetLudi, String nazov) {
		if(pocetLudi > maxPocetLudi) {
			System.out.println("Prilis vela ludi, nemozete mat u nas akciu s nazvom: " + nazov);
			return 0;
		}
		else
			System.out.println("Budete mat u nas akciu s nazvom: " + nazov + ". Cena bude: " + pocetLudi*cenaZaJednehoCloveka);
			return pocetLudi*cenaZaJednehoCloveka;
	}
}
