package modulo;



import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
public static void main(String[] args) {

		
		String shape = JOptionPane.showInputDialog("Which shape do you want? (square, circle, or triangle");
		
		if(shape.equals("square")) {
			drawSquare();
		}
		
		else if(shape.equals("circle")) {
			drawCircle();
		}
		
		else if (shape.equals("triangle")) {
			drawTriangle();
		}
		
}
			
		


private static void drawSquare() {
	Robot robot = new Robot("mini");
	
	String color = JOptionPane.showInputDialog("What color would you like? (pink, yellow, or cyan)");
	if (color.equals("yellow")) {
		robot.setPenColor(255,255,77);
	}
	
	else if (color.equals("cyan")) {
		robot.setPenColor(77,255,255);
	}
	
	else if (color.equals("pink")) {
		robot.setPenColor(255,128,255);
	}
	
	// TODO Auto-generated method stub
	for(int i = 0; i<4; i++) {
	robot.setSpeed(30);
	robot.penDown();
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
		r.move(50);
		r.turn(120);
	}
	r.penUp();
	r.hide();
	
	String color = JOptionPane.showInputDialog("What color would you like? (pink, yellow, or cyan)");
	if (color.equals("yellow")) {
		r.setPenColor(255,255,77);
	}
	
	else if (color.equals("cyan")) {
		r.setPenColor(77,255,255);
	}
	
	else if (color.equals("pink")) {
		r.setPenColor(255,128,255);
	} 
}

private static void drawCircle() {
	Robot c = new Robot("mini");
	c.moveTo(250,  300);
	String color = JOptionPane.showInputDialog("What color would you like? (pink, yellow, or cyan)");
	if (color.equals("yellow")) {
		c.setPenColor(255,255,77);
	}
	
	else if (color.equals("cyan")) {
		c.setPenColor(77,255,255);
	}
	
	else if (color.equals("pink")) {
		c.setPenColor(255,128,255);
	}
	for(int i = 0; i<380; i++) {
		c.penDown();
		c.move(1);
		c.turn(1);
	}
	
}
}

