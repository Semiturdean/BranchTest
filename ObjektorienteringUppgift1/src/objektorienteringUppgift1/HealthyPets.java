package objektorienteringUppgift1;

import java.util.*;

import javax.swing.JOptionPane;

public class HealthyPets {
	public String s1;
	public void printFoods(IFood s) {
		s1 = JOptionPane.showInputDialog(null, "Ange namn på djuret som skall matas!");
	}
	public HealthyPets() {
		DjurfoderDemo pets = new DjurfoderDemo();
		List<IFood> food = pets.getAllFoods();
		for (IFood s : food) {
			printFoods(s);
		}
	}
	public static void main(String[] arg) {
		HealthyPets printer = new HealthyPets();
	}
}
