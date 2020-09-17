import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class BMI_Calculate {

	
	
/*  Global variable bnye jesa hum android main krte hain   
  
  
  
 * */
	
	
	private JFrame frame/*these are variable names so change these variable names*/;
	private JTextField textField /*this variable is for weight*/;
	private JTextField textField_1  /* this variable is for height */;
	private JTextField textField_2  /* this is used for showing output on   */;

	/**
	 * Launch the application.
	 */
	
	
	//ya compilation unit ha humara 
	public static void main(String[] args) {
		
		//Runnable interface ha yehan Runnable ka interface lga ha 
		EventQueue.invokeLater(new Runnable() {
			
			// a run() method always comes with a try catch  ;) 
			
			
			// runnable interface k ander aik run ka method ha jisa implement krna lazmi ha
			public void run() {
				try {
					
					
					
					BMI_Calculate window = new BMI_Calculate();
					
					/*
					 humna apne class pa JFrame lgaya phir 
					 
					   aus ke visibility ko true kr dia 
					   
					   humna apne window ko try catch main aislia rekha ha 
					   
					   taka wo humare pas phate nai 
					  
					 * */
					window.frame.setVisible(true);
					
					
					
				} 
				
				catch (Exception e)
				
				{
					e.printStackTrace();
				}
				
				
			}
		}); //listner ends here which is an interface
		
		
	
	}
	

	/**
	 * Create the application.
	 */
	//Constructor
	public BMI_Calculate() {
		
		/* ya class ka constructor ha jis k ander hum na 
		  
		 values initialize ka aik method bnya aur ausa yehan implement kr dia
		 
		  
		 * */ 
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
	/*      
	 This is initialize method where we initialize our text fields and buttons 
	  
	  like we do in OnCreateMethod in mainActivity
	  
	 * */	
		
		
		
		//ya Swing sa bna k edit ho skta ha aram sa nai to yahe parameter autha skta hain
		frame = new JFrame();
		frame.setBounds(100, 100, 383, 295);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		
		
		
		
		
		textField = new JTextField();
		textField.setBounds(120, 45, 225, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(120, 93, 225, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(120, 225, 225, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		
		
		
		/*
		  
CONSTRUCTORS OF J BUTTON		  
		  
		 JButton()
JButton(Icon)
JButton(String)
JButton(Action)
JButton(String, Icon) 
		  
		  
		 * */
		
		
		
		JButton btnCalculate = new JButton("Calculate")   /*  ya text humna button k aupar likha huwa ha   */;
		btnCalculate.setBounds(194, 181, 89, 23);
		frame.getContentPane().add(btnCalculate);
		
		JLabel lblEnterWeight = new JLabel("Enter Weight")  /* same as button description */;
		lblEnterWeight.setBounds(20, 48, 79, 14);
		frame.getContentPane().add(lblEnterWeight);
		
		JLabel lblEnterHeight = new JLabel("Enter Height ");
		lblEnterHeight.setBounds(20, 96, 79, 14);
		frame.getContentPane().add(lblEnterHeight);
		
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setBounds(20, 228, 46, 14);
		frame.getContentPane().add(lblOutput);
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*jesa hum android k ander kam krte hain 
		  
		 button k aupar on click lgata hain
		 
		  waise he yehan pa action listner lgyain ga 
		  
		  aur aus k ander logic define krain ga 
		  
		 * */ 
		
		
		//Listener is an interface and you had to implement all of the methods defined in it 
		
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		
				
				
				/*
				 ya bat yad rekhna k
				 
				  ais main input by default String data type ka hota ha 
				  
				  tbhe huma  integer main convert kr wa k wapse 
				  
				  String main output nikal wana hota ha 
				  
				  
				  */	
				
				
				
				// weight that you will enter will be in Killogram
	   float Weight =  Float.parseFloat(   textField.getText())	;
	   
	   
	   //remember the height that you will enter will be of centimeters
	   
		//double Height =  Integer.parseInt(   textField_1.getText()    )	;
		
	   //Double ko parse krwane k lia Double ata ha pehla
	   
	   float Height =  Float.parseFloat(   textField_1.getText()    )/100	;
		
//		double BMI = (  ( 10000 * Weight) / (Height * Height)   );
		
		
		/*
		GUIDES TAKEN FROM LOGICS AND FOORMULA 
		  https://www.codentricks.com/make-bmi-calculator-using-pure-javascript/
		  
		  
		  https://www.codentricks.com/bmi-calculator-using-python/
		  
		  https://www.youtube.com/watch?v=Is37HPhwMeE
		 * */
	   
	   
	   
	   
	   /*
	    INCHES TO CENTEMETER CALCULATOR BUT REMEMBER TO ROUNDOFF YOUR CENTIMETER 
	     https://www.inches-to-cm.com/
	     
	     
	     ACTUAL BMI TESTER
	     
	     https://www.codentricks.com/make-bmi-calculator-using-pure-javascript/
	     
	    * */
	   
	   
		double BMI = (   Weight / (Height * Height)   );
		
		
		textField_2.setText(String.valueOf(BMI));
		
		
			
			}
			
		});
		
		
		
		
		
	
	
	
	}







}
