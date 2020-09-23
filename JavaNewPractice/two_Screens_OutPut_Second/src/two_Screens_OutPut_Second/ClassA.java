package two_Screens_OutPut_Second;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


//jehan pa show ho reha ha


class ClassA{
JFrame frame;
JTextField text1;
void form()
{
frame=new JFrame("test");
JPanel cp=new JPanel();
text1=new JTextField(10);
cp.add(text1);
frame.add(cp);
frame.setSize(300,100);
frame.setVisible(true);
}
} 
