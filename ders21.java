import java.util.Random;


public class ders21 {
	
	public static void main(String[] args) {
		
		
		int dizi[] = new int[10]; 
		int enBuyuk,enKucuk;
			enBuyuk=dizi[0];
			enKucuk=9999;
		System.out.println("--Oluşturulan Dizi--");
		for(int i=0;i<10;i++) {
		Random r=new Random(); 
		   int a=r.nextInt(1000);
		   dizi[i]=a;
		   System.out.println(	(i+1)+".Eleman	="	+dizi[i]);
		   }
		for(int i=0;i<10;i++) {
			if(dizi[i]>enBuyuk) {
			enBuyuk=dizi[i];	
			}
			else if(dizi[i]<enKucuk) {
				enKucuk=dizi[i];
			}
		}
		System.out.println("En Büyük Eleman	="	+enBuyuk);
		System.out.println("En Küçük Eleman	="	+enKucuk);	
		
	
}
	}