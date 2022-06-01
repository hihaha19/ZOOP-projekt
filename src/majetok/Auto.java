package majetok;
import platenie.*;
import java.text.DecimalFormat;

public class Auto extends Majetok implements AutoInterface{
	static double cenaZaJedenDen;
	String farba;
	static double vyslednaCena;
	double benzin;
	double cenaZaBenzin;
		
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	
	//pretazenie konstruktorov
	public Auto(String nazov, double cenaZaJedenDen, int benzin) {
		this.nazov = nazov;
		this.cenaZaJedenDen = cenaZaJedenDen;
		this.benzin = benzin;
	}
	
	public Auto (String nazov, double cenaZaJedenDen, String farba, int benzin)  {
		this.nazov = nazov;
		this.cenaZaJedenDen = cenaZaJedenDen;
		this.farba = farba;
		this.benzin = benzin;
	}
	
	public Auto(String nazov, String farba, int benzin) {
		this.nazov = nazov;		
		this.farba = farba;
		this.benzin = benzin;
	}
	
	public void cestujem(int pocetKilometrov, double spotreba) {
		if(pocetKilometrov*spotreba > benzin) {
			System.out.println("Treba najprv natankovat!");
		}
		else {
			this.benzin = this.benzin - (pocetKilometrov*spotreba);
		System.out.println("Benzinu zostalo: " + df2.format(benzin));
		if(benzin < 20) {
			natankuj(100-benzin, 1.3);
		}	
		}	
	}

	public void natankuj(double pocetLitrov, double cenaZaLiter) {
		this.benzin += pocetLitrov;
		cenaZaBenzin = pocetLitrov*cenaZaLiter;
		BankovyUcet.zaplat(cenaZaBenzin);
		System.out.println("Tankujem " +pocetLitrov+ " litrov za celkovu cenu " + df2.format(cenaZaBenzin) + "€, ktore zaplatim z bankoveho uctu");
	}
	
	//vypocitaj cenu za prenajom
	public static void vypocitajCenu (String nazov, int pocetDni) {
		System.out.println(nazov + " odchadza na " + pocetDni + " dni");
			if (pocetDni > 3) {	
			System.out.println("Vysledna cena je: " + (vyslednaCena = pocetDni * cenaZaJedenDen) * 0.9); }
			
			else System.out.println("Vysledna cena je: " + (vyslednaCena = pocetDni * cenaZaJedenDen));
			 
		
			  BankovyUcet.prijem(vyslednaCena);
			 BankovyUcet.zobrazZostatok();
			  System.out.println();
		
	}
	}