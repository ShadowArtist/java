// allows us to perform a single action in different ways.

//action = method


class Human

{
	
void pick_apple() 
{
	
System.out.println(" picking apple ");
	
}

	
}


class Right_hand extends Human
{

	void pick_apple() 
	{
		System.out.println(" picking apple from Right hand ");
	}

}


class Left_hand extends Human
{
	
void pick_apple() 
{
	
System.out.println("picking apple from left hand  ");
	
}

}








public class Explanaing_Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Human use_hand = new Left_hand(); // runtime polymorphism , by doing this te expected output will come on runtime
		
		use_hand.pick_apple();
		
		
		Human use_hand_ = new Right_hand();
		
		use_hand_.pick_apple();
		
	}

}
