package inheritance_Case_1_Explaning;

class PARENT

{

	
	
	
	/* Methods are used to perform certain actions */
	
	
	//action
	void Printing_FROMPARENT() 
	
	{
		
		System.out.println("this is from Parent");
		
	}
	

}



class Child_1 extends PARENT


{
	
	void Printing_Something_in_Child1() 
	{
		System.out.println(" i am from child 1 ");
	}
	
}



class Child_2 extends PARENT


{
	
	void Printing_Something_in_Child2() 
	{
		System.out.println(" i am from child 2 ");
	}
	
}




public class INHERITANCE_CASE_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child_2 obj = new Child_2();
		
		obj.Printing_FROMPARENT();
		
		obj.Printing_Something_in_Child2();
		
		
		
		
		Child_1 obj1 = new Child_1();
		
		obj1.Printing_FROMPARENT();
		obj1.Printing_Something_in_Child1();
		
	}

}
