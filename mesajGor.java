
public class mesajGor implements Runnable {

	final private int kacKez=5;
	private int goruntulemeSayisi;
	
	public mesajGor() {
		goruntulemeSayisi=0;
	}

	@Override
	public void run() {
		while(goruntulemeSayisi<kacKez) {
			System.out.println("Bu bir mesajdır. - mesajGor");
			goruntulemeSayisi++;
			System.out.println("Mevcut  :" +Thread.currentThread().getName());
			try {	
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
