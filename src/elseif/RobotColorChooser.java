//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		for (int i = 0; i<10; i++) {
		//1. Create a new Robot
		Robot r = new Robot("mini");
		//3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("What color would you like the robot to draw with?");
		//5. Use an if/else statement to set the pen color that the user requested
		if (color.equals("yellow")) {
		r.setPenColor(255, 229, 0);
		}
		
		else if(color.equals("red"))  {
			r.setPenColor(244, 66, 66);
			}
		
		else if (color.equals("blue"));  {
			r.setPenColor(0, 165, 255);
			}
		
        //6. If the user doesn’t enter anything, choose a random color
		if(color.equals("")) {
			r.setRandomPenColor();
		}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		r.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		for(int i1 = 0; i1<4; i1++) {
			r.penDown();
		r.move(50);
		r.turn(90);
		}
	}
	}
}
