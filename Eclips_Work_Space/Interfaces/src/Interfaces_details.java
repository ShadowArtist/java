
public class Interfaces_details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		A obj1 = new A ();
		
		System.out.println(obj1.sub(2, 1) );
	}

}



//remember interfaces will be created outside the class

// interface aik contract ke terha ha

//ais main btya gye ga ka kia kia ho ga pure detail btye nai gye ge

// interface main over riding ho rahe ha 


interface myinterface {
	
	// here we will define our methods not the method logic
	
	public int  add(int a , int b);
	
	public int sub( int a , int b);
}



class A implements myinterface 
{
//here we will define our logic
	
	public int add(int a , int b){
		return a+b;
	}

	public int sub(int a , int b) {
		return a-b;
	}

	
}




