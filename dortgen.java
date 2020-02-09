import java.awt.Graphics;
import java.awt.Rectangle;

public class dortgen {
	
	Rectangle r;
	int vX,vY;
	
	
	public dortgen(int x,int y,int width, int height, int vX,int vY) {
		
		r= new Rectangle(x,y,width,height);
		this.vX=vX;
		this.vY=vY;
	}
	
	public void ekranCiz (Graphics g) {
		
		g.drawRect((int)r.getX(), (int)r.getY(), (int)r.getWidth(), (int)r.getHeight());
	}
	
	public void hareketEt( dortgen[] digerleri, int sayi) {
		
		Rectangle gecici = new Rectangle(r);
		gecici.setLocation((int)gecici.getX()+vX,(int)gecici.getY()+vY);
		
		boolean cakisma=false;
		for(int i=0;i<sayi;i++) {
			if((!this.equals(digerleri[i])) && gecici.intersects(digerleri[i].getRectangle())) {
				cakisma=true;
			}
		}
		if (gecici.getX()<0 || gecici.getY()<0 || gecici.getX()>620-gecici.getWidth() || gecici.getY()>460-gecici.getHeight())
		{
			cakisma=true;
		}
			if(cakisma==false)	
		r.setLocation((int)r.getX()+vX,(int)r.getY()+vY);
			else {
				vX=-vX;
				vY=-vY;
			}
	}
	public Rectangle getRectangle() {
		return r;
	}
}