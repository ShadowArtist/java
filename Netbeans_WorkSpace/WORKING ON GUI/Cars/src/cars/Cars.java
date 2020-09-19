/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author RehanUsmani
 */
public class Cars extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    JFrame app = new JFrame();
    work w = new work();
    app.add(w); // adding (w)<-- object variable to our frame
    
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    app.setSize(500,720);
    app.setVisible(true);
    
    
    
    }
    
}
