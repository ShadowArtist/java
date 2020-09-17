import java.util.Scanner;

public class Interfaces_with_Billionare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		
		System.out.println("enter name please");
		String name=input.next();
		
		System.out.println("enter password please");
		String pass=input.next();
	
		
		a obj1 = new a();
		
		boolean confirmation= obj1.verify(name, pass);
		
		if(confirmation == true) 
		{
			System.out.println("Welcome to Program");
		}
		else {
			System.out.println(" their is something wrong ");
		}
		
	}

}




interface mera_interface {
	
	boolean verify(String name , String pass);
	
}






class a implements mera_interface{
	
	
	public boolean verify(String name , String pass) {
		
		if(name.equals("rehan")  && pass.equals("123")    ) 
		{
			return true;
			
		}
		return false;
		
		
		
	}
	
	
}


