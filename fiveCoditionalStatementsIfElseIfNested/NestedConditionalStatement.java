package fiveCoditionalStatementsIfElseIfNested;

import java.util.Scanner;

public class NestedConditionalStatement {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Age : ");
		int age = s.nextInt();
		boolean isVerified = false;
		
		if(age >= 18) {
			
			System.out.println("You Have Access");
			
			if(isVerified ) {
				System.out.println("Qualified");
			}else {
				System.out.println("Not Qualified");		// this can be use the more on Conditional Statement
			}
			
		} else System.out.println("Access Denied1"); 		// you can be more conditional statement
		

	}

}
