
public class COUNTING_PROGRAM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		//initialize your value in counter from where you want to start counting 
		int counter=0;
		
		
		//here initialize your values till where you want to count 
		for(int i=1;i<=1000;i++) 
		{
			/*   you can also put logical conditions here like    if(){}
			 *    */
			
			//or simply count the values
			
			counter++;
		}
		
		/* make sure to print the counted values outside the ,for loop /any loop ,body .
		 * because if you do so the statement will iterate until the logic in loop becomes
		 * false 
		*/
		
		System.out.println("The counted values are : "+counter);
		
	}

}
