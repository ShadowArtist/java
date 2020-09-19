import java.io.*;
import java.net.*;



public class MainServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server s = new  Server(4000);
	}

}

class Server{
	
    private Socket          socket   = null; 
    private ServerSocket    server   = null; 
    private DataInputStream in       =  null; 
  
    public Server(int port) 
    { 
     
        try
        { 
            server = new ServerSocket(port); 
            System.out.println("Server started"); 
  
            System.out.println("Waiting for a client ..."); 
  
            socket = server.accept(); 
            System.out.println("Client accepted"); 
  
            in = new DataInputStream( 
                new BufferedInputStream(socket.getInputStream())); 
  
            String line = ""; 
            
            while (!line.equals("Over")) 
            { 
                try
                { 
                    line = in.readUTF(); 
                    
                    System.out.println(line); 
  
                }
                
                //catching IOException
                //trying to replace it with Exception 
                //replaced with sucess
                catch(Exception i) 
                { 
                    System.out.println(i); 
                } 
            } 
            System.out.println("Closing connection"); 
   
            socket.close(); 
            in.close(); 
        }
        
      //catching IOException
        //trying to replace it with Exception
        //replaced with sucess
        catch(Exception i) 
        { 
            System.out.println(i); 
        } 
    }
}


