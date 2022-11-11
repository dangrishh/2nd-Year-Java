package protected_class;

import publicPrivateProtected.myclass3;

public class myclass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myclass3 myobj1 = new myclass3();	// kapag protected ay hindi magrurun sa ibang package.
		System.out.println(myobj1.hours);	// pero apag same package magrurun
		//System.out.println(myobj1.minutes);
		myobj1.computation();

	}

}
