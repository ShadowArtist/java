import java.io.*;
import java.util.*;
import java.*;
public class Simple_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
	//	String In_Upper_Case = s.toUpperCase();
//		String In_Upper_Case = s.toLowerCase();	
		System.out.println("Enter the String to be Reversed ");
		
		
		
		/* over here while taking input in string in String Buffer
		 *  we can apply .toUpperCase() or  .toLowerCase() 
		*/
		StringBuffer s = new StringBuffer( input.next().toUpperCase() );
	
		s.reverse();
		
		
		System.out.println(s);
		
		
		
	
		
		
	}

}
