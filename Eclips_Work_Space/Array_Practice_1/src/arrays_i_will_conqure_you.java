


public class arrays_i_will_conqure_you {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//taking average
		
		
		double  nums[]= {12.2,23.3,12.21,23.1,32.12,43.12};
		
		double result =0;
		
		
		
		
		
		// REMEMBER DONT PUT SEMICOLON AFTER FOR OR ELSE IT WILL GIVE ERROR 
		
		
		// we are taking i to store our values on index 
		for(int i =0;i<6;i++)
		
		{
		//0 + numbers present in i variable 
		result	  = result + nums[i];
		}		
		
		result = result/6;
		
		System.out.println("Average is "+result);
	}

}
