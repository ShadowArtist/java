import java.awt.EventQueue;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CCTester {

	public static JFrame frame;
	public static JTextField txtInput1;
	public static JTextField txtInput2;
	public static JTextField textResult;
	public static JTextField textOperandSelector;
	public static String input1;
	public static String input2;

	
	
	
	ResultWindow resultWindow;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CCTester window = new CCTester();
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
	public CCTester() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() 
	
//	Method Started From here
	
	{
		
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtInput1 = new JTextField();
		txtInput1.setBounds(143, 38, 86, 20);
		frame.getContentPane().add(txtInput1);
		txtInput1.setColumns(10);
		
		txtInput2 = new JTextField();
		txtInput2.setBounds(143, 82, 86, 20);
		frame.getContentPane().add(txtInput2);
		txtInput2.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		
		btnCalculate.setBounds(143, 143, 89, 23);
		frame.getContentPane().add(btnCalculate);
		
		textResult = new JTextField();
		textResult.setBounds(143, 208, 86, 20);
		frame.getContentPane().add(textResult);
		textResult.setColumns(10);
		
		textOperandSelector = new JTextField();
		textOperandSelector.setBounds(276, 112, 86, 20);
		frame.getContentPane().add(textOperandSelector);
		textOperandSelector.setColumns(10);
		
		
		
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
//		int add= Add(txtInput1.getText().toString() , txtInput2.getText().toString());
//		
//		
//		
//		int sub= Sub(txtInput1.getText().toString() , txtInput2.getText().toString());
//		
//		
//		int mul= Mul(txtInput1.getText().toString() , txtInput2.getText().toString());
//		
//		int div= Div(txtInput1.getText().toString() , txtInput2.getText().toString());
//		
		
//		textResult.setText(Add(txtInput1.getText().toString(),txtInput2.getText().toString()));
		
//		int a= Integer.parseInt(   txtInput1.getText() )   ;
//		
//		int b = Integer.parseInt(   txtInput2.getText()  )   ;
		
		

		
//	String c_a=  String.valueOf(     Add(a,b)  ).toString()  	;
//	String c_s=  String.valueOf(     Sub(a,b)  ).toString()  	;
//	String c_m=  String.valueOf(     Mul(a,b)  ).toString()  	;
//	String c_d=  String.valueOf(     Div(a,b)  ).toString()  	;
	
		
		
		
				
				input1=txtInput1.getText();
						
						input2=txtInput2.getText();
						
						
						if(textOperandSelector.getText().toString().equals("+"))
						{
						textResult.setText(String.valueOf(  Add(input1, input2)     ));
						
						//resultWindow.initialize();
						//resultWindow.Output.setText(textResult.getText());
						
						
						//sirf result ko dalna ha constructor k ander
						
						//new memory allocate krne k lia hota ha
						//new ResultWindow(  String.valueOf(   Add(input1, input2)    )                );
						
						//resultWindow.initialize();
						
						
						
						
						}
						
						
						
						
						else if(textOperandSelector.getText().toString().equals("-"))
							
						{
							textResult.setText(String.valueOf(  Sub(input1, input2)     ));
						}
						
						else if(textOperandSelector.getText().toString().equals("*")) 
						{
							textResult.setText(String.valueOf(  Mul(input1, input2)     ));
						}
						
						else if(textOperandSelector.getText().toString().equals("/")) {
							textResult.setText(String.valueOf(  Div(input1, input2)     ));
						}
		
		
		
		
		
				
			}
		});
		
		
	}
	
//	Method ended From here

static	int Add(String a, String b) {
		
		
     int converted_Values= ( Integer.parseInt(a)  ) + (  Integer.parseInt(b)   );
		
		return converted_Values; 
		
		
		
	}
	
	
	
	
static	 int Sub(String a, String  b) {
		

		

		
		  int converted_Values= ( Integer.parseInt(a)  ) - (  Integer.parseInt(b)   );
			
			return converted_Values; 
	}
	
	
	
	
static	double Div(String a,String b) {


		
		
		  double converted_Values= ( Double.parseDouble(a)  ) / (  Double.parseDouble(b)   );
			
			return converted_Values; 
	}
	
	
static	int Mul(String a,String b) {
		
		  int converted_Values= ( Integer.parseInt(a)  ) * (  Integer.parseInt(b)   );
			
			return converted_Values; 
		
	}
}
