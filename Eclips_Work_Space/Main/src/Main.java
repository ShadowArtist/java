import java.io.*;

import java.net.*;

import java.util.*;

//client made by me
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client c = new Client("192.168.0.1", 1000);
		
	}

}


class Client 

{
	private Socket socket =         null;
	
	private DataInputStream input = null;
	
	private DataOutputStream out =  null;


	
	public Client(String address ,int port) 
	
	{
		
		try {
			
			socket = new Socket(address,port);
			System.out.println("Connected");
			
			input = new DataInputStream(System.in);
			out = new DataOutputStream(  socket.getOutputStream()  );
			
		}catch(Exception e) {System.out.println(e);} // this will catch all kinds of exception no need of using multiple catch statement
		
		
		
		
		try
        { 
            input.close(); 
            out.close(); 
            socket.close(); 
        } 
        catch(Exception e) 
        { 
            System.out.println(e); 
        } 
		
		
		
		
		
	}
	
	
	
	

}