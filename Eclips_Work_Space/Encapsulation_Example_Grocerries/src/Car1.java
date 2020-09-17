class Grocerries
{
	private String grocerry;
	
	
	public void Put_Grocerries_In_Car() 
	
	{
		
		grocerry="putting grocerry in car";

		System.out.println(grocerry);
		
	}
	
	
	
	
	public void Get_Grocerries_from_Car() 
	
	{
		
		grocerry="getting grocerry in car";

		System.out.println(grocerry);
		
	}
	
	
	
	
	
	
	
}



public class Car1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
    Grocerries action = new Grocerries();
    
    action.Put_Grocerries_In_Car();
    
    action.Get_Grocerries_from_Car();
		
		
	}

}









