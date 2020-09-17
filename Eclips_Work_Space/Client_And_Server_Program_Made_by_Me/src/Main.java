//import java.io.DataInputStream;
//import java.io.DataOutputStream;
//import java.io.IOException;
//import java.net.Socket;
//import java.net.UnknownHostException;
//import java.util.ArrayList;
//import java.util.Scanner;

import java.io.*;
import java.net.*;
import java.util.*;

//client made by me
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client c = new Client("127.0.0.1", 1000);
		
	}

}


class Client{
	 private Socket socket            = null; 
	    private DataInputStream  input   = null; 
	    private DataOutputStream out     = null; 
	  
	   
	    public Client(String address, int port) 
	    { 
	      
	        try
	        { 
	            socket = new Socket(address, port); 
	            System.out.println("Connected"); 
	  
	         
	            input  = new DataInputStream(System.in); 
	  
	           
	            out    = new DataOutputStream(socket.getOutputStream()); 
	        } 
	        
	      //catching UnknownHostException
            //trying to replace it with Exception 
	        
	        //I removed catch of UnknownHostException because Exception hadles all type of Exception  ;-) 
	        
	        // main multiple catch main khale Exception nai lga skta 
	        
	        
	        
	      //catching IOException
            //trying to replace it with Exception 
	        
	        catch(Exception i) 
	        { 
	            System.out.println(i); 
	        } 
	  
	       
	        String line =""; 
	  
	        while (!line.equals("Over")) 
	        { 
	            try
	            { 
	                line = input.readLine(); 
	                
	                out.writeUTF(line); 
	            } 
	            
	          //catching IOException
                //trying to replace it with Exception 
	            
	            
	            catch(Exception i) 
	            { 
	                System.out.println(i); 
	            } 
	        } 
	  
	        
	        try
	        { 
	            input.close(); 
	            out.close(); 
	            socket.close(); 
	        } 
	        
	      //catching IOException
            //trying to replace it with Exception 
	        
	        catch(Exception i) 
	        { 
	            System.out.println(i); 
	        } 
	
	    }
}

