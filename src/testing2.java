import org.jointheleague.graphical.robot.Robot;

public class testing2 {
public static void main(String[] args) {
	int x = 100;
	Robot rob = new Robot();
	rob.setSpeed(5);
	rob.turn(270);
	rob.move(x*2);
	rob.turn(90);
	rob.move(x);
	rob.turn(90);
	rob.penDown();
	rob.move(x);
	rob.turn(180);
	rob.move(x);
	rob.turn(270);
	rob.move(x);
	rob.turn(270);
	rob.move(x);
	rob.turn(90);
	rob.move(x);
	rob.turn(90);
	rob.move(x);
	rob.penUp();
	rob.turn(180);
	rob.move(2*x);
	rob.penDown();
	rob.turn(270);
	rob.move(x);
	rob.penUp();
	rob.move(x/2);
	rob.penDown();
	rob.move(5);
	rob.penUp();
	rob.move(45);
	rob.turn(90);
	rob.move(x*2);
	rob.penDown();
	rob.turn(90);
	rob.move(x*2);
	rob.turn(90);
	rob.move(x);
	rob.turn(90);
	rob.move(x);
	rob.turn(90);
	rob.move(x);
	rob.hide();
}
}
