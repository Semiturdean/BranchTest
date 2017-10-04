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
		else if (aktuell(s1, food)) {
			for(IFood s : food) {
				if (s1.equalsIgnoreCase(s.getName())) {
					s.Foder(); /* Det �r h�r polymorfismen sker, trots att en metod som definierats i flera klasser kallas, s� f�r vi r�tt objekt.
		Dessutom anv�nder vi oss av dynamisk bindning f�r att leta igenom arvshierarkin. (metoden finns ej i superklassen).*/
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
