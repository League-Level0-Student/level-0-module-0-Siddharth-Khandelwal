import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
}
