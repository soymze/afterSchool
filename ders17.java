
public class ders17 {

	public static void main(String[] args) {
		
		pazarListesi liste = new pazarListesi(3);
		liste.listeyeEkle("Salatalık");
		liste.listeyeEkle("Diş Macunu");
		liste.listeyeEkle("Bisküvi");
		liste.listeyeEkle("Kalem");
		liste.listeyeEkle("Deodorant");
		System.out.println("İLK HALİ:");
		liste.yaz();
		
		System.out.println("SON HALİ:");
		liste.bastansil();
		liste.yaz();
		liste.sondanSil();
		liste.yaz();
		
	}

}
