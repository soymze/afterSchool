import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Renkler extends JPanel implements MouseListener{
	
	
		
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	BufferedImage resim;
	Color renk;
	int boyutx=640;
	int boyuty=480;
	String yazi;
		public Renkler() {
        resim=new BufferedImage(boyutx,boyuty,BufferedImage.TYPE_INT_RGB);
        
        float hue=0F;
        float saturation=0F;
        
        Graphics2D g=resim.createGraphics();
        for(int i=0;i<boyutx;i++) {
        	for(int j=0;j<boyuty;j++) {
        		hue=(float)i/boyutx;
        		saturation=(float)j/boyuty;
        		renk = Color.getHSBColor(hue, saturation, 1F);
        		resim.setRGB(i,j,renk.getRGB());
        	}
        }
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, boyutx, boyuty);
		}
		public void renkDegistir(int x, int y) {
		  float hue= (float)x/boyutx;
		  float saturation= (float)y/boyuty;
			renk=Color.getHSBColor(hue, saturation, 1F);
			
			 Graphics2D g=resim.createGraphics();
		        g.setColor(renk);
		        g.fillRect(0, 0, boyutx, boyuty);
		}
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(resim,0,0,null);
			g.drawString(yazi, 20,20);
		}		
		public static void main(String[] args) {
			JFrame frame= new JFrame("Renkler");
			Renkler panel = new Renkler();
			panel.addMouseListener(panel);
			
			frame.add(panel);
			
			frame.setSize(640,480);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		@Override
		public void mouseClicked(MouseEvent e) {
			yazi= "X:  "  +e.getX()+  " - Y: "  +e.getY();
			renkDegistir(e.getX(),e.getY());
			repaint();
		}
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}	
	}

