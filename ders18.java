import java.util.Scanner;

public class ders18 {

	public static void main(String[] args) {
		int silinecekeleman,eklenecekIndex;
		String eklenecekeleman;
		
		Scanner sc  = new Scanner(System.in);
		pazarListesi liste = new pazarListesi(10);
		liste.listeyeEkle("Salatalık");
		liste.listeyeEkle("Diş Macunu");
		liste.listeyeEkle("Bisküvi");
		liste.listeyeEkle("Kalem");
		liste.listeyeEkle("Deodorant");
		System.out.println("İLK HALİ:");
		liste.yaz();
		
		System.out.println("Kaçıncı elemanı silmek istersiniz :");
        silinecekeleman=sc.nextInt();
        liste.sil(silinecekeleman-1);
        liste.yaz();
        
		System.out.println("Kaçıncı sıraya eklemek istersiniz :");
        eklenecekIndex=sc.nextInt();
        System.out.println("Hangi elemanı eklemek istersiniz :");
        eklenecekeleman=sc.next();
       
       liste.ekle(eklenecekIndex-1, eklenecekeleman);
       liste.yaz();
	}
}
