/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t37;

/**
 *
 * @author RehanUsmani
 */
public class T37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Nested for Loop        
//Printing Rows And Columns In Triangle Pattern
  
        for(int i=0;i<=3;i++)
        {
            System.out.println("");
            for(int j=0;j<=i;j++)
            {
                System.out.print(" "+i+",");
                System.out.print(""+j+" ");
            }
        }
    }
    
}
