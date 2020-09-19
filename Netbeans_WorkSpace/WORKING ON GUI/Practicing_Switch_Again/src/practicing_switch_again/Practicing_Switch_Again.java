/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicing_switch_again;

/**
 *
 * @author RehanUsmani
 */

import java.util.Scanner;

public class Practicing_Switch_Again {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner input =new Scanner(System.in);
    
    int value_entered=input.nextInt();
    
    switch(value_entered %4 ){
    
        case 0:
            System.out.println("Leap Year");
            break;
            
        case 1:
            System.out.println("Not a leap year ");
            break;
        
    
    }
    
    
    
    }
    
}
