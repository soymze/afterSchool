import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JPanel;

public class yeniPanel extends JPanel implements KeyListener{

	dortgen a;
	dortgen[] digerleri;
	int elemanSayisi=20;
	int adim=5;
	int gen,boy,xi,yi;
	Rectangle as;
	Random r = new Random();
	public yeniPanel()
	{
		super();
		addKeyListener(this);
		
		a= new dortgen(300,200,20,20);
		digerleri = new dortgen[20];
		for(int i= 0;i<elemanSayisi;i++) {			
			digerleri[i]= new dortgen(xi=r.nextInt(600),yi=r.nextInt(400),boy=r.nextInt(50),boy);
		}
	}
public void kontrol(int x, int y, dortgen[] digerleri, int sayi) {
		
		Rectangle gecici = new Rectangle(as);
		gecici.setLocation((int)gecici.getX()+x,(int)gecici.getY()+y);
		
		boolean ctrl=false;
		for(int i=0;i<elemanSayisi;i++) {
			if(gecici.intersects(digerleri[i].getRectangle())) {
				ctrl=true;					
			}
		}
			if (gecici.getX()<0 || gecici.getY()<0 || gecici.getX()>620-gecici.getWidth() || gecici.getY()>460-gecici.getHeight())
		{
			ctrl=true;
		}
			if(ctrl==false)	
		as.setLocation((int)as.getX()+x,(int)as.getY()+y);
	}
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawRect(0, 0, 620, 460);
		a.ekranCiz(g);
		for(int i= 0;i<elemanSayisi;i++) {
			digerleri[i].ekranCiz(g);;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == e.VK_UP) {
			a.hareketEt(0, -adim, digerleri,elemanSayisi);
			repaint();
		}
		else if(e.getKeyCode() == e.VK_DOWN) {
			a.hareketEt(0, adim, digerleri,elemanSayisi);
			repaint();
		}
	
		else if(e.getKeyCode() == e.VK_LEFT) {
			a.hareketEt(-adim, 0, digerleri,elemanSayisi);
			repaint();
		}
		else if(e.getKeyCode() == e.VK_RIGHT) {
			a.hareketEt(adim, 0, digerleri,elemanSayisi);
			repaint();
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}