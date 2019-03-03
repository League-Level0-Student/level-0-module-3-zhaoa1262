package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String happy = JOptionPane.showInputDialog("Are you happy?");
	
	if(happy.equals("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing!");
	}
	
	else if (happy.equals("no")) {
		String want = JOptionPane.showInputDialog("Do you want to be happy?");
		if (want.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Change Something!");
		}
			else if (want.equals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing!");
			}
		}
		}
	
	
	
	
	
	
	
	
}

