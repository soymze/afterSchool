public class kedi extends hayvan {

	public int islemYap(int sayi1,int sayi2) {
		int sonuc= super.islemYap(sayi1, sayi2);
		System.out.println(sonuc);
		return sonuc*sayi1+sayi2;
	}
	
	public kedi(String isim, int yas) {
		super(isim,yas);
	}
	
	@Override
	public void sesCikar() {
		System.out.println("Miyavv!");
		
	}

}