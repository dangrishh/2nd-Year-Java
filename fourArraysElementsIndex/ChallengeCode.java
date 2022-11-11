package fourArraysElementsIndex;

import java.util.Scanner;

public class ChallengeCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter of Number of Index  : ");
		x = s.nextInt();
		System.out.println();
		
		String emails[] = {"danieldetorres30@gmail.com",
						   "danbly30@gmail.com",
						   "dangrishh@gmail.com"};
		
		String usernames[] = {"Daniel",
							  "Danbly",
							  "Dangirshh"};
		
		String passwords[] = {"DeTorres30",
							  "dan30",
							  "dangrishh30"};
		
		System.out.println("Index    : " +  x);
		System.out.println("Email    : " +  emails[x]);
		System.out.println("Username : " +  usernames[x]);
		System.out.println("Password : " +  passwords[x]);
		
		

	}

}
