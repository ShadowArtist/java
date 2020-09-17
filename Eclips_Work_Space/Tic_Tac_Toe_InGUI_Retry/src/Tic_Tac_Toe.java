//this is the working one




//to find the drag and moving logic just type Soching  after pressing Ctrl + F 




import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Cursor;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.JPanel;
import java.awt.ComponentOrientation;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;


public class Tic_Tac_Toe {
	
		// i will check the value of turn value if the value is even
	//that means it is the value of player 1 not even number so ,turn ofplayer 2
		int turn =2;
		
		//overwriting ko rokne ka lia array aistmal kia ha
	public static	int buttonused[]= {0,0,0,0,0,0,0,0,0,};
		
		
		// now creating winning logic
		int p1won[]={0,0,0,0,0,0,0,0,0,};
		int p2won[]={0,0,0,0,0,0,0,0,0,};
	
		
		
		//creating counters (Scores For Two Players)
		//and making them public so that they ca be accessed from any where 
	
		public static	int P1Score = 0;
		public static	int P2Score = 0;
    
    
    
    
    
    
		
		
		// i had cutted and pasted buttons here to make it a global variable so that it can be accessed from anywhere
		
	public	static JButton btn1 = new JButton("");
		
	
	public static JButton btn2 = new JButton("");
	
	public static JButton btn3 = new JButton("");
		
	public static JButton btn4 = new JButton("");	
	
	public static JButton btn5 = new JButton("");
	
	public static JButton btn6 = new JButton("");	
	
	public static JButton btn7 = new JButton("");
	
	public static JButton btn8 = new JButton("");
	
	public static JButton btn9 = new JButton("");
	
