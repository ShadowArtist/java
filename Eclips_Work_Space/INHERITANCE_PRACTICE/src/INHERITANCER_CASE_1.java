

class PARENT

{	
	
	

	
	// outside the class no loop comes , no print statement comes
	
	
	// jo kuch method main mojude ha wo aye ga wo print ho ga
	
	
	/*
	 A method is a block of code which only runs when it is called.

You can pass data, known as parameters, into a method.

Methods are used to perform certain actions, and they are also known as functions.

Why use methods? To reuse code: define the code once, and use it many times. 
	  
	 * */
	
	/*Methods are used to perform certain actions*/
	
 void Printing_Something_FROM_PARENT() {
	
	 
	 
System.out.println("this is PARENT");
}


}



class CHILD1 extends PARENT


{
	
void Printing_Something_IN_CHILD1() 
{
	
System.out.println("this is CHILD 1");
}

}

class CHILD2 extends PARENT
{
	
	void Printing_Something_IN_CHILD2() 
	{
				
		System.out.println("this is CHILD 2");
		
	}
	
}







public class INHERITANCER_CASE_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CHILD1 obj = new CHILD1();
		
		obj.Printing_Something_FROM_PARENT();
	
		
		// parent to kuch inherit nai kera ga child sa 
	PARENT obj2= new PARENT();

	obj2.Printing_Something_FROM_PARENT();
	
	
	
	
	}

}
