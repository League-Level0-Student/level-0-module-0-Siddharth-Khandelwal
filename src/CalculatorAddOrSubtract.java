import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorAddOrSubtract implements ActionListener {
	JButton add = new JButton(" Addition(+) ");
	JButton subtract = new JButton("Subtraction(-)");
	JButton multiply = new JButton("Multiply(x)");
	JButton division = new JButton("Division(/)");
	JTextField num1 = new JTextField(10);
	JTextField num2 = new JTextField(10);
	JLabel label1 = new JLabel("Number 1:");
	JLabel label2 = new JLabel("Number 2:");
public static void main(String[] args) {
CalculatorAddOrSubtract t = new CalculatorAddOrSubtract();
t.run();
}	
	void run(){
		JFrame frame = new JFrame();
		frame.setPreferredSize(new Dimension(500,100));
	JPanel panel = new JPanel();
	frame.add(panel);
	panel.add(label1);
	panel.add(num1);
	panel.add(label2);
	panel.add(num2);
	panel.add(add);
	panel.add(subtract);
	panel.add(multiply);
	panel.add(division);
	
	frame.setVisible(true);
	frame.pack();
	add.addActionListener(this);
	subtract.addActionListener(this);
	multiply.addActionListener(this);
	division.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String number1 = num1.getText();
		double one = Double.parseDouble(number1);
		String number2 = num2.getText();
		double two = Double.parseDouble(number2);
		JButton pressed = (JButton) e.getSource();
		if (pressed == add){
			JOptionPane.showMessageDialog(null, one+two);
		}
		else if (pressed == subtract) {
			JOptionPane.showMessageDialog(null, one-two);
		}
		else if (pressed == multiply) {
			JOptionPane.showMessageDialog(null, one*two);
		}
		else if(pressed == division) {
			JOptionPane.showMessageDialog(null, one/two);
		}

	}
}
