import java.util.Scanner;

public class THINGS_TESTER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);

String answer="";
	
int N = input.nextInt();

/*

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of  6 to 20 , print Weird
If n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

*/


if(N%2!=0)
{
    answer="Weird";
}
else if(N%2==0)
{
answer =  "Not Weird";
}
else if (  N >=2 || N <=5 && N>20 )
{
          answer =  "Not Weird";

}
else if(   N>=6 || N <=20    )
{
     answer = " Weird";
}

System.out.println(answer);



/*
double d = input.nextDouble();
input.nextLine();
String s = input.nextLine();
// Write your code here.

System.out.println("String: " + s);
System.out.println("Double: " + d);
System.out.println("Int: " + i);
	*/
	}

}
