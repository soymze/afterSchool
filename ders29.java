
public class ders29 {

	public static void main(String[] args) {
		
		kedi cimo = new kedi("cimi",3);
		kedi clint = new kedi("clint",7);
		kopek will = new kopek("will",4);
		
		
		System.out.println("İşlem sonucu	:" +cimo.islemYap(5, 3));
		System.out.println("İşlem sonucu	:" +clint.islemYap(4, 2));
		System.out.println("İşlem sonucu	:" +will.islemYap(9, 1));

	}

}
