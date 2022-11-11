package encapsulation;

public class student {

	private String fname;
	private String mname;
	private String lname;
	private String gender;
	private int age;
	
	public void setFname(String newfname) {
		fname = newfname;
	}
	public String getFname() {
		return fname;
	}
	public void setMname(String newmname) {
		mname = newmname;
	}
	public String getMname() {
		return mname;
	}
	public void setLname(String newlname) {
		lname = newlname;
	}
	public String getLname() {
		return lname;
	}
	public void setAge(int newage) {
		age = newage;
	}
	public int getAge() {
		return age;
	}
	public void setGender(String newgender) {
		gender = newgender;
	}
	public String getGender() {
		return gender;
	}
	
}
