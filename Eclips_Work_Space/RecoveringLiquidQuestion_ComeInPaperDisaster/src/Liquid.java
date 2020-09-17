import java.util.Scanner;

public class Liquid {
	
	
	
     Scanner input = new Scanner(System.in);	
	
     int adds_it_to_the_orignal_amount_of_liquid;
     int orignal_amount_of_liquid;
     
     
	int Add(int takes_some_amount_of_liquid_from_user) {
		
       
		System.out.println(" define orignal amount of liquid");
		
		 orignal_amount_of_liquid=input.nextInt();
		
		
		
		//System.out.println(" amount to take from the user  ?");
		
		
		
	
		
		
		
		 adds_it_to_the_orignal_amount_of_liquid= takes_some_amount_of_liquid_from_user+orignal_amount_of_liquid;
		
		return adds_it_to_the_orignal_amount_of_liquid;
		
	}
	
	
	int remove(int removes_some_amount_of_liquid) {
		
		//System.out.println(" how much to remove from orignal amount ?");
		
		
		
		
		int removal=adds_it_to_the_orignal_amount_of_liquid-removes_some_amount_of_liquid;
		
		
		return removal;

	
	}
	
	
	
	int removeAll() 
	
	{
		int removes_all_amount=adds_it_to_the_orignal_amount_of_liquid*0;
		
		
		return removes_all_amount;
	}
	
	
	

}
