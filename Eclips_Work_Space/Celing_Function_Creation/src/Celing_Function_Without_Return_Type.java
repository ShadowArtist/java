import java.util.Scanner;
public class Celing_Function_Without_Return_Type {

	public static void main(String[] args) {
		
		ceiling();
	}
	
	
	/* For Example ,floor(2.4) = 2 and ceil(2.4)=3 */
	
	/*Help From Geeks for Geeks because i was in hurry and got lots of work to do
	 
	 // Java program to find ceil(a/b) 
// without using ceil() function 

class GFG { 
	
// Driver Code 
public static void main(String args[]) 
{ 
	
	// taking input 1 
	int a = 4; 
	int b = 3; 
	int val = (a + b - 1) / b; 
	System.out.println("The ceiling value of 4/3 is "
						+ val); 

	// example of perfect division 
	// taking input 2 
	a = 6; 
	b = 3; 
	val = (a + b - 1) / b; 
	System.out.println("The ceiling value of 6/3 is "
						+ val ); 
} 
} 



	 
	 
	 */
	
	
	public static void ceiling(){
		Scanner input = new Scanner(System.in);
	int value1=input.nextInt();
	int value2=input.nextInt();
	
	double calculation =(value1+value2 -1) / value2;
	System.out.println( "  celing value is :  "+calculation);
	}
	

}
