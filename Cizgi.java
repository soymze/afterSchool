package ders57;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Cizgi extends JPanel implements ActionListener{
 
	Timer time = new Timer(1,this);
	
	int pencerex= 640;
	int pencerey= 480;
	
	int yarix= pencerex/2;
	int yariy= pencerey/2;
	
	int i=150;
	int j=150;
	
	double aci=0;
	int uzunluk= 140;
	
	public Cizgi() {
		time.start();
	}
	
	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		g.setColor(new Color(220,220,220));
		g.drawLine(0, yariy, pencerex, yariy);
		g.setColor(new Color(220,220,220));
		g.drawLine(yarix, 0, yarix, pencerey);
		
		g.setColor(new Color(255,0,0));
		g.drawLine(yarix, yariy,yarix+ i,yariy- j);
		g.drawLine(yarix, yariy,yarix- i,yariy+ j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(640, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Cizgi cizgi= new Cizgi();
		frame.add(cizgi);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		i= (int)(uzunluk*Math.cos(aci));
		j= (int)(uzunluk*Math.sin(aci));
		
		aci = aci + (0.0005 * Math.PI);
		repaint();
	}
	
	
}
