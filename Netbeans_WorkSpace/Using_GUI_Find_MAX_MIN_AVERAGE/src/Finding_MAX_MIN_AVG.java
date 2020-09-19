import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Finding_MAX_MIN_AVG {

	private JFrame frame;
	private JTextField txtInput_1;
	private JTextField txtInput_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finding_MAX_MIN_AVG window = new Finding_MAX_MIN_AVG();
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
	public Finding_MAX_MIN_AVG() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */ JLabel lblAns = new JLabel("Ans");
	 
	 
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 188, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtInput_1 = new JTextField();
		txtInput_1.setText("input_value_1");
		txtInput_1.setBounds(10, 41, 118, 20);
		frame.getContentPane().add(txtInput_1);
		txtInput_1.setColumns(10);
		
		txtInput_2 = new JTextField();
		txtInput_2.setText("input_value_2");
		txtInput_2.setBounds(10, 106, 118, 20);
		frame.getContentPane().add(txtInput_2);
		txtInput_2.setColumns(10);
		
		
		
		
		
		
		
		JButton btnMaxnum = new JButton("MAX_NUM");
		btnMaxnum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			
				 // method / function we created  
			max_number();
				
				

			
			
			
			}
		});
		btnMaxnum.setBounds(10, 187, 118, 23);
		frame.getContentPane().add(btnMaxnum);
		
		JButton btnMinnum = new JButton("MIN_NUM");
		btnMinnum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
				
				// method / function we created 
				
				min_number();	
			
			}
		});
		btnMinnum.setBounds(7, 258, 121, 23);
		frame.getContentPane().add(btnMinnum);
		
		JButton btnAvgnum = new JButton("AVG_NUM");
		btnAvgnum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			
			
			// method /function we created 
				avg_number();


			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			}
		});
		btnAvgnum.setBounds(10, 328, 118, 23);
		frame.getContentPane().add(btnAvgnum);
		
		
		lblAns.setBounds(10, 412, 118, 14);
		frame.getContentPane().add(lblAns);
	}
	
	
	
	
	
	
	// max number method / function 
		public  void max_number() {
			String  input_value_1 =  txtInput_1.getText();
			
			
			int converted_int_value_1= Integer.parseInt(input_value_1); 
			
			
			
			
			
			
			String  input_value_2 =  txtInput_2.getText();
			int converted_int_value_2= Integer.parseInt(input_value_2);
			
			

			if(converted_int_value_1 >converted_int_value_2) {
				
				lblAns.setText(  String.valueOf(converted_int_value_1) );
				
			} 
			
			else if (converted_int_value_2 > converted_int_value_1 ) {
				
				lblAns.setText(  String.valueOf(converted_int_value_2) );
				
				
			}
			
			
		}
	
	
	
	
	// minimum number function / method 
		
		public void min_number() {
			
			String  input_value_1 =  txtInput_1.getText();
			
			
			int converted_int_value_1= Integer.parseInt(input_value_1); 
			
			
			
			
			
			
			String  input_value_2 =  txtInput_2.getText();
			int converted_int_value_2= Integer.parseInt(input_value_2);
			

			
			
			
			
			if(converted_int_value_1 <converted_int_value_2) {
				
				lblAns.setText(  String.valueOf(converted_int_value_1) );
				
			} 
			
			else if (converted_int_value_2 < converted_int_value_1 ) {
				
				lblAns.setText(  String.valueOf(converted_int_value_2) );
				
				
			}
			
		}
	
	//average number method / function 
		
		
		public void avg_number() {
            String  input_value_1 =  txtInput_1.getText();
			
			
				int converted_int_value_1= Integer.parseInt(input_value_1); 
				
				
				
				
				
				
				String  input_value_2 =  txtInput_2.getText();
				int converted_int_value_2= Integer.parseInt(input_value_2);
				

				
				int average = (converted_int_value_1 + converted_int_value_2 )/2;
				
				
	
			
				lblAns.setText(  String.valueOf(average) );
			
			
			
			
		}
		
		
		
	
	
}
