/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finding_gratest_number_inarray;

/**
 *
 * @author RehanUsmani
 */


import java.util.Scanner;

public class Finding_Gratest_NUmber_InArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner input=new Scanner(System.in);
        
        
        System.out.println(" these are the numbers in array chose Grateset Number From It");
        
        
        
        System.out.println(" 12,43,56,87,12,556,85 ");
        
        
        
        //Change the Index Value Of Array 5 to assign your maximum number  
        
        
        String Random_numbers[]={" 12 "," 43 "," 56 "," 87 "," 12 "," 556 "," 85 "};
        
        System.out.println();
        
        String Entered_number=input.next();
        
        
        //variable1==variable2 >>>>> IN SRTING IT WOULD BE WRITTEN AS >>> variable1.equals(variable2)
        
        if(Entered_number.equals (    (Random_numbers[5]) )   ){
        
        System.out.println(" You Got Your maximum Number which is : "+Entered_number);
        }
        
        /*
        Just taken the guide for Not Equals from Quora
        
        The String class uses a method called equals(String str2) to compare one string to another.
The method returns true if the strings compared are equal and false otherwise.

To negate the result, just put an exclamationmark in front of the statement.

String str1 = "hi";
String str2 = "bye";
boolean notEqual = !str1.equals(str2);

would generate the value true to be put in the variable notEqual although the strings are not equal.
        
        
        */
        
        
        
        //variable1!=variable2 >>>>> IN SRTING IT WOULD BE WRITTEN AS >>> !variable1.equals(variable2)
        
        else if(!Entered_number.equals (Random_numbers[5])   ){
        System.out.println(" Boy Try harder and learn Counting ");
        }
        
        
        
    }
    
}
