
public abstract class ogr {
	private String isim;
	private int no;
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public ogr(String isim, int no) {
		
		this.isim = isim;
		this.no = no;
	}
	

	public void adSoyle() {
		System.out.println("Adım	:" +isim);
	}
}
