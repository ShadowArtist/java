//student has a adress with weak relationship(Association) known as Aggregation

 class Address

{
String street_Num;
String city;
String state;
String country;



public Address (String s_num, String ci , String st, String co) 
{
	
street_Num=s_num;

city=ci;

state = st;

country=co;
	
	
}


}



 class Student 
{
	// Student has a address with weak relationship(association)  as  aggregation .
	
	String roll_number;
	
	String student_name;
	
	Address student_addr;
	
	/*
	 if you define an instance of class with data type    
	 
	   it will give you an error because 
	   
	   
	   
	   Multiple markers at this line
	- Syntax error on token "String", invalid 
	 Modifiers
	- Syntax error on token ")", : expected
	- Syntax error on token "String", invalid 
	 Modifiers
	  
	  */
	
	public  Student(String r_n,String st_n ,/* String */ Address s_a )
	{
		
		roll_number = r_n;
		student_name=st_n;
		student_addr= s_a;
		
		
		
	
		
		
		
		
	}
	
	
}

/*
  
  
 
String class A{}

Syntax error on token "String", } expected


*/





public class Aggregation_Test_Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Address adr = new Address("12", "karachi", "Sindh", "Pakistan");

Student stu = new Student("312", " jack", adr);



System.out.println("Student roll number  "+stu.roll_number);
System.out.println("Student Name  "+ stu.student_name);




System.out.println("Student residential address "+stu.student_addr.city);
System.out.println("Country "+stu.student_addr.country);
System.out.println("state  "+stu.student_addr.state);
System.out.println(" street num " +stu.student_addr.street_Num);

	}

}
