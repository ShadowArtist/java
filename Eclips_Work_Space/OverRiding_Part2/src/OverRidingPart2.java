
class A{
	
	
	
	
	static void add(int a, int b) 
	{
		int sum=a+b;
		
		System.out.println("your  added number is " + sum);
	}
}


class B extends A{
	
	
	
	 static void add(int a, int b) 
	{
		int sum=a+b;
		
		System.out.println("your  added number is " + sum);
	}

}



public class OverRidingPart2 {

	public static void main(String[]args)
	{
	
		B obj = new B();
	  obj.add(1, 2);
	 
	 
		
	}
	
}



