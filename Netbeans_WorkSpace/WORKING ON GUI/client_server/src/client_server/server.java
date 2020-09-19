/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client_server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author RehanUsmani
 */
public class server {
        public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

	
		
		
		ServerSocket serversocket = new ServerSocket(9999); 
		
		Socket s = serversocket.accept(); 
		
	
	
	
		System.out.println("client connected ");
		
		
		InputStreamReader in = new InputStreamReader(s.getInputStream());
		
		
		BufferedReader bf = new BufferedReader(in);
		
		String str =bf.readLine();
		System.out.println(" client : "+str);
		
	
		
		
	}
        
        
}
