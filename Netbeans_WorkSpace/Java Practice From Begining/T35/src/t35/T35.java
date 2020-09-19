/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t35;

/**
 *
 * @author RehanUsmani
 */
public class T35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Nested For Loop
        //Triangle Pattern
        //Printing Index Values
        
        for(int i=0;i<=5;i++)
        {
        System.out.println();
        
        for(int j=1;j<=i;j++)
        {
        System.out.print(i);
        }
        
        }
        //we used this because to avoid merging
        System.out.println();
        
        
        for(int k=4;k>=1;k--)
        {
        for(int l=1;l<=k;l++){
        System.out.print(""+k);
        }
        System.out.println();
        }
    }
    
}
