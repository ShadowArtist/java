import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Efficient_Coding_Simple_Calculator {

	public JFrame frminputbuttonwithexceptionhandeling;  //make sure to convert this main class into public so that it can be accessible because we wanted it in our JOption Pane 
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField output;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Efficient_Coding_Simple_Calculator window = new Efficient_Coding_Simple_Calculator();
					window.frminputbuttonwithexceptionhandeling.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Efficient_Coding_Simple_Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frminputbuttonwithexceptionhandeling = new JFrame();
		frminputbuttonwithexceptionhandeling.setTitle("3_input_1_Button_With_Exception_Handeling");
		frminputbuttonwithexceptionhandeling.setBounds(100, 100, 411, 229);
		frminputbuttonwithexceptionhandeling.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frminputbuttonwithexceptionhandeling.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 46, 86, 20);
		frminputbuttonwithexceptionhandeling.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(148, 46, 86, 20);
		frminputbuttonwithexceptionhandeling.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(296, 46, 86, 20);
		frminputbuttonwithexceptionhandeling.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				Math whatever = new Math();
				try {
	
					
					output.setText(String.valueOf(whatever.calculator(Double.parseDouble(String.valueOf(textField.getText() )) , textField_1.getText(),  Double.parseDouble(String.valueOf(textField_2.getText() )))));		
				
				
				
				
				}catch(Exception e) {
					
					JOptionPane.showMessageDialog(frminputbuttonwithexceptionhandeling, "I am a bot not a human ");
					
				}
			
				
				
				
				
				
			}
		});
		
		output = new JTextField();
		output.setBounds(10, 158, 372, 20);
		frminputbuttonwithexceptionhandeling.getContentPane().add(output);
		output.setColumns(10);
		btnNewButton.setBounds(145, 106, 89, 23);
		frminputbuttonwithexceptionhandeling.getContentPane().add(btnNewButton);
		
		JLabel lblInputNumber = new JLabel("input number");
		lblInputNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblInputNumber.setBounds(10, 21, 86, 14);
		frminputbuttonwithexceptionhandeling.getContentPane().add(lblInputNumber);
		
		JLabel label = new JLabel("input number");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(296, 21, 86, 14);
		frminputbuttonwithexceptionhandeling.getContentPane().add(label);
		
		JLabel lblInputOperator = new JLabel("input operator");
		lblInputOperator.setHorizontalAlignment(SwingConstants.CENTER);
		lblInputOperator.setBounds(145, 11, 96, 14);
		frminputbuttonwithexceptionhandeling.getContentPane().add(lblInputOperator);
		
		JLabel label_1 = new JLabel("+ , - , * , /");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(148, 31, 86, 14);
		frminputbuttonwithexceptionhandeling.getContentPane().add(label_1);
	}
	
	public class Math{
		
		
		public double calculator(double a ,String operator , double b) {
			
		
			// if you wont define calculation here it will give return type error 
			double calculation=0;
		
			
		
			if(operator.equals("+") ) {
				
				calculation = a+b;
			}
			
			if(operator.equals("-")  ) {
				calculation = a-b;
			}
			
			if(operator.equals("*")) {
				calculation = a*b;
			}
			
			
			if(operator.equals("/")) {
				calculation = a/b;
			}
			
			
			
			return calculation;
		  }
		} 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

