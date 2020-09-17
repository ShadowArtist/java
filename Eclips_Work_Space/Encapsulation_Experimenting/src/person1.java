class car
{
	
private  String grocerries;
	
public  void getGrocerries() 
{
	
grocerries=" grocerries picked ";
	System.out.println(grocerries);
}


}



public class person1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

car personPickingGrocerries = new car();

personPickingGrocerries.getGrocerries();

		
	}

}



/*
 
  ON COMPILING IT ASKED ME WHICH MAIN METHOD I WANT TO RUN  SO I SELECTED 
THE CLASS OF PERSON 2 CONTANING MAIN METHOD 

*/




 class person2 
{
	
public static void main(String [] args) 
{
	
car personPickingGrocerries = new car();

personPickingGrocerries.getGrocerries();
}


}

 
class car2
{
	car personPickingGrocerries = new car();

	// here it can not access because it is seperate entity / unit / body .
	/*  personPickingGrocerries. */
}


