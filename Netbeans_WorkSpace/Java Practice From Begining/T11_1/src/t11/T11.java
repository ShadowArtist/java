/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t11;

/**
 *
 * @author RehanUsmani
 */
public class T11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Switch case
        //finding even Odd
        
        
        
        int a=28;
        
        switch(a%2) // we can apply formula in the round brackets of switch case
        {
            case 0: // if the output is zero number is even
                System.out.println("This Number is Even");
                break;
                
            case 1: //if the output is one number is odd
                System.out.println("This Number is odd");
        break;
        
            default:
                System.out.println("NOt in this case");
        break;
        
        }
    }
    
}
