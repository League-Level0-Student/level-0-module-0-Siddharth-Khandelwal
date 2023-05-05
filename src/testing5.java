import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class testing5 implements ActionListener {
	JButton button1 = new JButton("Special Button :)");
	JButton button2 = new JButton("Another button");
public static void main(String[] args) {
	
	testing5 t = new testing5();
	t.run();
	}
	void run(){
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	frame.pack();
	frame.setVisible(true);
	button1.addActionListener(this);
	button2.addActionListener(this);
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	JButton pre = (JButton)	e.getSource();
	if(pre == button1) {
		JOptionPane.showMessageDialog(null, "You pressed the special button!");
	}
	if(pre == button2) {
		JOptionPane.showMessageDialog(null, "I wonder what this button does?");
	}
	}
}