	public static JButton btnChoosePlayer = new JButton("");
	public static int xx,yy; // these are my variables for Making Move Event
		
		
		// defining winning function here for both players
		int p1won() {
			
			//yehan pa counter initialize kr wao 
		
			
			
			if(p1won[0]==1 && p1won[1]==1 && p1won[2]==1)
			{
				// and this is legit working 
				
				// yehan pa counter main increment kr wao aur score display kr wao
				P1Score++;
	            lblPlayerOneScore.setText("" + P1Score);
				
			return 1;	
			}
			
			if(p1won[3]==1 && p1won[4]==1 && p1won[5]==1)
			{
				
                 // and this is legit working 
				
				// yehan pa counter main increment kr wao aur score display kr wao
				P1Score++;
	            lblPlayerOneScore.setText("" + P1Score);
				
				
			return 1;	
			}
			
			if(p1won[6]==1 && p1won[7]==1 && p1won[8]==1)
			{
				
// and this is legit working 
				
				// yehan pa counter main increment kr wao aur score display kr wao
				P1Score++;
	            lblPlayerOneScore.setText("" + P1Score);
				
				
				
			return 1;	
			}
			
			if(p1won[0]==1 && p1won[3]==1 && p1won[6]==1)
			{
				
// and this is legit working 
				
				// yehan pa counter main increment kr wao aur score display kr wao
				P1Score++;
	            lblPlayerOneScore.setText("" + P1Score);
				
				
				
			return 1;	
			}
			
			
			if(p1won[1]==1 && p1won[4]==1 && p1won[7]==1)
			{
				
// and this is legit working 
				
				// yehan pa counter main increment kr wao aur score display kr wao
				P1Score++;
	            lblPlayerOneScore.setText("" + P1Score);
				
				
				
			return 1;	
			}
			
			
			
			if(p1won[2]==1 && p1won[5]==1 && p1won[8]==1)
			{
				
// and this is legit working 
				
				// yehan pa counter main increment kr wao aur score display kr wao
				P1Score++;
	            lblPlayerOneScore.setText("" + P1Score);
				
				
			return 1;	
			}
			
			
			if(p1won[2]==1 && p1won[4]==1 && p1won[6]==1)
			{
				
// and this is legit working 
				
				// yehan pa counter main increment kr wao aur score display kr wao
				P1Score++;
	            lblPlayerOneScore.setText("" + P1Score);
				
				
			return 1;	
			}
			
			
			
			if(p1won[0]==1 && p1won[4]==1 && p1won[8]==1)
			{
				
// and this is legit working 
				
				// yehan pa counter main increment kr wao aur score display kr wao
				P1Score++;
	            lblPlayerOneScore.setText("" + P1Score);
				
				
			return 1; // 1 is indicating true over  here	
			}
       
			
			
		     
			
			
			//Player Score counter
            
			
			return 0;
			
			 
			
			
			
			
			
		}
		
		
int p2won() {
			
			if(p2won[0]==1 && p2won[1]==1 && p2won[2]==1)
			{
				
// and this is legit working 
				
				// yehan pa counter main increment kr wao aur score display kr wao
				P2Score++;
	            lblPlayerTwoScore.setText("" + P2Score);
				
				
			return 1;	
			}
			
			if(p2won[3]==1 && p2won[4]==1 && p2won[5]==1)
			{
				
// and this is legit working 
				
				// yehan pa counter main increment kr wao aur score display kr wao
				P2Score++;
	            lblPlayerTwoScore.setText("" + P2Score);
				
				
			return 1;	
			}
			
			if(p2won[6]==1 && p2won[7]==1 && p2won[8]==1)
			{
				
// and this is legit working 
				
				// yehan pa counter main increment kr wao aur score display kr wao
				P2Score++;
	            lblPlayerTwoScore.setText("" + P2Score);
				
				
			return 1;	
			}
			
			if(p2won[0]==1 && p2won[3]==1 && p2won[6]==1)
			{
				
// and this is legit working 
				
				// yehan pa counter main increment kr wao aur score display kr wao
				P2Score++;
	            lblPlayerTwoScore.setText("" + P2Score);
				
				
			return 1;	
			}
			
			
			if(p2won[1]==1 && p2won[4]==1 && p2won[7]==1)
			{
// and this is legit working 
				
				// yehan pa counter main increment kr wao aur score display kr wao
				P2Score++;
	            lblPlayerTwoScore.setText("" + P2Score);
				
			return 1;	
			}
			
			
			
			if(p2won[2]==1 && p2won[5]==1 && p2won[8]==1)
			{
				
// and this is legit working 
				
				// yehan pa counter main increment kr wao aur score display kr wao
				P2Score++;
	            lblPlayerTwoScore.setText("" + P2Score);
				
				
			return 1;	
			}
			
			
			if(p2won[2]==1 && p2won[4]==1 && p2won[6]==1)
			{
// and this is legit working 
				
				// yehan pa counter main increment kr wao aur score display kr wao
				P2Score++;
	            lblPlayerTwoScore.setText("" + P2Score);
				
				
				
			return 1;	
			}
			
			
			
			if(p2won[0]==1 && p2won[4]==1 && p2won[8]==1)
			{
				
// and this is legit working 
				
				// yehan pa counter main increment kr wao aur score display kr wao
				P2Score++;
	            lblPlayerTwoScore.setText("" + P2Score);
				
			return 1; // 1 is indicating true over  here	
			}
			
			
			return 0;
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	public static JFrame frmTicTacToe;
	private final JLabel lblPlayerScore = new JLabel("PLAYER 1 Score");
	private final JLabel lblPlayerOneScore = new JLabel("");
	private final JLabel lblPlayerScore_1 = new JLabel("PLAYER 2 Score");
	private final JLabel lblPlayerTwoScore = new JLabel("");
	private final JLabel lblPlayer = new JLabel("PLAYER 1 =  X");
	private final JLabel lblPlayer_1 = new JLabel("PLAYER 2 = O");
	private final JButton btnMinimize = new JButton("-");
	private final JPanel panel_1 = new JPanel();
	private final Action action = new SwingAction();

	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tic_Tac_Toe window = new Tic_Tac_Toe();
					window.frmTicTacToe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tic_Tac_Toe() {
		initialize();
		 
		
	}
	 
	/**
	 * Initialize the contents of the frame.
	 */
	public  void initialize() {
		frmTicTacToe = new JFrame();
		frmTicTacToe.getContentPane().addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			//Soching to Mouse Drag
			public void mouseDragged(MouseEvent evt/*evt is my mouse event variable*/) {
			
			
			int x = evt.getXOnScreen();
			int y = evt.getYOnScreen();
			//setLocation(x-xx,y-yy);
			//apply your frame name instead of  (this keyword ) 
			frmTicTacToe.setLocation(x-xx, y-yy);
			
			
			}
		});
		
		
		
