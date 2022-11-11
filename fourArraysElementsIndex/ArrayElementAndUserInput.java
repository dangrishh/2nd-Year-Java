package fourArraysElementsIndex;

import java.util.Scanner;		// don't forger this syntax because kung wlaa ito 
								// you did'nt input the STRING using Scanner

public class ArrayElementAndUserInput {

	public static void main(String[] args) {
		
		// this is Array Adding Input using this Syntax
		
		Scanner s = new Scanner(System.in);
		String employeeNames[] = new String[20];
		
		System.out.print("Eneter Employee Name : "); 
		employeeNames[0] = s.nextLine();
		
		System.out.println(employeeNames[0]);
		
		// magaadd ito ng name dun sa employeeNames na EMPTY

	}

}
