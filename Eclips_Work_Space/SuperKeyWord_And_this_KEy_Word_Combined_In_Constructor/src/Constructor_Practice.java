//just maked default constructor and Worked on super and this keyword


public class Constructor_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B obj = new B();
		
		obj.show(30);
	}

}



class A{
	
	// super means parent 
	
	int i = 10;
	
	A()
	{
		System.out.println("this keyword used in  constructor in Class A which refers to curent class instance variable : "+this.i);
	}
	
	
}


class B extends A{
	
	int i= 20;
	
	B()
	{
		System.out.println("super keyword used in  constructor in Class B : "+super.i);
	}
	
	
	void show(int i) 
	{
		System.out.println("Value called by object in main class which is in show method : "+i); // it will give the output for the parameter that we inatialized in our method
		
		System.out.println("Value called by this keyword of current class in show method :  "+  this.i); //this keyword is the reference variable wihch refers to the current class instance variable
		
		System.out.println("Value called by super keyword of parent class in show method :  "+super.i); // super keyword is the reference variable which refers the parent class instance variable 
	}
	
	
	
}