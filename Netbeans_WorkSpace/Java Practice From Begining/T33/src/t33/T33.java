/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t33;

/**
 *
 * @author RehanUsmani
 */
public class T33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Nested For Loop
        //Calling index values of Row In Column Body 
        // we are using print to print it horizontially 
        // we use println to print vertically
        
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
            System.out.print(" "+i+"  ");
            
            }
            //we are using it to print in new line
            System.out.println();
        }
        
        
    }
    
}
