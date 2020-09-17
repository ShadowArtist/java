import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Finding_MAX_MIN_AVG {

	private JFrame frmMinmaxavg;
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
					window.frmMinmaxavg.setVisible(true);
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
		frmMinmaxavg = new JFrame();
		frmMinmaxavg.setTitle("min_max_avg");
		frmMinmaxavg.setBounds(100, 100, 283, 507);
		frmMinmaxavg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMinmaxavg.getContentPane().setLayout(null);
		
		txtInput_1 = new JTextField();
		txtInput_1.setText("input_value_1");
		txtInput_1.setBounds(10, 41, 247, 20);
		frmMinmaxavg.getContentPane().add(txtInput_1);
		txtInput_1.setColumns(10);
		
		txtInput_2 = new JTextField();
		txtInput_2.setText("input_value_2");
		txtInput_2.setBounds(10, 106, 247, 20);
		frmMinmaxavg.getContentPane().add(txtInput_2);
		txtInput_2.setColumns(10);
		
		
		JButton btnMaxnum = new JButton("MAX_NUM");
		btnMaxnum.setBounds(10, 187, 247, 23);
		frmMinmaxavg.getContentPane().add(btnMaxnum);
		
		
		
		JButton btnMinnum = new JButton("MIN_NUM");
		btnMinnum.setBounds(7, 258, 250, 23);
		frmMinmaxavg.getContentPane().add(btnMinnum);
		
		
		
		
		
		
		btnMaxnum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			
				 // method / function we created  
			max_number();
				
				

			
			
			
			}
		});
		
		
		btnMinnum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
				
				// method / function we created 
				
				min_number();	
			
			}
		});
		
		
		
		
		JButton btnAvgnum = new JButton("AVG_NUM");
		btnAvgnum.setBounds(10, 328, 247, 23);
		frmMinmaxavg.getContentPane().add(btnAvgnum);
		
		
		
		btnAvgnum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			
			
			// method /function we created 
				avg_number();


			
			
			
			
		
			
			}
		});
		
		
		
		
		
		
		
		lblAns.setBounds(10, 412, 118, 14);
		frmMinmaxavg.getContentPane().add(lblAns);
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
