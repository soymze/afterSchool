
public class Ikinci implements Runnable{

	private int sayi= 50;
	
	public Ikinci() {
		
	}
		
	public void run() {
		while(sayi>0) {
			System.out.println("Geri y:  "+sayi);
			sayi--;
			}
		
	}

}
