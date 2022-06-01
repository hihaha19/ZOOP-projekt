package zamestnanec;

import majetok.Pocitac;

public class Uctovnik extends Zamestnanec {
	private	String meno;
	private Pocitac pocitac;

	//asociacia
	public Uctovnik(String meno, Pocitac pocitac) {
		this.meno = meno;
		this.pocitac = pocitac;
	}
	

	public void zobrazUdaje() {
		System.out.println("Meno: " + meno);
		System.out.println("Pouzivany pocitac: " + pocitac.toString());
	}

	
	
}