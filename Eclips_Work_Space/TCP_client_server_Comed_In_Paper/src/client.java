import java.net.*;
import java.io.*;
import java.util.*;

public class client {

	public static void main(String[] args)throws IOException 
	{
		System.out.println("------ Client ------");
		  Scanner scanner=new Scanner(System.in);
		  String content=scanner.next();
		  byte[] buff=content.getBytes();
		  DatagramPacket dp=new DatagramPacket(buff,0,buff.length,new InetSocketAddress("127.0.0.1",9999));
		  DatagramSocket ds=new DatagramSocket();
		  ds.send(dp);
		  ds.close();
          
		 
		
	}
	




}


