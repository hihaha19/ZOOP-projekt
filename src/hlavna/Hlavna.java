package hlavna;

import majetok.*;
import zamestnanec.*;
import platenie.*;
import java.util.Random;


public class Hlavna {

	public static void main(String[] args) {
		
		//vytvorenie singletonu
		SefSingleton();
		
		//vytvorenie budovy, odteraz sa mozu konat v nasej budove akcie
		Budova budova = new Budova();
		//double akciaHorna = HornaSala.spravAkciu(150, "svadba");
			
		//vytvaranie zamestnancov
		
		//vytvorenie prveho brigadnika
		BrigadnikPredavac prvyB = new BrigadnikPredavac();
		prvyB.setMeno("Adam Sikovny");
		prvyB.setVek(19);
		prvyB.setId(11);
		prvyB.setOdpracovaneHodiny(100);
		prvyB.getVyplata();
	
		//vytvorenie prveho Predavaca
		Predavac prvyP = new Predavac();
		prvyP.setMeno("Jozko Mrkvicka");
		prvyP.setVek(28);
		prvyP.setId(1);
		prvyP.setOdpracovaneDni(17);
		prvyP.getHrubaMzda();
		prvyP.vypocitajPoistne();
		prvyP.getVyplata();
		
		Adresa adresa1 = new Adresa();
		adresa1.setMesto("Bratislava");
		adresa1.setUlica("Krizna");
		prvyP.setAdresa(adresa1);
		
		
		Pocitac pocitac1 = new Pocitac("najlepsi", 1000);
		
		//vytvorenie prveho uctovnika
		Uctovnik prvyUctovnik = new Uctovnik("Peter Chudy", pocitac1);

		
		//vytvorenie bankoveho uctu
		BankovyUcet ucet = new BankovyUcet("Slovenska", 20000);
		
	
		Auto honda = new Auto("Honda", 30, 100);
		Auto cervene = new Auto("Fiat", 25, "cervena", 100);
		
		String[] poleAut = {"Honda", "Fiat"};		

		
	Random rand = new Random(); 
	 
	for(int i = 0; i < 10; i++) {
		  int vyberAuto = rand.nextInt(poleAut.length);
	      int cislo = rand.nextInt(30); 
	      Auto.vypocitajCenu(poleAut[vyberAuto], cislo);
	  }
	
	honda.cestujem(120, 0.56);
	honda.cestujem(50, 0.6);
	 
	//polymorfizmus
		Auto polymorfneAuto = new Auto("Cierne", 15, 100);
		Majetok m = polymorfneAuto;
		m.komuPatrim();
		
	//INTERFACE
	AutoInterface sukromneAuto = new Auto("BMW", "cierne", 50);	
		
		
		//upcasting, z triedy predavac sa stal brigadnik
		Predavac p = new Predavac();
		p.setMeno("Filip Velky");
		p.setVek(25);
		p.setId(8);
		p.setOdpracovaneDni(15);
		p.getHrubaMzda();
		p.vypocitajPoistne();
		p.setPocetDniDovolenky(13);
		p.getVyplata();
		
		Adresa adresa2 = new Adresa();
		adresa2.setMesto("Bratislava");
		adresa2.setUlica("Hospodarska");
		p.setAdresa(adresa2);
		
		BrigadnikPredavac.predstavSa(p);		//Upcasting = predavac vyuziva metodu rodicovskej triedy
	
		//Teraz predavaca upcastnem na brigadnika
		BrigadnikPredavac b = p;			//upcasting
		//b.getPocetDniDovolenky();	--- chyba, brigadnici nemaju definovane pocet dni dovolenky
		b.menoBrigadnika();
		
		//downcasting
		Predavac preDowncasting = new Predavac();
		BrigadnikPredavac Downcasting = preDowncasting;
		Predavac druhyPreDowncasting = null;
		if (Downcasting instanceof Predavac) {
			druhyPreDowncasting = (Predavac) Downcasting;
		}
		
		druhyPreDowncasting.setMeno("Peter Maly");
		druhyPreDowncasting.povedzSvojeMeno();
		
	 	}
	
	 
	private static void SefSingleton() {
		SefSingleton sef = SefSingleton.getInstance();	
		sef.pozdrav();
	}
} 

