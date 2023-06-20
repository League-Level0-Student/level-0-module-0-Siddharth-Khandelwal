import java.awt.Component;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class testing5 implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Special Button :)");
	JButton button2 = new JButton("Another button");
	JButton button3 = new JButton("");
	JButton button4 = new JButton("no context");
	JButton button5 = new JButton("interesting. confusion. who. what. explain please. wow.");
	JButton button6 = new JButton("math");
	JButton button7 = new JButton("Unscramble the Scrambled+Trivia: fi ouy ownk het tapacli fo uytrke htne lccki htis nbtuto, ntere ti ftare gcikcinl hist");
	JLabel labelok = new JLabel("MINIGAME:");
	JLabel image;
	

	public static void main(String[] args) {
		testing5 t = new testing5();
		t.run();
	}

	String imageAdd = "https://m.media-amazon.com/images/I/61rf05mfTSS._UX569_.jpg";

	private JLabel createImage(String imageUrl) {
		JLabel imageLabel = null;
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel = new JLabel(icon);

		} catch (MalformedURLException e) {

		}
		return imageLabel;
	}

	void run() {

		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(labelok);
		panel.add(button7);
		frame.setSize(5,5);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		image = createImage(imageAdd);

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);

		;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pre = (JButton) e.getSource();
		if (pre == button1) {
			JOptionPane.showMessageDialog(null, "bob the builder");
		}
		if (pre == button2) {
			JOptionPane.showMessageDialog(null, "what if ............ AND HIS NAME IS JOHN CENA never ate bing chilling");
		}
		if (pre == button3) {
			panel.add(image);

			frame.pack();
		}
		if (pre == button4) {
			imageAdd = "https://flxt.tmsimg.com/assets/p8201068_b_v8_ac.jpg";
			image = createImage(imageAdd);
			panel.add(image);
			frame.pack();
		}
		if (pre == button5) {
			imageAdd = "https://www.tynker.com/projects/screenshot/5cd60dc27b5986230728f19d/confusing-pictures.png";
			image = createImage(imageAdd);
			panel.add(image);
			frame.pack();
		}
		if (pre == button6) {
			imageAdd = "https://www.akc.org/wp-content/uploads/2018/04/DogsDoMath.jpg";
			image = createImage(imageAdd);
			panel.add(image);
			frame.pack();
		}
		if(pre == button7) {
			String answer = JOptionPane.showInputDialog("What is it?");
			if(answer.equalsIgnoreCase("Ankara")) {
				JOptionPane.showMessageDialog(null, "congrats, it's not istanbul, you are one of the small amount of non-turkish people that know that");
			}
			else {
				JOptionPane.showMessageDialog(null, "Either you clicked without unscrambling or you though it was the obvious(Hint: it's not)");
			}
		}

	}
}
