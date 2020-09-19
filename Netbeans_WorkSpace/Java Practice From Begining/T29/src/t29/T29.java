/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t29;

/**
 *
 * @author RehanUsmani
 */
public class T29 {

    
    public static void main(String[] args) {
        // Nested For Loop
        //Printing Star Pattern easy logic
        
        
        
        for(int i=0;i<=4;i++){
       
            // here we maked row invisible because we are not calling its index values
        //nor printing any thing in it that it shows us something ,we had hidden the row
        //here we had used println so that it could print in next line and to move downwards
            System.out.println(""); 

        // we are printing stars in columns
        for(int j=1;j<=i;j++){
        
            //here we stored the star in the matrix instead of calling the index values
        System.out.print("*");
        }
             
        
        }
    }
    
}
