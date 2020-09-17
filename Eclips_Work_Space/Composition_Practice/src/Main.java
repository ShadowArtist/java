// composition

// person   (association) HAS-A   job 


class job{
	
	private int id;
	private String role;
	
	
	
	public void setId(int Idset) 
	{
		id=Idset;
	}
	
	public int getId() 
	{
		return id;
	}
	
	
	public void setRole(String Roleset) 
	{
		
		role=Roleset;
		
	}
	
	
	public String getRole()
	{
		
		return role;
	}	
	
	
	
	
	
	
}



// person has a job
class person{
	
	private job j;
	
	
	person()
	
	{
		
		// here we will only initialize values , that what constructors are for
		
		j= new job();
		
		j.setId(123);
		
		j.setRole(" Chief Execitive Officer ");
		
	}
	
   /* Dear child you are trying to acess a private field without a public method   {  j.  }
    
     you will die trying but encapsulation wont allow that until or unless you use 
     
     a public method to access a private field 
    */
	public int GetID() 
	{
		return j.getId();
		
	}
	
	
	
	public String GetRole() 
	
	{
		return j.getRole();
	}
	
	
}







public class Main {

	public static void main(String[] args) {
	/* Over here we will only make object and print the two get methods which we used in person class 
		 
	to get our setteted values	  
		 */

		
		/* because person has job so we will access person class and make its 
		 object to obtain methods of  job class   */
		
		
		person p = new person();
		
		System.out.println(p.GetID()       );
		
		System.out.println(p.GetRole()     );
	}

}
