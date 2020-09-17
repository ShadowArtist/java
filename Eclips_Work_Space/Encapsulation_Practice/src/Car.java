
class carpart


{

	
private	String Wheels ;
private String Doors;
private String Seats;
private String Engine;

// part 1
public void/* */ attachWheels() 

{
	
Wheels="wheels are attached";

System.out.println(Wheels);

	
}

//part 2
public void attachDoors() 
{
	
	Doors="doors are attached";

	System.out.println(Doors);

}







}




public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		carpart parts_attach = new carpart();
		
		
		parts_attach.attachDoors();
		
		parts_attach.attachWheels();
		
	}

}



class car2

{
	
	
public static void main (String[] args) 

{
	
	
carpart parts = new carpart();

parts.attachDoors();
parts.attachWheels();
	
	
}	
	



}

