

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
public static void main(String[] args) {
	
		
		drawTriangle();
		drawCircle();
		
		String shape = JOptionPane.showInputDialog("Which shape do you want? (square, circle, or triangle");
		
		if(shape.equals("square")) {
			drawSquare();
		}
		
		if(shape.equals("square")) {
			drawSquare();
		}
}





private static void drawSquare() {
	Robot robot = new Robot("mini");
	// TODO Auto-generated method stub
	for(int i = 0; i<4; i++) {
	robot.setSpeed(30);
	robot.penDown();
	robot.setPenColor(255, 170, 170);
	robot.move(50);
	robot.turn(90);
	}
	
	robot.penUp();
	robot.hide();

}

private static void drawTriangle() {
	Robot r = new Robot("mini");
	r.setX(100);
	r.setY(100);
	for (int i = 0; i < 3; i++) {
		r.setSpeed(30);
		r.penDown();
		r.setPenColor(017, 204, 255);
		r.move(50);
		r.turn(120);
	}
	r.penUp();
	r.hide();
}

private static void drawCircle() {
	Robot c = new Robot("mini");
	c.moveTo(250,  300);
	
	for(int i = 0; i<380; i++) {
		c.penDown();
		c.setPenColor(221, 85, 238);
		c.move(1);
		c.turn(1);
	}
}
}