		// Over here i am Soching to Drag my Panel
		frmTicTacToe.getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			
			public void mousePressed(MouseEvent evt) {
				xx = evt.getX();
				yy=evt.getY();
			// remember evt the the variable of MouseEvent
			
		//	frmTicTacToe.setLocation(x-xx, arg1);
			
			
			}
		});
		frmTicTacToe.getContentPane().setFocusTraversalPolicyProvider(true);
		frmTicTacToe.getContentPane().setFocusCycleRoot(true);
		frmTicTacToe.setUndecorated(true);
		frmTicTacToe.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\BLUE Berrie Candy With Some Colour Fixes\\Blue Berrie Candy With Color Fixes.jpg"));
		frmTicTacToe.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frmTicTacToe.setResizable(false);
		frmTicTacToe.setTitle("Tic Tac Toe");
		frmTicTacToe.setForeground(new Color(0, 0, 0));
		frmTicTacToe.setBackground(new Color(0, 0, 0));
		frmTicTacToe.getContentPane().setForeground(Color.MAGENTA);
		
		
		// over here you can change the background color in RGB
		//with the help of this  { new Color(23, 3, 12) }  command i can change colors from net
		//alpha value is the opacity level
		frmTicTacToe.getContentPane().setBackground(new Color(117, 31, 255));
		frmTicTacToe.getContentPane();
		frmTicTacToe.getContentPane();
		frmTicTacToe.getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frmTicTacToe.getContentPane() ;
		frmTicTacToe.setBounds(100, 100, 291, 506);
		frmTicTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTicTacToe.getContentPane().setLayout(null);
		btn1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn1.setFocusPainted(false);
		btn1.setBorderPainted(false);
		btn1.setFocusTraversalPolicyProvider(true);
		btn1.setFocusTraversalKeysEnabled(false);
		btn1.setFont(new Font("ROCK-ON Demo", Font.BOLD, 51));
		
		//55, 255, 0
		btn1.setForeground(new Color(255, 106, 0));
		
		//here i am going to change button color
		btn1.setBackground(new Color(75, 11, 147));
		
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// i will check the value of turn value if the value is even
				//that means it is the value of player 1 not even number so ,turn of player 2
				
				
				
				
				
				
				if(buttonused[0]==0) 
				{
					
					
					
					
					
					// aik button ko aik he waqt main aik he text gye ga
					btnChoosePlayer.setText("Player 1 Turn  , Player 2 Turn Next");
					
					if(turn %2== 0) 
					{
						//Player 1 turn for button 1
						
						turn++;
						
						
						btn1.setText("X");
						buttonused[0]=1;
						p1won[0]=1;
						
						int result1= p1won();
						int result2= p2won();
						
						if(result1==1) 
						
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 1 has Won" );
						}
						
						else if (result2==1) 
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 2 has Won" );
						}
						
						//determining audio for player 1
						
						
						try {
							//in new File you will specify the path of your music file
							
							// and always remember the format
							
							// Format Example = C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\H.wav
							
							AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\SOUNDS USED FOR TIC TAC TOE\\smash.wav")    );
							
							Clip c =AudioSystem.getClip();
							
							c.open(input);
							
							c.start();
							
						}
						
						catch(Exception ee) {}
						
						
						
					}
					else
					{
						//player 2 turn for button 1 
						btnChoosePlayer.setText("Player 2 Turn , Player 1 Turn Next");
						
						
						
						turn ++;
						btn1.setText("O");
						buttonused[0]=1;
						p2won[0]=1;
						
						
						int result1= p1won();
						int result2= p2won();
						
						if(result1==1) 
						
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 1 has Won" );
						}
						
						else if (result2==1) 
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 2 has Won" );
						}
						
                      //determining audio for player 2   
						
						
						try {
							//in new File you will specify the path of your music file
							
							// and always remember the format
							
							// Format Example = C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\H.wav
							
							AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\SOUNDS USED FOR TIC TAC TOE\\Light Bulb Breaking.wav")    );
							
							Clip c =AudioSystem.getClip();
							
							c.open(input);
							
							c.start();
							
						}
						
						catch(Exception ee) {}
						
						
						
						
						
						
						
						
						
						
						
						
						
						
					}
				
					
				}
				else 
				{
					JOptionPane.showMessageDialog(frmTicTacToe, "Cheating is not allowed");
				}
				
				
				
			
			
			
			}
		});
		btn1.setBounds(10, 71, 83, 70);
		frmTicTacToe.getContentPane().add(btn1);
		btn2.setFont(new Font("ROCK-ON Demo", Font.BOLD, 51));
		btn2.setFocusPainted(false);
		btn2.setBorderPainted(false);
		btn2.setForeground(new Color(255, 106, 0));
		btn2.setBackground(new Color(75, 11, 147));
		
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnChoosePlayer.setText("Player 1 Turn");
				
				if(buttonused[1]==0) 
				{
					btnChoosePlayer.setText("Player 1 Turn , Player 2 Turn Next");
					
					
					if(turn %2== 0) 
					{
						turn++;
						btn2.setText("X");
						buttonused[1]=1;
						p1won[1]=1;
						
						
						int result1= p1won();
						int result2= p2won();
						
						if(result1==1) 
						
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 1 has Won" );
						}
						
						else if (result2==1) 
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 2 has Won" );
						}
						
                      //determining audio for player 1
						
						
						try {
							//in new File you will specify the path of your music file
							
							// and always remember the format
							
							// Format Example = C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\H.wav
							
							AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\SOUNDS USED FOR TIC TAC TOE\\smash.wav")    );
							
							Clip c =AudioSystem.getClip();
							
							c.open(input);
							
							c.start();
							
						}
						
						catch(Exception ee) {}
						
						
						
						
						
					}
					else
					{
						btnChoosePlayer.setText("Player 2 Turn , Player 1 Turn Next");
						
						turn ++;
						btn2.setText("O");
						buttonused[1]=1;
						p2won[1]=1;
						
						
						
						
						int result1= p1won();
						int result2= p2won();
						
						if(result1==1) 
						
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 1 has Won" );
						}
						
						else if (result2==1) 
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 2 has Won" );
						}
						
						
						
						
					}
					//determining audio for player 2   
					
					
					try {
						//in new File you will specify the path of your music file
						
						// and always remember the format
						
						// Format Example = C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\H.wav
						
						AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\SOUNDS USED FOR TIC TAC TOE\\Light Bulb Breaking.wav")    );
						
						Clip c =AudioSystem.getClip();
						
						c.open(input);
						
						c.start();
						
					}
					
					catch(Exception ee) {}
					
				}
				else 
				{
					JOptionPane.showMessageDialog(frmTicTacToe, "Cheating is not allowed");
				}
			
			}
		});
		btn2.setBounds(103, 71, 83, 70);
		frmTicTacToe.getContentPane().add(btn2);
		btn3.setFont(new Font("ROCK-ON Demo", Font.BOLD, 51));
		btn3.setFocusPainted(false);
		btn3.setBorderPainted(false);
		btn3.setForeground(new Color(255, 106, 0));
		btn3.setBackground(new Color(75, 11, 147));
		
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(buttonused[2/*this is button used index value*/]==0) 
				{
					btnChoosePlayer.setText("Player 1 Turn , Player 2 Turn Next");
					
					
					if(turn %2== 0) 
					{
						turn++;
						btn3.setText("X");
						buttonused[2]=1;
						p1won[2]=1;
						
						
						int result1= p1won();
						int result2= p2won();
						
						if(result1==1) 
						
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 1 has Won" );
						}
						
						else if (result2==1) 
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 2 has Won" );
						}
						
