/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

/**
 *
 * @author RehanUsmani
 */
public class Array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        // remember Array Starts from 0 index 
        // but when you will count its length it will start from 1
        
 
        String Array1[]={"Name: Rehan","Section : C","Roll Number : 138 ","Batch : 2016 "};
    
    
    
    System.out.println(Array1[0]+ "," +Array1[1]+","+Array1[2]+","+Array1[3]);
    System.out.println(Array1.length);
    
  
    System.out.println("===========================================================");
    System.out.println("working with intigers");
    
    int A[]= new int[6];
            
    A[0]=2;
            A[1]=12;
            A[2]=21;
            A[3]=13;
            A[4]=25;
            A[5]=32;
            
            //
    for( int i=0;i<A.length;i++)
    {
          
    System.out.println( " Array Value  "+A[i] +" and the total length of array " +A.length);
            
            }
    

    
  
    
    }
    
}
