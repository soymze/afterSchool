
public class fenOgr extends ogr implements bil,ciz {
	public fenOgr(String isim, int no) {
		super(isim,no);
		// TODO Auto-generated constructor stub
	}
	public void bil() {
	System.out.println("Bildim");
	}
	@Override
	public void bolumSoyle() {
		// TODO Auto-generated method stub
		System.out.println("Benim bölümüm Fen");
	}
	@Override
	public void bilgisayardaYaz() {
		System.out.println("Tamam kardeş yazıyoruz işte..");
		
	}
	@Override
	public int bilgi(int a, int b) {
		// TODO Auto-generated method stub
		return a+(2*a-b)+6;
	}
	@Override
	public void cizSimdi() {
		System.out.println("Kalem var mı ?");
		
	}
}
