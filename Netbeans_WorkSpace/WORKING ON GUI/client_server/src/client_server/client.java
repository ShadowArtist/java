/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client_server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author RehanUsmani
 */
public class client {
    
    public static void main(String[] args)throws IOException 
	{
		// TODO Auto-generated method stub

		Socket s = new Socket("locat host",9999);
		PrintWriter pr = new PrintWriter(s.getOutputStream());
		pr.println("hello");
		pr.flush();
                
                
		
		
	}
}
