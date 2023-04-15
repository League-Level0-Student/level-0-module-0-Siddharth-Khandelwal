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
	JButton add = new JButton("Addition(+)");
	JButton subtract = new JButton("Subtraction(-)");
	JButton multiply = new JButton("Multiplication(x)");
	JButton division = new JButton("Division(/)");
	JButton square = new JButton("Square(^2)");
	JButton cube = new JButton("Cube(^3)");
	JButton power = new JButton("Power^#");
	JTextField num1 = new JTextField(10);
	JTextField num2 = new JTextField(10);
	JLabel label1 = new JLabel("Number 1:");
	JLabel label2 = new JLabel("Number 2:");
	JLabel info = new JLabel("If squaring or cubing, Number 2 must be filled, but is irrelevant.");
	JLabel minfo = new JLabel("If doing to a power, Number 2 is the exponent, Number 1 is the base.");
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
	panel.add(info);
	panel.add(square);
	panel.add(cube);
	panel.add(minfo);
	panel.add(power);
	
	frame.setVisible(true);
	frame.pack();
	add.addActionListener(this);
	subtract.addActionListener(this);
	multiply.addActionListener(this);
	division.addActionListener(this);
	square.addActionListener(this);
	cube.addActionListener(this);
	power.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pressed = (JButton) e.getSource();
		String number1 = num1.getText();
		double one = Double.parseDouble(number1);
		String number2 = num2.getText();
		double two = 0; 
				if(pressed != cube && pressed != square) {
					two = Double.parseDouble(number2);
				}
		
		if (pressed == add){
			JOptionPane.showMessageDialog(null, "Addition Answer: "+(one+two));
		}
		else if (pressed == subtract) {
			JOptionPane.showMessageDialog(null, "Subtraction Answer: "+(one-two));
		}
		else if (pressed == multiply) {
			JOptionPane.showMessageDialog(null, "Multiplication Answer: "+(one*two));
		}
		else if(pressed == division) {
			JOptionPane.showMessageDialog(null, "Division Answer: "+(one/two));
		}
		else if(pressed == square) {
			JOptionPane.showMessageDialog(null, "Squaring Answer: "+(one*one));
		}
		else if(pressed == cube) {
			JOptionPane.showMessageDialog(null, "Cubing Answer: "+(one*one*one));
		}
		else if(pressed == power) {
			JOptionPane.showMessageDialog(null, "Power Answer: "+Math.pow(one,two));
		}
	}
}
