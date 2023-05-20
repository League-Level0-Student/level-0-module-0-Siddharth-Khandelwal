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
	JButton button1 = new JButton("Special Button :)");
	JButton button2 = new JButton("Another button");
	JButton button3 = new JButton("");
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
	
	}
	catch(MalformedURLException e) {
		
	}
	return imageLabel;
}
	void run(){
	
	JPanel panel = new JPanel();
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	frame.pack();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	image = 	createImage(imageAdd);
		
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	JButton pre = (JButton)	e.getSource();
	if(pre == button1) {
		JOptionPane.showMessageDialog(null, "i just saved myelf 150 bucks");
	}
	if(pre == button2) {
		JOptionPane.showMessageDialog(null, "you wanted braids!");
	}
	if(pre == button3) {
	frame.add(image);
		
	frame.pack();
	}
	}
}
