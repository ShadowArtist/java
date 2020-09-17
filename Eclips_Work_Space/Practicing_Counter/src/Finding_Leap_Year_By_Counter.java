
public class Finding_Leap_Year_By_Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//  from 1752 leap year started << google badsah ya bat kehta hain 
			/*After 1752 we adopted the system still in use today where an additional
			 *  day is inserted in February in years wholly divisible by four, 
			 *  other than years ending in 00 with the exception of those divisible by 400 
			 *  which are still leap years (like 2000).*/
		
		int count=0;
		
		for(int i=1752 ; i<=2019;i++) {
			
			if(i % 4 ==0) {
			//if ( i ) is being devided by 4 and its answer is coming equals to zero 
				//then start counting from zero that we initialized on top 
				// and it will loop out when the condition of for loop will become false
				
				count++;	
				}
			
			
		
		}
		
		System.out.println("the leap years that come from 1752 are : " +count);
		
		
		
	}

}
