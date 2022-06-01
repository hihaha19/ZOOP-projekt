package majetok;
//kompozicia
public class Budova {
	private HornaSala hornaSala;
	private DolnaSala dolnaSala;
	
	public Budova() {
		hornaSala = new HornaSala(140, 30.5);
		dolnaSala = new DolnaSala(30, 20.1);
		
	}

}
