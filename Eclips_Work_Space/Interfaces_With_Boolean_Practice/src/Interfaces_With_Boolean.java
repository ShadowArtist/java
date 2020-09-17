import java.util.Scanner;

public class Interfaces_With_Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println(" enter your name ");
		
		String name = input.next();
		
		System.out.println("enter pass ");
		String pass = input.next();
		
		a obj1 = new a();

		
		boolean confirmation = obj1.verify(name,pass);
	
		if (confirmation == true) {
			System.out.println(" Welcome ");
		}
		else {
			System.out.println("something went wrong");
		}
		
		
		
		
	}

}










interface myInterface{
	
	boolean verify (String name ,String pass );
	
}



class a implements myInterface{
	
	public boolean verify(String name , String pass) {
	
		
		
		if(name.equals("rehan")   && pass.equals("123")   ) 
		{
			return true;
		}
		return false;
		
		
		
	}
	
	
	
}