/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t36;

/**
 *
 * @author RehanUsmani
 */
public class T36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Nested For Loop
        // Showing how index values are stored in the matrix
    // we started from ( 0 row ,0 column) and ended it in (3 row , 3 column)
    for(int i=0;i<=3;i++){
   // we used print here because we wanted the values to print in horizontal 
      System.out.print("");
    
      for(int j=0;j<=3;j++){
      // we used print here because we wanted both row and column print in horizontal pattern
      System.out.print("");
      System.out.print(" "+i+",");
      System.out.print(""+j+" ");
      
      }
    //we use println here because we wanted to move on next line
 System.out.println();
    }
    
    
    
    
    }
    
}
