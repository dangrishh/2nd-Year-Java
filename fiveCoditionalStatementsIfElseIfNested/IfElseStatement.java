package fiveCoditionalStatementsIfElseIfNested;

import java.util.Scanner;			// wag lagi kalimutan because, very important if you going input.

public class IfElseStatement {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter Age : ");
		int age = s.nextInt();
		
		if(age >= 18) {
			System.out.println("Legal Age!");
		}else {
			System.out.println("Under Age!");
		}

	}

}
