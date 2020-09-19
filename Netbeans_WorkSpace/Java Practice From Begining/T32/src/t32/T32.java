/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t32;

/**
 *
 * @author RehanUsmani
 */
public class T32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Nested For loop
        //Printing Pattern in reverse
        //Point to Remember:
        //1)we will use println after the second body of (for loop) body but it should be in 
        //the main body of for loop .
        //2)to reverse it starting point will become ending point and 
        //ending point will become starting point,less than will become graterthan,
        //increment will become decrement
        //3)we will only reverse the column here
        
        
        
        
        for(int i=1;i<=5;i++){
        
            for(int j=5;j>=i;j--){
            System.out.print("  "+j+"  ");
            }
        
        System.out.println( );
        }
    }
    
}
