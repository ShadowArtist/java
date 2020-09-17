import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Try_Catch_Basics_App {

	private JFrame frame;
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
					Try_Catch_Basics_App window = new Try_Catch_Basics_App();
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
	public Try_Catch_Basics_App() {
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
		textField.setBounds(10, 24, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 81, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 217, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnDevide = new JButton("devide");
		btnDevide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				
				
				
				// this is the description for JOptionPane
				
				/*JOptionPane makes it easy to pop up a standard dialog box thatprompts users for a value or informs them of something.For information about using JOptionPane, see How to Make Dialogs,a section in The Java Tutorial. 
While the JOptionPaneclass may appear complex because of the large number of methods, almostall uses of this class are one-line calls to one of the static showXxxDialog methods shown below: 



Method Name

Description

showConfirmDialog Asks a confirming question, like yes/no/cancel. 
showInputDialog Prompt for some input. 
showMessageDialog Tell the user about something that has happened. 
showOptionDialog The Grand Unification of the above three. 
Each of these methods also comes in a showInternalXXXflavor, which uses an internal frame to hold the dialog box (see JInternalFrame).Multiple convenience methods have also been defined -- overloadedversions of the basic methods that use different parameter lists. 
All dialogs are modal. Each showXxxDialog method blocksthe caller until the user's interaction is complete. 
icon message 
input value 
option buttons 
The basic appearance of one of these dialog boxes is generallysimilar to the picture at the right, although the variouslook-and-feels areultimately responsible for the final result. In particular, thelook-and-feels will adjust the layout to accommodate the option pane's ComponentOrientation property. 


Parameters:
The parameters to these methods follow consistent patterns: 

parentComponentDefines the Component that is to be the parent of thisdialog box.It is used in two ways: the Frame that containsit is used as the Frameparent for the dialog box, and its screen coordinates are used inthe placement of the dialog box. In general, the dialog box is placedjust below the component. This parameter may be null,in which case a default Frame is used as the parent,and the dialog will becentered on the screen (depending on the L&F). messageA descriptive message to be placed in the dialog box.In the most common usage, message is just a String or String constant.However, the type of this parameter is actually Object. Itsinterpretation depends on its type: Object[]An array of objects is interpreted as a series ofmessages (one per object) arranged in a vertical stack.The interpretation is recursive -- each object in thearray is interpreted according to its type. ComponentThe Component is displayed in the dialog. IconThe Icon is wrapped in a JLabeland displayed in the dialog. othersThe object is converted to a String by callingits toString method. The result is wrapped in a JLabel and displayed. messageTypeDefines the style of the message. The Look and Feelmanager may lay out the dialog differently depending on this value, andwill often provide a default icon. The possible values are: •ERROR_MESSAGE 
•INFORMATION_MESSAGE 
•WARNING_MESSAGE 
•QUESTION_MESSAGE 
•PLAIN_MESSAGE 
optionTypeDefines the set of option buttons that appear atthe bottom of the dialog box: •DEFAULT_OPTION 
•YES_NO_OPTION 
•YES_NO_CANCEL_OPTION 
•OK_CANCEL_OPTION 
You aren't limited to this set of option buttons. You can provide anybuttons you want using the options parameter. optionsA more detailed description of the set of option buttonsthat will appear at the bottom of the dialog box.The usual value for the options parameter is an array of Strings. Butthe parameter type is an array of Objects.A button is created for each object depending on its type: ComponentThe component is added to the button row directly. IconA JButton is created with this as its label. otherThe Object is converted to a string using its toString method and the result is used tolabel a JButton. iconA decorative icon to be placed in the dialog box. A defaultvalue for this is determined by the messageType parameter. titleThe title for the dialog box. initialValueThe default selection (input value). 
When the selection is changed, setValue is invoked,which generates a PropertyChangeEvent. 

If a JOptionPane has configured to all input setWantsInputthe bound property JOptionPane.INPUT_VALUE_PROPERTYcan also be listenedto, to determine when the user has input or selected a value. 

When one of the showXxxDialog methods returns an integer,the possible values are: 
•YES_OPTION 
•NO_OPTION 
•CANCEL_OPTION 
•OK_OPTION 
•CLOSED_OPTION 
Examples: Show an error dialog that displays the message, 'alert': JOptionPane.showMessageDialog(null, "alert", "alert", JOptionPane.ERROR_MESSAGE);  Show an internal information dialog with the message, 'information':  JOptionPane.showInternalMessageDialog(frame, "information",
             "information", JOptionPane.INFORMATION_MESSAGE);
 
Show an information panel with the options yes/no and message 'choose one': JOptionPane.showConfirmDialog(null,
             "choose one", "choose one", JOptionPane.YES_NO_OPTION);
 
Show an internal information dialog with the options yes/no/cancel andmessage 'please choose one' and title information: JOptionPane.showInternalConfirmDialog(frame,
             "please choose one", "information",
             JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
 
Show a warning dialog with the options OK, CANCEL, title 'Warning', andmessage 'Click OK to continue':  Object[] options = { "OK", "CANCEL" };
 JOptionPane.showOptionDialog(null, "Click OK to continue", "Warning",
             JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
             null, options, options[0]);
 
Show a dialog asking the user to type in a String: String inputValue = JOptionPane.showInputDialog("Please input a value");  Show a dialog asking the user to select a String:  Object[] possibleValues = { "First", "Second", "Third" };

 Object selectedValue = JOptionPane.showInputDialog(null,
             "Choose one", "Input",
             JOptionPane.INFORMATION_MESSAGE, null,
             possibleValues, possibleValues[0]);
 


Direct Use:
To create and use an JOptionPane directly, thestandard pattern is roughly as follows:      JOptionPane pane = new JOptionPane(arguments);
     pane.set.Xxxx(...); // Configure
     JDialog dialog = pane.createDialog(parentComponent, title);
     dialog.show();
     Object selectedValue = pane.getValue();
     if(selectedValue == null)
       return CLOSED_OPTION;
     //If there is not an array of option buttons:
     if(options == null) {
       if(selectedValue instanceof Integer)
          return ((Integer)selectedValue).intValue();
       return CLOSED_OPTION;
     }
     //If there is an array of option buttons:
     for(int counter = 0, maxCounter = options.length;
        counter < maxCounter; counter++) {
        if(options[counter].equals(selectedValue))
        return counter;
     }
     return CLOSED_OPTION;
 

Warning: Swing is not thread safe. For moreinformation see Swing's ThreadingPolicy. 

Warning:Serialized objects of this class will not be compatible withfuture Swing releases. The current serialization support isappropriate for short term storage or RMI between applications runningthe same version of Swing. As of 1.4, support for long term storageof all JavaBeans™has been added to the java.beans package.Please see XMLEncoder.
*/
				
				
				
				
				
				
				
				
				
				//get is use to take input from user
				
				
				// jo text field lo aushe ko parse krwa do 
//			int one=Integer.parseInt(/*pehla jis chez sa get krna ha wo likho*/textField./*phir aus ke value .getText() ka zaria lo */getText());
			
//			int two=Integer.parseInt(textField_1.getText() );
			
			
//			int calculation=one/two;
			
			
			
			
//			textField_2.setText(String.valueOf(calculation)   );
			
	
				
				
				
				
			// now we are applying try catch on it which is Exception Handling
				
				// in try we will put the thing on which exception is coming
				try {
					
					int one=Integer.parseInt(/*pehla jis chez sa get krna ha wo likho*/textField./*phir aus ke value .getText() ka zaria lo */getText());
					
					int two=Integer.parseInt(textField_1.getText() );
					
					
					int calculation=one/two;
					
					
					
					
				textField_2.setText(String.valueOf(calculation)   );
				} 
				
				 
				
				
				
				
				// or we can use this single Exception which deals with all types of Exceptions
				catch(Exception e){
					JOptionPane.showMessageDialog(frame, "Hello Bhai Error a gya ha ausa sai kr lo ");
						}
				
				
				// this is try with multiple cath's ,it shows which type of exception you want to catch
				//if you are not catching all the exceptions
//				catch(NumberFormatException e){
//			JOptionPane.showMessageDialog(frame, "Hello Bhai Error a gya ha ausa sai kr lo ");
//				}
//				catch(ArithmeticException e) {
//					JOptionPane.showMessageDialog(frame, "Hello Bhai Error a gya ha ausa sai kr lo ");
//				}
			
			
			
				
				
			/*showMessageDialog
public static void showMessageDialog(Component parentComponent,
                                     Object message)
                              throws HeadlessException

Brings up an information-message dialog titled "Message".
Parameters:parentComponent - determines the Frame inwhich the dialog is displayed; if null,
or if the parentComponent has no Frame, a default Frame is usedmessage - the Object to display*/
			
			
			
			}
		});
		btnDevide.setBounds(7, 152, 89, 23);
		frame.getContentPane().add(btnDevide);
	}
}
