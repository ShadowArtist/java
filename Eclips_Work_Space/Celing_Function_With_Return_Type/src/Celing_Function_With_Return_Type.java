import java.util.Scanner;

public class Celing_Function_With_Return_Type {

	public static void main(String[] args) {
		
		ceiling();

	}

	/* For Example ,floor(2.4) = 2 and ceil(2.4)=3 */
	
	public static double ceiling(){
		Scanner input = new Scanner(System.in);
	int value1=input.nextInt();
	int value2=input.nextInt();
	
	double calculation =(value1+value2 -1) / value2;
	System.out.println( "  celing value is :  "+calculation);
	
	
	return calculation;
	}
	
	
}
