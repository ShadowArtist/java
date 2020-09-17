package inheritance_case_2_Explaning;


class GRAND_GRAND_PARENT

{
	
void Printing_In_Grand_Parent() 


{
	

System.out.println("I am from Grand Grand Parent");

}
	
}


class GRAND_PARENT extends GRAND_GRAND_PARENT
{
	
void Printing_in_Grand_Parent() 

{
	

	System.out.println("I am from Grand Parent");
	
}


}

class PARENT extends GRAND_PARENT
{

	void Printing_In_Parent() 
	
	{
		
		System.out.println(" I am from parent ");
	}

}



class Child /*Child always*/ extends /*Parent always*/ PARENT

{
	
	void Printing_In_Child() 
	
	{
		
		System.out.println(" Printing in child  ");
		
	}
}


public class INHERITANCE_CASE_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child obj = new Child();
		
		
		obj.Printing_In_Grand_Parent();
		
		obj.Printing_in_Grand_Parent();
		
		obj.Printing_In_Parent();
		
		obj.Printing_In_Child();
		
		
	}

}
