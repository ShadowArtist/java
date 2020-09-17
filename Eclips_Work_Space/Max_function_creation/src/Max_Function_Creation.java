import java.util.Scanner;
public class Max_Function_Creation {

	public static void main (String [] args) {
	
	max();
	}
	


	


// here we created a method of max
// void means without return type	
	
public   static   void max() {
	Scanner input= new Scanner(System.in);
	
	int input_1=input.nextInt();
	int input_2=input.nextInt();
	
	
	if(input_1 > input_2 ) {
		System.out.println("grater value is :  "+input_1);
	} 
	else {
		System.out.println("grater value is :  "+input_2);
	}
	
	
	
	
} 
	
}