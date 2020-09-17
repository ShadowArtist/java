/*Annual exam result is to be conducted for 20 students for 3 subjects. Write a program to
 *  read the data and determine the following:

• Collect the exam result data for individual student.
• Calculate all the obtained marks from three subjects for each student.
• Put them in condition statement and get the grading and percentage of students.
• The Student who get clear the required condition for Division placement.

Here is the C program to Find the Percentage or marks of students. This C
 program is an example to use Control statements.
 
 
 
 
 
 #include<stdio.h>
void main()
{
         int m1,m2,m3,total;
         float per;
         clrscr();
         
         
         printf("Enter 3 Nos.");
         
         //m=marks
          * 
         scanf("%D%D%D",&m1,&m2,&m3);
         total=m1+m2+m3;
         per=total*100/300;
         if(per>=60&&per<=100)
                 printf("You are 1st :");
        else if(per>=50&&per<=60)
                 printf("You are 2nd");
        else if(per>=40&&per<=50)
                 printf("You are 3rd");
        else
                 printf("You are Fail");
        getch();
}
 
 */






import java.util.Scanner;

public class GRADES_BY_SWITCH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
	/*	
		
	int	sub_1_marks = input.nextInt();
	int	sub_2_marks = input.nextInt();
	int	sub_3_marks = input.nextInt();
	
	int total_got_marks= sub_1_marks+sub_2_marks+sub_3_marks;
	
	int percentage = (total_got_marks*100)/300;
	
	
	
	switch(percentage) {
	
	}
	*/
	
	
			

		
		
		
		System.out.println(" Enter Student name  ");
		
		String name = input.next();
		
		System.out.println("  ");
		


		System.out.println(" Enter sub 1 marks out of 100");
		int	sub_1_marks = input.nextInt();
		System.out.println(" Enter sub 2 marks out of 100");
		int	sub_2_marks = input.nextInt();
		System.out.println(" Enter sub 3 marks out of 100");
		int	sub_3_marks = input.nextInt();
		
		int total_got_marks= sub_1_marks+sub_2_marks+sub_3_marks;
		
		int percentage = (total_got_marks*100)/300;
		

		System.out.println(" percentage : "+percentage);
		
		switch(percentage) {
		
		case 91:
			System.out.println(" Grade : A-1");
			break;
		case 92:
			System.out.println(" Grade : A-1");
			break;	
		case 93:
			System.out.println(" Grade : A-1");
			break;
		case 94:
			System.out.println(" Grade : A-1");
			break;
		case 95:
			System.out.println(" Grade : A-1");
			break;
		case 96:
			System.out.println(" Grade : A-1");
			break;
		case 97:
			System.out.println(" Grade : A-1");
			break;
		case 98:
			System.out.println(" Grade : A-1");
			break;
		case 99:
			System.out.println(" Grade : A-1");
			break;
		case 100:
			System.out.println(" Grade : A-1");
			break;
		
		
			
			
		case 81:
			System.out.println(" Grade : A");
			break;	
		case 82:
			System.out.println(" Grade : A");
			break;	
			
		case 83:
			System.out.println(" Grade : A");
			break;
		case 84:
			System.out.println(" Grade : A");
			break;
		case 85:
			System.out.println(" Grade : A");
			break;
		case 86:
			System.out.println(" Grade : A");
			break;
		case 87:
			System.out.println(" Grade : A");
			break;
		case 88:
			System.out.println(" Grade : A");
			break;
		case 89:
			System.out.println(" Grade : A");
			break;	
		case 90:
			System.out.println(" Grade : A");
			break;
			
			
			
		case 71:
			System.out.println(" Grade : B");
			break;
		case 72:
			System.out.println(" Grade : B");
			break;
		case 73:
			System.out.println(" Grade : B");
			break;
		case 74:
			System.out.println(" Grade : B");
			break;
		case 75:
			System.out.println(" Grade : B");
			break;
		case 76:
			System.out.println(" Grade : B");
			break;
		case 77:
			System.out.println(" Grade : B");
			break;
		case 78:
			System.out.println(" Grade : B");
			break;
		case 79:
			System.out.println(" Grade : B");
			break;
		case 80:
			System.out.println(" Grade : B");
			break;
			
			
		case 61:
			System.out.println(" Grade : C");
			break;
		case 62:
			System.out.println(" Grade : C");
			break;
		case 63:
			System.out.println(" Grade : C");
			break;
		case 64:
			System.out.println(" Grade : C");
			break;
		case 65:
			System.out.println(" Grade : C");
			break;
		case 66:
			System.out.println(" Grade : C");
			break;
		case 67:
			System.out.println(" Grade : C");
			break;
		case 68:
			System.out.println(" Grade : C");
			break;
		case 69:
			System.out.println(" Grade : C");
			break;
		case 70 :
			System.out.println(" Grade : C");
			break;
			
		case 51:
			System.out.println(" Grade : D");
			break;
		case 52:
			System.out.println(" Grade : D");
			break;
		case 53:
			System.out.println(" Grade : D");
			break;
		case 54:
			System.out.println(" Grade : D");
			break;
		case 55:
			System.out.println(" Grade : D");
			break;
		case 56:
			System.out.println(" Grade : D");
			break;
		case 57:
			System.out.println(" Grade : D");
			break;
		case 58:
			System.out.println(" Grade : D");
			break;
		case 59:
			System.out.println(" Grade : D");
			break;
		case 60:
			System.out.println(" Grade : D");
			break;
			
		case 41:
			System.out.println(" Grade : E");
			break;
		case 42:
			System.out.println(" Grade : E");
			break;
		case 43:
			System.out.println(" Grade : E");
			break;
		case 44:
			System.out.println(" Grade : E");
			break;
		case 45:
			System.out.println(" Grade : E");
			break;
		case 46:
			System.out.println(" Grade : E");
			break;
		case 47:
			System.out.println(" Grade : E");
			break;
		case 48:
			System.out.println(" Grade : E");
			break;
		case 49:
			System.out.println(" Grade : E");
			break;
		case 50:
			System.out.println(" Grade : E");
			break;
		
			
			default:
				System.out.println(" Failed");
				
			break;
			
			
			
			
			
			
		}
		
		
		
		
	

	}
	


	
	
	







}
