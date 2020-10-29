
public class Array_Swapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cars[]= {1,2,3};
//		you should fill temp with some thing in order to replace values
		int temp[]= {0,0,0};
		
		int bikes[]= {4,5,6};
		
		

	
//  \n -> it creates a new line  



//	cars[j]=temp[];	
	
	System.out.println( "cars element \n" +cars[0]+"\n"+cars[1]+"\n"+cars[2]);
	System.out.println();
	System.out.println( "bikes element \n" +bikes[0]+"\n"+bikes[1]+"\n"+bikes[2]);

	
	
//Values going in temp
	System.out.println("\n \n Values Going In Temp");
	
	
temp[0]=cars[0];
temp[1]=cars[1];
temp[2]=cars[2];

System.out.println("Car Values Dropped in Temp  \n"+  temp[0]+"\n"+temp[1]+"\n"+temp[2]);
	




System.out.println("\n\n Bike Values Going in car");
cars[0]=bikes[0];
cars[1]=bikes[1];
cars[2]=bikes[2];


System.out.println("Bike Values Dropped in car \n"+cars[0]+"\n"+cars[1]+"\n"+cars[2]);



System.out.println();

System.out.println("Temp Values which had come from car is dropping in bikes \n");

bikes[0]=temp[0];
bikes[1]=temp[1];
bikes[2]=temp[2];

System.out.println("Temp values going in bike \n"+ bikes[0]+"\n"+bikes[1]+"\n"+bikes[2]);
		
	}
	

	

		
	}


