
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Shirt s = new Shirt("White",'M');
		//s.putOn();

		
		
		/*this is kind of alot if you want to create just white medium shirt
		 * instead of saying give me a shirt ill do it my self  you can say give me a white medium shirt */
		
		
		
		//s.setColor("White");
	//	s.setSize('M');
		
		System.out.println(s.color);
		System.out.println(s.size);
	
	}

}


/* construction worker makes a building , teacher builds a curriculum
 * 
 *  constructor basically makes objects*/

 class Shirt {
	
	
	Shirt(){
		System.out.println("Inside constructor , this is a default constructor,this is discarted by JVM because we created a constructor");
	}
	
	Shirt(String Newcolor , char Newsize){
		// if we wont define these color and sizes output will be null
		this.color = Newcolor;
		this.size=Newsize;
		
	}	
	
	
	
	
	
	public static String color;
	public static char size;
	
	
	
	
	public static void putOn() 
	
	{
		System.out.println("Shirt is on");
	}
	
	public static void takeOff() 
	
	{
		System.out.println("Shirt is off");
	}
	
	
	public static void setColor(String newColor) 
	{
		color = newColor;
	}

	public static void setSize(char newSize) 
	
	
	{
		size = newSize;
	}
	
	
 }