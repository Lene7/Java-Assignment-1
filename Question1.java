//Lene Kriel
//34317996
//Assignment 1 Part 1

import java.util.Scanner;

public class Question1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//ask user for their name
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		
		//ask user for their surname
		System.out.print("Enter your surname: ");
		String surname = scanner.nextLine();
		
		//close scanner
		scanner.close();
		
		//get initials
		String initials = getInitials(name,surname);
		System.out.println("Your initials are: " + initials);
	}
	
	private static String getInitials(String name, String surname){
		//get the first letter of name and surname in capital
		char initialName = Character.toUpperCase(name.charAt(0));
		char initialSurname = Character.toUpperCase(surname.charAt(0));
		
		return initialName + "." + initialSurname + ".";
	}
}