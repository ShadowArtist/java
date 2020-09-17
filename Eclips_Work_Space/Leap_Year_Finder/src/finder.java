import java.util.Scanner;

public class finder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter Number to check ,leap year or not");
		
		int enter_a_number=input.nextInt();
		
		if(enter_a_number %4 ==0) {
			System.out.println("It is leap Year ");
		}
		else {System.out.println("Not Leap Year");
		}
		
		
		
	}
}
