import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class gezenKare extends JPanel implements KeyListener {

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<Rectangle> gk;
	
	Random rast = new Random();
	int degX= rast.nextInt(300);
	int degY= rast.nextInt(300);
	int boyut = 10;
	
	Rectangle a = new Rectangle(degX, degY, boyut, boyut);
	
	public gezenKare() {
		gk = new ArrayList<Rectangle>();
		for(int i = 0; i <=500 ; i+=10) {
			for(int k = 0; k <=500 ; k+=10) {
			gk.add(new Rectangle(i,k,10,10));	
			}
			
		}		
	}
	public void paint(Graphics g) {
		super.paint(g);
		
		Iterator<Rectangle> it = gk.iterator();
		Rectangle r;
		while(it.hasNext()){
			r= it.next();
				g.setColor(Color.RED);
				g.fillRect(r.x, r.y, boyut, boyut);
				g.setColor(Color.BLACK);
			}			
		g.fillRect(a.x, a.y, a.width, a.height);
	}
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Yilaaan");
		gezenKare panel = new gezenKare ();
		frame.addKeyListener(panel);
		frame.add(panel);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			if (a.y > 0) {
				a.y-=10;
			repaint();
			}
		}
		else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			if (a.y < 500) {
				a.y+=10;
			repaint();
			}		
		}
		else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			if (a.x > 0) {
			a.x-=10;
			repaint();	
			}			
		}
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			if (a.x < 500) {
			a.x+=10;
			repaint();	
			}		
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
