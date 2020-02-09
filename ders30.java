
public class ders30 {

	public static void main(String[] args) {
		
		ogr o1= new fenOgr("Ali",2);
		ogr o2= new matOgr("Tuğçe",3);
		
		o1.adSoyle();
		o2.adSoyle();

		((fenOgr) o1).bil();
		((matOgr) o2).hesapla();
	}

}
