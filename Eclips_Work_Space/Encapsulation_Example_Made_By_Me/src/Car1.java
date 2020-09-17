
public class Car1 {

	
	private String Wheels;
	private String Doors;
	private String Seats;
	private String Engine;
	
	
    
	
	public void attachWheels() 
	{
		Wheels="Wheels are attached";
		System.out.println(Wheels);
	}
	
	public void attachDoors() 
	{
		
		Doors="Doors are attached";
		System.out.println(Doors);
	}
	
	public void attachSeats() 
	{
		Seats="Seats are attached";
		System.out.println(Seats);
	}
	
	public void startEngine() 
	{
		
		Engine= "Engine Started";
		System.out.println(Engine);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Car1 build = new Car1();
		
		build.attachDoors();
		build.attachWheels();
		build.attachSeats();
		build.startEngine();
		
		
	}

}




/*

class Car2 {
	Car1 a = new Car1();

	
	a. // bhai tumhain access kia krna ha ais class main to kuch pra hua he nai ha jo pra ha wo Car 1 main pra ha
}


*/