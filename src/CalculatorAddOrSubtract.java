import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorAddOrSubtract implements ActionListener {
public static void main(String[] args) {
CalculatorAddOrSubtract t = new CalculatorAddOrSubtract();
t.run();
}	
	void run(){
		JFrame frame = new JFrame();
	
	JPanel panel = new JPanel();
	frame.add(panel);
	JButton add = new JButton(" Addition(+) ");
	JButton subtract = new JButton("Subtraction(-)");
	JTextField num1 = new JTextField(10);
	JTextField num2 = new JTextField(10);
	JLabel label1 = new JLabel("Number 1:");
	JLabel label2 = new JLabel("Number 2:");
	panel.add(label1);
	panel.add(num1);
	panel.add(label2);
	panel.add(num2);
	panel.add(add);
	panel.add(subtract);
	
	frame.setVisible(true);
	frame.pack();
	add.addActionListener(this);
	subtract.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
