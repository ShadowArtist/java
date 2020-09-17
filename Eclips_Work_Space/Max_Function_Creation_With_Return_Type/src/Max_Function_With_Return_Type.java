
import java.util.Scanner;

public class Max_Function_With_Return_Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		max();
	}
	
	
	
	
	public static int max(){
		
		Scanner input=new Scanner(System.in);
		
		
		
		
		int value_1 = input.nextInt(); 
		int value_2 = input.nextInt();
		
		
		if( value_1>value_2  ) 
		{
		System.out.println("max value : "+value_1); 
		//we are returning value 1 in method of return type int
		return value_1;		
		
		}
		
		
		else
		{
			System.out.println("max value : "+value_2); 
			//we are returning value 2 in method of return type int
			return value_2;
		}
		 
		
		
		
		
		
	}

}
