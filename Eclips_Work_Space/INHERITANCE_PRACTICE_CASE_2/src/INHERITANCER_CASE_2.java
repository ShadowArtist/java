
class GRAND_GRAND_PARENT
{
	


	void PRINTING_IN_GRAND_GRAND_PARENT() 
	{
		System.out.println("printing from Grand Grand Parent ");
	}
	
}

class GRAND_PARENT extends GRAND_GRAND_PARENT
{
	
	void PRINTING_IN_GRAND_PARENT() 
	{
		System.out.println("printing from Grand Parent");
	}
	
}


class PARENT extends GRAND_PARENT

{
	
	void PRINTING_IN_PARENT() 
	{
		
		System.out.println("printing from parent");
	}
	
}

class CHILD extends PARENT

{
	
void PRINTING_IN_CHILD() 
{
System.out.println("printing in child");	
}	
	
}


public class INHERITANCER_CASE_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CHILD obj = new CHILD();
		
		obj.PRINTING_IN_GRAND_GRAND_PARENT();
		
		
		obj.PRINTING_IN_GRAND_PARENT();
		
		obj.PRINTING_IN_PARENT();
		
		
		obj.PRINTING_IN_CHILD();
		
		
		
		
	}

}
