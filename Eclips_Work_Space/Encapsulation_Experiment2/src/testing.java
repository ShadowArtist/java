
public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car personPickingGrocerries = new car();

		personPickingGrocerries.getGrocerries();
	}

}





class car
{
	
private static String grocerries;
	
public  void getGrocerries() 
{
	
grocerries=" grocerries picked ";
	System.out.println(grocerries);
}


}




class car2
{
	

	// here it can not access because it is seperate entity / unit / body .
	
	//even if we try to access it with a public method it will not be accessed because it is accessed by
	//only 
	public void access() 
	{
		car personPickingGrocerries = new car();
		
		personPickingGrocerries.getGrocerries();
	}
}



