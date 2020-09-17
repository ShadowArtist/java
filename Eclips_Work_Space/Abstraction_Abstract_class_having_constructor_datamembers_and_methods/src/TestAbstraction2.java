
/*

An abstract class can have a data member, abstract method,
 method body (non-abstract method), constructor, and even main() method.  
  
  
  
  
 * 
 * */







abstract class Bike 
{
	
	// this is a constructor
	Bike()
	{
		System.out.println(" this is bike constructor where we only initialize values  , here bike is created ");
	}
	
	// this is abstract method
	abstract void run();
	
	
	// tihs is simple mehotds
	void changeGear() 
	
	{
		
	System.out.println(" Gear Changed   ");	
	}
	
	
}


class Honda extends Bike 
{
	
void run ()
{
		
System.out.println(" bike running  ");
}



}















public class TestAbstraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Bike obj = new  Honda();
		
		obj.run();
		
		
		obj.changeGear();
		
	}

}
