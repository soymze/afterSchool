
public class Ikinci implements Runnable{

	Islem birimIslem;
	int sayi,indeks,sonIfade;
	
	public Ikinci(Islem gelenIslem) {
		birimIslem= gelenIslem;
		sayi= 10;
		indeks=2;
	}
	
	public void run() {
		birimIslem.setSonuc(1);
		
		sonIfade=1;
		birimIslem.setSonuc(1);
		
		while(indeks<sayi) {
			int eskiYeni = birimIslem.getSonuc();
			birimIslem.setSonuc(sonIfade+birimIslem.getSonuc());
			sonIfade= eskiYeni;
			indeks++;
			
			try {
				Thread.sleep(100);
				System.out.println("Fibonacci hesaplanıyor..beklemede..");
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Fibonacci hesaplandı..sonuç gönderiliyor..");
		birimIslem.setTamamlandi(true);
	}

}
