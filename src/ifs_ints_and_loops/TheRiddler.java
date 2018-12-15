package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle = JOptionPane.showInputDialog(null, "I'm tall when I'm young and I'm short when I'm old. What am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddle.equals("a candle")) {
	JOptionPane.showMessageDialog(null, "Correct!");
 score= score+1;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else JOptionPane.showMessageDialog(null, "incorrect");
		// 6. Add some more riddles
String riddle2 = JOptionPane.showInputDialog(null, "What has a head and a tail, but no body?");
// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddle2.equals("a coin")) {
JOptionPane.showMessageDialog(null, "Correct!");
score= score+1;
}
// 5. Otherwise, say "wrong" and tell them the answer
else JOptionPane.showMessageDialog(null, "incorrect");
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is " + score);
	}
}

