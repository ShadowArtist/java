

import java.util.Scanner;

public class checking {
	
	
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		
		
		System.out.println("Enter number to check if its positive or negative");
		
		double number_enter = input.nextInt();
		
		if(number_enter >=0) {
			System.out.println("you entered positive number which is " +number_enter);
		}
		
		else {System.out.println("negative number");}
		
		
		
		
		
	}
}
