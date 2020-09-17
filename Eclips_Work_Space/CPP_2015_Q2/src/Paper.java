import java.util.Scanner;
public class Paper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner (System.in);
		Math whatever = new Math();
		
		whatever.MathEx();
	
	
	
		Math2 what = new Math2();
		
		
		
		//Enter 2 Circle values 
		System.out.println("Enter Two circle values to calculate the radius ");
		what.DecimalFormatEx(input.nextInt(), input.nextInt());
	}
	
	
	
	
	
}



class  Math{
	
	
	public static void MathEx(  ) 
	{
		Scanner input =new Scanner(System.in);
		
		
		 System.out.println("Input value");
		double r1=input.nextInt();
		System.out.println("Input value");
		double r2=input.nextInt();
		
		System.out.println("Finding Max");
		if(r1>r2) {System.out.println("Max : "+r1);} else {System.out.println("Max : "+r2);}
		System.out.println("Finding Min");
		if(r1<r2) {System.out.println("Min : "+r1);} else {System.out.println("Min : "+r2);}
		
		System.out.println("finding celing");
		double calculation =(r1+r2 -1) / r2;
		System.out.println("Celing Value  "+calculation);

		System.out.println("Finding Floor");
		double floor = ( (r1-r2)* (-1) * -1 )/r2; //method for floor is  not accurate
		System.out.println(" Floor Value  "+floor);
		
		System.out.println("Finding Squre Root");
		
		double square_root=r1*r1/2; 
		System.out.println("Squre Root of "+  r1*r1 + " is " +square_root);
		
		double square_root_2=r2*r2/2; 
		System.out.println("Squre Root of  "+ r2*r2  +" is "+square_root_2);
	}
	
	
	
	
}




class Math2{
	
	// i taked String datatype as my return type because it was eaisy to calculate my two values
	public static String DecimalFormatEx(double r1, double r2)
	{	
	Scanner input= new Scanner(System.in);
		
	System.out.println("first Circle Radius");
	// PI value
 double PI = 3.1415926535;
	
	
	
	
	
	double radius_squared= r1*r1;
	
double	 Area_Of_Circle= PI *  radius_squared ;
	
	r1 =Area_Of_Circle;
	
	
	
	System.out.println(r1);
	
	
	
	System.out.println("second Circle radius");
	
	double radius_squared_for_circle_2= r2*r2;
	
double	 Area_Of_Circle_2= PI *  radius_squared_for_circle_2 ;
	
	
	r2=Area_Of_Circle_2;
	
	System.out.println(r2);

	
	//I returned the value in String , and performed the calculation in double.
	String calculation = String.valueOf("Area_Of_Circle_1  "+r1+ "  Area_Of_Circle_2  "+r2);
	
	
	return calculation;
	
	}
	
	
}

