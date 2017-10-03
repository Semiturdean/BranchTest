package objektorienteringUppgift1;

import java.util.*;

import javax.swing.JOptionPane;

public class HealthyPets {
	
	private String s1;
	public boolean aktuell(String s1, List<IFood> food) {

		for(IFood s : food)
			if (s1.equalsIgnoreCase(s.getName())) {
				return true;
			}
		return false;
		
	}
	
	public HealthyPets() {
		DjurfoderDemo pets = new DjurfoderDemo();
		List<IFood> food = pets.getAllFoods();
		while (true) {
		s1 = JOptionPane.showInputDialog(null, "Vilket djur skall f� mat?");
		if (s1 == null) {
			JOptionPane.showMessageDialog(null, "Du angav inget namn");
			System.exit(0);
		}
		else if (s1 == "") {
			JOptionPane.showMessageDialog(null, "Du angav ett tomt f�lt");
		}
		else if (aktuell(s1, food)) {
		for(IFood s : food) {
			if (s1.equalsIgnoreCase(s.getName())) {
				s.Foder();
			}
		}
		}
		else {
			JOptionPane.showMessageDialog(null, "Du angav ett oregistrerat namn");
		}
		}
	}
	public static void main(String[] arg) {
		HealthyPets printer = new HealthyPets();
	}
}
