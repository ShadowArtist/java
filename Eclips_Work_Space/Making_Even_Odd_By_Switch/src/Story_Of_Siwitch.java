
import java.util.Scanner;

public class Story_Of_Siwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter the number to check if it is even or odd");
		
		int enter_number_to_find_Even_or_Odd=input.nextInt();
		
		
		// we can apply logic in switch starting brackets

		switch(enter_number_to_find_Even_or_Odd % 2) {
		
		
		// this means if in remainder  it comes zero, run this case
		case 0:
		System.out.println("Number is Even");
		
		break;
		
		// this means if in remainder  it comes 1, run this case
		
		case 1:
			System.out.println("Number is odd");
		break;
		}
	
	
	}

}
