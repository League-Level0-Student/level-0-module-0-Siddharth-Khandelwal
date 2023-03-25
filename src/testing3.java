import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class testing3 implements ActionListener {
	JLabel lucas = new JLabel("Name:");
	JLabel lamar = new JLabel("Current Age:");
	JTextField tom = new JTextField(10);
	JTextField tallon = new JTextField(6);
	JButton bob = new JButton("Click Here For Cookie");
	JButton borna = new JButton("Click Here For Chocolate");
	JButton bonnie = new JButton("Click Here If It's Your Birthday");
public static void main(String[] args) {
testing3 t = new testing3();
t.run();
}
void run() {
JFrame jamal = new JFrame();
	JPanel patrick = new JPanel();
	jamal.add(patrick);
	patrick.add(lucas);
	patrick.add(tom);
	patrick.add(lamar);
	patrick.add(tallon);
	patrick.add(bob);
	patrick.add(borna);
	patrick.add(bonnie);
	jamal.setVisible(true);
	jamal.pack();
	bob.addActionListener(this);
	borna.addActionListener(this);
	bonnie.addActionListener(this);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
		String name = tom.getText();
		String age = tallon.getText();
		JButton pressed = (JButton) e.getSource();
	if(pressed == bob) {

	JOptionPane.showMessageDialog(null, "Hello "+name+", here is "+age+" cookie(s)!");
	}
	else if(pressed == borna) {
		JOptionPane.showMessageDialog(null, "Hello "+name+", here is a box with "+age+" chocolate(s)!");
	}
	else if(pressed == bonnie) {
		JOptionPane.showMessageDialog(null, "Hey "+name+", since it is your "+age+"th birthday, here is "+age+" chocolates and "+age+" cookies!");
}
}
}
