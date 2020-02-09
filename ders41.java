import javax.swing.JFrame;

public class ders41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame pencere = new JFrame("wsp");
		yeniPanel panel1 = new yeniPanel();
		pencere.add(panel1);
		pencere.addKeyListener(panel1);
		pencere.setSize(640, 480);
		pencere.setVisible(true);
		
	}

}
