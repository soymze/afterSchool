import java.awt.Graphics;

public abstract class FizikElemani {

	double x=0;
	double y=0;
	
	double vx= 0;
	double vy=0;
	
	double w=0;
	double h=0;
	
	double m=0;

	public abstract void ekranaCiz(Graphics g);
	
	public FizikElemani(double x,double y, double vx, double vy,double w, double h,double m) {
		super();
		this.x= x;
		this.y= y;
		this.vx= vx;
		this.vy= vy;
		this.w= w;
		this.h= h;
		this.m= m;
	}
}
