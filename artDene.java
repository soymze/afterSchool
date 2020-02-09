
public class artDene {

	public artDene() {
		
	}

	public static void main(String[] args) {
		MevcutSayi paket = new MevcutSayi();
		
		Thread t1 = new Thread(new Arttirici(paket));
		t1.start();
		Thread t2 = new Thread(new Azaltici(paket));
		t2.start();
	}

}
