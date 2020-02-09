import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

public class fizikMotoru {

	ArrayList <FizikElemani> elemanlar;

	private double g= 0.3;
	private double hizSiniri= 0.001;
	double enerjiKat = 0.2;
	
	
	int maxX = 640;
	int maxY = 480;
	int minX = 0;
	int minY = 0;
	
	public fizikMotoru() {
		elemanlar = new ArrayList <FizikElemani>();
	}
	
	public void elemanEkle(FizikElemani gelenEleman) {
		elemanlar.add(gelenEleman);
	}
	
	public void ekranaCiz(Graphics g) {
		Iterator <FizikElemani> it = elemanlar.iterator();
		while(it.hasNext()) {
			FizikElemani e = it.next();
			e.ekranaCiz(g);
		}
	}
	public void guncelle(double katSayi) {
		
		Iterator <FizikElemani> it = elemanlar.iterator();
		while(it.hasNext()) {
			FizikElemani e = it.next();
			e.x= e.x + e.vx * katSayi;
			e.y= e.y + e.vy * katSayi;
		
			// Y ekseni hareket	
		if(e.y > maxY - e.h) {
			e.vy= e.vy - (e.m*katSayi)* enerjiKat;
			e.y= maxY - e.h;
			if(e.vy < hizSiniri) {
				e.vy= 0 ;
				e.vx = e.vx * 0.9;
			}
			else {
			e.vy= e.vy - g * katSayi;
			e.vy=-e.vy;	
			}
			
		}
		
		else if (e.y < minY) {
			e.vy = e.vy - g * katSayi;
			e.vy = -e.vy;
		}
		
		else {
			e.vy= e.vy + g * katSayi;
		}
		
		//X ekseni hareket
		if(e.x > maxX - e.w) {
			e.vx= e.vx - (e.m*katSayi)* enerjiKat;
			e.x= maxX - e.h;
			e.vx=-e.vx;
		}
		else if(e.x < minX) {
			e.vx= e.vx - (e.m*katSayi)*0.2;
			if(e.vx > -hizSiniri) {
				e.vx= 0 ;
			}
			e.x= minX;
			e.vx=-e.vx;
			}		
		}
	}
}
