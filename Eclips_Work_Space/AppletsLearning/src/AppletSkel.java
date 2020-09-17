
import java.awt.*;
import java.applet.*;


/*
 <applet code="AppletSkel" width=300 height=100>
 </applet>
*/


public class AppletSkel extends Applet{

	
	//Called first
	public void init() 
	{
	//initialization	
	}
	
	
	//Also called whenever the applet is restarted
	public void start() 
	{
		//start or resume
	}
	
	//called when applet is stopped
	public void stop() 
	{
		//suspends execution
	}
	
	
	// called when applet is terminated
	public void destroy() 
	{
		//perform shutdown activities
	}
	
	//called when applets window must be restored 
	public void paint(Graphics g) 
	{
		// redisplay the contentws of the window
	}
	
}
