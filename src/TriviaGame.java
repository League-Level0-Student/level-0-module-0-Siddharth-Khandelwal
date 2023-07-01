import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TriviaGame implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("START GAME");
	JButton button2 = new JButton("START GAME");
	JButton button3 = new JButton("START GAME");
	JLabel label1 = new JLabel("Easy:");
	JLabel label2 = new JLabel("Medium:");
	JLabel label3 = new JLabel("Hard:");

	public static void main(String[] args) {
		TriviaGame t = new TriviaGame();
		t.run();
	}

	void run() {
		frame.add(panel);
		panel.add(label1);
		panel.add(button1);
		panel.add(label2);
		panel.add(button2);
		panel.add(label3);
		panel.add(button3);
		frame.pack();
		frame.setVisible(true);

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pressed = (JButton) e.getSource();
		if (pressed == button1) {
			String easy1 = JOptionPane.showInputDialog("Question 1: What is the capital of Russia?");
			if (easy1.equalsIgnoreCase("moscow")) {
				JOptionPane.showMessageDialog(null, "Correct! Click below for next Question");
				String easy2 = JOptionPane.showInputDialog("Question 2: What character is Tom Holland in the Marvel Chacter Universe?");
				if (easy2.equalsIgnoreCase("Spiderman")) {
					JOptionPane.showMessageDialog(null, "Correct! Click below for next Question");
					String easy3 = JOptionPane.showInputDialog("What sport does Lebron James play?");
					if (easy3.equalsIgnoreCase("basketball")) {
						JOptionPane.showMessageDialog(null, "Correct! Click below for next Question");
						String easy4 = JOptionPane.showInputDialog("How many side does an octagon have?(Word Answer)");
						if (easy4.equalsIgnoreCase("eight")) {
							JOptionPane.showMessageDialog(null, "Correct! Click below for next Question");
							String easy5 = JOptionPane.showInputDialog("Who was the first man on the Moon?");
							if (easy5.equalsIgnoreCase("Neil Armstrong")) {
								JOptionPane.showMessageDialog(null, "Correct! You have completed easy trivia game!");
							}
							else {
								JOptionPane.showMessageDialog(null, "Incorrect SCORE:4");
							}
							}
						else {
							JOptionPane.showMessageDialog(null, "Incorrect SCORE:3");
						}
					} else {
						JOptionPane.showMessageDialog(null, "Incorrect SCORE:2");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Incorrect SCORE:1");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Incorrect SCORE:0");
			}
		}
	}
}
