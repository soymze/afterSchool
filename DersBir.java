import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class DersBir extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int pencereBoyutx=640;
	int pencereBoyuty=480;

	int x=10;
	int y=10;
	
	Insets icKisim;
	
	BufferedImage gorselBuffer;
	
	int hedefFps= 200;
	boolean oyunDevam=true;
	
	fizikMotoru fm= new fizikMotoru();
	int topSayisi=100;
	
	public static void main(String[] args) {
		DersBir oyun = new DersBir();
		oyun.dongu();
		

	}
	long fpsYazdirmaZamani=0;
	int mevcutFps=0;
	
	private void dongu() {
				baslangic();
				
				long oncekiDonguBaslangici= System.nanoTime();
				long hedefDonguZamani=1000000000/hedefFps;
				
				//Döngü başlar
				while(oyunDevam) {
					
				long donguBaslangici=System.nanoTime();
				long donguZamani= donguBaslangici-oncekiDonguBaslangici;
								
				
				oncekiDonguBaslangici=donguBaslangici;
				
				double zamanDegiskeni= (double)donguZamani/(double)hedefDonguZamani;
				
				mevcutFps++;
				fpsYazdirmaZamani=fpsYazdirmaZamani+donguZamani;
				
				if(fpsYazdirmaZamani>=1000000000) {
					System.out.println("FPS : " +mevcutFps);
					fpsYazdirmaZamani=0;
					mevcutFps=0;
				}
				
				//Update
				oyunMantigiGuncelle(zamanDegiskeni);
				
				//Render
				oyunGrafigiGuncelle();
				long artanNano=hedefDonguZamani-(System.nanoTime()-donguBaslangici);
				try {
					if(artanNano>0) {
					Thread.sleep(artanNano/1000000);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
				}
	}
	
	private void oyunGrafigiGuncelle() {
		
		Graphics frameGrafigi=getGraphics();
		
		Graphics bufferGrafigi=gorselBuffer.getGraphics();
		
		//Buffer'ı güncelle
		bufferGrafigi.setColor(Color.WHITE);
		bufferGrafigi.fillRect(0, 0, pencereBoyutx, pencereBoyuty);
		
		bufferGrafigi.setColor(Color.BLACK);
		fm.ekranaCiz(bufferGrafigi);

		
		//Buffer'ı Frame'e çiz
		frameGrafigi.drawImage(gorselBuffer,icKisim.left,icKisim.top,this);
		
		repaint();
	}

	private void oyunMantigiGuncelle(double zamanDegiskeni) {
			fm.guncelle(zamanDegiskeni);		
	}

	private void baslangic() {
		setTitle("İlk Döngü");		
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		icKisim = getInsets();
		
		setSize(icKisim.left+pencereBoyutx+icKisim.right,icKisim.top+pencereBoyuty+icKisim.bottom);
		
		gorselBuffer = new BufferedImage(pencereBoyutx, pencereBoyuty, BufferedImage.TYPE_INT_RGB);
	
	double boyut = Math.random()*50;
		for(int i= 0; i<topSayisi; i++) {
		fm.elemanEkle(new top(Math.random()*640,
				Math.random()*300,
				Math.random()*10,
				Math.random()*10, 
				boyut+i/2,
				boyut+i/2,
				boyut+i/2));

		}
	}
}
