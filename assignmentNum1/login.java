package assignmentNum1;

import java.util.Scanner;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	home myobj1 = new home();
	Scanner myObj = new Scanner(System.in);
	
	System.out.print("Enter username : ");
	String userName = myObj.nextLine();
	
	System.out.print("Enter password : ");
	String passWord = myObj.nextLine();
	
	if("Daniel".equals(userName) && "De Torres".equals(passWord))System.out.println(myObj1.login);
	else System.out.println("Invalid Username and Password");
	
			
	}

}
