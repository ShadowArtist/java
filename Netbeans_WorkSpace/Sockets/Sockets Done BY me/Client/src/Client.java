import java.io.*;
import java.net.*;
//ArrayList is a class in utility liabrary 
import java.util.*;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		client c = new client("127.0.0.1", 2000);
		
		
		
	}

}



class client

{
	private Socket socket =         null;
	
	private DataInputStream input = null;
	
	private DataOutputStream out =  null;


	
	public client(String address ,int port) 
	
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