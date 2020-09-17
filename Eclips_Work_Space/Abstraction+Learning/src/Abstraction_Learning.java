
public class Abstraction_Learning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Bike obj = new Bike ();   <--- as you can see we can not make objects of abstract class
		
	//	here we did over riding , over riding is run time poly morphism 
		Bike obj = new Honda();
		
		obj.run();
		
		
		/*
		// parent class ka method aur aus ke apne class ka method aye ga
		Honda obj1 = new Honda();
		
		obj1.run();
		
		
		
		obj1.startgear();
		
		
		
		// ais main apne class ka method run ho ga aur parent class ka method run ho ga 
		
		// likan aidher run ka method main kuch aur define ka ha to jo define kia ha wo he aye ga 
		Bike obj2 = new bike2();
	
		obj2.run(); */
	}

}



// parent abstract
abstract class Bike{
/*	 void startgear() {System.out.println("Gears started");} */
	
	abstract void run();
	
	
}



class Honda extends  Bike
{
	//implements Bike.run
void run() {System.out.println("running saftely");}
}



/*

class bike2 extends Bike
{
void run() { System.out.println( "bike 2 started");}	

} */