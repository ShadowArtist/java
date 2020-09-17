import java.util.Scanner;
public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Scanner input = new Scanner(System.in);
		
		
		System.out.println(" enter a value of character ");
		// it is used to take values  for character at specific index 
	
		char taking_input_from_character_index = input.next().charAt(0);
		
		
		
		
		System.out.println(taking_input_from_character_index);
		
	*/
		
		BankAccount obj= new BankAccount("Rehan", " A2213");
		
		obj.showMenu();
	}

}


class BankAccount

{
int balance;
int previousTransaction;
String customerName;
String customerId;


// creating bank account constructor over here
//cname = customer name
//cid = customer id 
BankAccount(String cname , String cid)
{
	customerName = cname;
	
	customerId = cid;
	
}




// method for depositing
void deposit(int amount) 
{
if(amount !=0) 
{
balance = balance+amount;
previousTransaction = amount;
}

}

// method for widhraw
void widhraw(int amount) 
{
	
	if(amount !=0) 
	{
		balance = balance-amount;
		previousTransaction = previousTransaction-amount;
	}
	
	
}



void getPreviousTransaction() 
{
if(previousTransaction > 0) 
{
System.out.println("Deposited :" + previousTransaction);	
}

else if(previousTransaction < 0) //else main wo mujha pounchye ga he nai ager <=0 ho ga ,tbhe  < 0 dala ha ka wo mujha else ma pounchye
{
	System.out.println("Withdrawn"+Math.abs(previousTransaction) );
}

else {
	System.out.println("No transaction occoured");
}

}

void showMenu() {
	char option = '\0';
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Welcome "+customerName);
	System.out.println("Your id is"+customerId);
	System.out.println("\n");
	System.out.println("A . Check Balance");
	System.out.println("B . Deposit ");
	System.out.println("C . Widhraw");
	System.out.println("D . Previous transactions");
	System.out.println("E . Exit ");

	
	
	do {
		System.out.println("==========================================================");
		System.out.println("Enter an option");
		System.out.println("====================================");
		
		option = scanner.next().charAt(0);
		
		
		System.out.println("\n");

		switch(option) 
		{
		
		case 'A':
			System.out.println("-------------------------------------------");
			System.out.println("Balance ="+balance);
			System.out.println("-----------------------------------------");
			System.out.println("\n");
		break;
		
		
		
		case 'B':
			System.out.println("--------------------------------------------");
			System.out.println("Enter an amount to deposit : ");
			System.out.println("----------------------------------------------");
			
			int amount = scanner.nextInt();
			
			deposit(amount);
			
			
			
			System.out.println("\n");
		break;
		
		
		case 'C':
			System.out.println("------------------------------------");
			System.out.println("Enter an amount to widhraw");
			System.out.println("---------------------------------------------");
			
			int amount2= scanner.nextInt();
			widhraw(amount2);
			
			System.out.println("\n");
			break;
			
			
		case 'D':
			System.out.println("-------------------------------------------------------");
			getPreviousTransaction();
			System.out.println("\n");
			break;
			
		case 'E':
			System.out.println("===========================");
		break;
		}
		
		
	} 
	while(option !='E');
	
	System.out.println("ThankYou for using our services ");	
	
	
	
	
}







}
