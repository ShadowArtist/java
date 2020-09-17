import java.util.Scanner;


// here we will create all methods
public class Math {

	
	
	
public  int max()

{
	
	System.out.println("         ");
	
	System.out.println("  FINDING MAXIMUM VALUE  ");
	
	System.out.println("         ");
	
		Scanner input=new Scanner(System.in);
		
		
		
		System.out.println("  Enter first value  ");
		
		int value_1 = input.nextInt(); 
		
		System.out.println("  Enter second value  ");
		int value_2 = input.nextInt();
		
		
		if( value_1>value_2  ) 
		{
		System.out.println("max value : "+value_1); 
		//we are returning value 1 in method of return type int
		return value_1;		
		
		}
		
		
		else
		{
			System.out.println("max value : "+value_2); 
			//we are returning value 2 in method of return type int
			return value_2;
		}
		 

		
		
		
		
	}

	

public  int min(){
	
	System.out.println("         ");
	
	System.out.println("  FINDING MINIMUM VALUE  ");
	
	System.out.println("         ");
	
	Scanner input=new Scanner(System.in);
	
	
	System.out.println("  Enter first value  ");
	
	int value_1 = input.nextInt(); 
	
	System.out.println("  Enter second value  ");
	int value_2 = input.nextInt();
	
	
	if( value_1<value_2  ) 
	{
	System.out.println("min value : "+value_1); 
	//we are returning value 1 in method of return type int
	return value_1;		
	
	}
	
	
	else
	{
		System.out.println("min value : "+value_2); 
		//we are returning value 2 in method of return type int
		return value_2;
	}
	 
	
	
	
	
	
}



public  int abs()
{
	
	System.out.println("         ");
	
	System.out.println("  FINDING ABSOLUTE VALUE  ");
	Scanner input=new Scanner(System.in);
	
	System.out.println("         ");
	
	System.out.println("  Enter  value to find its  absolute ");
      int value=input.nextInt();

      
      
   
      
      
      if (value < 0) {
    	 
    	  /*ager value negative main a rahe ha to aus value ko -1 sa multiply
    	    kr wado value positive ho gye ge . ku ka (minus  x  minus) = plus
    	    hota ha
    	    
    	    */
    	  value = value * -1; 
    	    
    	    System.out.println("Absolute value of your number is " +value );
    	    
    	    return value;
      }
      
      else {
    	  System.out.println("Absolute value of your number is : " +value );
      
    	  return value;
      }
      
      
	
}


public  double ceiling(){
	
	System.out.println("         ");
	
	System.out.println("  FINDING CEILING VALUE  ");
	
	System.out.println("         ");
	
	Scanner input = new Scanner(System.in);

	System.out.println("  Enter first value  ");
	
	int value1=input.nextInt();

	System.out.println("  Enter second value  ");
	int value2=input.nextInt();

double calculation =(value1+value2 -1) / value2;
System.out.println( "  celing value is :  "+calculation);


return calculation;
}
	
	
	
	
	
	
}
