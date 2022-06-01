package majetok;

import platenie.BankovyUcet;

public class DolnaSala {
	private static int maxPocetLudi;
	private static double cenaZaJednehoCloveka;
	
	DolnaSala(int maxPocetLudi, double cenaZaJednehoCloveka){
		this.maxPocetLudi = maxPocetLudi;
		this.cenaZaJednehoCloveka = cenaZaJednehoCloveka;
	}
	
	public static double spravAkciu(int pocetLudi, String nazov) {
		if(pocetLudi > maxPocetLudi) {
			System.out.println("Prilis vela ludi, nemozete mat u nas akciu s nazvom: " + nazov);

		}
		else
			System.out.println("Budete mat u nas akciu s nazvom: " + nazov + ". Cena bude: " + pocetLudi*cenaZaJednehoCloveka);
			return BankovyUcet.prijem(pocetLudi*cenaZaJednehoCloveka);
}}
