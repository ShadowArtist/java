//import Coffee.Swriller;

/**
 * 
 */

/**
 * @author RehanUsmani
 *
 */

/*
 GUIDE TAKEN TO UNDERSATND  ARRAY OF OBJECTS 
  
  http://www.javawithus.com/tutorial/array-of-objects
  
  
  https://www.codesdope.com/java-array-of-objects/
  
  */

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Student[] studentArray = new Student[7]; */

	
	
		Liquid[] elements = new Liquid[10];
		
		
		/*studentArray[0].marks = 100;*/
		/*try {
		elements[0].Add(6).to();
//		elements[0].remove(1);
		
		System.out.println(elements[0]);
		
		
		}catch(NullPointerException e) {}
		*/
		/*
		 studentArray[0] = new Student();
		  
		  */
		
		
	
	/*
	elements[0].remove(input.nextInt());
	elements[1].remove(input.nextInt());
	elements[2].remove(input.nextInt());

	elements[0].removeAll(input.nextInt());
	elements[1].removeAll(input.nextInt());
	elements[2].removeAll(input.nextInt());*/

		
		
		
// till here the program works
	//just testing the for loop , remove it if causes error
		
		
		
		
			elements[0] = new Liquid();
			elements[1] = new Coffee(); 
			elements[2] = new Milk();
		
			
			
			
		
			
		
		
		
		
		
			/*Liquid q=elements[0];
			Liquid w=elements[0];
			Liquid e=elements[0];*/
		
		
		// for ka loop kis pa lgana ha 
			
		int a= elements[0].Add(7);
		
		
		System.out.println(" added some amount of liquid in orignal amount "+a); // added in some amount of liquid
		
		int b= elements[0].remove(a); // this is how we remove some amount from our orignal amount of liquid
		
		System.out.println("remove some amount of liquid from present amount "+b);
		
		int c = elements[0].removeAll(b); // it removed all from it
		
		System.out.println("removed all amount of liquid from present amount of liquid   "+c);
		
		
		
		
		
		
		
		// this is the work for calling only Swirl method 	
					// Swriller is our interface 
				if (elements[1] instanceof Swriller) {
					
					
					// it was simple object creation with the help of interface
					Swriller new_name = new Coffee();
					
				String print=	new_name.Swirl();
				
				System.out.println(print);
					
				}
		
		
		
//loop kis chez pa lga ga		
		
		/*
		 for ( int i=0; i<studentArray.length; i++) {
	studentArray[i]=new Student();
	}
		 
		  */
		
	//	for (int i=0 ; i<elements.length) {}
		
		
		
		
		
		// Our methods should contain return types 
		
		//because if we want our desired results if we want to add something void methods will not work

	
	
	
	/*
	  for ( int i=0; i<studentArray.length; i++) {
studentArray[i]=new Student();
}

*/

	
	
	
/*	for(int i=0 ; i<elements.length;i++) 
	{
	
		elements[i]= new Liquid();
		
		
	}*/
	
	
	/*
	 
	  for ( Student x : studentArray ) {
    x.marks = s.nextInt(); // s is a Scanner object
}
	  
	  */

	
	
	
	
	
	}

}


// our methods should be of return type in order to achieve its functionality 
//in this case 
class Liquid 
{
//Liquid class having 10 elements  which means we need to make a constructor	
	
	

public  int Add(int a)
{
  
	
	 return 	a=a+1;
	
}

public int remove(int b) 

{
	
	return b= b-1;
}

public int removeAll(int a) 

{
	return a=a*0;
}


}

// we implemented our interface here 
class  Coffee  extends Liquid implements Swriller
{
	public int Add(int a)
	{
		return 	a=a+1;
	}

	public int remove(int a) 

	{
		return a= a-2;
	}

	public int removeAll(int a) 

	{
		return a=a*0;
	}
	
	
	
	// here i implemented the method which i described in interface
	public String Swirl()
	{
		
	return	"Swirling coffee";
	}
	
}


// interface created  for Swirl method 
interface Swriller
{
	public String Swirl();
}


class Milk extends Liquid
{
	public int Add(int a)
	{
		return 	a=a+1;
	}

	public int remove(int a) 

	{
		return a= a-2;
	}

	public int removeAll(int a) 

	{
		return a=a*0;
	}
}
