import java.io.*;

import java.net.*;


//Server made by me
public class Mains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server s = new  Server(1000);
	}

}
class Server
{
	
private Socket socket = null;

private ServerSocket server = null;

private DataInputStream in =null;




public Server(int port) 

{

	try 
	{
		// server main khale port aye ga
		
		//ServerSocket object inatializing
		server = new ServerSocket(port);
		System.out.println("Server Started ");
		
		System.out.println("Wating for the client ");
		
		//initialiazing Socket object
		// their wa no need of allocating it in memory
		
		socket = server.accept();
		System.out.println("Client accepted ");
		
		//DataInputStream ka object ko inatialize kr wa reha hain 
		
		in = new DataInputStream(new BufferedInputStream(socket.getInputStream()   )   );
		
		
		String line = ""; // ya line ka ander kuch ku nai likha
		
		while(!line.equals("Over")  ) 
		
		{
			/*jesa humare paas  Scanner input = new Scanner(System.in);
			 * 
			 * hota ha aur input lena k lia  (  input.nextInt();  ya input.next(); ) leta hain
			 * 
			 * ain main input mera variable ha jis main hum value input kr ka store krwa reha hain
			 * */
			
			
			
			
			//this try catch (Exception handeling  ) is in while loop
			try {
				// server side pa read ho ga 
		line = in.readUTF();
		System.out.println(line);
			} catch (Exception e) { System.out.println(e); }
			
		
		
		
		} // here while loop ends 
		
		
		
		System.out.println("Connection closing");
		
		//socket close krna zarure ha 
		socket.close();
		//input stream close kerna bhe zarure ha 
		in.close();
			
		}catch(Exception e) {System.out.println(e);} // ya sub sa aupar wala try ka catch ha
	
















}	
}