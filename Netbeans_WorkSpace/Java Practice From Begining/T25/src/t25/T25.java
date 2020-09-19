/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t25;

import java.util.Scanner;

/**
 *
 * @author RehanUsmani
 */
public class T25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Scanner and If else if ladder implemetntation 
//.equals() implementation 
//.equals() method is used because we were not getting right output when we were comparing String values in (if else if ladder)  
//we used .equals() method instead of (ch==a) because if we were doing this it was sending the output direct in else body and was not comparing the string values
// Finding Vowels by if else if ladder 
        
         Scanner input=new Scanner(System.in);
   //ch=character 
    String ch=input.next();
    
    // here we are comparing the typed string by before by stored string
    // 
    if(ch.equals("a"))
    {
    System.out.println("it is vowel");
    }
    
    else if(ch.equals("e"))
    {
    System.out.println("it is vowel");
    }
    
     else if(ch.equals("i"))
    {
    System.out.println("it is vowel");
    }
    
     else if(ch.equals("o"))
    {
    System.out.println("it is vowel");
    }
    
     else if(ch.equals("u"))
    {
    System.out.println("it is vowel");
    }
    
    else if(ch.equals("A"))
    {
    System.out.println("it is vowel");
    }
    
     else if(ch.equals("E"))
    {
    System.out.println("it is vowel");
    }
    
     else if(ch.equals("I"))
    {
    System.out.println("it is vowel");
    }
    
     else if(ch.equals("O"))
    {
    System.out.println("it is vowel");
    }
    
     else if(ch.equals("U"))
    {
    System.out.println("it is vowel");
    }
    
     else {
     System.out.println("it is consonsnt");
     }
        
        
        
        
    }
    
}