//determining audio for player 1
						
						
						try {
							//in new File you will specify the path of your music file
							
							// and always remember the format
							
							// Format Example = C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\H.wav
							
							AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\SOUNDS USED FOR TIC TAC TOE\\smash.wav")    );
							
							Clip c =AudioSystem.getClip();
							
							c.open(input);
							
							c.start();
							
						}
						
						catch(Exception ee) {}
						
						
						
					}
					else
					{
						
						btnChoosePlayer.setText("Player 2 Turn ,Player 1 Turn Next");
						
						
						turn ++;
						btn3.setText("O");
						buttonused[2]=1;
						p2won[2]=1;
						
						
						
						int result1= p1won();
						int result2= p2won();
						
						if(result1==1) 
						
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 1 has Won" );
						}
						
						else if (result2==1) 
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 2 has Won" );
						}
						
//determining audio for player 2   
						
						
						try {
							//in new File you will specify the path of your music file
							
							// and always remember the format
							
							// Format Example = C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\H.wav
							
							AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\SOUNDS USED FOR TIC TAC TOE\\Light Bulb Breaking.wav")    );
							
							Clip c =AudioSystem.getClip();
							
							c.open(input);
							
							c.start();
							
						}
						
						catch(Exception ee) {}
						
						
						
						
					}
				
					
				}
				else 
				{
					JOptionPane.showMessageDialog(frmTicTacToe, "Cheating is not allowed");
				}
			
				
			}
		});
		btn3.setBounds(192, 71, 83, 70);
		frmTicTacToe.getContentPane().add(btn3);
		btn4.setFont(new Font("ROCK-ON Demo", Font.BOLD, 51));
		btn4.setFocusPainted(false);
		btn4.setBorderPainted(false);
		btn4.setForeground(new Color(255, 106, 0));
		btn4.setBackground(new Color(75, 11, 147));
		
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(buttonused[3]==0) 
				{
					btnChoosePlayer.setText("Player 1 Turn ,Player 2 Turn Next");
					
					
					
					
					if(turn %2== 0) 
					{
						turn++;
						btn4.setText("X");
						buttonused[3]=1;
						p1won[3]=1;
						
						int result1= p1won();
						int result2= p2won();
						
						if(result1==1) 
						
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 1 has Won" );
						}
						
						else if (result2==1) 
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 2 has Won" );
						}
						
