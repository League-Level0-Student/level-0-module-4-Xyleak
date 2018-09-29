package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScores {

public static void main(String[] args) {
	
	
	
	
String Scores = JOptionPane.showInputDialog("Input Your Current Test Scores");	
	
double scores; 
scores = Double.parseDouble(Scores);
	
 
if(scores > 75.5) {JOptionPane.showMessageDialog(null,"You Must Have Studied Realy Hard For Your Test, After All You Got Over 75.5 %");}	
if(scores < 75.5) {JOptionPane.showMessageDialog(null, "Tough Luck, Hopefully You Get A Better Grade Next Time, Possibly A 75.5 % Or Higher");}

if(scores == 75.5) {JOptionPane.showMessageDialog(null,("Congrats On Getting A Standard Grade Of 75.5 %"));}




	
	
	
	
	
	
	
	
	
}	
}
