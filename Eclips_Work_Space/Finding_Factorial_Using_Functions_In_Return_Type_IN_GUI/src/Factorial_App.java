import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Factorial_App {

	private JFrame frmFactorialApplication;
	private JTextField txtInputvalue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Factorial_App window = new Factorial_App();
					window.frmFactorialApplication.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Factorial_App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFactorialApplication = new JFrame();
		frmFactorialApplication.setTitle("Factorial Application");
		frmFactorialApplication.setBounds(100, 100, 238, 315);
		frmFactorialApplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFactorialApplication.getContentPane().setLayout(null);
		
		//if you want to simply define label on top  drag it in GUI on top in Components Screen 
		JLabel lblAns = new JLabel("ans");
		lblAns.setBounds(22, 215, 167, 50);
		frmFactorialApplication.getContentPane().add(lblAns);
		
		txtInputvalue = new JTextField();
		txtInputvalue.setText("input_value");
		txtInputvalue.setBounds(63, 96, 86, 20);
		frmFactorialApplication.getContentPane().add(txtInputvalue);
		txtInputvalue.setColumns(10);
		
		
		
		
		JButton btnFactorial = new JButton("factorial");
		btnFactorial.setBounds(63, 138, 89, 23);
		frmFactorialApplication.getContentPane().add(btnFactorial);
		
		JLabel lblEnterValueBetween = new JLabel("Enter Value between 1 to 170 ");
		lblEnterValueBetween.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterValueBetween.setBounds(10, 32, 252, 14);
		frmFactorialApplication.getContentPane().add(lblEnterValueBetween);
		
		
		
		
		
		btnFactorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			String input_value= txtInputvalue.getText();
			
			lblAns.setText(String.valueOf(   factorial(input_value)     )        );
			
			
			
			
			
			
			
			
			
			}
		});
		
	
	
	
	}
	
	
	// int over here is a return type
	// in factorial(parameter1,parameter2,...,parameter n ) we can give parameters
	//parameter assigning = String value_1 ,int value_2 
	
	
	
	
	/* we assigned String data type  with variable input_value as our parameter  here because if we take 
	 * integer data type  it will cause error when you will call factorial method in button section in label 
	 * because label shows you output in String*/
	public static double factorial(String input_value) {
		
		
		
		
		double converted_String_Value_to_Double =Double.parseDouble(input_value);
		
		
		double i=1;
		double fact=1;
		
	while(i<=converted_String_Value_to_Double) {
			
			
			fact = fact * i ; 
			
		    i++;
			
		}
		
		
		
		
		// jis chez sa huma output chayia ha wo return krwain ga na ?
		return fact;
		
	
	}
	
	
}
