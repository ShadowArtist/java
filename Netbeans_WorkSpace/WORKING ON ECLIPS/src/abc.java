import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class abc {
	// we had made Label Global here  , we put this here from bottom in label section  to here
	JLabel lblNewLabel = new JLabel("New label");
	
	
	
	
	
	
	
	
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					abc window = new abc();
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
	public abc() {
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
		
		textField = new JTextField();
		textField.setBounds(42, 103, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(250, 103, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		
		//Coding And Action Performed  here in button section
		//From here the Button Starts 
		JButton button = new JButton("+");
		button.addActionListener(   new ActionListener(  ) {
			public void actionPerformed(ActionEvent arg0) {
			
// in here we will do the coding of the button 
				
				
				
	// we had taked the input from user as String			
String value1 =textField.getText();
String value2 =textField_1.getText();

//performed the calculation on String by converting it to integir 

int value_1_converted_in_integir=Integer.parseInt(value1);
int value_2_converted_in_integir=Integer.parseInt(value2);

int sum = value_1_converted_in_integir +value_2_converted_in_integir;


//then calling value of converted string , in string 

lblNewLabel.setText(""+sum);
			
			
			
			
			
			
			}
		}  ) ;
		
		
		// here were the settings of label but we had putted label on top to make it global 
		button.setBounds(151, 102, 41, 23);
		frame.getContentPane().add(button);
		
		
		lblNewLabel.setBounds(360, 106, 46, 14);
		frame.getContentPane().add(lblNewLabel);
	}
}
