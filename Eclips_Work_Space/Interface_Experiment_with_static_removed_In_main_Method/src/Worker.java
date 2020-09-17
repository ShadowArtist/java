

interface Contract
{

	//by default it is abstract 
	
/*abstract*/	void  closed_Home();
}


interface paper_1 extends Contract
{
	void Room_details();
}


interface paper_2 extends Contract
{
	void Swming_pool();
}






public class Worker implements     paper_1   , paper_2{

	/*khuda    k waste yehan sa static hta de gya ga
	  
	 
	  not going in static details right now  ,,, ager abhe btya to 
	  
	   apko  nai dade yad a gain ge aur smjh kuch bhe nai aye ga 
	 * */
	
	
	
	/* static lgyain ga na to ya error da ga k
	
	ap static field k ander non static chezain aistmal kr reha hain 
	
	
	*/
	public /*static*/ void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		closed_Home();
		Swming_pool();
		Room_details();
	
	}

	
	
	
	
	@Override
	public void closed_Home() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Swming_pool() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Room_details() {
		// TODO Auto-generated method stub
		
	}

}
