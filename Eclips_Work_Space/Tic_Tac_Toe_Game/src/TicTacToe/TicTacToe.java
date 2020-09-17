package TicTacToe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class TicTacToe {

	public JFrame frame; // created our class JFrame  and Object Variable
	public String startGame = "X";
	//Count1 is for player 1 score counting counter
	public int Count1 = 0;
	
	
	
	//Count2 is for player 2 score counting counter
	public int Count2 = 0;

	public JLabel button; // made the button variable global
	public JLabel button_1;
	public JLabel button_2;
	public JLabel button_3;
	public JLabel button_4;
	public JLabel button_5;
	public JLabel button_6;
	public JLabel button_7;
	public JLabel button_8;
	public JTextField txtCount1;
	public JTextField txtCount2;
	

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
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
	public TicTacToe() {
		initialize();
		gameScore();
	}

	// creating game Score Method
	
	
	//======================================= My Methods ==================================
	
	public void gameScore() 
	//game score pa khale humna counter lgya ha aur aus ke value int sa String pa convert kr wae ha 
			// these are our labels for scores
		 	//lblPlayer
			//lblPlayer_1
	{
		
		txtCount1.setText(String.valueOf(Count1++)    );
		txtCount2.setText(String.valueOf(Count2++)  );
	}
	
	
	
	
	
	
	// method to chose player
	
	public void choosePlayer() 
	{
		/*equalsIgnoreCase
public boolean equalsIgnoreCase(String anotherString)

Compares this String to another String, ignoring caseconsiderations. Two strings are considered equal ignoring case
 if theyare of the same length and corresponding characters in the two stringsare equal ignoring case. 
Two characters c1 and c2 are considered the sameignoring case if at least one of the following is true: 
 The two characters are the same (as compared by the == operator) 
 Applying the method Character.toUpperCase(char) to each characterproduces the same result 
 Applying the method Character.toLowerCase(char) to each characterproduces the same result 
Parameters:anotherString - The String to compare this String against*/
		
		
		// Jub X ,,,, X ,, ka braber a gya to O ko bare do 
		
		if(startGame.equalsIgnoreCase("X") ) 
		
		{
			startGame="O";
		}
		
		// Jub O ,,,, O ,, ka braber a gya to X ko bare do 
		else 
			
		{
			
			startGame="X";
		}
		
		
		
		
		
		
	
	}
	
	
	// method to define a game winner
	public void winningGame() 
	{
		String b1 = button.getText();
		String b2 = button_1.getText();
		String b3 = button_2.getText();
		String b4 = button_3.getText();
		String b5 = button_4.getText();
		String b6 = button_5.getText();
		String b7 = button_6.getText();
		String b8 = button_7.getText();
		String b9 = button_8.getText();
		
		//============== Player 1 Wining Combination===========
		if(b1.equals("X")  && b2.equals("X") && b3.equals("X")  ) 
		{
			JOptionPane.showMessageDialog(null/*ais main humesha parent class aye ge*/, "Player 1 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			Count1++;
			gameScore();
		}
		
		 if(b4.equals("X")  && b5.equals("X") && b6.equals("X")  ) 
		{
			JOptionPane.showMessageDialog(null/*ais main humesha parent class aye ge*/, "Player 1 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			Count1++;
			gameScore();
		}
		
		 if(b7.equals("X")  && b8.equals("X") && b9.equals("X")  ) 
		{
			JOptionPane.showMessageDialog(null/*ais main humesha parent class aye ge*/, "Player 1 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			Count1++;
			gameScore();
		}
		
		 if(b1.equals("X")  && b4.equals("X") && b7.equals("X")  ) 
		{
			JOptionPane.showMessageDialog(null/*ais main humesha parent class aye ge*/, "Player 1 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			Count1++;
			gameScore();
		}
		
		 if(b2.equals("X")  && b5.equals("X") && b8.equals("X")  ) 
		{
			JOptionPane.showMessageDialog(null/*ais main humesha parent class aye ge*/, "Player 1 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			Count1++;
			gameScore();
		}
		
		 if(b3.equals("X")  && b6.equals("X") && b9.equals("X")  ) 
		{
			JOptionPane.showMessageDialog(null/*ais main humesha parent class aye ge*/, "Player 1 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			Count1++;
			gameScore();
		}
		
		
		
		 if(b1.equals("X")  && b5.equals("X") && b9.equals("X")  ) 
		{
			JOptionPane.showMessageDialog(null/*ais main humesha parent class aye ge*/, "Player 1 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			Count1++;
			gameScore();
		}
		
		
		 if(b3.equals("X")  && b5.equals("X") && b7.equals("X")  ) 
		{
			JOptionPane.showMessageDialog(null/*ais main humesha parent class aye ge*/, "Player 1 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			Count1++;
			gameScore();
		}
		
		
		//=========== Player 2 wining combination ============
		
		 if(b1.equals("O")  && b2.equals("O") && b3.equals("O")  ) 
		{
			JOptionPane.showMessageDialog(null/*ais main humesha parent class aye ge*/, "Player 2 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			Count2++;
			gameScore();
		}
		
		 if(b4.equals("O")  && b5.equals("O") && b6.equals("O")  ) 
		{
			JOptionPane.showMessageDialog(null/*ais main humesha parent class aye ge*/, "Player 2 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			Count2++;
			gameScore();
		}
		
		 if(b7.equals("O")  && b8.equals("O") && b9.equals("O")  ) 
		{
			JOptionPane.showMessageDialog(null/*ais main humesha parent class aye ge*/, "Player 2 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			Count2++;
			gameScore();
		}
		
		 if(b1.equals("O")  && b4.equals("O") && b7.equals("O")  ) 
		{
			JOptionPane.showMessageDialog(null/*ais main humesha parent class aye ge*/, "Player 2 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			Count2++;
			gameScore();
		}
		
		 if(b2.equals("O")  && b5.equals("O") && b8.equals("O")  ) 
		{
			JOptionPane.showMessageDialog(null/*ais main humesha parent class aye ge*/, "Player 2 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			Count2++;
			gameScore();
		}
		
		 if(b3.equals("O")  && b6.equals("O") && b9.equals("O")  ) 
		{
			JOptionPane.showMessageDialog(null/*ais main humesha parent class aye ge*/, "Player 2 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			Count2++;
			gameScore();
		}
		
		
		
		 if(b1.equals("O")  && b5.equals("O") && b9.equals("O")  ) 
		{
			JOptionPane.showMessageDialog(null/*ais main humesha parent class aye ge*/, "Player 2 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			Count2++;
			gameScore();
		}
		
		
		 if(b3.equals("O")  && b5.equals("O") && b7.equals("O")  ) 
		{
			JOptionPane.showMessageDialog(null/*ais main humesha parent class aye ge*/, "Player 2 wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			Count2++;
			gameScore();
		}
		
	}
	
	
	
	
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 5, 2, 2));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			button.setText(startGame);
			//ager X ,,, X  ,, ka braber ha  
			if(startGame.equalsIgnoreCase("X"))
			{
				button.setForeground(Color.RED);
			}
			else 
			{
				button.setForeground(Color.BLUE);
			}
			
			// choose player ka method yehan pa call ker wa dia , wo method decide kera ga k player X ha ya O ...
			choosePlayer();
			winningGame();
			
			}
		});
		button.setFont(new Font("Roboto", Font.BOLD, 96));
		panel_1.add(button, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				button_1.setText(startGame);
				//ager X ,,, X  ,, ka braber ha  
				if(startGame.equalsIgnoreCase("X"))
				{
					button_1.setForeground(Color.RED);
				}
				else 
				{
					button_1.setForeground(Color.BLUE);
				}
				
				// choose player ka method yehan pa call ker wa dia , wo method decide kera ga k player X ha ya O ...
				choosePlayer();
				winningGame();
			
			
			
			}
		});
		button_1.setFont(new Font("Roboto", Font.BOLD, 96));
		panel_2.add(button_1, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				button_2.setText(startGame);
				//ager X ,,, X  ,, ka braber ha  
				if(startGame.equalsIgnoreCase("X"))
				{
					button_2.setForeground(Color.RED);
				}
				else 
				{
					button_2.setForeground(Color.BLUE);
				}
				
				// choose player ka method yehan pa call ker wa dia , wo method decide kera ga k player X ha ya O ...
				choosePlayer();
				winningGame();
			
			}
		});
		button_2.setFont(new Font("Roboto", Font.BOLD, 96));
		panel_3.add(button_2, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPlayer = new JLabel("Player 1 :");
		lblPlayer.setFont(new Font("Roboto", Font.BOLD, 48));
		panel_4.add(lblPlayer, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		txtCount1 = new JTextField();
		txtCount1.setHorizontalAlignment(SwingConstants.CENTER);
		txtCount1.setFont(new Font("Roboto", Font.BOLD, 48));
		txtCount1.setText("0");
		panel_5.add(txtCount1, BorderLayout.CENTER);
		txtCount1.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JButton button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				button_3.setText(startGame);
				//ager X ,,, X  ,, ka braber ha  
				if(startGame.equalsIgnoreCase("X"))
				{
					button_3.setForeground(Color.RED);
				}
				else 
				{
					button_3.setForeground(Color.BLUE);
				}
				
				// choose player ka method yehan pa call ker wa dia , wo method decide kera ga k player X ha ya O ...
				choosePlayer();
				winningGame();
			}
		});
		button_3.setFont(new Font("Roboto", Font.BOLD, 96));
		panel_6.add(button_3, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JButton button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				button_4.setText(startGame);
				//ager X ,,, X  ,, ka braber ha  
				if(startGame.equalsIgnoreCase("X"))
				{
					button_4.setForeground(Color.RED);
				}
				else 
				{
					button_4.setForeground(Color.BLUE);
				}
				
				// choose player ka method yehan pa call ker wa dia , wo method decide kera ga k player X ha ya O ...
				choosePlayer();
				winningGame();
			}
		});
		button_4.setFont(new Font("Roboto", Font.BOLD, 96));
		panel_7.add(button_4, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JButton button_5 = new JButton("");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				button_5.setText(startGame);
				//ager X ,,, X  ,, ka braber ha  
				if(startGame.equalsIgnoreCase("X"))
				{
					button_5.setForeground(Color.RED);
				}
				else 
				{
					button_5.setForeground(Color.BLUE);
				}
				
				// choose player ka method yehan pa call ker wa dia , wo method decide kera ga k player X ha ya O ...
				choosePlayer();
				winningGame();
			
			}
		});
		button_5.setFont(new Font("Roboto", Font.BOLD, 96));
		panel_8.add(button_5, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPlayer_1 = new JLabel("Player 2 :");
		lblPlayer_1.setFont(new Font("Roboto", Font.BOLD, 48));
		panel_9.add(lblPlayer_1, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		txtCount2 = new JTextField();
		txtCount2.setHorizontalAlignment(SwingConstants.CENTER);
		txtCount2.setFont(new Font("Roboto", Font.BOLD, 48));
		txtCount2.setText("0");
		panel_10.add(txtCount2, BorderLayout.CENTER);
		txtCount2.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JButton button_6 = new JButton("");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				button_6.setText(startGame);
				//ager X ,,, X  ,, ka braber ha  
				if(startGame.equalsIgnoreCase("X"))
				{
					button_6.setForeground(Color.RED);
				}
				else 
				{
					button_6.setForeground(Color.BLUE);
				}
				
				// choose player ka method yehan pa call ker wa dia , wo method decide kera ga k player X ha ya O ...
				choosePlayer();
				
				
				winningGame();
			}
		});
		button_6.setFont(new Font("Roboto", Font.BOLD, 96));
		panel_11.add(button_6, BorderLayout.CENTER);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JButton button_7 = new JButton("");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				button_7.setText(startGame);
				//ager X ,,, X  ,, ka braber ha  
				if(startGame.equalsIgnoreCase("X"))
				{
					button_7.setForeground(Color.RED);
				}
				else 
				{
					button_7.setForeground(Color.BLUE);
				}
				
				// choose player ka method yehan pa call ker wa dia , wo method decide kera ga k player X ha ya O ...
				choosePlayer();
			
				winningGame();
				
			}
		});
		button_7.setFont(new Font("Roboto", Font.BOLD, 96));
		panel_12.add(button_7, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JButton button_8 = new JButton("");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
				button_8.setText(startGame);
				//ager X ,,, X  ,, ka braber ha  
				if(startGame.equalsIgnoreCase("X"))
				{
					button_8.setForeground(Color.RED);
				}
				else 
				{
					button_8.setForeground(Color.BLUE);
				}
				
				// choose player ka method yehan pa call ker wa dia , wo method decide kera ga k player X ha ya O ...
				choosePlayer();
			
				winningGame();
			}
		});
		button_8.setFont(new Font("Roboto", Font.BOLD, 96));
		panel_13.add(button_8, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			// to reset the values we set it to null	
			button.setText(null);
			button_1.setText(null);
			button_2.setText(null);
			button_3.setText(null);
			button_4.setText(null);
			button_5.setText(null);
			button_6.setText(null);
			button_7.setText(null);
			button_8.setText(null);
			
			
			
			}
		});
		btnReset.setFont(new Font("Roboto", Font.BOLD, 76));
		panel_14.add(btnReset, BorderLayout.CENTER);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			// we initialized Object variable of class JFrame of JFrame here
				frame = new JFrame("Exit");
				//ager JOptionPane ka Dialog Box equal ha JOptionPane.YES_NO_OPTION ka to exit kerdo 
			if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit" , "Tic Tac Toe",
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION ) 
			{
				/*exit
public static void exit(int status)

Terminates the currently running Java Virtual Machine. Theargument serves as a status code; by convention, a nonzero statuscode indicates abnormal termination. 
This method calls the exit method in class Runtime. This method never returns normally. 

The call System.exit(n) is effectively equivalent tothe call: 

 Runtime.getRuntime().exit(n)
 
Parameters:status - exit status.*/
				System.exit(0);
			} 
			
			}
		});
		btnExit.setFont(new Font("Roboto", Font.BOLD, 96));
		panel_15.add(btnExit, BorderLayout.CENTER);
	}

}
