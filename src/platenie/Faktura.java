package platenie;

public class Faktura {
	private int cisloFaktury;
	private String odberatel;
	private double suma;
	

	public Faktura(int cisloFaktury, String odberatel, double suma) {
		this.cisloFaktury = cisloFaktury;
		this.odberatel = odberatel;
		this.suma = suma;		
	}

}
