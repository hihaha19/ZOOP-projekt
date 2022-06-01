package zamestnanec;

public abstract class Zamestnanec {			//abstraktna trieda
	private String meno;
	private int vek;
	private int id;
	
	//enkapsulacia
	public String getMeno() {
		return meno;
	}
	
	public int getVek() {
		return vek;
	}
	
	public int getId() {
		return id;
	}
	
	public void setMeno(String newMeno) {
		meno = newMeno;
	}
	
	public void setVek(int newVek) {
		vek = newVek;
	}
	
	public void setId(int newId) {
		id= newId;
	}
	
	public abstract void zobrazUdaje();			//abstraktna metoda
}