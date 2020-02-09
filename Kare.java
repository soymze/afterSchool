package ders58;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Kare extends JPanel implements ActionListener,KeyListener{

	
		
			 
			Timer time = new Timer(1,this);
			
			int pencerex= 640;
			int pencerey= 480;
			
			int yarix= pencerex/2;
			int yariy= pencerey/2;
			
			int i=0;
			int j=0;
			
			int i1,i2,i3,i4;
			int j1,j2,j3,j4;
			
			double hiz=0.0010;
			double hizd=0.0001;
			
			double aci=0;
			int uzunluk= 150;
			
			public Kare() {
				time.start();
			}
			
			@Override
			public void paint(Graphics g) {
				
				super.paint(g);
				g.setColor(new Color(220,220,220));
				g.drawLine(0, yariy, pencerex, yariy);
				g.drawLine(yarix, 0, yarix, pencerey);
				
				g.setColor(new Color(255,100,150));
				g.drawLine(i1, j1, i2, j2);
				g.drawLine(i2, j2, i3, j3);
				g.drawLine(i3, j3, i4, j4);
				g.drawLine(i4, j4, i1, j1);
			}

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				JFrame frame = new JFrame();
				frame.setVisible(true);
				frame.setSize(640, 480);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				
				Kare kare = new Kare();
				frame.add(kare);
				frame.addKeyListener(kare);
				
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				i1= yarix+(int)(uzunluk*Math.cos(aci));
				j1= yariy-(int)(uzunluk*Math.sin(aci));
				
				i2= yarix+(int)(uzunluk*Math.cos(aci+(0.50*Math.PI)));
				j2= yariy-(int)(uzunluk*Math.sin(aci+(0.50*Math.PI)));
				
				i3= yarix+(int)(uzunluk*Math.cos(aci+(1*Math.PI)));
				j3= yariy-(int)(uzunluk*Math.sin(aci+(1*Math.PI)));
				
				i4= yarix+(int)(uzunluk*Math.cos(aci+(1.50*Math.PI)));
				j4= yariy-(int)(uzunluk*Math.sin(aci+(1.50*Math.PI)));
				
				aci = aci + (hiz * Math.PI);
				repaint();
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode()==KeyEvent.VK_LEFT) {
					hiz-=hizd;
				}
				else if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
					hiz+=hizd;
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

	}


