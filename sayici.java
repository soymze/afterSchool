
public class sayici implements Runnable {
	boolean bulduMu= false;
	sayiciIslem islem;
	int kacKez;
	
	final int ARTTIRMA=3;
	int kackezGecti;
	
	public sayici(sayiciIslem gelensayiciIslem, int gelenkacKez) {
		islem= gelensayiciIslem;
		kacKez= gelenkacKez;
		
		kackezGecti= 0;
	}

	@Override
	public void run() {
		while(kackezGecti<kacKez) {
			islem.sayi=islem.sayi+ARTTIRMA;
			kackezGecti++;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Sonuç bulundu!");
		islem.bulduMu= true;
	}

}
