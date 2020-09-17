import java.util.Scanner;
public class Making_Absolute_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		abs();
		
		
	}
	
	
	public static void abs()
	{
		
		Scanner input=new Scanner(System.in);
		
	      int value=input.nextInt();

	      
	      
	   
	      
	      
	      if (value < 0) {
	    	 
	    	  /*ager value negative main a rahe ha to aus value ko -1 sa multiply
	    	    kr wado value positive ho gye ge . ku ka minus * minus = plus
	    	    hota ha
	    	    
	    	    */
	    	  value = value * -1; 
	    	    
	    	    System.out.println("Absolute value of your number is " +value );
	    	
	      }
	      
	      else {System.out.println("Absolute value of your number is : " +value );}
	      
		
	}
	
	
	
	
	

}
