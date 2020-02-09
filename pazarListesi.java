
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
	
	public void yaz() {
		for(int i=0;i<elemanSayisi;i++) {
			System.out.println(liste[i]);
		}
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
	
	public void sil(int index) {
		for (int i=index;i<elemanSayisi-1;i++) {
			liste[i]=liste[i+1];
			}
		elemanSayisi--;
		}
	public void ekle(int index, String eklenecekEleman) {
		String tmp;
		elemanSayisi++;
		for (int i=index;i<elemanSayisi;i++) {
			
			tmp=liste[index];
			liste[index]=eklenecekEleman;			
			eklenecekEleman=tmp;
			}
	}
}
