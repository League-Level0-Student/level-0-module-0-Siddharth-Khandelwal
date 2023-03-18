import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class testing3 implements ActionListener {
	JTextField tom = new JTextField(10);
public static void main(String[] args) {
testing3 t = new testing3();
t.run();
}
void run() {
JFrame jamal = new JFrame();
	JPanel patrick = new JPanel();
	jamal.add(patrick);
	JButton bob = new JButton("Click Here For Cookie");
	patrick.add(bob);
	
	patrick.add(tom);
	jamal.setVisible(true);
	jamal.pack();
	bob.addActionListener(this);
	
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	String name = tom.getText();
	JOptionPane.showMessageDialog(null, "Hello, "+name+", here is a cookie!");
}

}
