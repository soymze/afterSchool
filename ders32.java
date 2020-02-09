
public class ders32 {

	public static void main(String[] args) {
		
		ogr o1= new fenOgr("Ali",2);
		ogr o2= new matOgr("Tuğçe",3);
		ciz o3= new psi("Aleyna",4);
		
		o1.adSoyle();
		o2.adSoyle();
        ((ogr) o3).adSoyle();
        
        ((matOgr) o2).bilgisayardaYaz();
		((fenOgr) o1).bilgisayardaYaz();
		
		o3.cizSimdi();
		((fenOgr) o1).cizSimdi();
	}

}
