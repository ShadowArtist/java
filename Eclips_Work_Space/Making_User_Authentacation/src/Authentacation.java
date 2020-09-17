import java.util.Scanner;
public class Authentacation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("set your user name ");
		String set_user_name = input.next();
		
		
		System.out.println("Set your password");
		
		String set_password = input.next();
		
		
		System.out.println("==== Authentaction ====");
		
		
		System.out.println("Enter your user name");
		String user_name =input.next();
		
		
		System.out.println("Enter password");
		String password =input.next();
		
		
		
		if(set_user_name.equals(user_name) && set_password.equals(password) ) {
			System.out.println(" Authentacation Sussesful ");
		}
		
		else {
			System.out.println(" Authentacation Unsucessfull, User name or password might be wrong ");
		}
		
		
		
		
		
	}

}
