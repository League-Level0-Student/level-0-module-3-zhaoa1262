//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot r = new Robot("mini");
		//3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("What color would you like the robot to draw with?");
		//5. Use an if/else statement to set the pen color that the user requested
		if (color.equals("black"));{
		r.setPenColor(0, 0, 0);
		
		}
		else(color.equals("red")){
			r.setPenColor(221, 34, 34);
		}
		
        //6. If the user doesn’t enter anything, choose a random color
		if(color.equals("")) {
			r.setRandomPenColor();
		}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		r.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		for(int i = 0; i<5; i++) {
		r.move(50);
		r.turn(90);
		}
	}
	}

