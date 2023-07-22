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
	int score = 0;

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
		if(askQuestion("What is the capital of Italy?","Rome")) {
			if(askQuestion("What character is Tom Holland in the Marvel Cinematic Universe?(No hyphen)","Spiderman")) {
				if(askQuestion("What sport does Lebron James play?","Basketball")) {
					if(askQuestion("How many side does an octagon have?(Word Answer)","eight")) {
						if(askQuestion("Who was the first man on the Moon?","Neil Armstrong")) {
							JOptionPane.showMessageDialog(null, "Congradulations, you have completed easy trivia game!");
						}
					}
				}
			}
		}
		}
		if(pressed == button2) {
			if(askQuestion("What city was destroyed first by American atomic bombs in WWII?","Hiroshima")) {
				if(askQuestion("What is the only mammal that can't jump?","Elephant")) {
					if(askQuestion("What is arachnaphobia a fear of?(plural)","Spiders")) {
						if(askQuestion("What modern day country is Chernobyl in?","Ukraine")) {
							if(askQuestion("What country possesed Alaska before the United States?","Russia")) {
								JOptionPane.showMessageDialog(null, "Congradulations, you have completed medium trivia game!");
							}
						}
					}
				}
			}
		}
		if(pressed == button3) {
			if(askQuestion("What language is spoken in Brazil?","Portuguese")) {
				if(askQuestion("Silverstone is a circuit in what car racing league?(Word Form)","Formula One")) {
					if(askQuestion("What does BBC stand for?","British Broadcasting Corporation")) {
						if(askQuestion("What is the largest desert in the world?","Antarctica")) {
							if(askQuestion("What is the only non-European double landlocked country?","Uzbekistan")) {
								JOptionPane.showMessageDialog(null, "Congradulations, you have completed hard trivia game!");
							}
						}
					}
				}
			}
		}
		score = 0;
	}
	boolean askQuestion (String question, String answer) {
		String guess = JOptionPane.showInputDialog(question);
		if(guess.equalsIgnoreCase(answer)) {
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
			return true;
		}
		else {
		JOptionPane.showMessageDialog(null, "Incorrect. Score: "+score);
		return false;
		}
	}
}
