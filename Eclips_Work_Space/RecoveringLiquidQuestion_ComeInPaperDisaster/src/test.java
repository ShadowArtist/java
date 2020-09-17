
public class test {

	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//  https://www.codesdope.com/java-array-of-objects/
		
		
		
		
		Coffee coffee=new Coffee();
		Milk milk = new Milk();
		
		
		
		//Liquid[] liquids= { coffee,milk  };
		
		
		System.out.println(" Amount of cofee added  in orignal amount  "+  coffee.Add(123)   );	
			
		
		
		System.out.println(" Amount of coffee after removing from the total added amount    "+  coffee.remove(2) )  ;
		   
			
			if (coffee/*this is instance variable of Cofee */ instanceof/* instance variable of */ Coffee) {
			
				//type new_name = (type) liquids;
				
				coffee.Swirl();
			}
			
			
//		   System.out.println( milk.Add(456) ); 	
//		    System.out.println( milk.remove(3)  ) 	;
		
		
//		liquids=new Liquid[10];
//		
//		
//	    liquids[0]=new Liquid();
	    
	    
	}

}
