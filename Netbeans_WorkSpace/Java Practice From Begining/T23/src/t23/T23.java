/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t23;
import java.util.Scanner;
/**
 *
 * @author RehanUsmani
 */
public class T23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner Class
        //Printing number by defining its starting point and ending point
        
        
        Scanner input=new Scanner(System.in);
        
        
        int start_point=input.nextInt();
        int end_point=input.nextInt();
        
        //we can call any value in (i) of integir type from above because our data type is integir.
        
        //to print anything in reverse order 
        //starting point becoming ending point, ending point become starting point,
        //less than becomes grater than ,increment is changed by decrement
        
        
        //Printing in Reverse Order Logic= for(int i=end_point;i>=start_point;i--);
        
        for(int i=start_point;i<=end_point;i++)
        {
        System.out.println("numbers : "+i);
        
        }
    }
    
}
