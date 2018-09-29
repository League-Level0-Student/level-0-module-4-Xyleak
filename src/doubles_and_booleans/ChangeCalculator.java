package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {
		
		String Nickles = JOptionPane.showInputDialog("Input The Number Of Nickles You Currently Have In Your Possesion");
		String Dimes = JOptionPane.showInputDialog("Input The Number Of Dimes You Currently Have In Your Possesion");
		String Quarters = JOptionPane.showInputDialog("Input The Number Of Quarters You Currently Have In Your Possesion");
		
		JOptionPane.showConfirmDialog(null,"If I Am Correct, You Have This Many Nickles, " +Nickles );
        JOptionPane.showConfirmDialog(null,"If I Am Correct, You Have This Many Dimes, " +Dimes );
        JOptionPane.showConfirmDialog(null, "If I Am Correct, You have This Many Quarters, " +Quarters );
        
        
        
        
        int nickles = Integer.parseInt(Nickles);
		int dimes = Integer.parseInt(Dimes);
		int quarters = Integer.parseInt(Quarters);
		
		
		double $ = nickles *0.05; 
		double $$ = dimes *0.10;
		double $$$ = quarters *0.25;

		double Money = $+$$+$$$;
		
		
		JOptionPane.showMessageDialog(null,"Your Total Number Of Change Is In Cash Is $" +Money );
		
		
		
		
		
		
		
		

		// Ask the user how many nickels they have

		// Convert their answer to an int using Integer.parseInt()

		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has and save it in a double variable 

		// Tell the user how much money they have

	}
}

