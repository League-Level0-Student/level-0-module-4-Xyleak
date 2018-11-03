package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	static int happinessLevel = 0;
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		
//String pet = JOptionPane.showInputDialog("What Pet Do You Want");

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
for (int i = 3; i < 9; i++) {
	String pet = JOptionPane.showInputDialog("What Pet Do You Want");


			int task = JOptionPane.showOptionDialog(null, "What Do You Do?", "Deku", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Green", "Yellow", "Red", "Pink" }, null);
             
			if ("Green" != null) {JOptionPane.showMessageDialog(null,"Now Your Pet Looks An All Might Fan Boy (Happy)");}
if("Yellow" != null) {JOptionPane.showMessageDialog(null, "Your Pet Now Want's To Make A Blue Ball And Hit Someone With It (Okish)");}
if("Red" !=null) {JOptionPane.showMessageDialog(null, "Your Pet May Have Done Something When You Were Away. After All He Is Red (;-;)");}
if("Pink" !=null) {JOptionPane.showMessageDialog(null, "Your Pet Is Pink, Histroy Has Told Us People With Pink Hair Are Useless So Get A Rid Of That Pet As Quick As Possible (USELESS)");

}

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.



	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}
}
}