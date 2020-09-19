/* Java Program Example - Find Frequency of Character */
		
import java.util.Scanner;

public class JavaProgram
{
   public static void main(String args[])
   {
        int ci, i, j, k, l=0;
        String str, str1;
        char c, ch;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a String : ");
        str=scan.nextLine();
        //i = string name ke length ha
        i=str.length();
		//your code starts from here
        for(c='A'; c<='z'; c++)
        {
            k=0;
            for(j=0; j<i; j++)
            {
                //ch is our string braker which brakes string into character by charAt() method
				ch = str.charAt(j);
                if(ch == c)
                {
                    k++;
                }
            }
            if(k>0)
            {
                System.out.println("The character " + c + " has occurred for " + k + " times");
            }
        }
   }
}
