import java.net.*;
import java.io.*;
import java.util.*;


public class server {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

	
		
		
		public DNSMessage query(Question q,String host) throws IOException {
			  DNSMessage message=new DNSMessage();
			  message.setQuestions(new Question[]{q});
			  message.setRecursionDesired(true);
			  message.setId(random.nextInt());
			  byte[] buf=message.toArray();
			  DatagramSocket socket=new DatagramSocket();
			  DatagramPacket packet=new DatagramPacket(buf,buf.length,InetAddress.getByName(host),53);
			  socket.setSoTimeout(5000);
			  socket.send(packet);
			  packet=new DatagramPacket(new byte[513],513);
			  socket.receive(packet);
			  DNSMessage dnsMessage=DNSMessage.parse(packet.getData());
			  if (dnsMessage.getId() != message.getId()) {
			    return null;
			  }
			  return dnsMessage;
			}
		
	
		
		
	} 
}
