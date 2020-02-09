import javax.swing.JFrame;

public class ders46 extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Deneme Programı");
		frame.add(new checkBoxPanel());		
		frame.setVisible(true);
		frame.setBounds(100, 100, 200, 150);
	}

}
