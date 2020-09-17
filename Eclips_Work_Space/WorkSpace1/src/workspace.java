import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class workspace {

	private JFrame frmMarkSheetApplication;
	private JTextField textField_Enter_Your_Name;
	private JLabel lbl_Entered_Rollnumber;
	private JTextField textField_Enter_Your_Roll_Number;
	private JLabel lblSubjects;
	private JTextField txtSub_marks_1;
	private JTextField txtSub_marks_2;
	private JTextField txtSub_marks_3;
	private JTextField txtSub_marks_4;
	private JTextField txtSub_marks_5;
	private JTextField txtSub_marks_6;
	private JTextField txtSub_marks_7;
	private JLabel lblPercentage;
	private JLabel lblGrade;
	private JLabel lblObtainMarks;
	private JLabel lbl_Display_Name;
	private JLabel lbl_Display_Roll_no;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					workspace window = new workspace();
					window.frmMarkSheetApplication.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public workspace() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMarkSheetApplication = new JFrame();
		frmMarkSheetApplication.setTitle("Mark Sheet Application");
		frmMarkSheetApplication.setBounds(100, 100, 634, 735);
		frmMarkSheetApplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMarkSheetApplication.getContentPane().setLayout(null);
		
		JLabel lbl_Entered_Name = new JLabel("Name");
		lbl_Entered_Name.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lbl_Entered_Name.setBounds(22, 86, 46, 14);
		frmMarkSheetApplication.getContentPane().add(lbl_Entered_Name);
		
		JLabel lblMarkSheetApplication = new JLabel("MARK SHEET APPLICATION");
		lblMarkSheetApplication.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblMarkSheetApplication.setBounds(88, 11, 425, 42);
		frmMarkSheetApplication.getContentPane().add(lblMarkSheetApplication);
		
		textField_Enter_Your_Name = new JTextField();
		textField_Enter_Your_Name.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField_Enter_Your_Name.setBounds(157, 83, 146, 20);
		frmMarkSheetApplication.getContentPane().add(textField_Enter_Your_Name);
		textField_Enter_Your_Name.setColumns(10);
		
		lbl_Entered_Rollnumber = new JLabel("RollNumber");
		lbl_Entered_Rollnumber.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lbl_Entered_Rollnumber.setBounds(22, 139, 92, 21);
		frmMarkSheetApplication.getContentPane().add(lbl_Entered_Rollnumber);
		
		textField_Enter_Your_Roll_Number = new JTextField();
		textField_Enter_Your_Roll_Number.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField_Enter_Your_Roll_Number.setBounds(157, 142, 146, 20);
		frmMarkSheetApplication.getContentPane().add(textField_Enter_Your_Roll_Number);
		textField_Enter_Your_Roll_Number.setColumns(10);
		
		lblSubjects = new JLabel("Subjects");
		lblSubjects.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblSubjects.setBounds(250, 204, 117, 28);
		frmMarkSheetApplication.getContentPane().add(lblSubjects);
		
		txtSub_marks_1 = new JTextField();
		txtSub_marks_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtSub_marks_1.setText("sub_1_marks");
		txtSub_marks_1.setBounds(22, 263, 117, 28);
		frmMarkSheetApplication.getContentPane().add(txtSub_marks_1);
		txtSub_marks_1.setColumns(10);
		
		txtSub_marks_2 = new JTextField();
		txtSub_marks_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtSub_marks_2.setText("sub_2_marks");
		txtSub_marks_2.setBounds(171, 263, 117, 28);
		frmMarkSheetApplication.getContentPane().add(txtSub_marks_2);
		txtSub_marks_2.setColumns(10);
		
		txtSub_marks_3 = new JTextField();
		txtSub_marks_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtSub_marks_3.setText("sub_3_marks");
		txtSub_marks_3.setBounds(317, 263, 109, 28);
		frmMarkSheetApplication.getContentPane().add(txtSub_marks_3);
		txtSub_marks_3.setColumns(10);
		
		txtSub_marks_4 = new JTextField();
		txtSub_marks_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtSub_marks_4.setText("sub_4_marks");
		txtSub_marks_4.setBounds(454, 263, 109, 28);
		frmMarkSheetApplication.getContentPane().add(txtSub_marks_4);
		txtSub_marks_4.setColumns(10);
		
		txtSub_marks_5 = new JTextField();
		txtSub_marks_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtSub_marks_5.setText("sub_5_marks");
		txtSub_marks_5.setBounds(171, 324, 117, 28);
		frmMarkSheetApplication.getContentPane().add(txtSub_marks_5);
		txtSub_marks_5.setColumns(10);
		
		txtSub_marks_6 = new JTextField();
		txtSub_marks_6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtSub_marks_6.setText("sub_6_marks");
		txtSub_marks_6.setBounds(317, 324, 109, 28);
		frmMarkSheetApplication.getContentPane().add(txtSub_marks_6);
		txtSub_marks_6.setColumns(10);
		
		txtSub_marks_7 = new JTextField();
		txtSub_marks_7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtSub_marks_7.setText("sub_7_marks");
		txtSub_marks_7.setBounds(250, 384, 110, 28);
		frmMarkSheetApplication.getContentPane().add(txtSub_marks_7);
		txtSub_marks_7.setColumns(10);
		
		lblPercentage = new JLabel("Percentage");
		lblPercentage.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPercentage.setBounds(10, 512, 241, 20);
		frmMarkSheetApplication.getContentPane().add(lblPercentage);
		
		lblGrade = new JLabel("Grade");
		lblGrade.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblGrade.setBounds(221, 512, 146, 20);
		frmMarkSheetApplication.getContentPane().add(lblGrade);
		
		lblObtainMarks = new JLabel("Obtain Marks");
		lblObtainMarks.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblObtainMarks.setBounds(425, 512, 183, 20);
		frmMarkSheetApplication.getContentPane().add(lblObtainMarks);
		
		lbl_Display_Name = new JLabel("Name");
		lbl_Display_Name.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lbl_Display_Name.setBounds(22, 558, 245, 20);
		frmMarkSheetApplication.getContentPane().add(lbl_Display_Name);
		
		lbl_Display_Roll_no = new JLabel("Roll_No");
		lbl_Display_Roll_no.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lbl_Display_Roll_no.setBounds(292, 561, 241, 14);
		frmMarkSheetApplication.getContentPane().add(lbl_Display_Roll_no);
		
		JButton btnGenerateResult = new JButton("GENERATE RESULT");
		btnGenerateResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			
                //Now Displaying  Name 
				
				String name = textField_Enter_Your_Name.getText();
				lbl_Display_Name.setText("Name: "+name);
				
				
				
				
				//Now Displaying Roll Number
				
				String roll_no = textField_Enter_Your_Roll_Number.getText();
				lbl_Display_Roll_no.setText("Roll Number: "+ roll_no);
				
				
				
				
				
				
				
				
				
				
		
				
			//first i am calling subject marks values here 
				String Sub_marks_1 = txtSub_marks_1.getText();
				String Sub_marks_2 = txtSub_marks_2.getText();
				String Sub_marks_3 = txtSub_marks_3.getText();
				String Sub_marks_4 = txtSub_marks_4.getText();
				String Sub_marks_5 = txtSub_marks_5.getText();
				String Sub_marks_6 = txtSub_marks_6.getText();
				String Sub_marks_7 = txtSub_marks_7.getText();
				
				
			//now converting these String mark values into float	
				
				
				float Sub_marks_1_converted_in_float = Float.parseFloat(Sub_marks_1);
				float Sub_marks_2_converted_in_float = Float.parseFloat(Sub_marks_2);
				float Sub_marks_3_converted_in_float = Float.parseFloat(Sub_marks_3);
				float Sub_marks_4_converted_in_float = Float.parseFloat(Sub_marks_4);
				float Sub_marks_5_converted_in_float = Float.parseFloat(Sub_marks_5);
				float Sub_marks_6_converted_in_float = Float.parseFloat(Sub_marks_6);
				float Sub_marks_7_converted_in_float = Float.parseFloat(Sub_marks_7);
				
				
				
				// now we will start finding percentage 
				
				float Sub_max_marks_1 = 200;
				float Sub_got_marks_1 = Sub_marks_1_converted_in_float;
				
				float Sub_max_marks_2 = 200;
				float Sub_got_marks_2 = Sub_marks_2_converted_in_float;
				
				
				float Sub_max_marks_3 = 50;
				float Sub_got_marks_3 = Sub_marks_3_converted_in_float;
				
				float Sub_max_marks_4 = 50;
				float Sub_got_marks_4 = Sub_marks_4_converted_in_float;
				
				
				float Sub_max_marks_5 = 50;
				float Sub_got_marks_5 = Sub_marks_5_converted_in_float;
				
				
				float Sub_max_marks_6 = 200;
				float Sub_got_marks_6 = Sub_marks_6_converted_in_float;
				
				
				float Sub_max_marks_7 = 200;
				float Sub_got_marks_7 = Sub_marks_7_converted_in_float;
				
				
				
				
				
				float total_max_marks = Sub_max_marks_1 + Sub_max_marks_2 + Sub_max_marks_3 + Sub_max_marks_4 + Sub_max_marks_5 + Sub_max_marks_6 + Sub_max_marks_7 ; 
				
				float marks_obtained = Sub_got_marks_1 + Sub_got_marks_2 + Sub_got_marks_3 + Sub_got_marks_4 + Sub_got_marks_5 + Sub_got_marks_6 + Sub_got_marks_7 ;
				
				
				float percentage =(marks_obtained *100)/total_max_marks;
				
				
				// we had used String.valueOf() method in label because i am outputting (converted String into float) values back into  String
				
				// to view our results we are using label 
				
				lblPercentage.setText(   " Percentage : "    +  String.valueOf(percentage)  +" % "     );
				
				
				
				// Now Just Displaying Obtained Marks
				
				lblObtainMarks.setText("Marks Obtain : "    +String.valueOf(marks_obtained)       );
				
				
				
				
				
				
				
				// Now Finding Grades of Subjects 
				
				if(   (percentage >=80) && (percentage <=100   ) ) {
					/*instead of using System.out.println to print statement we will
					 *  use the label of Grades that we created because in button System.out.Println
					 *   dont work */ 
					
					lblGrade.setText("Grade : A+ ");
					
                      // here we had set the lblGrade value to Grade A+  if the condition is right 	
				}
				
				
				
				else if (   (percentage >=70) && (percentage <=79)         ) {
					
					lblGrade.setText("Grade : A ");
				}
				
	            
				
				else if (   (percentage >=60) && (percentage <=69.99999)         ) {
					
					lblGrade.setText("Grade : B ");
				}
				
				
				
	            else if (   (percentage >=50) && (percentage <=59.99999)         ) {
					
					lblGrade.setText("Grade : C ");
				}
				
				
				
	           else if (   (percentage >=40) && (percentage <=49.99999)         ) {
					
					lblGrade.setText("Grade : D ");
				}
				
				
	       	 else if (   (percentage >=30) && (percentage <=39.99999)         ) {
				
				lblGrade.setText("Grade : E ");
			}
				
			
				
				
				
	    	else {
	    		lblGrade.setText("Sorry You Failed");
	    	}
				
				
				
			}
		});
		btnGenerateResult.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnGenerateResult.setBounds(115, 638, 372, 47);
		frmMarkSheetApplication.getContentPane().add(btnGenerateResult);
		
		JLabel lblMaxMarks = new JLabel("max marks 200");
		lblMaxMarks.setBounds(38, 242, 101, 14);
		frmMarkSheetApplication.getContentPane().add(lblMaxMarks);
		
		JLabel lblMaxMarks_1 = new JLabel("max marks 200");
		lblMaxMarks_1.setBounds(188, 242, 100, 14);
		frmMarkSheetApplication.getContentPane().add(lblMaxMarks_1);
		
		JLabel lblMaxMarks_2 = new JLabel("max marks 50");
		lblMaxMarks_2.setBounds(331, 243, 95, 14);
		frmMarkSheetApplication.getContentPane().add(lblMaxMarks_2);
		
		JLabel lblMaxMarks_3 = new JLabel("max marks 50");
		lblMaxMarks_3.setBounds(472, 242, 91, 14);
		frmMarkSheetApplication.getContentPane().add(lblMaxMarks_3);
		
		JLabel lblMaxMarks_4 = new JLabel("max marks 50");
		lblMaxMarks_4.setBounds(181, 302, 107, 14);
		frmMarkSheetApplication.getContentPane().add(lblMaxMarks_4);
		
		JLabel lblMaxMarks_5 = new JLabel("max marks 200");
		lblMaxMarks_5.setBounds(327, 302, 99, 14);
		frmMarkSheetApplication.getContentPane().add(lblMaxMarks_5);
		
		JLabel lblMaxMarks_6 = new JLabel("max marks 200");
		lblMaxMarks_6.setBounds(266, 363, 92, 14);
		frmMarkSheetApplication.getContentPane().add(lblMaxMarks_6);
	}
}