//determining audio for player 1
						
						
						try {
							//in new File you will specify the path of your music file
							
							// and always remember the format
							
							// Format Example = C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\H.wav
							
							AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\SOUNDS USED FOR TIC TAC TOE\\smash.wav")    );
							
							Clip c =AudioSystem.getClip();
							
							c.open(input);
							
							c.start();
							
						}
						
						catch(Exception ee) {}
						
						
						
						
					}
					else
					{
						btnChoosePlayer.setText("Player 2 Turn , Player 1 Turn Next");
						
						
						
						turn ++;
						btn4.setText("O");
						buttonused[3]=1;
						p2won[3]=1;
						
						
						
						int result1= p1won();
						int result2= p2won();
						
						if(result1==1) 
						
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 1 has Won" );
						}
						
						else if (result2==1) 
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 2 has Won" );
						}
						
//determining audio for player 2   
						
						
						try {
							//in new File you will specify the path of your music file
							
							// and always remember the format
							
							// Format Example = C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\H.wav
							
							AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\SOUNDS USED FOR TIC TAC TOE\\Light Bulb Breaking.wav")    );
							
							Clip c =AudioSystem.getClip();
							
							c.open(input);
							
							c.start();
							
						}
						
						catch(Exception ee) {}
						
						
						
					}
				
					
				}
				else 
				{
					JOptionPane.showMessageDialog(frmTicTacToe, "Cheating is not allowed");
				}
			
			}
		});
		btn4.setBounds(10, 152, 83, 70);
		frmTicTacToe.getContentPane().add(btn4);
		btn5.setFont(new Font("ROCK-ON Demo", Font.BOLD, 51));
		btn5.setFocusPainted(false);
		btn5.setBorderPainted(false);
		btn5.setForeground(new Color(255, 106, 0));
		btn5.setBackground(new Color(75, 11, 147));
		
		
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(buttonused[4]==0) 
				{
					
					btnChoosePlayer.setText("Player 1 Turn ,Player 2 Turn Next");
					
					
					
					
					if(turn %2== 0) 
					{
						turn++;
						btn5.setText("X");
						buttonused[4]=1;
						p1won[4]=1;
						
						
						int result1= p1won();
						int result2= p2won();
						
						if(result1==1) 
						
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 1 has Won" );
						}
						
						else if (result2==1) 
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 2 has Won" );
						}
						
//determining audio for player 1
						
						
						try {
							//in new File you will specify the path of your music file
							
							// and always remember the format
							
							// Format Example = C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\H.wav
							
							AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\SOUNDS USED FOR TIC TAC TOE\\smash.wav")    );
							
							Clip c =AudioSystem.getClip();
							
							c.open(input);
							
							c.start();
							
						}
						
						catch(Exception ee) {}
						
					}
					else
					{
						btnChoosePlayer.setText("Player 2 Turn ,Player 1 Turn Next ");
						
						
						
						turn ++;
						btn5.setText("O");
						buttonused[4]=1;
						p2won[4]=1;
						
						
						int result1= p1won();
						int result2= p2won();
						
						if(result1==1) 
						
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 1 has Won" );
						}
						
						else if (result2==1) 
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 2 has Won" );
						}
						
//determining audio for player 2   
						
						
						try {
							//in new File you will specify the path of your music file
							
							// and always remember the format
							
							// Format Example = C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\H.wav
							
							AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\SOUNDS USED FOR TIC TAC TOE\\Light Bulb Breaking.wav")    );
							
							Clip c =AudioSystem.getClip();
							
							c.open(input);
							
							c.start();
							
						}
						
						catch(Exception ee) {}
						
						
						
					}
				
					
				}
				else 
				{
					JOptionPane.showMessageDialog(frmTicTacToe, "Cheating is not allowed");
				}
			
			
			}
		});
		btn5.setBounds(103, 152, 83, 70);
		frmTicTacToe.getContentPane().add(btn5);
		btn6.setFont(new Font("ROCK-ON Demo", Font.BOLD, 51));
		btn6.setFocusPainted(false);
		btn6.setBorderPainted(false);
		btn6.setForeground(new Color(255, 106, 0));
		btn6.setBackground(new Color(75, 11, 147));
		
		
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(buttonused[5]==0) 
				{
					
					btnChoosePlayer.setText("Player 1 Turn ,Player 2 Turn Next");
					
					
					if(turn %2== 0) 
					{
						turn++;
						btn6.setText("X");
						buttonused[5]=1;
						p1won[5]=1;
						
						
						int result1= p1won();
						int result2= p2won();
						
						if(result1==1) 
						
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 1 has Won" );
						}
						
						else if (result2==1) 
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 2 has Won" );
						}
						
