
public class denemeThread {

	public denemeThread() {
		
	}
	
	public static void main(String[] args) {
		Islem mevcutIslem= new Islem();
		
		Thread t1= new Thread(new Birinci(mevcutIslem));
		t1.start();
		
		Thread t2= new Thread(new Ikinci(mevcutIslem));
		t2.start();

	}

}
