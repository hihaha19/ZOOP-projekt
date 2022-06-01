package zamestnanec;

public class SefSingleton {

		private static SefSingleton instance;
		private SefSingleton() {};
		public static SefSingleton getInstance() {
			if(instance == null) {
				instance = new SefSingleton();
			}
			return instance;
		}
		
		public void pozdrav() {
			System.out.println("Ja som vas sef");
		}
	}