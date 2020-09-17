import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;

// your 
public class carracer {

	
	
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					carracer window = new carracer();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public carracer() {
		initialize();
		 
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	}

	
	public class Racing extends JFrame
	{
		public void paint(Graphics g) 
		{
		super.paint(g);
		
		g.setColor(Color.red);
		
		g.drawRect(30, 30, 20, 20);
		}
	}
	
	
	
	
	
	
}
