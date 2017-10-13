package objektorienteringUppgift2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import javax.swing.text.DateFormatter;

public class BestGymEver {
	
	
	public BestGymEver() {
		String PathToClients = "src\\objektorienteringUppgift2\\customers.txt";
		Path infilsPath = Paths.get(PathToClients);
		Path utfilsPathToCustomers = Paths.get("src\\objektorienteringUppgift2\\members.txt");
		Path utfilsPathToActiveMembers = Paths.get("src\\objektorienteringUppgift2\\recentActivity.txt");
		String[] customers;
		String firstLine;
		String secondLine;
		LocalDate date = LocalDate.now();
		LocalDate today = LocalDate.now();
		date = date.minusYears(1);
		System.out.println(date);
		
		try (PrintWriter print = new PrintWriter(Files.newBufferedWriter(utfilsPathToCustomers))){
		Scanner readFile = new Scanner(infilsPath);
		
		while(readFile.hasNext()) {
			firstLine = readFile.nextLine();
			
		if (readFile.hasNext()); {
			secondLine = readFile.nextLine();
			customers = secondLine.split("0");
		
			print.println(secondLine);
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
