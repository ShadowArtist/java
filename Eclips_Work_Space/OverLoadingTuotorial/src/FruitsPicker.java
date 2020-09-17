import java.util.ArrayList;

class FruitsTable
{
	

/*   function / method  / action  ,  is same and one   but overloaded   */
	
	void pick_fruit(String oneApple , String oneBanana) 
	{
		System.out.println(" you picked  " + oneApple  +  " and  "   +oneBanana  );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	void pick_fruit(String oneApple ) 
	{
		System.out.println(" you picked  " + oneApple   );
	}
	
	
	//String is a non primitive ( programmers made )  ,, it is collection of characters
 
	//char  is primitive datatype ( from the time of c language  ) ,, it is single alphabet
	
	void pick_fruit(String oneBigApple ,char oneSmallApple) 
	{
		
	
	System.out.println("You picked  which is " + oneBigApple + "   and   Small apple which is " +  oneSmallApple );	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*void pick_fruit(String oneBanana ,String oneApple,String oneOrange ) 
	{
		System.out.println(" you picked  " + oneApple + "  " + oneBanana  +"   " +  oneOrange );
	}*/
	
	void pick_fruit(String oneApple , String oneBanana ,String oneOrange , String oneMango ) 
	{
		System.out.println(" you picked  " + oneApple  +  " ,  "   +oneBanana  +  " , " + oneOrange + " and  "+ oneMango );
	}
	

}

class A extends FruitsTable
{
	void pick_fruit(String oneApple ,String oneOrnge) 
	{
		System.out.println(" you picked  " + oneApple   );
	}

}



public class FruitsPicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 FruitsTable  Hand = new FruitsTable();
		 
		 /*Hand.pick_fruit(" apple ", " banana");
		 
		 Hand.pick_fruit("apple");
		 
		 Hand.pick_fruit(" apple ", "banana" , "orange" , " mango " );*/
		 
		 Hand.pick_fruit(" Big Apple ", 'a');
		 
		 
		 
		 
		
	}

}
