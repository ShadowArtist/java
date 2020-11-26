import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QUESTUIOMN_5 {

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
					QUESTUIOMN_5 window = new QUESTUIOMN_5();
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
	public QUESTUIOMN_5() {
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
		
		JLabel lblEnterYourName = new JLabel("Enter Your Name");
		lblEnterYourName.setBounds(10, 29, 81, 14);
		frame.getContentPane().add(lblEnterYourName);
		
		JLabel lblEnterMobileNumber = new JLabel("Enter Mobile Number");
		lblEnterMobileNumber.setBounds(10, 70, 89, 14);
		frame.getContentPane().add(lblEnterMobileNumber);
		
		textField = new JTextField();
		textField.setBounds(142, 26, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(142, 67, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblShowMessageHere = new JLabel("Show Message Here");
		lblShowMessageHere.setBounds(156, 225, 124, 14);
		frame.getContentPane().add(lblShowMessageHere);
		
		JButton btnOk = new JButton("OK");
		
		
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String Name =textField.getText().toString();
				
				
				String Mobile_NUmber= textField_1.getText().toString();
				
				if(Name.equals("")) 
				{
					lblShowMessageHere.setText("Please Fill The name First");
				}
				
				else if(Mobile_NUmber.equals("")) 
				{
					lblShowMessageHere.setText("Please Fill The Mobile Number First");
				}
				
				else {
					lblShowMessageHere.setText(" Thanks For Filling The Form ");
				}
				
				
				
				
			}
		});
		
		
		btnOk.setBounds(65, 175, 89, 23);
		frame.getContentPane().add(btnOk);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				it will exit from the form 
				
				System.exit(0);
				
				
			}
		});
		btnExit.setBounds(191, 175, 89, 23);
		frame.getContentPane().add(btnExit);
		
	
	}
}
