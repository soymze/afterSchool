import java.awt.Graphics;

public class cember {

	int x,y;
	int genyuk;

	public cember(int x, int y, int genyuk) {
		super();
		this.x = x;
		this.y = y;
		this.genyuk = genyuk;
	}

	public void ekranaCiz(Graphics g) {
		g.drawOval(x, y, genyuk, genyuk);
	}
	
	public void genisle(int i) {
		x-= i/2;
		y-= i/2;	
		genyuk = genyuk+i;
	}
	
}
