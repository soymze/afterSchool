
public class Birinci  implements Runnable{

	Islem birimIslem;
	
	public Birinci(Islem gelenIslem) {
		birimIslem= gelenIslem;
	}

	public void run() {
		while(!birimIslem.isTamamlandi()) {
			long baslangic = System.currentTimeMillis();
			try {
				System.out.println("İşlem sonucu hazır değil.Sistem beklemede...");
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			long bitis= System.currentTimeMillis();
			System.out.println("Uyku süresi: " +(bitis-baslangic));
		}
		System.out.println("İşlem sonucu hazır. Sonuç:"  +birimIslem.getSonuc());
	}

}
