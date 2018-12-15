package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
String JerneSuperPower = "Runs at high speeds";
String CherylSuperPower = " extremely inteligent.";
String RandySuperPower = "go invisible";


		// 2. Ask the user to enter a name. Store their answer in a variable.
String name = JOptionPane.showInputDialog(null, "Enter a Ward family name (besides that of the creator of this program):");
		// 3. Show the superpower in a pop-up, depending on the name entered. 
if (name.equals("Jerne")) {
JOptionPane.showMessageDialog(null, JerneSuperPower);
	}
if (name.equals("Cheryl")) {
JOptionPane.showMessageDialog(null, "Is" + CherylSuperPower);
}
if (name.equals("Randy")) {
JOptionPane.showMessageDialog(null, "Has the power to " + RandySuperPower);}
else JOptionPane.showMessageDialog(null, "That is not a Ward family name!!!");}

}