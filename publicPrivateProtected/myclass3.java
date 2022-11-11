package publicPrivateProtected;

public class myclass3 {
	protected int hours = 10; // public pede sa lahat 
	protected int minutes = 57; // ito ay dito lang sa mismong isang file

public void computation() { // you need to public to access another package
		hours = hours + 10;
		System.out.println(minutes);
	}
}
