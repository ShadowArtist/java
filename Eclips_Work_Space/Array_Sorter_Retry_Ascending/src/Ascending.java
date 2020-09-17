import java.util.Scanner;




public class Ascending {


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
		// we are storing values that we input in a variable
		
		
		
		
		System.out.println("Enter the length for an array so it shoud store values in it ");
		
		
		int Values_Created_For_Arrays = input.nextInt();
		
		
		/* we are calling the variable(in which the values are stored) ,
		 and calling that variable in the array  
		*/
		// it defines the number of values we want in an array
		
		
		
		
		
		
		
		
		
		
		
		// you know what this type of Array creation creates a storage memory of Array 
		
		//if we will use this method (int RandomArrayNumbers[]= {Values_Created_For_Arrays};) 
		// it will never create a storage space in memory 
		
		// huma values ko access he nai krna tha blke store bhe kr wana ha .
		
		int RandomArrayNumbers[]; // array created and asigned data type to it
	
		
		
/*RandomArrayNumbers is variable of Array */		 RandomArrayNumbers = new int/*it is telling that we stored datatype of in in it*/[ /*box of integer values*/   Values_Created_For_Arrays];  // this allocates the memory
		 
		 
		 
// for more efficiency you create Arrays like this too:   int RandomArrayNumbers[] = new int[Values_Created_For_Arrays]; 		 
		 
		 
		 
		System.out.println("First You Shoud Enter Values");
		
		
		
		
		for(int i=0 ; i<Values_Created_For_Arrays;i++ ) {
			
			/* index values (jo k variable (i) k andar store hain)
			    values ko read krta reho aus waqt tak k index values 
			    less na ho gye , aur input leta reho   
			
			*/
			RandomArrayNumbers[i]=input.nextInt();
		}
		
		
		
		int temp;
		// dubara index values read krna shru kro
		for(int i =0 ;i < Values_Created_For_Arrays ;i++ ) {
			
			// likan ais bar compare krna pra ga huma agle value sa
			// agle value tk jana k lia hum (1) add kr wain ga 
			//index value main taka aik value aga jump ho
			// ku ka add ka mtlab aik value aga jump ho
			// substract ka mtlab aik value pecha jump ho
			//multiply ka matlab 2 value aga jump ho
			//devide ka mtlab 2 value pecha jump ho
			
			
			
			// jumping at every first step
			for(int j= i+1 ; j < Values_Created_For_Arrays ;j++ ) {
				
				// jub tum ais loop ka andar ao to condition check 
				//kro wo condition ager true ha to action perform 
				//kero
				
				// comparing Array index values
				
				//check and move the number started
				//if value at index i is grater than value at index j
				// if so move the value 
				if(RandomArrayNumbers[i]>RandomArrayNumbers[j]) {
					//temporary value k ander store krdo 
					// jo bhe value ha aus waqt array k index ka
					//aupar
					temp = RandomArrayNumbers[i];
					
					// index i pa jo value the ausa swap
					//krdo index j pa jo value ha aus sa 
					RandomArrayNumbers[i]=RandomArrayNumbers[j];
					
					
					//index j pa jo value ha ausa brabr krdo temp ka
					//temp na jo index i  ke value store ke aus ka
					
					RandomArrayNumbers[j]=temp;
					
				}
				
				
				
			}
			
			
		
			
			
			
			
		}
		
		System.out.println(" Sorted Array ");
		// -1 sa ab reverse jump kr ke pecha sa  check kro
		
		// ya nai kro ga to Exception aye ga
		//java.lang.ArrayIndexOutOfBoundsException: 4
		
		for(int i=0 ;i <Values_Created_For_Arrays + -1 ;i++ ) {
			System.out.print(RandomArrayNumbers[i] + " , ");
		}
		System.out.print(RandomArrayNumbers[Values_Created_For_Arrays -1]);
		
		
		
		
	}

}
