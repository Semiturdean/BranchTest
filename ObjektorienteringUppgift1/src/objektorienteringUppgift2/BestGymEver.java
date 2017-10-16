package objektorienteringUppgift2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class BestGymEver {
	
	
	public BestGymEver() {
		
		String PathToClients = "src\\objektorienteringUppgift2\\customers.txt";
		Path infilsPath = Paths.get(PathToClients);
		Path utfilsPathToPayingCustomers = Paths.get("src\\objektorienteringUppgift2\\MembersWithActiveMembership.txt");
		Path utfilsPathToActiveMembers = Paths.get("src\\objektorienteringUppgift2\\MembersWithRecentActivity.txt");
		String firstLine;
		String secondLine;
		LocalDate date = LocalDate.now();
		String aYearAgo = date.minusYears(1).toString().replaceAll("-", "");
		String input = JOptionPane.showInputDialog("Ange namn eller personnummer på kunden!");
		
		
		try (PrintWriter print = new PrintWriter(Files.newBufferedWriter(utfilsPathToPayingCustomers))){
		Scanner readFile = new Scanner(infilsPath);
		
		while(readFile.hasNext()) {
			firstLine = readFile.nextLine();
			
		if (readFile.hasNext()); {
			secondLine = readFile.nextLine().replaceAll("-", "");
		
		if(Integer.parseInt(secondLine) >= Integer.parseInt(aYearAgo)) {
		
			print.format(firstLine + "\n" + secondLine + "\n");
		}
		Scanner readActiveMemberFile = new Scanner(utfilsPathToPayingCustomers);
		
		if(readActiveMemberFile.hasNext()){
			readActiveMemberFile.next();
		}
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
