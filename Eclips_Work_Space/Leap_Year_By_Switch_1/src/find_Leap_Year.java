import java.util.Scanner;

public class find_Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//  from 1752 leap year started << google badsah ya bat kehta hain 
		/*After 1752 we adopted the system still in use today where an additional
		 *  day is inserted in February in years wholly divisible by four, 
		 *  other than years ending in 00 with the exception of those divisible by 400 
		 *  which are still leap years (like 2000).*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value to be checked if ity is a leap year or not ");
		
		int   input_value= input.nextInt();
	
       
		
		switch (input_value % 4) 
		{
		// if the remainder comes in zero its a leap year 
		
		// case works as equals  , case equals to 0
		case 0:
		System.out.println("Leap Year");
		break;
		
			// else  it is not a leap year 
		// this default act as a else 	
		default :
			System.out.println("not a leap year");
				break;
		}
		
		
		
		
		
		
		
		
		
	}

}
