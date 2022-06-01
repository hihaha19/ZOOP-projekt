package zamestnanec;

public class Predavac extends BrigadnikPredavac {
	final static double dennaMzda = 30;
	private double hrubaMzda;
	private double vyplata;
	private double poistne;
	private int odpracovaneDni;
	private Adresa adresa;		//agregacia
	private int pocetDniDovolenky;
	
	public int getOdpracovaneDni() {
		return odpracovaneDni;
	}
	
	public double getHrubaMzda() {
		return hrubaMzda = dennaMzda*odpracovaneDni;
	}
	
	public double vypocitajPoistne() {
		return poistne = hrubaMzda*0.1;
	}
	
	public double getVyplata() {
		return vyplata = hrubaMzda-poistne;
	}
	
	public double getPocetDniDovolenky() {
		return pocetDniDovolenky;
	}
	
	public void setPocetDniDovolenky(int pocetDniDovolenky) {
		this.pocetDniDovolenky = pocetDniDovolenky;
	}
	
	public Adresa getAdresa(){
		return adresa;
	}
	
	public void setAdresa(Adresa adresa) {
		this.adresa = adresa;
	}
	
	public void setOdpracovaneDni(int newOdpracovaneDni) {
		this.odpracovaneDni = newOdpracovaneDni;
	}
	
	
	public void zobrazUdaje() {	
		System.out.println("Meno: " + getMeno());
		System.out.println("Pozicia : Predavac");
		System.out.println("Vek: " + getVek());
		System.out.println("Id: " + getId());
		System.out.println("Odpracovane dni: " + getOdpracovaneDni());
		System.out.println("Hruba mzda: " + getHrubaMzda());
		System.out.println("Poistne: " + vypocitajPoistne());	
		System.out.println("Vyplata: " + vyplata);
		System.out.println("Mesto: " + adresa.getMesto() + "\n" + "Ulica: " + adresa.getUlica());
		
	}

}
