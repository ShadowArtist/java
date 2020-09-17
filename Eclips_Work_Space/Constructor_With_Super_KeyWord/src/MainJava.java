
public class MainJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		B obj = new B(12,2);
		
	}

}










class A {
	int IntegerA =10;
	
	public A() {
		System.out.println("Inside constructor A");
		
	}

	
	//parameterized constructor
	public A(int no) 
	{
	    System.out.println("inside A's Constructor");      
		
		IntegerA=no;	
	}
	
	
}





class B extends A{
	
	int IntegerB = 20;
	
public B() {
	System.out.println("Inside constructor B");
}	
	
// parameterized constructor
public B(int no1 , int no2) {
	

	
	
	// super is the reference variable which refers to the instance value of parent class
System.out.println(super.IntegerA);
	
	IntegerB=no2;
	
}

	
}

