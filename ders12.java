import java.util.Scanner;

public class ders12 {

	public static void main(String[] args) {
		int sayi= 29;
		int tahmin;
		boolean devam=true;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Tahmininizi giriniz	: ");
			tahmin=sc.nextInt();
			
			if(tahmin<sayi)
			{
				System.out.println("Hayır daha büyük bir sayı..");
			}
			
			else if(tahmin>sayi)
			{
				System.out.println("Hayır daha küçük bir sayı..");
			}
			
			else
			{
				System.out.println("TEBRİKLER BİLDİNİZ!!!");
				devam=false;
			}
			
		}while(devam);

	}

}
