
public class Insan {
	private String isim;
	private int yas;
	
	public void sayHi()
	{
		System.out.println("Merhaba, benim adım "+isim);
	}
	public void sayHiTo(Insan gelenInsan)
	{
		System.out.println("Merhaba," +gelenInsan.getIsim()+ " benim adım " +isim+ ". Nasılsın?");
	}
	public Insan (int alinanYas, String alinanIsim)
	{
		setYas(alinanYas);
		setIsim(alinanIsim);
		
	}
	
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public String getIsim() {
		return isim;
	}	

	public void setYas(int yas) {
		this.yas = yas;
	}
	public int getYas() {
		return yas;
	}
}
