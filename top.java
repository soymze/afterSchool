import java.awt.Graphics;

public class top extends FizikElemani {
	
	public top(double x, double y, double vx, double vy, double w, double h, double m) {
		super(x, y, vx, vy, w, h, m);
		// TODO Auto-generated constructor stub
	}	

	public void ekranaCiz(Graphics g) {
		g.drawOval((int)x,(int)y,(int)w,(int)h);
	}
}
