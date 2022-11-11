package fiveCoditionalStatementsIfElseIfNested;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		boolean hasRuler = true;
		boolean hasBallpen = false;
		
		if(hasRuler || hasBallpen) {			// this is Logical Operators using ADD(&&) / OR(||)
												// !hasRuler NOT(!) - OPPOSITE
			System.out.println("Very Good!");
		}else {
			System.out.println("Not Very Good");
		}
	}

}
