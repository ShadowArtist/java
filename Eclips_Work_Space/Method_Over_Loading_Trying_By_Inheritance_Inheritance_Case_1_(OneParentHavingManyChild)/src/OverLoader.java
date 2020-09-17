
public class OverLoader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// here it will over load from child class (OverLoaderChild1)   and parent class (OverLoaderParent)
		
		System.out.println("Sum : "+OverLoaderChild1.add(12,3,3) );     
		
		// here it will over load from child class (OverLoaderChild2)   and parent class		
		  System.out.println( " Sum : "+OverLoaderChild2.add(2, 2,1,3) );
		
		/*when i applied static in child class then i
		 was able to access child class here without creating an Object*/
	}

}

class OverLoaderParent{
	
	
	public static/*when you will apply static keyword here you will be able to access this in main class without creating an object in main class */ int add(int a, int b) {
		
		return a+b;
	}
	
	
}



class OverLoaderChild1 extends  OverLoaderParent {
	
	public static/*when you will apply static keyword here you will be able to access this in main class without creating an object in main class */ int add( int a ,int b , int c) {
		
		
		return a+b+c;
	}	
}



class OverLoaderChild2 extends OverLoaderParent{
	
	public static /*when you will apply static keyword here you will be able to access this in main class without creating an object in main class */ int add(  int a , int b , int c , int d   ) {
		
		return a+b+c+d;
	}
	
}
