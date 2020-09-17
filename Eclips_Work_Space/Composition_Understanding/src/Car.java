
public class Car {

	/*
	 
	 Engine over here is a class 
	 
	 */
	
	
	/*
	  
	 yehan pa hum na ENGINE ke class ka ka aik object bnayia
	 
	 jis ka object variable ha "engine" k nam sa  ,,,,,,,
	  ENGINE ke class ko constant rekha ,,,,,
	  car k constructor k ander aisa initialize kr waya
	  */
	private final ENGINE engine;
	
	 public Car() 
	{
		engine = new ENGINE();
	}
	
}

// pehla engine ke aik class bnaye 
class ENGINE{
	
	private String type;
}