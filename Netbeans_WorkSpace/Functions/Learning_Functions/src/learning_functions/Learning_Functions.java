/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning_functions;

/**
 *
 * @author RehanUsmani
 */
public class Learning_Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
               leapyear();
               evenodd();
    }
  
    
    
    
    
    
    public static void leapyear(){
    
    int a=2014;
    if(a%4==0){
    
    System.out.println(" Leapyear ");
    }
    
    
    System.out.println(" leap year is being called");
    }
    
    
    
    public static void evenodd(){
    
      int a=4;  
    
      if(a%2==0){
      System.out.println("  ");
      }
    
      else{
          System.out.println(" ");
      }
      
      System.out.println(" even odd is being called ");
      
      
    }
    
    
    
    
    
    
    
    
}
