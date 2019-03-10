
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "February 22";
		String dadsBirthday = "April 3";
		String myBirthday = "June 12";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String bday = JOptionPane.showInputDialog("Whose birthday do you want revealed? Type mom, dad or you");
		
		// 3. Print out what the user typed
		System.out.println(bday);
		// 4. if user asked for "mom"
			//print mom's birthday
		if(bday.equals("mom")) {
			System.out.println(momsBirthday);
		}
		
		// 5. if user asked for "dad"
			// print dad's birthday
		else if (bday.equals("dad")) {
		System.out.println(dadsBirthday);
		}
		
		// 6. if user asked for your name
			// print myBirthday
		else if (bday.equals("you")) {
			System.out.println(myBirthday);
			}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			System.out.println("Sorry I do not remember that person's birthday!");
		}
		
	} 
}
