import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class ResultWindow{
// in progress
	public static JFrame frame;
	public  JTextField Output;


        CCTester ccTester;

//String a=Output.getText().toString(); 




	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResultWindow window = new ResultWindow();
					
					
					
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
	
	//this thing over here is constructor
	public ResultWindow() {
		initialize();
	}
	
	
	
	
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Output = new JTextField();
		Output.setBounds(158, 119, 86, 20);
		frame.getContentPane().add(Output);
		Output.setColumns(10);
		
		
//		if(textOperandSelector.getText().toString().equals("+"))
//		{}
		
	//	Output.setText(    String.valueOf(  Add(input1, input2)     ));
			
			
		
		
	//	Output.setText(textResult.getText());
		

		//Output.setText(textResult.getText());
		
//	String a=	ccTester.textResult.getText();
//	
//	Output.setText(a);
	}

}
