import javax.swing.JFrame;

public class ders3839 {

	public static void main(String[] args) {
		
		JFrame pencere=new JFrame("Program1");
		suDalgasi panel1 =new suDalgasi();
		pencere.add(panel1);
		pencere.addKeyListener(panel1);
		pencere.setSize(640, 480);
		pencere.setVisible(true);

	}

}
