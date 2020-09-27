/*
  
1)We can declare an abstract class using the abstract keyword.

2)It may have abstract as well as concrete (non-abstract) methods.

3)An abstract class can have static methods.

4)An abstract class can also have constructors.




5)We can’t instantiate or create an object of an abstract class.


6)A class derived from the abstract parent class must implement each method 
that is declared as abstract in the parent class. Otherwise, there will be a
compilation error.


7)If the derived class does not implement all the abstract methods of an abstract parent class
, then the derived class must also declare itself as abstract.
  
  
 * */


/* 8) public*/ /* abstract class can not be public if it is public then what is the use abstract class 
   
 * */

abstract class  abstractor{
	String item1,item2;
	
	//CONSTRUCTORS
	
	
	//Overloaded Constructor with one parameter
	
	public  abstractor(String item1) {
		// TODO Auto-generated constructor stub
	
	// this reffres to current class on which you are in that class variable 
		this.item1=item1;
		//current_class_instance_variable is equal to the variable of the parameter present in the constructor
		
	}
	
	// Overloaded constructor with two parameter 
	public abstractor(String item1,String item2) {
		// TODO Auto-generated constructor stub
	}
	
	
	//default constructor
	public abstractor() 
	{
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	//NON ABSTRACT METHOD
	void method1() 
	{
		System.out.println("  This is the method that varies so we define the method logic ,"
				+ "like every person have different intellect level ");
	}
	
	//STATIC METHOD
	
	static void method2() 
	{
		
System.out.println(" this is static method due to which it can be called without making an object of the class ");
	
	}
	
	

	
	
	//ABSTRACT METHOD
	// actions that do not change and are same like all Dog barks and all Cats Mewo
	
	/*the method present only in abstract keyword are the methods which must be implemented ,if not implemented
	it will give error*/
	abstract void method3();
	
	

}




 class AbstractTesting extends abstractor/*parent class name*/{

	String itemizer; //this is referring to this variable
	
	
	
	//Constructor Overloading
	
	//default Constructor
	public AbstractTesting() 
	
	{
		
	}
	
	
	
	public AbstractTesting(String item1 ,String itemizer) {
		
	
/* The item variable present in parent class is equal to the the varable of Parameter present in the Constructor
		  
		  of this class in which you are in right now
		 */
		
		//i am from the parent class dancing over here
	super.item1=item1;
	
	
	
	
	//i am  the variable from the class on which you are in
	this.itemizer=itemizer;
	
	
	
	}
	
	
	
	
	
	@Override
	void method3() {
		// TODO Auto-generated method stub
		
	}
	
      
	void method1() 
	 {
		 
	 }
	
	static void method2() 
	{
		
	}


//
//	@Override
//	void method3() {
//		// TODO Auto-generated method stub
//		
//	}
//  
	
}




























// due to inheritance Overriding is occouring 
public class AbstractionRules {
	

	public static void main(String args[]) 
	{
		
		String item1="item 1";
		String item2="item 2";
		
		//Constructors are only for initialization of values
		AbstractTesting abstractTesting = new AbstractTesting(item1,item2);
		

		System.out.println( item1  );
		
		
		System.out.println( item2  );
		
		
		
	}
}










