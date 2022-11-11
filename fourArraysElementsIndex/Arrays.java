package fourArraysElementsIndex;

public class Arrays {

	public static void main(String[] args) {
		
		String names[] = {"Dangrishh","Daniel","Danbly","Dongchie"};
		names[1] = "De Torres";
		int numbers[] = {1,2,3,4,5,6,7,8,9,10};

		/* String names[] = new String[20];
		   int nums[] = new int[10];
		   
		   ito ung magiinput ka ng mga names na may limit like 20, 10
		   base to this Syntax.
		   
		   // pede mo rin sila lagyan ng names/numbers using this syntax
		    	*  names[0] = "Dongchie";
		    	*  names[1] = "De Torres";
		   
		 */
		
		System.out.println(names[0]);				 // Dangrishh
		System.out.println(names[1]); 				 // De Torres
		System.out.println(numbers[2] + numbers[5]); // 9
		


	}
}
