import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class suDalgasi extends JPanel implements ActionListener , MouseListener, KeyListener{

	cember[] cemberler;
	int cemberMevcut=0;
	int cemberMax =10;
	int cemberEleman=0;
	int artisMiktari=2;
	Timer zaman;
	public suDalgasi() {
		super();
		
		
		addMouseListener(this);
		cemberler= new cember[10];
		zaman = new Timer(50,this);
		zaman.start();
	}
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		for(int i = 0; i< cemberEleman; i++) {
			cemberler[i].ekranaCiz(g);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		for(int i = 0; i< cemberEleman; i++) {
			cemberler[i].genisle(artisMiktari);
		}
			repaint();
										
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		cember yeniCember = new cember(e.getX(),e.getY(),0);
		cemberler[cemberMevcut] = yeniCember;
		cemberMevcut= (cemberMevcut+1) %cemberMax;
		if(cemberEleman<cemberMax) {
			cemberEleman++;
		}
		
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
		zaman.restart();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		zaman.stop();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode()==e.VK_UP) {
			artisMiktari++;
		}
		else if (e.getKeyCode()==e.VK_DOWN) {
			artisMiktari--;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
