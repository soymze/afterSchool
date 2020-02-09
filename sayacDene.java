
public class sayacDene {

	public sayacDene() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int kacDefa=20;
		
		sayiciIslem islem= new sayiciIslem();
		Thread t1= new Thread(new sayici(islem,kacDefa));
		t1.start();
		
		while(t1.isAlive()) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(islem.bulduMu) {
			System.out.println("Sonuç  :" +islem.sayi);
		}
	}

}
