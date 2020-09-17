


package even_odd_Finder;

import java.util.Scanner;


public class finder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter Number to check ,even or odd");
		
		int enter_a_number=input.nextInt();
		
		if(enter_a_number %2 ==0) {
			System.out.println("You antered Even Number");
		}
		else {System.out.println("You antered Odd Number");
		}
		
		
		
	}

}
