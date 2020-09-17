
import java.util.Scanner;

public class Switcher {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		
		
		System.out.println("Enter the number to check if it is leap year or not");
		
		int enter_value= input.nextInt();
		
		int assigned_value=4;
		
		
		switch (enter_value %  assigned_value ) {
		
		
		case 0:
			System.out.println(" leap year ");
			break;
			
		
		}
		
		
	}

}
