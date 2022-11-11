package publicPrivateProtected;

public class myClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myclass3 myobj1 = new myclass3();	// PROTECTED magrurun ito  same packages
		System.out.println(myobj1.hours); // but the other package is not running.
		//System.out.println(myobj1.minutes);
		myobj1.computation();
		
	}
}

class myclass2 {

	}
