import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class testing4 implements ActionListener{
JButton button = new JButton("Click after inserting number.");
JTextField textfield = new JTextField(10);
JLabel label = new JLabel("Enter a number 1-300");
	public static void main(String[] args) {
	testing4 t = new testing4();
	t.run();
	}
	void run(){
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.add(panel);
	panel.add(label);
	panel.add(textfield);
	panel.add(button);
	frame.pack();
	frame.setVisible(true);
	button.addActionListener(this);
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pressed = (JButton) e.getSource();
		String first = textfield.getText();
		Random rand = new Random();
				int one = Integer.parseInt(first);
	if(pressed == button) {
		int num = rand.nextInt(9)+2;
		
	if(one%num==0) {
		JOptionPane.showMessageDialog(null, "you are special");
		System.out.println("Your number divided by "+num+" had a remainder of 0");
	}
	else {
		JOptionPane.showMessageDialog(null, "L, not special lol");
		System.out.println("Your number divided by "+num+" did not have a remainder of 0");
	}
	}
	}
	}
		


