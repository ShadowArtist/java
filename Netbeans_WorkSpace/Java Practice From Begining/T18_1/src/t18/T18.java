/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t18;

/**
 *
 * @author RehanUsmani
 */
public class T18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // For Loop
        //finding how many leap year came from your date of birth uptill now not year,only counting
        
        
        int count=0;
        for(int a=1997;a<=2019;a++){
        
        if(a%4==0){
        
        count++;
        
        }
            
        }
        
        System.out.println("Times the Leap Year came from birth date uptill now are "+count);
    }
    
}
