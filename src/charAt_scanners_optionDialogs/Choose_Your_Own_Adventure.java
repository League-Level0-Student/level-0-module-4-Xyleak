package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class Choose_Your_Own_Adventure {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Loading.");

		JOptionPane.showMessageDialog(null, "Loading..");

		JOptionPane.showMessageDialog(null, "Loading...");

		JOptionPane.showMessageDialog(null, "Loaded");

		JOptionPane.showMessageDialog(null, "Welcome To CYOA");

		int task = JOptionPane.showOptionDialog(null,
				"You Get Approached By A Farmer, He Requests A Warrior To Kill A Fowl Beast That Is Devouring His Crops (REWARD), What Do You Do?",
				"Quest", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Declined The Quest", "Accepted The Quest" }, null);

		if ("Accept The Quest" != null) {
			JOptionPane.showMessageDialog(null,
					"The Farmer Dragged You On To The Location Of The Beast, You Were Dragged Along Eventhough No Matter What You Said, He Gave You A Sword And Said Good Luck...");
			String Item = JOptionPane.showInputDialog(null,
					"You Died, But You Can Use An Item of Your Choice To Kill The Beast Too, So You Both Die");
			JOptionPane.showMessageDialog(null, "The Beast Died To " + Item);
			JOptionPane.showMessageDialog(null, "For a Reward The Farmer Gave You A Sword, It Is Quite Useless Since You Died.");
			JOptionPane.showMessageDialog(null, "GAME OVER (Percent Finished (1%)");
			JOptionPane.showConfirmDialog(null, "Delete CYAO.exe");
			JOptionPane.showMessageDialog(null, "CYAO.exe Deleted Itself");
			int Virus = JOptionPane.showConfirmDialog(null, "Apple Has Detected A Virus, Click Yes For A Free Scan");
			JOptionPane.showMessageDialog(null, "You Clicked On " +Virus);
			JOptionPane.showMessageDialog(null, Virus+ "Downloaded A Virus");
			JOptionPane.showMessageDialog(null, "Loading Loading. Social Secruity Number Has Been Stolen.");
			JOptionPane.showMessageDialog(null, "Data.CAYO.exe.net.stealer.xp.port1");
	        JOptionPane.showMessageDialog(null, "GAME OVER, LIFE OVER");
	        JOptionPane.showMessageDialog(null, Item+" Stole It All.");

		}

	}
}