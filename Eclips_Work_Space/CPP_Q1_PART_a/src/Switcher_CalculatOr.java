import java.util.Scanner;


public class Switcher_CalculatOr {

	public static void main(String[] args) {
		/*public class StringToCharExample1{  
public static void main(String args[]){  
String s="hello";  
char c=s.charAt(0);//returns h  
System.out.println("1st character is: "+c);  
}}



*/ 
		
		//char c = reader.next().charAt(0);		
		
		
		
		
		Scanner input = new Scanner(System.in);
		
		
// over here i converted String value into character 

		
		System.out.println("Choose your mode of calculation you will be directed to one of these modes , remember to chose any one,   +   ,   -    ,    *   ,   /  ");
		
		String input_operator = input.next(); // taked the input (+,-,*,/) any one of them in String 
	
		//as you know indexing starts from 0 where as in above string their would be only one operator and its index value will be zero
		
		char operation= input_operator.charAt(0); // here i called the index value of String , stored in the variable called input_operator.
		
		/*
		
		if(input_operator.equals("+")) 
		{
			add();
		}
		
		else if (input_operator.equals("-") ) 
		{
		sub();	
		}
		
		else if (input_operator.equals("*") ) 
		{
		mult();	
		}
		
		else if (input_operator.equals("/") ) 
		{
		div();	
		}
		
		*/
		
		
		switch(operation) {
		
		case '+':
			System.out.println("You entered in addition mode");
			add();
			break;
			
		case '-':
			System.out.println("You entered in substraction mode");
			sub();
			break;
		
			
		case '*':
			System.out.println("You entered in multiplication mode");
			mult();
			break;
			
		case '/':
			System.out.println("You entered in division mode");
			div();
		}
		
		
		
		
		
		
		
	}	
	
	public static void add() {
		Scanner input = new Scanner(System.in);
	
		System.out.println("  ");
		
		System.out.println("Enter your first value");
		float value1=input.nextInt();
		
		System.out.println("Enter your second value");
		float value2=input.nextInt();
		
		float calculate=value1 +value2 ;
		System.out.println("Ans = " +calculate);
	}
	
	
	public static void sub() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("     ");
		
		System.out.println("enter your first value");
	float value1=input.nextInt();
		
	System.out.println("enter your second value");
		float value2=input.nextInt();
		
		float calculate=value1 - value2 ;
	
		System.out.println("Ans = " +calculate);
	}
	
	
	

	public static void mult() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("  ");
		
		System.out.println("Enter your first value");
	float value1=input.nextInt();
		
	System.out.println("Enter your second value");
		float value2=input.nextInt();
		
		float calculate=value1 * value2 ;
	
		System.out.println("Ans = " +calculate);
	}
	
	
	
	
	public static void div() {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("  ");
		
		System.out.println("Enter your first value");
	float value1=input.nextInt();
		
	
	System.out.println("Enter your second value");
		float value2=input.nextInt();
		
		float calculate=value1 / value2 ;
	
		System.out.println("Ans = " +calculate);
	}
	
	
	
	
	
	
}
