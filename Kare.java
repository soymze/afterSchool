package ders60;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Kare extends JPanel implements ActionListener,KeyListener{

	
			Random rg = new Random ();
			 
			Timer time = new Timer(1,this);
			
			int pencerex= 640;
			int pencerey= 480;
			
			int anakareX= pencerex/2;
			int anakareY= pencerey/2;
			int anaKareHiz=7;
			int i=0;
			int j=0;
			
			int i1,i2,i3,i4;
			int j1,j2,j3,j4;
			
			Polygon anaKare;
			
			LinkedList<Polygon> kareler = new LinkedList();
			
			double hiz=0.0010;
			double hizd=0.0001;
			
			double aci=0;
			int uzunluk= 150;
			
			public Kare() {
				time.start();
				anaKare= new Polygon();
				anaKare.xpoints= new int[4];
				anaKare.ypoints= new int[4];
				anaKare.npoints= 4;
			}
			
			@Override
			public void paint(Graphics g) {
				
				super.paint(g);
				g.setColor(new Color(220,220,220));
				g.drawLine(0, pencerey/2, pencerex, pencerey/2);
				g.drawLine(pencerex/2, 0, pencerex/2, pencerey);
				
				/*g.setColor(new Color(255,100,150));
				g.drawLine(i1, j1, i2, j2);
				g.drawLine(i2, j2, i3, j3);
				g.drawLine(i3, j3, i4, j4);
				g.drawLine(i4, j4, i1, j1);*/
				g.setColor(new Color(53,99,200));
					
				
				g.fillPolygon(anaKare);
				g.setColor(new Color(255,255,255));
				g.drawLine(anakareX, anakareY,(anaKare.xpoints[0]+anaKare.xpoints[1])/2,(anaKare.ypoints[0]+anaKare.ypoints[1])/2);			
				g.setColor(new Color(53,99,200));
				
				Iterator<Polygon> kucukKareler = kareler.iterator();
				while(kucukKareler.hasNext()) {
					g.fillPolygon(kucukKareler.next());
				}
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
				
				
				anaKare.xpoints[0]= anakareX+(int)(uzunluk*Math.cos(aci));
				anaKare.ypoints[0]= anakareY-(int)(uzunluk*Math.sin(aci));
				
				anaKare.xpoints[1]= anakareX+(int)(uzunluk*Math.cos(aci+(0.50*Math.PI)));
				anaKare.ypoints[1]= anakareY-(int)(uzunluk*Math.sin(aci+(0.50*Math.PI)));
				
				anaKare.xpoints[2]= anakareX+(int)(uzunluk*Math.cos(aci+(1*Math.PI)));
				anaKare.ypoints[2]= anakareY-(int)(uzunluk*Math.sin(aci+(1*Math.PI)));
				
				anaKare.xpoints[3]= anakareX+(int)(uzunluk*Math.cos(aci+(1.50*Math.PI)));
				anaKare.ypoints[3]= anakareY-(int)(uzunluk*Math.sin(aci+(1.50*Math.PI)));
				
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
				else if(e.getKeyCode()==KeyEvent.VK_UP) {
					ilerle();
				}
				else if(e.getKeyCode()==KeyEvent.VK_DOWN) {
					gerile();
				}
				else if(e.getKeyCode()==KeyEvent.VK_A) {
					anakareX=anakareX-anaKareHiz;
				}
				else if(e.getKeyCode()==KeyEvent.VK_D) {
					anakareX=anakareX+anaKareHiz;
				}
				else if(e.getKeyCode()==KeyEvent.VK_W) {
					anakareY=anakareY-anaKareHiz;
				}
				else if(e.getKeyCode()==KeyEvent.VK_S) {
					anakareY=anakareY+anaKareHiz;
				}
				else if(e.getKeyCode()==KeyEvent.VK_N) {
					rastgeleKareEkle();
				}
			}

			private void ilerle() {
				
				int yerDegX=((anaKare.xpoints[0]+anaKare.xpoints[1])/2)-anakareX;
			    int yerDegY=((anaKare.ypoints[0]+anaKare.xpoints[1])/2)-anakareY;
			    
			    anakareX+=yerDegX*0.1;
			    anakareY+=yerDegY*0.1;
			}
			private void gerile() {
				
				int yerDegX=((anaKare.xpoints[0]+anaKare.xpoints[1])/2)-anakareX;
			    int yerDegY=((anaKare.ypoints[0]+anaKare.xpoints[1])/2)-anakareY;
			    
			    anakareX-=yerDegX*0.1;
			    anakareY-=yerDegY*0.1;
			}

			public void rastgeleKareEkle() {
				Polygon yeniRastgeleKare = new Polygon();
				yeniRastgeleKare.xpoints=new int [4];
				yeniRastgeleKare.ypoints=new int [4];
				yeniRastgeleKare.npoints=4;
				
				int yeniKareX=rg.nextInt(pencerex);
				int yeniKareY=rg.nextInt(pencerey);
				int yeniUzunluk= rg.nextInt(15);
				
				yeniRastgeleKare.xpoints[0]= yeniKareX+(int)(yeniUzunluk*Math.cos(aci));
				yeniRastgeleKare.ypoints[0]= yeniKareY-(int)(yeniUzunluk*Math.sin(aci));
				
				yeniRastgeleKare.xpoints[1]= yeniKareX+(int)(yeniUzunluk*Math.cos(aci+(0.50*Math.PI)));
				yeniRastgeleKare.ypoints[1]= yeniKareY-(int)(yeniUzunluk*Math.sin(aci+(0.50*Math.PI)));
				
				yeniRastgeleKare.xpoints[2]= yeniKareX+(int)(yeniUzunluk*Math.cos(aci+(1*Math.PI)));
				yeniRastgeleKare.ypoints[2]= yeniKareY-(int)(yeniUzunluk*Math.sin(aci+(1*Math.PI)));
				
				yeniRastgeleKare.xpoints[3]= yeniKareX+(int)(yeniUzunluk*Math.cos(aci+(1.50*Math.PI)));
				yeniRastgeleKare.ypoints[3]= yeniKareY-(int)(yeniUzunluk*Math.sin(aci+(1.50*Math.PI)));
				
				aci = aci + (hiz * Math.PI);
				repaint();
				kareler.add(yeniRastgeleKare);
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

	}

