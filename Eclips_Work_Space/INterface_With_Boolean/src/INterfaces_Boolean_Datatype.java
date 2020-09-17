import java .util.Scanner;
public class INterfaces_Boolean_Datatype {

	 
	public static void main(String[] args) {


		Scanner input  = new Scanner(System.in);
		
		System.out.println("Enter User Name");

		String user  = input.nextLine();
		System.out.println("Enter User Password");
		
		String pas  = input.nextLine();
		
		
		a obj = new a();
	 boolean confirm =	obj.verify(user, pas);
		
	 if(confirm == true) {
		 
		 System.out.println("welcome");
		 
		 
	 }
	 else {
		 System.out.println("something went wrong .. !");
		 
	 }
		
		
	}
}

interface Iverification {
	
	public  boolean verify(String name  , String pass);
	
	
	
}




class a implements Iverification{

	@Override
	public  boolean verify(String name, String pass) {
	 
		
		if(name.equals("rehan") && pass.equals("123")) {
			
			return true;
					
		}
		
		return false;
		
		
		
		
	}


}