//determining audio for player 1
						
						
						try {
							//in new File you will specify the path of your music file
							
							// and always remember the format
							
							// Format Example = C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\H.wav
							
							AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\SOUNDS USED FOR TIC TAC TOE\\smash.wav")    );
							
							Clip c =AudioSystem.getClip();
							
							c.open(input);
							
							c.start();
							
						}
						
						catch(Exception ee) {}
					}
					else
					{
						
						btnChoosePlayer.setText("Player 2 Turn , Player 1 Turn Next");
						
						
						turn ++;
						btn6.setText("O");
						buttonused[5]=1;
						p2won[5]=1;
						
						
						int result1= p1won();
						int result2= p2won();
						
						if(result1==1) 
						
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 1 has Won" );
						}
						
						else if (result2==1) 
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 2 has Won" );
						}
						
						
//determining audio for player 2   
						
						
						try {
							//in new File you will specify the path of your music file
							
							// and always remember the format
							
							// Format Example = C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\H.wav
							
							AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\SOUNDS USED FOR TIC TAC TOE\\Light Bulb Breaking.wav")    );
							
							Clip c =AudioSystem.getClip();
							
							c.open(input);
							
							c.start();
							
						}
						
						catch(Exception ee) {}
						
					}
				
					
				}
				else 
				{
					JOptionPane.showMessageDialog(frmTicTacToe, "Cheating is not allowed");
				}
				
			
			}
		});
		btn6.setBounds(192, 152, 83, 70);
		frmTicTacToe.getContentPane().add(btn6);
		btn7.setFont(new Font("ROCK-ON Demo", Font.BOLD, 51));
		btn7.setFocusPainted(false);
		btn7.setBorderPainted(false);
		btn7.setForeground(new Color(255, 106, 0));
		btn7.setBackground(new Color(75, 11, 147));
		
		
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(buttonused[6]==0) 
				{
					btnChoosePlayer.setText("Player 1 Turn , Player 2 Turn Next");
					
					
					
					if(turn %2== 0) 
					{
						turn++;
						btn7.setText("X");
						buttonused[6]=1;
						p1won[6]=1;
						
						
						int result1= p1won();
						int result2= p2won();
						
						if(result1==1) 
						
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 1 has Won" );
						}
						
						else if (result2==1) 
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 2 has Won" );
						}
						
//determining audio for player 1
						
						
						try {
							//in new File you will specify the path of your music file
							
							// and always remember the format
							
							// Format Example = C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\H.wav
							
							AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\SOUNDS USED FOR TIC TAC TOE\\smash.wav")    );
							
							Clip c =AudioSystem.getClip();
							
							c.open(input);
							
							c.start();
							
						}
						
						catch(Exception ee) {}
						
					}
					else
					{
						btnChoosePlayer.setText("Player 2 Turn ,Player 1 Turn Next");
						
						
						
						turn ++;
						btn7.setText("O");
						buttonused[6]=1;
						p2won[6]=1;
						
						
						
						int result1= p1won();
						int result2= p2won();
						
						if(result1==1) 
						
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 1 has Won" );
						}
						
						else if (result2==1) 
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 2 has Won" );
						}
						
//determining audio for player 2   
						
						
						try {
							//in new File you will specify the path of your music file
							
							// and always remember the format
							
							// Format Example = C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\H.wav
							
							AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\SOUNDS USED FOR TIC TAC TOE\\Light Bulb Breaking.wav")    );
							
							Clip c =AudioSystem.getClip();
							
							c.open(input);
							
							c.start();
							
						}
						
						catch(Exception ee) {}
						
						
						
					}
				
					
				}
				else 
				{
					JOptionPane.showMessageDialog(frmTicTacToe, "Cheating is not allowed");
				}
			
			}
		});
		btn7.setBounds(10, 233, 83, 70);
		frmTicTacToe.getContentPane().add(btn7);
		btn8.setFont(new Font("ROCK-ON Demo", Font.BOLD, 51));
		btn8.setFocusPainted(false);
		btn8.setBorderPainted(false);
		btn8.setForeground(new Color(255, 106, 0));
		btn8.setBackground(new Color(75, 11, 147));
		
		
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				
				
				if(buttonused[7]==0) 
				{
					
					btnChoosePlayer.setText("Player 1 Turn , Player 2 Turn Next");
					
					
					
					
					if(turn %2== 0) 
					{
						turn++;
						btn8.setText("X");
						buttonused[7]=1;
						p1won[7]=1;
						
						
						int result1= p1won();
						int result2= p2won();
						
						if(result1==1) 
						
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 1 has Won" );
						}
						
						else if (result2==1) 
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 2 has Won" );
						}
						
