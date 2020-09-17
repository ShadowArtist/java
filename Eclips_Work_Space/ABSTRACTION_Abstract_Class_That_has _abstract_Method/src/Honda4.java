
abstract class Bike
{
	abstract void run();
}



public class Honda4 extends Bike{
	
	
	// main method sa bahir aur class k ander method ko initialize krain ga 
	
	
	// ASAL WEJHA YA HA K METHOD K ANDER METHOD INITIALIZE NAI HOTA 
	
	
	void run() {
		// YA DR ASAL METHOD KE FUNCTIONALITY LIKHE HUE HA 
		System.out.println("Bike is runnung");
		}
	
	
	
	
	// MAIN METHOD BHE TO AIK TAREKA KA METHOD HE TO HA , TO AUS K ANDER MAIN METHOD  KE FUNCTIONALITY KU LIKHAIN GA 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

// daikho ais ka ander over riding ho rahe ha ku ka abstract class ka apna object nai bnta 
		
		// hum abstract class ko instantiate nahe kra skata 
		//tbhe hum over riding perform kr reha hain 
		// bike ke class ko call krwa k aus k child ko call kr wa reha hain jis pa huma parent ke functionality perform kr wane ha 
		 Bike obj = new Honda4();

		 obj.run();
		
	}

}
