import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.JEditorPane;
import javax.swing.DropMode;

public class CAR_GAME_RETRY {
	Timer t;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CAR_GAME_RETRY window = new CAR_GAME_RETRY();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application
	 * 
	 */
	
	//This is the constructor.
	public CAR_GAME_RETRY() {
		initialize();
	}

	//making methods here
	
	
	
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 503, 738);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnUsercar = new JButton("user_car");
		btnUsercar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUsercar.setIcon(new ImageIcon("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\JAVA 2 D Car racing game tuotorial\\Already made game to take help from\\Cars\\image\\user1.png"));
		btnUsercar.setBounds(220, 638, 50, 50);
		frame.getContentPane().add(btnUsercar);
		
		JButton btnOponentcar1 = new JButton("oponent_car_1");
		btnOponentcar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOponentcar1.setIcon(new ImageIcon("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\JAVA 2 D Car racing game tuotorial\\Already made game to take help from\\Cars\\image\\op3.png"));
		btnOponentcar1.setBounds(145, 392, 50, 50);
		frame.getContentPane().add(btnOponentcar1);
		
		JButton btnOponentcar2 = new JButton("oponent_car_2");
		btnOponentcar2.setIcon(new ImageIcon("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\JAVA 2 D Car racing game tuotorial\\Already made game to take help from\\Cars\\image\\op1.png"));
		btnOponentcar2.setBounds(273, 275, 50, 50);
		frame.getContentPane().add(btnOponentcar2);
		
		JLabel lblScore = new JLabel("Score");
		lblScore.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblScore);
		
		JLabel lblGameOver = new JLabel("Game Over");
		lblGameOver.setBounds(10, 36, 65, 14);
		frame.getContentPane().add(lblGameOver);
		
		JLabel lblTrack = new JLabel("Track");
		lblTrack.setIcon(new ImageIcon("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\JAVA 2 D Car racing game tuotorial\\Already made game to take help from\\Cars\\image\\road.png"));
		lblTrack.setBounds(107, 11, 266, 677);
		frame.getContentPane().add(lblTrack);
	}
}
