
public class hayvan {

	int yas;
	String isim;
	
	public int islemYap(int a,int b) {
		System.out.println(a + "*" + (b+3));
		return a*(b+8);
	}
	
	public hayvan(String isim, int yas) {
		this.isim=isim;
		this.yas=yas;
	}
	
	public void yuru() {
	System.out.println("Yürüyorum..");	
	}
	
	public void yasSoyle() {
		System.out.println(yas+ "	yaşındayım..");
	}
	
	public void sesCikar() {
		System.out.println("Ben bir hayvanım.");
	}
}
