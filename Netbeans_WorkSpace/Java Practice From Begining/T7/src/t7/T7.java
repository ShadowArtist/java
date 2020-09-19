/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7;

/**
 *
 * @author RehanUsmani
 */
public class T7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//using if else if ladder        
// Taking percentage of 5 marks and assining them grades 
    
      float Total_Max_Marks_For_Each_Subject=50;
        
        
        float sub1=50;// change these valuse to see different results
        float percentage_of_sub1=(sub1*100)/Total_Max_Marks_For_Each_Subject;
        
        
        float sub2=50;// change these valuse to see different results
        float percentage_of_sub2=(sub2*100)/Total_Max_Marks_For_Each_Subject;
        
        
        float sub3=50;// change these valuse to see different results
        float percentage_of_sub3=(sub3*100)/Total_Max_Marks_For_Each_Subject;
        
        
        float sub4=50;// change these valuse to see different results
        float percentage_of_sub4=(sub4*100)/Total_Max_Marks_For_Each_Subject;
        
        
        float sub5=45;// change these valuse to see different results
        float percentage_of_sub5=(sub5*100)/Total_Max_Marks_For_Each_Subject;
        
        
        
        
        float Total_Obtain_Marks_Of_All_Subjects=(sub1+sub2+sub3+sub4+sub5);
        float Total_Max_Marks=250; //we assigned total of 50 marks for each subject so the total for each will be 250
        
        float Total_Percentage_Of_All_Subjects=(Total_Obtain_Marks_Of_All_Subjects*100)/Total_Max_Marks;
        
        
        System.out.println("Subject 1 percentage  = "+percentage_of_sub1);
        System.out.println("Subject 2 percentage  = "+percentage_of_sub2);
        System.out.println("Subject 3 percentage  = "+percentage_of_sub3);
        System.out.println("Subject 4 percentage  = "+percentage_of_sub4);
        System.out.println("Subject 5 percentage  = "+percentage_of_sub5);
        
        System.out.println("Total percentage Of Subjects = "+Total_Percentage_Of_All_Subjects);
        
        
        if(Total_Percentage_Of_All_Subjects >=80 && Total_Percentage_Of_All_Subjects<=100){
        System.out.println("Your Grade is A+");
        
        }
        
        else if(Total_Percentage_Of_All_Subjects >=70 && Total_Percentage_Of_All_Subjects<=79){
        System.out.println("Your Grade is A");
        }
        
        else if(Total_Percentage_Of_All_Subjects>=60 && Total_Percentage_Of_All_Subjects<=69){
        System.out.println("Your Grade is B");
        }
        
        else if(Total_Percentage_Of_All_Subjects>=50 && Total_Percentage_Of_All_Subjects<=59){
        System.out.println("Your Grade is C");
        }
        
        
        
        
        
        else{
             System.out.println("Sorry we dont accept this percentage level");
        }
        
        
    
    }
    
}
