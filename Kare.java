import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Kare extends JPanel implements MouseListener,MouseMotionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    
	
	String yazi= "  ";
    ArrayList<Rectangle> kare;
	Rectangle seciliKare= null;
    
    public Kare() {
	kare = new ArrayList<Rectangle>();
	kare.add(new Rectangle(10,10,30,30));
	kare.add(new Rectangle(40,40,30,30));
	kare.add(new Rectangle(110,10,30,30));
	kare.add(new Rectangle(10,330,30,30));
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		//g.drawString(yazi,20,20);
		
		Iterator<Rectangle> it = kare.iterator();
		Rectangle r;
		while(it.hasNext()){
			r= it.next();
			if(seciliKare != null && r.equals(seciliKare)) {
				g.setColor(Color.RED);
				g.fillRect(r.x, r.y, r.width, r.height);
				g.setColor(Color.BLACK);
			}
			else {
				g.fillRect(r.x, r.y, r.width, r.height);
			}
		}
	}
	
	public static void main(String[] args) {
		JFrame frame= new JFrame ("Kareler");
		Kare panel = new Kare();
		panel.addMouseMotionListener(panel);
		panel.addMouseListener(panel);
		frame.add(panel);
		
		frame.setSize(640,480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if(seciliKare !=null) {
			seciliKare.setLocation(e.getPoint());
			repaint();
		}
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		yazi= e.toString();
		repaint();
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		Iterator<Rectangle> it = kare.iterator();
		Rectangle r;
		while(it.hasNext()){
			r= it.next();
			if(r.contains(e.getPoint())){
				seciliKare= r;
				repaint();
				return;
			}
		}
		seciliKare=null;
		repaint();
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
