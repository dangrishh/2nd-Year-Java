package encapsulation;

public class main {

	public static void main(String[] args) {
		
		
		System.out.println();
		student S1= new student();
		S1.setFname("Daniel");
		S1.setMname("Altoveros");
		S1.setLname("De Torres");
		System.out.println(S1.getFname()+(" ")+S1.getMname()+(" ")+S1.getLname());
		S1.setAge(20);
		System.out.println(S1.getAge());
		S1.setGender("Male");
		System.out.println(S1.getGender());
	}

}