//determining audio for player 1
						
						
						try {
							//in new File you will specify the path of your music file
							
							// and always remember the format
							
							// Format Example = C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\H.wav
							
							AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\SOUNDS USED FOR TIC TAC TOE\\smash.wav")    );
							
							Clip c =AudioSystem.getClip();
							
							c.open(input);
							
							c.start();
							
						}
						
						catch(Exception ee) {}
						
						
					}
					else
					{
						btnChoosePlayer.setText("Player 2 Turn , Player 1 Turn Next");
						
						
						
						turn ++;
						btn8.setText("O");
						buttonused[7]=1;
						p2won[7]=1;
						
						
						int result1= p1won();
						int result2= p2won();
						
						if(result1==1) 
						
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 1 has Won" );
						}
						
						else if (result2==1) 
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 2 has Won" );
						}
						
//determining audio for player 2   
						
						
						try {
							//in new File you will specify the path of your music file
							
							// and always remember the format
							
							// Format Example = C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\H.wav
							
							AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\SOUNDS USED FOR TIC TAC TOE\\Light Bulb Breaking.wav")    );
							
							Clip c =AudioSystem.getClip();
							
							c.open(input);
							
							c.start();
							
						}
						
						catch(Exception ee) {}
						
						
					}
				
					
				}
				else 
				{
					JOptionPane.showMessageDialog(frmTicTacToe, "Cheating is not allowed");
				}
			
			}
		});
		btn8.setBounds(103, 233, 83, 70);
		frmTicTacToe.getContentPane().add(btn8);
		btn9.setFont(new Font("ROCK-ON Demo", Font.BOLD, 51));
		btn9.setFocusPainted(false);
		btn9.setBorderPainted(false);
		btn9.setForeground(new Color(255, 106, 0));
		btn9.setBackground(new Color(75, 11, 147));
		
		
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(buttonused[8]==0) 
				{
					btnChoosePlayer.setText("Player 1 Turn ,Player 2 Turn Next");
					
					
					if(turn %2== 0) 
					{
						turn++;
						btn9.setText("X");
						buttonused[8]=1;
						p1won[8]=1;
						
						
						int result1= p1won();
						int result2= p2won();
						
						if(result1==1) 
						
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 1 has Won" );
						}
						
						else if (result2==1) 
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 2 has Won" );
						}
//determining audio for player 1
						
						
						try {
							//in new File you will specify the path of your music file
							
							// and always remember the format
							
							// Format Example = C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\H.wav
							
							AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\SOUNDS USED FOR TIC TAC TOE\\smash.wav")    );
							
							Clip c =AudioSystem.getClip();
							
							c.open(input);
							
							c.start();
							
						}
						
						catch(Exception ee) {}
						
						
						
					}
					else
					{
						
						btnChoosePlayer.setText("Player 2 Turn ,Player 1 Turn Next");
						
						
						turn ++;
						btn9.setText("O");
						buttonused[8]=1;
						p2won[8]=1;
						
						
						int result1= p1won();
						int result2= p2won();
						
						if(result1==1) 
						
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 1 has Won" );
						}
						
						else if (result2==1) 
						{
							JOptionPane.showMessageDialog(frmTicTacToe, "Player 2 has Won" );
						}
						
