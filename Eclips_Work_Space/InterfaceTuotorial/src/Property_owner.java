

interface Contract
{

	//by default it is abstract 
	
/*abstract*/	void  closed_Home();
}


interface paper_1 extends Contract
{
	void Room_details();
}


interface paper_2 extends Contract
{
	void Swming_pool();
}













/*
 
 A Java class can only extend one parent class. Multiple inheritance (extends)
  is not allowed. Interfaces are not classes, 
  however, and a class can implement more than one interface.

The parent interfaces are declared in a comma-separated list,
 after the implements keyword.

In conclusion, yes, it is possible to do:

public class A implements C,D {...} 
  

   
 * */



/*   now it is  necessary for a worker to implements these things  
       
        if it is not implemented you will ask worker why haven't you 
        
        made these things which were in contract
  
 * */


class Worker implements     paper_1   ,   paper_2 


{

	//inhereted from parent class which is contract
	@Override
	public void closed_Home() {
		// TODO Auto-generated method stub
		
		
		System.out.println("Whole  home  is close  ");
	}

	@Override
	public void Swming_pool() {
		// TODO Auto-generated method stub
		
		System.out.println(" Swming pool made  ");
	}

	@Override
	public void Room_details() {
		// TODO Auto-generated method stub
		
		System.out.println("  6 rooms made   ");
	}
	



}






public class Property_owner 



{

	
	
	
	public static  void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		Worker  acknowledging_things_has_been_made = new Worker();
		
		
		/*
		  
		  Worker is now acknowledging  the  Property Owner
		   that these things have been made
		   */
		acknowledging_things_has_been_made.closed_Home();
		acknowledging_things_has_been_made.Room_details();
		acknowledging_things_has_been_made.Swming_pool();
		
	}

	
	
	
	

	

}
