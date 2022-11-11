package fiveCoditionalStatementsIfElseIfNested;

import java.util.Scanner;

public class IfElseIfElseStatement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Age : ");
		int age = s.nextInt();
		
		if(age >= 18) {
			System.out.println("Legal Age!");
		}else if (age >= 13){
			System.out.println("Under Age!");
		}else if(age >= 4){
			System.out.println("Young Age!");
		}else {
			System.out.println("You Are a Baby!");
		}
		
	/* 	if(age >= 18) System.out.println("Legal Age!");
		else if (age >= 13) System.out.println("Under Age!");
		else if(age >= 4)System.out.println("Young Age!");
		else System.out.println("You Are a Baby!");
		
		// THIS IS USEFULL IF EVER ONE LINE THE IF ELSE STATEMENT :)	 
	 */
	}
}
