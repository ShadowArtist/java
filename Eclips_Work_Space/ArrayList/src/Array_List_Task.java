import java.util.ArrayList;
import java.util.Scanner;

public class Array_List_Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		<>   <-----  Generic
		
//      < data type >	 <---- data type in it is generic datatype 	

		ArrayList </* datatype*/ String   > list /* this is the variable  of Array List */ = new ArrayList<>(); //this is the simple object that we created
		
		
		
	/* adding things in list which is variable of  Array list  */	
	
		// remember dont give spaces because its it self is a character by which it can give error
		
	list.add("ali");	  
	list.add("kamran");
	list.add("jon");
	list.add("tom");
	list.add("jery");
	list.add("ken");
	list.add("rex");
	list.add("roy");
	list.add("non");
	list.add("salman");

		
Scanner input = new Scanner(System.in);
	
	System.out.println(" Hi  enter  the name of person you want toCheck in the list  ");
	
	String name_check = input.next();
	
	// doned by contains method which is bultin 
	
	if(list.contains(name_check)   ) {
		
		System.out.println("Found!");
		
	}
	else {
		
		System.out.println("not Found!");
		
		
	}
	
		
	}

}
