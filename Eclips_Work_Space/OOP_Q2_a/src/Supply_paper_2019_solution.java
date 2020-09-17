/*
 taken from : https://programmingpot.com/
 Ternary Operator
The conditional operator or ternary operator ?: is shorthand for if-then-else statement. 
The syntax of conditional operator is:
•	variable = Expression ? expression1 : expression2
Here’s how it works.
•	If the Expression is true, expression1 is assigned to variable.
•	If the Expression is false, expression2 is assigned to variable.
________________________________________
Example 9: Ternary Operator
•	class ConditionalOperator {
•	public static void main(String[] args) {
•	
•	int februaryDays = 29;
•	String result;
•	
•	result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
•	System.out.println(result);
•	}
•	}
When you run the program, the output will be:
•	Leap year
*/
public class Supply_paper_2019_solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int februaryDays =29;
		String result;
		 result = (  februaryDays==28) ? "Not a leap year"
		 : " Leapyear";
		 System.out.println(result);
		 
		
	}

}





