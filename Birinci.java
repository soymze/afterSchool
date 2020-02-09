
public class Birinci implements Runnable{

	private int sayi= 0;
	
	public Birinci() {
		
	}

	@Override
	public void run() {
		while(sayi<10) {
		System.out.println("İleri x:  "+sayi);
		sayi++;
		try {
			Thread.sleep(100);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
	}	
}
