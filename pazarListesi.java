
public class pazarListesi {

	String[] liste;
	int elemanSayisi;
	int sinir;
	
	public pazarListesi(int elemanKapasitesi)
	{
		liste= new String [elemanKapasitesi];
		elemanSayisi=0;
		sinir= elemanKapasitesi;
	}
	
	public void listeyeEkle(String eklenecekOlan)
	{
		if(elemanSayisi<sinir) {
			liste[elemanSayisi] = eklenecekOlan;
			elemanSayisi++;
		}
		else
		{
			System.out.println("Boş yer kalmadı..");
		}
		
	}
	public void yaz() {
		for(int i=0;i<elemanSayisi;i++) {
			System.out.println(liste[i]);
		}
	}
}
