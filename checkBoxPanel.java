import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class checkBoxPanel extends JPanel implements ActionListener{
	
	JCheckBox check1,check2;
	JButton button1;
	
	public checkBoxPanel() {
		
		check1= new JCheckBox("Yalnız");
		add(check1);
		check2= new JCheckBox("Mutsuz");
		add(check2);
		
		button1= new JButton("Onayla");
		button1.addActionListener(this);
		add(button1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s="Seçtiğiniz İnsan,";
		
		if(check1.isSelected()) {
			s+= "	yalnız	";
		}
		else {
			s+="	yalnız değil	";
		}
		if(check2.isSelected()) {
			s+= "	ve mutsuz...	";
		}
		else {
			s+="	ve mutlu...	";
		}
		JOptionPane.showMessageDialog(this, s);
	}

}
