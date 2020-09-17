package abstractionTuotorial;



abstract class DogCharacterstics
{

	
	// Characteristics that are same  in a thing , are in void or public method 
	
	void Bark()
	{
		System.out.println("BArk");
	}
	
	
	// characterstics that are not same comes with abstract keyword 
	
	
	/*
	  
	 we know it has that characterstics,
	  but but how much / which one / what is the quantity/ etc  ,, that we dont know 
	  
	    and it varies time to time 
	    
	    -> variable is called a variable because it varies time to time.
	    
	    fo eg;
	    
	    int a=2;
	    a=3;
	    a=1;
	    a=123;
	    
	    System.out.println(a);
	    
	    
	    OUTPUT: 123 <- because the last value we give it was 123
	    
	    here same law applies as we dont know what are the diffrent intellectual levels of dog's  
	    
	    they vary in every dog
	   
	 * */
	abstract void DogsIntellect();

}



class Dog1 extends DogCharacterstics
{
	
	void DogsIntellect() 
	{
		
          System.out.println(" Dog one  intellect =  90 %  ");		
	}
	
	
	
	
}






class Dog2 extends DogCharacterstics
{
	
	void DogsIntellect() 
	
	{
          System.out.println(" Dog two  intellect 80 %  ");		
	}
	
	
	
	
}




public class abstractionTuotorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	  
	->  Object defines the behavior of the class
 
	
	-> Class is the Blue print of an object
	
	-> The behavior that we are trying to access 
	
	  
	  	
	->  Behavior mtlab aus class main kia kia action perform ho reha hain , , 
	
	
	// what type of actions/functions/methods , that class contain
	  
	  
	  
	  	DogCharacterstics characteristics = new DogCharacterstics(); 
	  	
	  	
it can not see the DogCharacterstics    class  ,,,, if  this class in which we are in cannot

 see  DogCharacterstics class then how it will access it ,,, it is impossible for to access it 
 
  and impossible for it to check its behavior ,, that what type of actions do it contain ..
	  	
	  	*/
		
		
		
		
		
		Dog1  dog_1_characterstics = new Dog1();
	
		System.out.println( "   Dog    1    "  );
		
		dog_1_characterstics.Bark();
		dog_1_characterstics.DogsIntellect();
		
		
		
		Dog2 dog_2_characterstics = new Dog2();
		
		
		
		System.out.println( "   Dog    2    "  );
		
		dog_2_characterstics.Bark();;
		dog_2_characterstics.DogsIntellect();
	}

}
