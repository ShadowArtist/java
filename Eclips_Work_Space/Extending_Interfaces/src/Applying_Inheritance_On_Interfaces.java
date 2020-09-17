
public class Applying_Inheritance_On_Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		S obj1= new S();
		
		obj1.add(1, 2);
		obj1.mul(3, 2);
		obj1.div(6, 3);
		obj1.sub(3, 2);
		
	

		
	}

}


 interface A
{
int div(int a, int b);	
}

interface B extends A{
	 int add(int a, int b);
}

interface C extends B{
	int sub(int a ,int b);
}

interface D extends C{
	
	int mul(int a ,int c);
}


class S implements D
{
	
public int div(int a, int b) {return a/b;}
 
public  int add(int a,int b) {return a+b;}

public int sub(int a , int b) {return a-b;}

public int mul(int a, int b) {return a*b;}
 

}

