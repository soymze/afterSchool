import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class ders43 extends JFrame implements MouseListener{	
	
	JLabel label1,label2,label3;
	JPanel panel1;
	int sayi=0;
	ders43(){
		super();
		
		panel1= new JPanel();
		
		label1= new JLabel("Hoşgeldiniz!");
		panel1.add(label1);
		
		label2= new JLabel("Deneme");
		panel1.add(label2);
		
		label3= new JLabel(" " +sayi);
		panel1.add(label3);
		
		add(panel1);
		addMouseListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ders43  pencere = new ders43 ();
		pencere.setSize(640,480);
		pencere.setVisible(true);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getButton()== e.BUTTON1) {
		sayi++;
		label3.setText(" " +sayi);
		}
		else if (e.getButton()==e.BUTTON3) {
			sayi--;
			label3.setText(" " +sayi);
		}
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





	

	
