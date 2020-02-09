import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class textFDeneme extends JPanel implements ActionListener{

	JLabel label1;
	JTextField textField1;
	JButton button1;
	
	public textFDeneme() {
		super();
		label1 = new JLabel();
		textField1 = new JTextField(10);
		this.add(textField1);
		button1 = new JButton("Tamam");
		button1.addActionListener(this);
		add(button1);
		add(label1);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().contentEquals("Tamam")) {
			
			label1.setText(label1.getText() +" "+ textField1.getText());
			textField1.setText(" ");
		}		
	}

}
