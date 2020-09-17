import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Orignal_Calculator {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Orignal_Calculator window = new Orignal_Calculator();
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
	public Orignal_Calculator() {
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
		textField.setBounds(10, 11, 414, 54);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("0");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			/*	yehan pa hum text field main jo input lain ga , 
			  button zero ka zaria wo aga remove nai ho ga text field ka andar sa , wo 0(zero) ka brabar
			  bhe kre ga button zero ko aur aga values bhe likhne da ga huma 
				*/
				textField.setText( textField.getText() +  "0");
			
			}
		});
		button.setBounds(10, 227, 89, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textField.setText( textField.getText() +  "1");
				
			}
		});
		button_1.setBounds(208, 193, 89, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textField.setText( textField.getText() +  "2");
			}
		});
		button_2.setBounds(109, 193, 89, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textField.setText( textField.getText() +  "3");
			}
		});
		button_3.setBounds(10, 193, 89, 23);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textField.setText( textField.getText() +  "4");
			
			}
		});
		button_4.setBounds(208, 159, 89, 23);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textField.setText( textField.getText() +  "5");
			}
		});
		button_5.setBounds(109, 159, 89, 23);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
				textField.setText( textField.getText() +  "6");
			
			}
		});
		button_6.setBounds(10, 159, 89, 23);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
				textField.setText( textField.getText() +  "7");
			
			}
		});
		button_7.setBounds(208, 125, 89, 23);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textField.setText( textField.getText() +  "8");
			
			}
		});
		button_8.setBounds(109, 125, 89, 23);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
				textField.setText( textField.getText() +  "9");
			
			}
		});
		button_9.setBounds(10, 125, 89, 23);
		frame.getContentPane().add(button_9);
		
		JButton button_11 = new JButton("+");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
				Calculator obj1 = new Calculator(); 
			
	//		obj1.add(0 as, 1);   
			
			
			}
		});
		button_11.setBounds(335, 125, 89, 23);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("-");
		button_12.setBounds(335, 159, 89, 23);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("*");
		button_13.setBounds(335, 193, 89, 23);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("/");
		button_14.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(button_14);
		
		JButton button_10 = new JButton("=");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
	 Calculator obj1 = new Calculator();
			
  // textField.setText( String.valueOf( obj1.add( Double.parseDouble( button_10.getText()))  )   );
	 
	 
			}
		});
		button_10.setBounds(208, 227, 89, 23);
		frame.getContentPane().add(button_10);
		
		JButton button_15 = new JButton(".");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textField.setText( textField.getText() +  ".");
			
			
			}
		});
		button_15.setBounds(109, 227, 89, 23);
		frame.getContentPane().add(button_15);
	}
	
	

	public class Calculator{
	
	public  int add(int a , int b) {
		int calculation=0;
		
calculation = a+b;
		
		return calculation;
	}
	
	public  double substract(double a , double b) {
		double calculation=0;
		
calculation = a-b;
		
		return calculation;
	}	
	
	
	public  double multilpy(double a , double b) {
		double calculation=0;
		
calculation = a*b;
		
		return calculation;
	}
	
	
	
	public  double devide(double a , double b) {
		double calculation=0;
		
calculation = a/b;
		
		return calculation;
	}
	
	
	
	
	}
	
	
}
