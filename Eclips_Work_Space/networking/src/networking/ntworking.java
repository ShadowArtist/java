/*
Commonly used methods of InetAddress class


Method	                                             Description

public static InetAddress getByName(String host)     throws UnknownHostException	it returns the instance of InetAddress containing LocalHost IP and name.
public static InetAddress getLocalHost()             throws UnknownHostException	it returns the instance of InetAdddress containing local host name and address.
public String getHostName()	                         it returns the host name of the IP address.
public String getHostAddress()	                     it returns the IP address in string format.









Java InetAddress class
Java InetAddress class represents an IP address. The java.net.InetAddress class provides methods to get the IP of any host name for example www.javatpoint.com, www.google.com, www.facebook.com, etc.

An IP address is represented by 32-bit or 128-bit unsigned number. An instance of InetAddress represents the IP address with its corresponding host name. There are two types of address types: Unicast and Multicast. The Unicast is an identifier for a single interface whereas Multicast is an identifier for a set of interfaces.

Moreover, InetAddress has a cache mechanism to store successful and unsuccessful host name resolutions.




Example of Java InetAddress class
Let's see a simple example of InetAddress class to get ip address of www.javatpoint.com website.

import java.io.*;  
import java.net.*;  
public class InetDemo{  
public static void main(String[] args){  
try{  
InetAddress ip=InetAddress.getByName("www.javatpoint.com");  
  
System.out.println("Host Name: "+ip.getHostName());  
System.out.println("IP Address: "+ip.getHostAddress());  
}catch(Exception e){System.out.println(e);}  
}  
} */










package networking;




import java.net.*;
public class ntworking {

	public static void main(String[] args) 
	throws UnknownHostException
	{
		// TODO Auto-generated method stub
	
	
			
			
		InetAddress obj1=InetAddress.getByName("cisco.com"); 
		
		
		System.out.println(obj1.getHostName());
		
		System.out.println(obj1.getHostAddress());
		
		
/*		System.out.println(obj1.getHostAddress());        
 * this code is for the person who want to find the ip address of the site */ 
	}

}
