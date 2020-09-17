import java.util.Scanner;
//gude taken from 
//http://www.programmingunit.com/2013/07/23/java-program-to-calculate-salary-of-an-employee/
abstract class Person{
	
	Scanner input = new Scanner(System.in);
	
	private String FirstName;
	private String LastName;
	private String Age;
	
	public abstract  String toString();
	
	
	
	
	//private fields ko public methods sa acces krte hain ya encapsulation kehlate ha
	
	public void setAge(String age) {
		Age = age;
	}
	
	
	public String getAge() {
		return Age;
	}
	
	
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	
	
	
	
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	
	public String getLastName() {
		return LastName;
	}
	
	
	
	
	
	
	
	
	
	
}


interface Payable{
	double  getPayment();
}



// both classes inherit from abstract class person 

//which means Person is the parent class of Staff and Student



class Staff extends Person implements Payable{
	//ku ka mena Payble double main lia ha tbhe aisa duble main lia ha yehan pa Payable to salary he hote ha

	
	double Salary;  // it represents the monthly salary	

	

	@Override
	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		super.setFirstName(firstName);
	}
	
	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return super.getFirstName();
	}
	
	
	
	
	
	@Override
	public void setLastName(String lastName) {
		// TODO Auto-generated method stub
		super.setLastName(lastName);
	}
	
	
	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return super.getLastName();
	}
	
	
	
	@Override
	public void setAge(String age) {
		// TODO Auto-generated method stub
		super.setAge(age);
	}
	
	
	@Override
	public String getAge() {
		// TODO Auto-generated method stub
		return super.getAge();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		
		
		
		
		
		System.out.println("please input you salary");
		
		
		
		double annualSalary;
		
		System.out.println("input salary");
		
		Scanner input = new Scanner(System.in);
		
		Salary=input.nextDouble();
		
		annualSalary=Salary*12;
		
		
		
		return annualSalary;
	}
	
	
	
	@Override
	public String toString() {
		
		
		String concatValues= getFirstName()+" , "+getLastName()+" , "+getAge()+" , " + getPayment();
		
		
		return concatValues;
	}
}




class Student  extends Person{

	 
	@Override
	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		super.setFirstName(firstName);
	}
	
	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return super.getFirstName();
	}
	
	
	
	
	
	@Override
	public void setLastName(String lastName) {
		// TODO Auto-generated method stub
		super.setLastName(lastName);
	}
	
	
	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return super.getLastName();
	}
	
	
	
	
	@Override
	public void setAge(String age) {
		// TODO Auto-generated method stub
		super.setAge(age);
	}
	
	
	
	@Override
	public String getAge() {
		// TODO Auto-generated method stub
		return super.getAge();
	}
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		
		String concatValues= getFirstName()+" , "+getLastName() + " , "+getAge()  ;
		
		return concatValues;
	}
	
	
	
}







public class OOP_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		

		
		//student work
		System.out.println("input student first name");
		
		String studentFirstname=input.next();
		
		System.out.println("input student last name ");
		
		String studentLastName=input.next();
		
        
		System.out.println("input student age");
		
		String studentAge=input.next();
		
		
		
		
		Student student = new Student();
		
		student.setFirstName(studentFirstname);
		
		student.setLastName(studentLastName);
		
		student.setAge(studentAge);

		
		
		System.out.println(   student.toString()   );
		
		
		
		
		
	//Staff  work starts from here	
		
		
		
		System.out.println(" Working For Staff  ");
		
		System.out.println();
		
		System.out.println("input staff first name");
		String staffFirstName=input.next();
		
		
		
		System.out.println("input staff last name");
		String staffLastName=input.next();
		
		
		System.out.println("input staff age");
		String staffAge=input.next();
		
		
		
		
		
		
		
		
		Staff staff = new Staff();
		
		staff.setFirstName(staffFirstName);
		
		staff.setLastName(staffLastName);
		
		staff.setAge(staffAge);
		
		
		
		
		System.out.println(   staff.toString()   );
		
		
		
		

	}

}
