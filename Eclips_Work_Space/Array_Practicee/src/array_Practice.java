import java.util.Scanner;


public class array_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter 5 numbers because it the array length");
		
		
		
		int Numbers [];  // datatype of integer array created in variable name Numbers
		
		Numbers = new int [ /*this is the length of array defined*/     5];
		
		
		
		// if i am using Numbers .length is going on infinite length
		
		
		for(int i=0 ; i<Numbers.length;i++) {
			
			
			// take the input untill lenght becomes low than box of values
			
			
			
			Numbers[i]=input.nextInt();
		}
		
		
		
		
		int temp;
		// dubara index values read krna shru kro
		for(int i =0 ;i < Numbers.length ;i++ ) {
			
			// likan ais bar compare krna pra ga huma agle value sa
			// agle value tk jana k lia hum (1) add kr wain ga 
			//index value main taka aik value aga jump ho
			// ku ka add ka mtlab aik value aga jump ho
			// substract ka mtlab aik value pecha jump ho
			//multiply ka matlab 2 value aga jump ho
			//devide ka mtlab 2 value pecha jump ho
			
			//Values_Created_For_Arrays= Numbers.length();
			
			// jumping at every first step
			for(int j= i+1 ; j < Numbers.length ;j++ ) {
				
				// jub tum ais loop ka andar ao to condition check 
				//kro wo condition ager true ha to action perform 
				//kero
				
				// comparing Array index values
				
				//check and move the number started
				//if value at index i is grater than value at index j
				// if so move the value 
				if(Numbers[i]>Numbers[j]) {
					//temporary value k ander store krdo 
					// jo bhe value ha aus waqt array k index ka
					//aupar
					temp = Numbers[i];
					
					// index i pa jo value the ausa swap
					//krdo index j pa jo value ha aus sa 
					Numbers[i]=Numbers[j];
					
					
					//index j pa jo value ha ausa brabr krdo temp ka
					//temp na jo index i  ke value store ke aus ka
					
					Numbers[j]=temp;
					
				}
				
				
				
			}
			
			

			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

		
		
		System.out.println(" Sorted Array ");
		// -1 sa ab reverse jump kr ke pecha sa  check kro
		
		// ya nai kro ga to Exception aye ga
		//java.lang.ArrayIndexOutOfBoundsException: 4
		
		for(int i=0 ;i <Numbers.length  -1 ;i++ ) {
			System.out.print(Numbers[i] + " , ");
		}
		System.out.print(Numbers[Numbers.length -1]);
		
		
		
		
		
}}
