
public class Insan {
	
	private String isim;
	private int yas;
	
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
