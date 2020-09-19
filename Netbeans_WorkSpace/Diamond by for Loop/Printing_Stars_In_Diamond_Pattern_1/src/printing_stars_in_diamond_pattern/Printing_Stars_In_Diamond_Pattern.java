/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printing_stars_in_diamond_pattern;

/**
 *
 * @author RehanUsmani
 */
public class Printing_Stars_In_Diamond_Pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        
         for(int i=1;i<=5;i++){
    
    
        //making space in row
        
//going backwards in row by going direct to index (row =4 , column =4 ) and adding space to that position
        for(int j=1;j<=5-i;j++)
    {
    System.out.print(" ");
    }

        
        //once the space is created backwards ,we are directed to that position in row 
        
        /* in the same direction in which we directed our spaces,
        here we are calling the index value of row in the respective column */
        
       for(int k=1;k<=i;k++){
    System.out.print(" "+"*");
    } 
    
    
   // here it is saying now jump on next line
    System.out.println(" ");
 
    }
    
    
    
    
    
    
      for(int a=4;a>=1;a--){
    
    
        
        for(int b=1;b<=5-a;b++)
    {
    System.out.print(" ");
    }
   
    for(int c=1;c<=a;c++){
    System.out.print(" "+"*");
    }
    
    
    System.out.println(" ");
 
    }  
      
      
    }
    
}
