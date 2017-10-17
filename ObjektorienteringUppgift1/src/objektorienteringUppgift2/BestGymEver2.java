package objektorienteringUppgift2;

import javax.swing.JOptionPane;

public class BestGymEver2 {
	public static void main(String[] arg) {
		
		String input = JOptionPane.showInputDialog("Ange för -och efternamn eller personnummer!");
		BestGymEverFileManagement customer = new BestGymEverFileManagement();
		customer.getArray(input);
	
	}
}
