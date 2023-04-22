import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class testing4 implements ActionListener{
JButton button = new JButton();
	public static void main(String[] args) {
	testing4 t = new testing4();
	t.run();
	}
	void run(){
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.add(panel);
	panel.add(button);
	frame.pack();
	button.addActionListener(this);
	
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton pressed = (JButton) e.getSource();
	}
}

