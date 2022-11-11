package fiveCoditionalStatementsIfElseIfNested;

import java.util.Scanner;

public class EqualsFunction {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Greetings : ");
		String greet = s.nextLine();
		
		if(greet.equals("Hello")) {
			System.out.println("Hi");
		}
		
		// pwede rin ito gamitin for jejemon. uppercase and lowercase
		
		// para ito sa mga String..
		
		// if(greet.equalsIgnoreCase("Hello")) System.out.println("Hi");
	
	}

}
