
public class OVERLOADING_OF_METHODS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OVERLOADER obj1 = new OVERLOADER(); 
		
		System.out.println( "Sum = "+   obj1.add(2,1,2,3)   );
		
		
	}

}






//over loading ka ander zarure nai ha k ap multiple classes k ander methods bnye ya aik class ka ander 

class OVERLOADER{
	
	// keep in mind method name will be same and return type should be  of same data type of all methods 
	//but parameters data type can be different that dosen't matter
	public int add(int a ,int b) {

		
	int	sum = a+b;
	
	System.out.println(" method one called  ");
	
	return sum;
		
	}
	
	public int add(int a,int b , int c) {
		
		int sum=a+b+c;
		
		
		
		System.out.println("Method two called ");
		
		return sum;
	}
	
	
	
	public int add( int a ,int b , int c ,int d ) {
		
		int sum =a+b+c+d;
		
		
		System.out.println("Method three called ");
		
		return sum;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

