import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator {

	private JFrame frmPerfectcalculator;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frmPerfectcalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPerfectcalculator = new JFrame();
		frmPerfectcalculator.setTitle("PERFECT_CALCULATOR");
		frmPerfectcalculator.setBounds(100, 100, 268, 305);
		frmPerfectcalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPerfectcalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 33, 86, 20);
		frmPerfectcalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(148, 33, 86, 20);
		frmPerfectcalculator.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 220, 224, 32);
		frmPerfectcalculator.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnPlus = new JButton("plus");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			
				
				
				
				
				String value1=textField.getText();
				String value2=textField_1.getText();
			
				textField_2.setText(String.valueOf( /*dude dont forget to call method which you created*/plus(value1,value2)        ));
			
				
				
				
				
				
				
			}
		});
		btnPlus.setBounds(7, 86, 89, 23);
		frmPerfectcalculator.getContentPane().add(btnPlus);
		
		JButton btnMinus = new JButton("minus");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
				String value1=textField.getText();
				String value2=textField_1.getText();
			
				textField_2.setText(String.valueOf( /*dude dont forget to call method which you created*/minus(value1,value2)        ));
			
			
			
			
			
			
			
			}
		});
		btnMinus.setBounds(145, 86, 89, 23);
		frmPerfectcalculator.getContentPane().add(btnMinus);
		
		JButton btnMultiply = new JButton("multiply");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			
				String value1=textField.getText();
				String value2=textField_1.getText();
			
				textField_2.setText(String.valueOf( /*dude dont forget to call method which you created*/multiply(value1,value2)        ));
			
			
			
			
			
			
			}
		});
		btnMultiply.setBounds(10, 140, 89, 23);
		frmPerfectcalculator.getContentPane().add(btnMultiply);
		
		JButton btnDevide = new JButton("devide");
		btnDevide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				String value1=textField.getText();
				String value2=textField_1.getText();
			
				textField_2.setText(String.valueOf( /*dude dont forget to call method which you created*/devide(value1,value2)        ));
			
				
				
				
				
				
			
			
			}
		});
		btnDevide.setBounds(145, 140, 89, 23);
		frmPerfectcalculator.getContentPane().add(btnDevide);
	}
	
	
	
	public static double plus(/*here comes the parameters*/String value1,String value2) 
	{
	

		
		double cv1= Double.parseDouble(value1);
		double cv2= Double.parseDouble(value2);
		
		double calculate=cv1+cv2;
		
		
		
		
		return calculate;
	}
	
	
	
	
	/*
	public  void plus() {
		
		String value1=textField.getText();
		String value2=textField_1.getText();
		
		int cv1= Integer.parseInt(value1);
		int cv2= Integer.parseInt(value2);
		
		int calculate=cv1+cv2;
		
		
		textField_2.setText(String.valueOf(calculate));
		
	}
	*/
	
	
	
	
	public static double minus(/*here comes the parameters*/String value1,String value2) 
	{
	

		
		double cv1= Double.parseDouble(value1);
		double cv2= Double.parseDouble(value2);
		
		double calculate=cv1-cv2;
		
		
		
		
		return calculate;
	}
	
	
	
	
	
	
	
	
	
	
	/*
public  void minus() {
		
		String value1=textField.getText();
		String value2=textField_1.getText();
		
		int cv1= Integer.parseInt(value1);
		int cv2= Integer.parseInt(value2);
		
		int calculate=cv1-cv2;
		
		
		textField_2.setText(String.valueOf(calculate));
		
	}
	
	*/
	
	
	
	
	
	
	public static double multiply(/*here comes the parameters*/String value1,String value2) 
	{
	

		
		double cv1= Double.parseDouble(value1);
		double cv2= Double.parseDouble(value2);
		
		double calculate=cv1*cv2;
		
		
		
		
		return calculate;
	}
	
	
	
	
	
	
	
	
	
/*	
public  void multiply() {
	
	String value1=textField.getText();
	String value2=textField_1.getText();
	
	int cv1= Integer.parseInt(value1);
	int cv2= Integer.parseInt(value2);
	
	int calculate=cv1*cv2;
	
	
	textField_2.setText(String.valueOf(calculate));
	
}
	*/
	
	
	
	
	public static double devide(/*here comes the parameters*/String value1,String value2) 
	{
	

		
		double cv1= Double.parseDouble(value1);
		double cv2= Double.parseDouble(value2);
		
		double calculate=cv1/cv2;
		
		
		
		
		return calculate;
	}	
	
	
	
	
	
	/*
public  void devide() {
	
	String value1=textField.getText();
	String value2=textField_1.getText();
	
	int cv1= Integer.parseInt(value1);
	int cv2= Integer.parseInt(value2);
	
	int calculate=cv1/cv2;
	
	
	textField_2.setText(String.valueOf(calculate));
	
}
	*/
	
	
	
	
}
