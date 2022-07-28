package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {
int score = 0;
String answer ="echo";
String one = JOptionPane.showInputDialog("I speak without a mouth and hear without ears. I have no body, but I come alive with wind. What am I? "); 
if (one.equals(answer)) {
	JOptionPane.showMessageDialog(null, "You have got the question correct");
	score++; 
}
else {
	JOptionPane.showMessageDialog(null,"You have got the question incorrect. The answer was echo."); 
}
JOptionPane.showMessageDialog(null,"Your score so far is " + score);
String wind ="candle";
String two = JOptionPane.showInputDialog("You measure my life in hours and I serve you by expiring. I'm quick when I'm thin and slow when I'm fat. The wind is my enemy." );
if(two.equals(wind)) {
	JOptionPane.showMessageDialog(null,"You have got the question correct"); 
	score++; 
}
else {
	JOptionPane.showMessageDialog(null, "You have got the question incorrect. The answer was a candle.");
}
JOptionPane.showMessageDialog(null,"Your score so far is " + score);
String inanimate ="map"; 
String three = JOptionPane.showInputDialog("I have cities, but no houses. I have mountains, but no trees. I have water, but no fish. What am I? "); 
if(three.equals(inanimate)) {
	JOptionPane.showMessageDialog(null,"You have got the question correct");
	score++;
}
else {
	JOptionPane.showMessageDialog(null, "You have got the question incorrect. The answer was a map");
}
JOptionPane.showMessageDialog(null,"Your final score is " + score);
// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

