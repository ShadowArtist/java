/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t34;

/**
 *
 * @author RehanUsmani
 */
public class T34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // NEsted For Loop
        //Making a Triangle Pattern 
        //here we will use 2 main for loop body ,one for upside,one for downside
        //here we are printing star pattern in triangle
        
        
        for(int i =0;i<=6;i++)
        {
            System.out.println();
       
            for(int j=1;j<=i;j++)
       {
       System.out.print("*");
       }     
            
        }
 //we are putting gap here because we need to seperate column of j from row of k
        System.out.println();
        
        
        for(int k=1;k<=5;k++)
        {
            for(int l=5;l>=k;l--)
            {
            System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
