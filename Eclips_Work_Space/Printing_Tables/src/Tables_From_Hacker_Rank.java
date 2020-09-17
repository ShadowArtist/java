// PRINTING ANY TABLE

import java.util.Scanner;

public class Tables_From_Hacker_Rank {

	//over here it is global and made it static so it can be acessable from any where and we dont need to make objects again and again
	static 	Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
	
	// for simple printing table till 10 use for loop 	

		System.out.println("input number for its multiple till your defined limit ");
		
int N=input.nextInt();

System.out.println("Define your limit  till when to itirate");
int limit =input.nextInt();

System.out.println();
int result;

	
	
for(int i=1 ; i<=limit;i++) 
{
	//over here your multiplied value will be stored in result 
	//Your Number 
	result=N*i;
	

	System.out.println();
	System.out.println(N + " x "+ i +" = "+  result);	
	
	}




 



	
	}

}
