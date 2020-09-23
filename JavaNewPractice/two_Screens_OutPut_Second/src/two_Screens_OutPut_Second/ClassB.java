package two_Screens_OutPut_Second;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


//Jehan sa bejh reha hain 
class ClassB implements ActionListener
{
JFrame f;
JTextField text;
JButton jb;
ClassA m;



public static void main(String args[])
{
ClassB s=new ClassB();
s.form();
}



void form()
{
  text=new JTextField(10);
  
  
jb=new JButton("Submit");
f=new JFrame("test");
JPanel cp=new JPanel();


cp.add(text);
cp.add(jb);



jb.addActionListener(this);




f.setSize(350,350);
f.setVisible(true);
f.add(cp);
}



public void actionPerformed(ActionEvent ae)
{
	
	
m=new ClassA();
m.form();
m.text1.setText(text.getText());
}







}
