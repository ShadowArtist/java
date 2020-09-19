import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class GUI_Efficient {

	private JFrame frminputcalculator;
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
					GUI_Efficient window = new GUI_Efficient();
					window.frminputcalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_Efficient() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frminputcalculator = new JFrame();
		frminputcalculator.setTitle("3_Input_Calculator");
		frminputcalculator.setBounds(100, 100, 402, 259);
		frminputcalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frminputcalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 57, 86, 20);
		frminputcalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(152, 57, 86, 20);
		frminputcalculator.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		output = new JTextField();
		output.setBounds(102, 189, 199, 20);
		frminputcalculator.getContentPane().add(output);
		output.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(285, 57, 86, 20);
		frminputcalculator.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			try {
			
	//		int input_1 = Integer.parseInt(String.valueOf(  textField.getText()   )  ) ;
			
			String input_2 =   textField_1.getText();
			
		
			
	//		int input_3 = Integer.parseInt(String.valueOf(  textField_2.getText()   )  ) ;
			
			
			
			
		if( input_2.equals( "+" ) )
		{
			
			// i taked values in string converted them in integer ,performed calculation,then converted back the output by calculation into string
		
			int calculate = ( Integer.parseInt(String.valueOf(  textField.getText()   )  )  )  +  ( Integer.parseInt(String.valueOf(  textField_2.getText()   )  ) )  ;
		
		output.setText( String.valueOf(calculate));
		
		}
		
		
		// i taked values in string converted them in integer ,performed calculation,then converted back the output by calculation into string
		
		else if( input_2.equals( "-" ) )
		{
			
		
			int calculate = ( Integer.parseInt(String.valueOf(  textField.getText()   )  )  )  -  ( Integer.parseInt(String.valueOf(  textField_2.getText()   )  ) )  ;
		
		output.setText( String.valueOf(calculate));
		
		}
		
		
		// i taked values in string converted them in integer ,performed calculation,then converted back the output by calculation into string
		
		else if( input_2.equals( "*" ) )
		{
			
		
			int calculate = ( Integer.parseInt(String.valueOf(  textField.getText()   )  )  )  *  ( Integer.parseInt(String.valueOf(  textField_2.getText()   )  ) )  ;
		
		output.setText( String.valueOf(calculate));
		
		}
		
		
		// i taked values in string converted them in integer ,performed calculation,then converted back the output by calculation into string
		
		else if( input_2.equals( "/" ) )
		{
			
		
			double calculate = ( Double.parseDouble(String.valueOf(  textField.getText()   )  )  )  /  ( Double.parseDouble(String.valueOf(  textField_2.getText()   )  ) )  ;
		
		output.setText( String.valueOf(calculate));
		
		}
		
			}
			
			
			
			catch(Exception e) {
			JOptionPane.showMessageDialog(btnCalculate, "I am a calculator not Your Toy");
				
			}
		
		
		
		
			
			
			
			
			
			}
		});
		btnCalculate.setBounds(152, 110, 89, 23);
		frminputcalculator.getContentPane().add(btnCalculate);
		
		JLabel lblInputValue = new JLabel("input Value");
		lblInputValue.setBounds(21, 18, 86, 14);
		frminputcalculator.getContentPane().add(lblInputValue);
		
		JLabel lblInputValue_1 = new JLabel("input Value");
		lblInputValue_1.setBounds(285, 18, 86, 14);
		frminputcalculator.getContentPane().add(lblInputValue_1);
		
		JLabel lblEnterOperatorFrom = new JLabel("Enter Operator From Below");
		lblEnterOperatorFrom.setBounds(117, 18, 173, 14);
		frminputcalculator.getContentPane().add(lblEnterOperatorFrom);
		
		JLabel label = new JLabel("+  , -  ,  *  ,  /");
		label.setBounds(165, 32, 86, 14);
		frminputcalculator.getContentPane().add(label);
	}
}
