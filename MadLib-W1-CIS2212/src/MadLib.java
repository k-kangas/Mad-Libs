/*
 * Kurt Kangas
 * CIS 2212 Java Software Development I
 * Mad Libs
 */

import java.util.Scanner;

public class MadLib {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 final String TEXT_RED = "\u001B[31m"; 	// ANSI code for red.
		 final String TEXT_RESET = "\033[0m";
		 final String TEXT_YELLOW = "\033[0;33m";
		 final String TEXT_BLUE = "\033[0;34m";
		 final String TEXT_GREEN = "\033[0;32m";
		 
		Scanner input = new Scanner(System.in); 	// Keyboard
		
		 System.out.println("Hello, welcome to this Mad Libs program!");
		 
			System.out.print("Enter a state/country/or place: ");
			String noun1 = input.nextLine();
			
			System.out.print("Enter a vehicle or mode of transportation: ");
			String noun2 = input.nextLine();
			
			System.out.print("Enter a mass noun: ");
			String noun3 = input.nextLine();
			
			System.out.print("Enter a noun: ");
			String noun4 = input.nextLine();
			
			System.out.print("Enter a place: ");
			String noun5 = input.nextLine();
			
			System.out.print("Enter the name of a person: ");
			String noun6 = input.nextLine();
			
			System.out.print("Enter an past tense verb: ");
			String verb1 = input.nextLine();
			
			System.out.print("Enter a vehicle or mode of transportation: ");
			String noun7 = input.nextLine();
			
			System.out.print("Enter a place: ");
			String noun8 = input.nextLine();
			
			System.out.print("Enter a plural noun: ");
			String noun9 = input.nextLine();
			
			System.out.print("Enter an action verb: ");
			String verb2 = input.nextLine();
			
			System.out.print("Enter a mass noun: ");
			String noun11 = input.nextLine();
			
			System.out.print("Enter an adjective: ");
			String adjective1 = input.nextLine();
			
			
		// Output the Mad Lib
		System.out.print("\n\n\nWhen I traveled down to " + TEXT_RED + noun1 + TEXT_RESET + ", I got off the " + TEXT_YELLOW + noun2 + TEXT_RESET + " and I could smell the fresh " + TEXT_RED + noun1 + TEXT_RESET + " " + TEXT_YELLOW + noun3 + TEXT_RESET + "."
				+ "\nI could also smell the " + TEXT_BLUE + noun4 + TEXT_RESET + " from the " + TEXT_GREEN + noun5 + TEXT_RESET + " immediately after getting off the " + TEXT_YELLOW + noun2 + TEXT_RESET + ". "
				+ "\nI " + TEXT_YELLOW + verb1 + TEXT_RESET + " outside and I called " + TEXT_RED + noun6 + TEXT_RESET + " to pick me up outside the " + TEXT_GREEN + noun5 + TEXT_RESET + ". "
				+ "\nOnce they pulled up in their " + TEXT_GREEN + noun7 + TEXT_RESET + ", we were so happy to see each other. "
				+ "\nI got inside their " + TEXT_GREEN + noun7 + TEXT_RESET + " and we went right to the " + TEXT_BLUE + noun8 + TEXT_RESET + ". "
				+ "\nIt was really nice seeing all the " + TEXT_RED + noun9 + TEXT_RESET + " " + TEXT_YELLOW + verb2 + TEXT_RESET + " in the " + TEXT_GREEN + noun11 + TEXT_RESET + " and to just lay there and get a " + TEXT_BLUE + adjective1 + TEXT_RESET + " tan. "
				+ "\nI really wish I could do that everyday."); 	// String concatenation
	}
	
}

