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
		String firstLine ="";
		String secondLine;
		LocalDate date = LocalDate.now();
		String aYearAgo = date.minusYears(1).toString();
		String input = JOptionPane.showInputDialog("Ange namn eller personnummer på kunden!");
		
		try (PrintWriter printRecentActivity = new PrintWriter(new BufferedWriter
				(new FileWriter("src\\objektorienteringUppgift2\\MembersWithRecentActivity.txt", true)))){
			Scanner readFile = new Scanner(infilsPath);
		
		while(readFile.hasNext()) {
			firstLine = readFile.nextLine();
			
		if (readFile.hasNext()); {
			secondLine = readFile.nextLine();
			
			if(Integer.parseInt(secondLine.replaceAll("-", "")) >= Integer.parseInt(aYearAgo.replaceAll("-", ""))) {
				if(firstLine.contains(input)) {
					System.out.println(firstLine + "\nMedlem med aktivt medlemskap!");
					printRecentActivity.printf("%s" + "\nSenast aktiv: " + "%s" + "\n", firstLine, date);
				System.exit(0);
				}
			}
		}
		if(Integer.parseInt(secondLine.replace("-", "")) < Integer.parseInt(aYearAgo.replace("-", ""))) {
			if(firstLine.contains(input)) {
				System.out.println(firstLine + "\nMedlem utan aktivt medlemskap!");
			System.exit(0);
			}
		}
		else {
			System.out.println("Ej Medlem!");
			break;
		}
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
		BestGymEver customer = new BestGymEver();
	}
}
