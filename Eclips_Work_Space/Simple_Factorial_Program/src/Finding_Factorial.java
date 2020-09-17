import java.util.Scanner;
public class Finding_Factorial {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// mujha yehan pa nai pta tha ka kehan tk jana ha number of iteration
		//unknown the tbhe while loop lgya ha 
		
		
		Scanner input = new Scanner(System.in);
		
		int number_to_find_factorial_of= input.nextInt();

		//jub tak factorial main number a k store nai ho ga jub tak kam nai chle ga
		
		
		
		int factorial = 1;

		for(int i=1 ; i<=number_to_find_factorial_of ;i++) 
		{

			//yehan pa sara khail he ais statement ka ha  factorial = factorial*i 
			factorial = factorial*i;
		}
		
		System.out.println("factorial of you number entered number is "+ factorial);
		
		
		
	/*	
		int i=1;
		
		while(i<=a) 
		{
			factorial = factorial*i;
			i++;
		}
		
		System.out.println(factorial);
		*/
		
		
		
	
	}

	
	
}




	



