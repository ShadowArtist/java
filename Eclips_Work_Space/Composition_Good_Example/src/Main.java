

/* Remember person has a job , Job do not have a person
 
   so in person class constructor job object will be initialize 
   */



class job
{
	/* Encapsulation is also performed here we will 
	  access private fields with public methods

*/
private int id;  

private String role;

public void setId(int id_set) 
{
/* this.id ,,,, is equalent to id variable of our current class  */
	
	
	/*instead of using this i changed the variable name of variable present 
	 in parameter of a method */
	id=id_set;
	
}

public int getId() 
{
return id;	
}


public void setRole(String role_set) 
{
	role=role_set;
}

public String getRole() 
{
return role;	
}

	
}


class person
{
	// here composition is being performed
	
	// has a relationship  
	
	// person has a job
	
	/*created class object of job and initialized it in the constructor
	  of person
	 */
	
	
	
	
	/*
	  OVER HERE IF YOU SAY WHY THE HELL HAVE YOU TAKE THE 
	  
	  CLASS AND ITS OBJECT VARIABLE OUTSITE THE CONSTRUCTOR
	  
	  IT IS BECAUSE I HAVE TO APPLY ENCAPSULATION I HAD TO ACCESS THE { OBJECT VARIABLE WHICH IS " j  " }
	  
	  THROUGH PUBLIC METHODS ,,,, AND EVEN IF I TRY TO MAKE THE OBJECT( INSTANTIATE ) IN CONSTRUCTOR
	   
	   IT WOULD NOT LET ME TO ACCESS THE METHODS PRESENT IN JOB CLASS WHEN I WILL 
	   
	   CREATE A METHOD BECAUSE ENCAPSULATION IS BEING APPLIED , ONLY PRIVATE FIELDS CAN BE 
	   
	   ACESS BY PUBLIC METHODS WHICH ARE OUTSIDE THE CONSTRUCTORS , THESE ARE THE TEACHINGS OF
	   
	   ENCAPSULATION ...
	  
	  
	 * */				
 private job j;	
 
 // this is a constructor of a person
 person()
 {
//	THEIR IS NO USE OF CREATING AN OBJECT OVER HERE WHILE APPLYING ENCAPSULATION   job b = new job();
	 
	 // over here we just initialized the value 
	 j= new job();
	 
	   j.setId(12);
	
	 j.setRole("manager");
	 
 }

 
 /* Dear child you are trying to acess a private field without a public method   {  j.  }
 
 you will die trying but encapsulation wont allow that until or unless you use 
 
 a public method to access a private field 
*/
 
 
 
 
 
 // i am accessing a private field through a public method which is encapsulation
 // i am using a method with return type 
 public String getResult() 
 {
	return j.getRole();
 }
 
 // i am accessing a private field through a public method which is encapsulation
//i am using a method with return type 
 public int GetID() 
 {
	 return j.getId();
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

System.out.println(p.getResult()   )  ;
	
	System.out.println(p.GetID()   );
	}

}