//determining audio for player 2   
						
						
						try {
							//in new File you will specify the path of your music file
							
							// and always remember the format
							
							// Format Example = C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\H.wav
							
							AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\SOUNDS USED FOR TIC TAC TOE\\Light Bulb Breaking.wav")    );
							
							Clip c =AudioSystem.getClip();
							
							c.open(input);
							
							c.start();
							
						}
						
						catch(Exception ee) {}
						
						
					}
				
					
				}
				else 
				{
					JOptionPane.showMessageDialog(frmTicTacToe, "Cheating is not allowed");
				}
				
			
			
			}
		});
		btn9.setBounds(192, 233, 83, 70);
		frmTicTacToe.getContentPane().add(btn9);
		
		
		
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFocusPainted(false);
		btnReset.setBorderPainted(false);
		btnReset.setFont(new Font("Roboto", Font.BOLD, 17));
		btnReset.setBackground(new Color(55, 255, 0));
		btnReset.setForeground(Color.WHITE);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
				
				btn1.setText("");		
				btn2.setText("");
				btn3.setText("");
				btn4.setText("");
				btn5.setText("");
				btn6.setText("");
				btn7.setText("");
				btn8.setText("");
				btn9.setText("");
				
				turn =2;
				
				// it will write 0 on every index value of array
				for(int i =0 ; i <9 ;i++)
				{
					buttonused[i]=0;
				}
				
				for(int i =0 ; i <9 ;i++)
				{
					p1won[i]=0; // it will reset the value from 1 to zero
				}
				
				for(int i =0 ; i <9 ;i++)
				{
					p2won[i]=0; // it will reset the value from 1 to 0
				}
				
				
				
				
				
				
			
			
			}
		});
		btnReset.setBounds(103, 429, 83, 23);
		frmTicTacToe.getContentPane().add(btnReset);
		btnChoosePlayer.setFocusPainted(false);
		btnChoosePlayer.setBorderPainted(false);
		btnChoosePlayer.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnChoosePlayer.setForeground(Color.WHITE);
		btnChoosePlayer.setBackground(new Color(75, 11, 147));
		
		
		btnChoosePlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			}
		});
		btnChoosePlayer.setBounds(10, 314, 265, 50);
		frmTicTacToe.getContentPane().add(btnChoosePlayer);
		lblPlayerScore.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPlayerScore.setForeground(Color.WHITE);
		lblPlayerScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerScore.setBounds(83, 379, 103, 14);
		
		frmTicTacToe.getContentPane().add(lblPlayerScore);
		lblPlayerOneScore.setForeground(Color.WHITE);
		lblPlayerOneScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerOneScore.setBounds(176, 379, 46, 14);
		
		frmTicTacToe.getContentPane().add(lblPlayerOneScore);
		lblPlayerScore_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPlayerScore_1.setForeground(Color.WHITE);
		lblPlayerScore_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerScore_1.setBounds(83, 404, 103, 14);
		
		frmTicTacToe.getContentPane().add(lblPlayerScore_1);
		lblPlayerTwoScore.setForeground(Color.WHITE);
		lblPlayerTwoScore.setBackground(Color.BLACK);
		lblPlayerTwoScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerTwoScore.setBounds(176, 404, 46, 14);
		
		frmTicTacToe.getContentPane().add(lblPlayerTwoScore);
		lblPlayer.setForeground(Color.WHITE);
		lblPlayer.setBackground(Color.WHITE);
		lblPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer.setBounds(10, 46, 83, 14);
		
		frmTicTacToe.getContentPane().add(lblPlayer);
		lblPlayer_1.setForeground(Color.WHITE);
		lblPlayer_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer_1.setBounds(192, 46, 83, 14);
		
		frmTicTacToe.getContentPane().add(lblPlayer_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 291, 35);
		frmTicTacToe.getContentPane().add(panel);
		panel.setLayout(null);
		btnMinimize.setBounds(190, 3, 50, 23);
		panel.add(btnMinimize);
		btnMinimize.setForeground(Color.WHITE);
		btnMinimize.setFocusPainted(false);
		btnMinimize.setBorderPainted(false);
		btnMinimize.setBackground(Color.BLACK);
		btnMinimize.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMinimize.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btnX = new JButton("X");
		btnX.setBounds(241, 3, 50, 23);
		panel.add(btnX);
		btnX.setForeground(Color.WHITE);
		btnX.setFocusPainted(false);
		btnX.setBorderPainted(false);
		btnX.setBackground(Color.BLACK);
		btnX.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel_1.setLayout(null);
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 471, 291, 35);
		
		
		
		
		
		
		
		
		frmTicTacToe.getContentPane().add(panel_1);
		
		
		
		
		
		
		
		
		
		
		
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				frmTicTacToe= new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frmTicTacToe, "Confirm if you want to exit","Tic Tac Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) 
				{
					
					// by this command System.exit(0) we get executed from the window
					System.exit(0);
				}
			
			}
		});
		
		
		
		btnMinimize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				
				
				
				
				//YourFrameName is the Frame name you had set or it is set by default ,, use that frame name here
				
				
				
				//this code will come in your minimize button action
				
			//frmTicTacToe = my frame name ,here you will define Your frame name instead of this name
				
				//YourFrameName.setState(YourFrameName.ICONIFIED);
				
              //your frame name     //setState(Your Frame Name.ICONIFIED )
				frmTicTacToe.setState(frmTicTacToe.ICONIFIED);
			
			
			}
		});
		
		/*
		 * 
		private final Action minimizeAction = new AbstractAction("Minimize")
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            setState(JFrame.ICONIFIED);
        }
    };
		 * 
		 * */
	
	
	
		
		
		
		
		
		
		
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
