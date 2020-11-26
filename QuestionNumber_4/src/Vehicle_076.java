
public class Vehicle_076 {

	
//	We are taking String because we are not performing any calculation		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		
		String Make="  1990  ";
		
		String Model=" ght-908 ";
		
		
		
		Truck_076 truckKaInstanceVariable= new Truck_076();
		
		
		
//		Showing the thing Truck can access because of its child behaviour it will inherit the properties of its parent class
		System.out.println(truckKaInstanceVariable.Loading_capacity);
		
		
		System.out.println(truckKaInstanceVariable.price);
		
		
		System.out.println(truckKaInstanceVariable.seating_capacity);
		
		
		
		
		
//		Car behavuiour
		
		car_076 obj1= new car_076();
		
		System.out.println(obj1.price);
		System.out.println(obj1.seating_capacity);
	
		
		//  Bike Behaviour
		
		bike_076 obj2 = new bike_076();
		
		System.out.println(obj2.Engine_capacity_in_cc);
		
		
	}

}


class car_076 extends Vehicle_076{
	
	
	String seating_capacity="23";
	String price="12312";
}



class Truck_076 extends car_076{
	
 String Loading_capacity=" 1654";
}




class bike_076 extends Vehicle_076{
	
	String Engine_capacity_in_cc=" 1231 ";
	
	
}