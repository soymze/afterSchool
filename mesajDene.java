
public class mesajDene {

	public mesajDene() {
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1= new Thread(new mesajGor());
		System.out.println(t1.getState());
		t1.start();
		while(t1.isAlive()) {
			System.out.println("Mevcut  :" +Thread.currentThread().getName());
			System.out.println(t1.getName());
			Thread.sleep(500);
			
		}
		System.out.println(t1.getName());
	}

}
