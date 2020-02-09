import java.util.Random;

public class ders2223 {

	public static void main(String[] args) {
		
		int dizi[] = new int[10];
		
		System.out.println("---Oluşturulan Dizi---");
		
		for(int i=0;i<10;i++) {
			Random r=new Random(); 
			   int a=r.nextInt(1000);
			   dizi[i]=a;
		System.out.println((i+1)+ ". Eleman	" +dizi[i]);
		}
		int enKucuk=1000;
		for(int s=0;s<10;s++) {
			for(int a=s;a<10;a++) {
			if(dizi[a]<enKucuk) {
				enKucuk=dizi[a];
				dizi[a]=dizi[s];
				dizi[s]=enKucuk;
				}
			}
			enKucuk=1000;
		}
System.out.println("---Düzenlenen Dizi---");
		
		for(int q=0;q<10;q++) {
		System.out.println((q+1)+ ". Eleman	" +dizi[q]);
		}
	}

}

