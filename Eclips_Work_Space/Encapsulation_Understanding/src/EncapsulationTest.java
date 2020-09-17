
public class EncapsulationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Encapsulation obj = new Encapsulation();
			
         obj.setEMP_AGE(12);
     	
	obj.setEMP_NAME("John");
	obj.setSSN(001);
	
	
	System.out.println("Employer Name  :" +obj.getEMP_AGE());
	
	System.out.println("Employer Age   :"+obj.getEMP_NAME());
	
	System.out.println("Employer Social Securerity Number  : "+obj.getSSN());
	
	
	
	}

}

/*

 
 Example of Encapsulation in Java
How to implement encapsulation in java:

1) Make the instance variables private so that they cannot be accessed directly from outside the class.
 You can only set and get values of these variables through the methods of the class.

2) Have getter and setter methods in the class to set and get the values of the fields.
 
  
 * */

class Encapsulation

{
	
	//cheez mojude ha likan wo implement kaisa ho rahe ha ausa hide kia hua ha hum na  
	
private int social_secuerity_number;   // car 1

private String employer_Name;         // car 2

private int employer_age;            // car3


  

/* bilkul gare ke engines ke terha sara components gare ka ander apna kamn kr reha hain aur wo sub aik he component 
  sa connected hain jo k gare ha 
  
  */

/*
 English translation
 
  let us take the example of the car ,   every component is working inside the car and they have different usages 
  
  same thing here with getters and setters  they are just like those parts in a car working together and their implementation 
  is hidden inside the car body
  
  
 * */


//making getters and setters over here to get and set the values




//car 1 , component one .
public int getSSN() {
	return social_secuerity_number;
}

// car 1 component 2

public void setSSN(int ssn) 
{
	social_secuerity_number=ssn;
	
	
}



// car 2 , component one
public String getEMP_NAME() 
{
return employer_Name;
}

// car 2 , component two.


public void setEMP_NAME(String emp_name)
{
	employer_Name=emp_name;
	 
}


// car 3 , component one
public int getEMP_AGE() 

{
	return employer_age;
}

// car 3 , component two
public void setEMP_AGE(int emp_age) 
{
	
employer_age = emp_age;
}









}
