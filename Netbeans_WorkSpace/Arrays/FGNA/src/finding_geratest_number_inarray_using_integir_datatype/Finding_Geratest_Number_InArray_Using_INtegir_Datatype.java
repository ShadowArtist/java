/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finding_geratest_number_inarray_using_integir_datatype;

/**
 *
 * @author RehanUsmani
 */
import java.util.Scanner;

public class Finding_Geratest_Number_InArray_Using_INtegir_Datatype {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    
    Scanner input=new Scanner(System.in);
    
    
    System.out.println(" these are the numbers in array chose Grateset Number From It");
        
        
        
        System.out.println(" 12,43,56,87,12,556,85 ");
        
        
    //Change the Index Value Of Array 5 to assign your maximum number 
    
        int Random_numbers[]={ 12 , 43 , 56 , 87 , 12 , 556 , 85 };
        
    System.out.println();
    
    int Entered_number=input.nextInt();
    
    
    if(Entered_number  ==  (Random_numbers[5])    ){
        
        System.out.println(" You Got Your maximum Number which is : "+Entered_number);
        }
    
    
    
    
    
     else if(Entered_number != (Random_numbers[5])   ){
        System.out.println(" Boy Try harder and learn Counting ");
        }
    
    
    
    
    }
    
}
