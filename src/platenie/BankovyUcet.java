package platenie;

public class BankovyUcet {
	private String nazov;
	private static double zostatok;

	public BankovyUcet(String nazov, double zostatok) {
		this.nazov = nazov;
		this.zostatok = zostatok;
	}
	
	public static double prijem(double suma) {
		return zostatok += suma;
	}
	
	public static void zobrazZostatok() {
		System.out.println("Zostatok je: " + zostatok + "€");
	}
	
	public static void zaplat(double suma) {
		zostatok -= suma;
	}
	

}
