package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String birthday= JOptionPane.showInputDialog("What is your birthday(mm/dd)");
if(birthday.equals("6/28")) {
	JOptionPane.showMessageDialog(null, "I hope you have a happy birthday");
	
}
else {
	JOptionPane.showMessageDialog(null,"I hope you have a very merry Unbirthday");
}
	}

}
 
