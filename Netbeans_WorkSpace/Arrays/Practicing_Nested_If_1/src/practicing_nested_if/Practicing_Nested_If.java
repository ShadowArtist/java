/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicing_nested_if;
import java.util.Scanner;
/**
 *
 * @author RehanUsmani
 */
public class Practicing_Nested_If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner input=new Scanner(System.in);
    
    
  //country done
    
    //province done
    
  //city done
    
  //adress done
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
      String country_name="pakistan";
    System.out.println("What is your country name  ?");
    String country_name_entered=input.next();
    if(country_name.equals(country_name_entered)   )
    // main if condition body
    {
    
        System.out.println("you entered in country ");
        
        
        
        
        
        
        
        
        //if upward condition is right enter province body
        
        String province_name="sindh";
    System.out.println("What is your province name  ?");
    String province_name_entered=input.next();
        if(province_name.equals(province_name_entered)  ){
        
        System.out.println("you entered in province ");
        
        
        
        
        
        
        
        
        
        
          String city_name="karachi";
    System.out.println("What is your city name  ?");
    String city_name_entered=input.next();
        //if upward condition is right enter city body
        if(city_name.equals(city_name_entered)   ){
        System.out.println("you entered in city");
        
        
        
        
        
        
        
        
        
        String adress="defence phase b";
    System.out.println(" type location to track  ?");
    String adress_entered=input.next();
        //if upward condition is right enter adress body
        if(adress.equals(adress_entered)   ){
        System.out.println("you entered on your location");
        
        
        
        
        }  // pta nai  ku adress pa loop exit ke statement sat likhe hue a rahe ha 
        
        
        }else{System.out.println("Loop exit wrong city ");}
        
        }else{System.out.println("loop exit wrong province ");}
        
        
        
        
    }
    else{
    System.out.println("something up might be wrong ");
    }
   
    
    
    
    
    }
    
}
