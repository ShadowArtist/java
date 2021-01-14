import java.util.Scanner;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Calculator(double rootNumber)
	
//	Calculator obj1 = new Calculator(4);
//	
//	System.out.println(obj1);
//	
//	}
		Scanner input = new Scanner(System.in);
		System.out.println("input two number ");
		int num1=input.nextInt();
		int num2=input.nextInt();
		
		
Calculator obj = new Calculator(num1,num2);	

 int a= obj.add();

 System.out.println("Ans ="+ a);
 
 
 
 System.out.println("input two number ");
	int num11=input.nextInt();
	int num22=input.nextInt();
 
 obj=new Calculator(num11, num22);
 
 int b= obj.sub();
 
 System.out.println(b);
 
 
 
 
 
 System.out.println("input two number ");
	int num33=input.nextInt();
	int num44=input.nextInt();
 
 obj=new Calculator(num33, num44);
 
 int c= obj.mul();
 
 System.out.println(c);
 
 
 
 
 System.out.println("input two number ");
	int num55=input.nextInt();
	int num66=input.nextInt();
 
 obj=new Calculator(num55, num66);
 
 int d= obj.div();
 
 System.out.println(d);
 
 
 
 System.out.println("input a number ");
	int num77=input.nextInt();
	
	
	 obj=new Calculator(num77);
	 
	 double Sqrt= obj.Sqrt();
	 
	 System.out.println(Sqrt);
 
}
}




class Calculator{
	
	
	
	int num1;
	int num2;
	
	double rootNumber; 
	
//	for square root
	Calculator(int num1)
	{
		this.num1=num1;
	}
	
	
	Calculator(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	
	Calculator(double rootNumber){
		
		this.rootNumber=rootNumber;
		
	}
	
	int add() 
	{
	return	this.num1+this.num2;
	}
	
	int sub() 
	{
		if(this.num2>this.num1) 
		{
			throw new IllegalArgumentException(" answer is negative."); 
		}
		
		
		return this.num1-this.num2;
			
	}
	
	
	
	int mul() 
	{
		
		
		
		return this.num1*this.num2;
			
	}
	
	
	int div() 
	{
		
		
		if(this.num1/this.num2==0) 
		{
			throw new ArithmeticException("answer is infinity”.");
		}
		
		return this.num1/this.num2;
	}
	
	
	int Sqrt()
	{
//		 negative finding logic
		if(rootNumber<0) 
		{
			throw new IllegalArgumentException("square root is not possible");
		}
		
		return (int) Math.sqrt(rootNumber);
	}
	
	
	
}

