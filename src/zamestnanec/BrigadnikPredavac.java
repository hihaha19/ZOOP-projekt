package zamestnanec;

public class BrigadnikPredavac extends Zamestnanec {

				final static double mzda  = 3.5;
				private int odpracovaneHodiny;
				private double vyplata;
				private double poistne;
				
			public int getOdpracovaneHodiny() {
					return odpracovaneHodiny;
				}
				
				public double getVyplata() {
					return mzda*odpracovaneHodiny;
			}
				
				public void setOdpracovaneHodiny (int newOdpracovaneHodiny) {
					this.odpracovaneHodiny = newOdpracovaneHodiny;
				}
				
				public void setVyplata(double newVyplata) {
					this.vyplata = newVyplata;	
				}

				public double vypocitajPoistne(double vyplata) {
					if (vyplata > 200)  {
						return poistne = (vyplata-200)*0.1;
					}
					else return poistne = 0.0;
				}
				
				public void povedzSvojeMeno() {
					System.out.println("Volam sa: " + getMeno());
				}
				
				public static void predstavSa(BrigadnikPredavac b) {
					b.povedzSvojeMeno();
				}
				
				public void menoBrigadnika() {
					System.out.println("Som brigadnik a volam sa: " + getMeno());
				}
				
				public void zobrazUdaje() {
					System.out.println("Meno: " + getMeno());
					System.out.println("Vek: " + getVek());
					System.out.println("Id: " + getId());
					System.out.println("Odpracovane hodiny: " + getOdpracovaneHodiny());
					System.out.println("Vyplata: " + getVyplata());
					System.out.println("Poistne: " + vypocitajPoistne(getVyplata()));	
	}
}
