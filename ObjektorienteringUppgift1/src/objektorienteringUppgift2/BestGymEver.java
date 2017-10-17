package objektorienteringUppgift2;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class BestGymEver {
	
	
	public BestGymEver() {
		
		
		Path infilsPath = Paths.get("src\\objektorienteringUppgift2\\customers.txt");
		String secondLine;
		LocalDate date = LocalDate.now();
		String aYearAgo = date.minusYears(1).toString();
		String input = JOptionPane.showInputDialog("Ange för -och efternamn eller personnummer på kunden!");
		Boolean filled = false;
		String[] person;
		
		if (input == null) {
			System.exit(0);
		}
		else if(input.equals("")) {
			System.out.println("Fel format!");
			System.exit(0);
		}
		
		try (PrintWriter printRecentActivity = new PrintWriter(new BufferedWriter
				(new FileWriter("src\\objektorienteringUppgift2\\MembersWithRecentActivity.txt", true)))){
				Scanner readFile = new Scanner(infilsPath);
		
		while(readFile.hasNext()) {
			person = readFile.nextLine().split(",");
	
		if (readFile.hasNext()); {
			secondLine = readFile.nextLine();

			if(Integer.parseInt(secondLine.replaceAll("-", "")) >= Integer.parseInt(aYearAgo.replaceAll("-", ""))) {
				if (input.equals(person[0]) || input.equalsIgnoreCase(person[1].trim())) {
					if(input.matches("[0-9]{10}") || input.matches("[a-öA-Ö]*") || input.matches("[a-öA-Ö]*\\s*[a-öA-Ö]*")) {
						
						filled = true;
						System.out.println(person[0] +", " + person[1] + "\nMedlem med aktivt medlemskap!");
						printRecentActivity.printf("%s" + ",%s" + "\nSenast aktiv: " + "%s" + "\n", person[0],person[1], date);
					}
				}
			}
		}
		if(Integer.parseInt(secondLine.replaceAll("-", "")) < Integer.parseInt(aYearAgo.replaceAll("-", ""))) {
			if(input.equals(person[0]) || input.equalsIgnoreCase(person[1].trim())){
				if(input.matches("[0-9]{10}") || input.matches("[a-öA-Ö]*") || input.matches("[a-öA-Ö]*\\s*[a-öA-Ö]*")) {
					
					filled = true;
					System.out.println(person[0] + "," + person[1] + "\nMedlem utan aktivt medlemskap!");
				}
			}
		}
	}
		
		if(!filled) {
			System.out.println(input + "\nEj medlem!");
		}
		}catch(FileNotFoundException e) {
			System.out.println("Filen hittades ej");
			System.out.flush();
			System.exit(0);
			
		}catch(IOException e) {
			System.out.println("Det gick inte att skriva till fil");
			System.out.flush();
			System.exit(0);
		
		}catch(Exception e) {
			System.out.println("Något gick fel");
			System.out.flush();
			System.exit(0);
	}
}
	
	public static void main(String[] arg){
		new BestGymEver();
	}
}
