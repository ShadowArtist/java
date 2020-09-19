/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysmorepractice;
import java.util.Scanner;
/**
 *
 * @author RehanUsmani
 */
public class ArraysMorePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        
        Scanner input = new Scanner(System.in);
        
    int random_numbers[];
    random_numbers=new int[5];
    System.out.println(" Enter 5 Random Numbers  in array");
    
    random_numbers[0]=input.nextInt(); // if i put 1
    random_numbers[1]=input.nextInt(); // if i put 2
    random_numbers[2]=input.nextInt(); // if i put 3
    random_numbers[3]=input.nextInt(); // if i put 4
    random_numbers[4]=input.nextInt(); // if i put 5
 
    
    //maximum value will be checked from index zero of   (random numbers[] )<<this is the array which we created
    
    int maximum_value=random_numbers[0];
    
    //start looping from zero till lessthan the total length of random numbers ,increment untill the condition is false
    for(int i=0;i<random_numbers.length;i++){
    
 /*while looping check the condition if the maximum number in the array that you entered is grater than every number 
 present in the array that you entered.  than assign that grater value as maximum value */
        if(random_numbers[i] > maximum_value )
        {
        

            maximum_value=random_numbers[i];
        }
        
        
        //then print that maximum value
    }
    System.out.println( "Gratest Number in Array Is : " +maximum_value);
    
    
    
    
    }
    
}
