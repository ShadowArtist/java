import java.util.Scanner ;

import javax.sql.rowset.spi.SyncFactory;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*over here in object creation there are two consructor 
		 * one is of default which we created in class 
		 * second is of parameterized constructor */
		
		
		
		
		/*if  i remove the default constructor which i had made in the class the object will give me error 
		 *   that parameter/ parameters are  missing   
		 *   because only one constructor will be left which is of parameterized      */
		
		
		/*like as methods their are two two type of constructors parameterized and
		 *  non parameterized constructors */
		
		
		
		
		/*like we have Scanner object in that 
		 * 
		 * Scanner input = new Scanner(System.in);
		 * 
		 * 
		 * Scanner(System.in) <--- This is a constructor in the scanner class 
		 * */
		
		/*
		 * if you try to do over riding here it will not work 
		 * 
		 * the thing that only works here is over loading 
		 * 
		 * 
		 * the constructor of same class will be called over here due to over loading 
		 * 
		 * 
		 * 
		 * */
		
		// what is System.in 
		Scanner  input = new Scanner(System.in); // all the  constructors present in the Scanner class will come over here 
		
		
		/* two constructors are working over here default one and parameterized one that we created */
		/*over loading performed */
		
		
		
		/*dude remember when you are practicing constructor create an empty class then create its object 
		 * then come to class and start playing with constructor 
		 * */
		
		a obj1 = new a(10); 
		
		obj1.display();
	
	}

}



class a{
	
	/*the amazing thing over here is overloading is being performed
	 * first we have a default constructor 
	 * second we have a parameterized constructor  */
	
	
// instance variables objects ka lia he hota hain 
/* instance variables are for objects */	int id;// current class instance variable declared here but not inatialized
	
	
	// this is a constructor  
	a(){
		System.out.println("inside default constructor");
	}
	
	
	
	// this is a prameterized constructor 
	
	a(int id) // here we had made a parameterized constructor 
	{
	
		// this keyword  refers to object variable 
	// this key word is use to refer the current class instance variable
		// akela this object ko refer kerta ha 
		
		// ager this.id   <-- ya likhta hu to wo refer kera ga instance variable ko 
	
		// ager instance variable ka name aur local variable ka name same ho to huma this lgana perta ha 
		this.id=id;
	
	}
	
	
	
	
	void display() {
		System.out.println(id);
		}
	
	
	
}




