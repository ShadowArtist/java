/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t12;

/**
 *
 * @author RehanUsmani
 */
public class T12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Switch case
        //Leap year by Switch case
        
        int year=2028;
        
        switch(year%4){
        
            case 0:
                System.out.println("It is Leap year");
                break;
                
            case 1:
                System.out.println("It is not leap year");
                break;
                
        
            default:
                System.out.println("It can not be Leap Year by any Means");
                break;
        
                
        
        
        
        }
        
    }
    
}
