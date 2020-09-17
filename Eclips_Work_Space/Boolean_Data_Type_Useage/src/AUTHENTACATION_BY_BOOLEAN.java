


import java.util.Scanner;
public class AUTHENTACATION_BY_BOOLEAN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input =new Scanner(System.in);
		
System.out.println("Input username .. ");
		
		String name = input.next();
		

		System.out.println("Input password .. ");
		String password = input.next();
		
		//use age of boolean data type
		
		//verify is the variable of our method 
		
		boolean confirm  = verify(name, password);
		
		if(confirm == true) {
			
			System.out.println("login successful");
			
		}else {
			
			System.out.println("something went wrong ...! ");
			
			
		}

		
		
		
	}

	
	public static boolean verify(String username , String password) {
		
		
		
		
if(username.equals("rehan") && password.equals("123")) {
			
			return true;
			
		}
		return false;
		
		
		
	}
	
	
}
