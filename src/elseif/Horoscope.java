package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String sign = JOptionPane.showInputDialog("What is your star sign?");
	
	
	if (sign.equals("Aries")) {
		JOptionPane.showMessageDialog(null, "As The Moon leaves your house today your strong will could also be high ego,"
				+ " direct this positively." );
	}
	
	else if (sign.equals("Taurus")) {
		JOptionPane.showMessageDialog(null, "Energy from Mars in sextile with Neptune today urges you to be honest with yourself and with "
				+ "others. ");
	}
		
	else if (sign.equals("Gemini")) {
		JOptionPane.showMessageDialog(null, "When you meet someone today who can influence your future career dont be intimidated by it." );
	}

	else if (sign.equals("Cancer")) {
		JOptionPane.showMessageDialog(null, "Have a positive approach to everything today and you can deal with and prevent obstacles.");
	}
		
	else if (sign.equals("Leo")) {
		JOptionPane.showMessageDialog(null, "When you worry about someones commitment to you today, dont be clingy, some space will help you "
				+ "both.");
	}
	
	else if (sign.equals("Virgo")) {
		JOptionPane.showMessageDialog(null, "Others will persuade you to go out and have fun, but you need money sense and to watch your "
				+ "spending.");
	}
	
	else if (sign.equals("Libra")) {
		JOptionPane.showMessageDialog(null, "Use your all round perspective today to see where to make changes in your life and where to move"
				+ " forward.");
	}
	
	else if (sign.equals("Scorpio")) {
		JOptionPane.showMessageDialog(null, "Find time today to spend with someone close to you and balance this with the work you have to do.");
	}
	
	else if (sign.equals("Sagittarius")) {
		JOptionPane.showMessageDialog(null, "Separate yourself from drama going on around you today and stay focused on your goals.");
	}
	
	else if (sign.equals("Capricorn")) {
		JOptionPane.showMessageDialog(null, "As Saturn ends its time in sextile with The Sun today take care of your demons "
				+ "so you can take on new opportunities.");
	}
	
	else if (sign.equals("Aquarius")) {
		JOptionPane.showMessageDialog(null, "Stay positive today as energy enters your work life and have self belief, "
				+ "then the success you deserve will come.");
	}

	else if (sign.equals("Pisces")) {
		JOptionPane.showMessageDialog(null, "Energy from Neptune in sextile with Mars today brings high emotions to you and those around you.");
	}
	
	else {
		JOptionPane.showMessageDialog(null, "That is not a star sign!!!");
	}
	
	
	
	
}
}
