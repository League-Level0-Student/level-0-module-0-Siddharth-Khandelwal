import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class testing {
public static void main(String[] args) {
	Robot bob = new Robot("bob");
	bob.penDown();
	
	
	int x = 100;
	
	bob.setSpeed(10);
	bob.setPenColor(Color.BLACK);
	bob.move(x);
	bob.turn(90);
	bob.setPenColor(Color.BLUE);
	bob.move(x);
	bob.turn(90);
	x+=100;
	bob.move(x);
	bob.turn(90);
	bob.move(x);
	bob.turn(90);
	bob.move(x);
	bob.turn(90);	
	bob.move(x);
	bob.turn(90);
	bob.move(100);
	bob.turn(90);
	bob.setPenColor(Color.black);
	bob.move(x);
	bob.setPenColor(Color.blue);
	bob.turn(90);
	bob.move(100);
	bob.turn(90);
	bob.move(100);
	bob.setPenColor(Color.black);
	bob.turn(90);
	bob.move(x);
	bob.hide();
}	
}

