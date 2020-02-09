
public class matOgr extends ogr implements bil {

	public matOgr(String isim, int no) {
		super(isim,no);
		
	}

	public void hesapla() {
		System.out.println("Hesapladım");
	}

	@Override
	public void bolumSoyle() {
		// TODO Auto-generated method stub
		System.out.println("Benim bölümüm Mat");

	}

	@Override
	public void bilgisayardaYaz() {
		System.out.println("Bilgisayarda yazdım..");

		
	}

	@Override
	public int bilgi(int a, int b) {
		// TODO Auto-generated method stub
		return a+(2*a-b)+6;
	}
}
