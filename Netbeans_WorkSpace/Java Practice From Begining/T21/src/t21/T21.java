/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t21;

/**
 *
 * @author RehanUsmani
 */
public class T21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // While Loop
        //finding factorial of 5
        //we initialize the data type first in while loop, then condition in while round brackets then 
        //increment or decrement in the end
        
        int i=1;
        int fact=1;
        int number=5;//change the number here of which you want to take factorial of .
        
        
        while(i<=number)
        {
        fact=fact*i;
        i++;
        
        }
        //we are printing the factorials over here because in the loop body it will itirate the statement
        System.out.println("Taking factorial of number : "+number);
    System.out.println(" Factorial of the number you had taken   is : "+fact);
        
    }
    
}
