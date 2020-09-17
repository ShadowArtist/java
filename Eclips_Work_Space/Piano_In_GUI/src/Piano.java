import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File; // this library was missing so i was getting error 
import java.awt.event.ActionEvent; // this library was also missing so i was getting error
import java.awt.Color;



public class Piano {

	private JFrame frmPianoApplication;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Piano window = new Piano();
					window.frmPianoApplication.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Piano() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPianoApplication = new JFrame();
		frmPianoApplication.setTitle("Piano Application");
		frmPianoApplication.setBounds(100, 100, 475, 322);
		frmPianoApplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPianoApplication.getContentPane().setLayout(null);
		
		JButton Button_A_Black = new JButton("New button");
		Button_A_Black.setBackground(Color.BLACK);
		Button_A_Black.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			
			try {
				
				AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\A.wav")    );
				
				Clip c =AudioSystem.getClip();
				
				c.open(input);
				
				c.start();
				
			}
			
			catch(Exception e) {}
			
			
			
			
			
			
			
			
			
			
			}
		});
		Button_A_Black.setBounds(37, 11, 18, 179);
		frmPianoApplication.getContentPane().add(Button_A_Black);
		
		JButton Button_B_Black = new JButton("New button");
		Button_B_Black.setBackground(Color.BLACK);
		Button_B_Black.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
				try {
					
					AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\B.wav")    );
					
					Clip c =AudioSystem.getClip();
					
					c.open(input);
					
					c.start();
					
				}
				
				catch(Exception ee) {}
			
			}
		});
		Button_B_Black.setBounds(75, 11, 18, 179);
		frmPianoApplication.getContentPane().add(Button_B_Black);
		
		JButton Button_C_Black = new JButton("New button");
		Button_C_Black.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try {
					
					AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\C.wav")    );
					
					Clip c =AudioSystem.getClip();
					
					c.open(input);
					
					c.start();
					
				}
				
				catch(Exception eee) {}
			
			}
		});
		Button_C_Black.setBackground(Color.BLACK);
		Button_C_Black.setBounds(173, 11, 18, 179);
		frmPianoApplication.getContentPane().add(Button_C_Black);
		
		JButton Button_D_Black = new JButton("New button");
		Button_D_Black.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
				try {
					
					AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\D.wav")    );
					
					Clip c =AudioSystem.getClip();
					
					c.open(input);
					
					c.start();
					
				}
				
				catch(Exception ee) {}
			
			
			}
		});
		Button_D_Black.setBackground(Color.BLACK);
		Button_D_Black.setBounds(223, 11, 18, 179);
		frmPianoApplication.getContentPane().add(Button_D_Black);
		
		JButton Button_E_Black = new JButton("New button");
		Button_E_Black.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try {
					
					AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\E.wav")    );
					
					Clip c =AudioSystem.getClip();
					
					c.open(input);
					
					c.start();
					
				}
				
				catch(Exception ee) {}
			
			
			}
		});
		Button_E_Black.setBackground(Color.BLACK);
		Button_E_Black.setBounds(267, 11, 18, 179);
		frmPianoApplication.getContentPane().add(Button_E_Black);
		
		JButton Button_F_Black = new JButton("New button");
		Button_F_Black.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try {
					
					AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\F.wav")    );
					
					Clip c =AudioSystem.getClip();
					
					c.open(input);
					
					c.start();
					
				}
				
				catch(Exception ee) {}
			
			}
		});
		Button_F_Black.setBackground(Color.BLACK);
		Button_F_Black.setBounds(377, 11, 18, 179);
		frmPianoApplication.getContentPane().add(Button_F_Black);
		
		JButton Button_G_Black = new JButton("New button");
		Button_G_Black.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try {
					
					AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\G.wav")    );
					
					Clip c =AudioSystem.getClip();
					
					c.open(input);
					
					c.start();
					
				}
				
				catch(Exception ee) {}
			}
		});
		Button_G_Black.setBackground(Color.BLACK);
		Button_G_Black.setBounds(417, 11, 18, 179);
		frmPianoApplication.getContentPane().add(Button_G_Black);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
                     try {
					
					AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\H.wav")    );
					
					Clip c =AudioSystem.getClip();
					
					c.open(input);
					
					c.start();
					
				}
				
				catch(Exception ee) {}
			
			
			
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(4, 0, 56, 283);
		frmPianoApplication.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
try {
					
					AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\I.wav")    );
					
					Clip c =AudioSystem.getClip();
					
					c.open(input);
					
					c.start();
					
				}
				
				catch(Exception ee) {}}
		});
		button.setBackground(Color.WHITE);
		button.setBounds(58, 0, 56, 283);
		frmPianoApplication.getContentPane().add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
try {
					
					AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\J.wav")    );
					
					Clip c =AudioSystem.getClip();
					
					c.open(input);
					
					c.start();
					
				}
				
				catch(Exception ee) {}
			
			
			
			
			
			
			
			
			
			}
		});
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(117, 0, 56, 283);
		frmPianoApplication.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("New button");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
try {
					
					AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\K.wav")    );
					
					Clip c =AudioSystem.getClip();
					
					c.open(input);
					
					c.start();
					
				}
				
				catch(Exception ee) {}
			
			}
		});
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(173, 0, 56, 283);
		frmPianoApplication.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("New button");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
try {
					
					AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\L.wav")    );
					
					Clip c =AudioSystem.getClip();
					
					c.open(input);
					
					c.start();
					
				}
				
				catch(Exception ee) {}
			
			
			}
		});
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(223, 0, 56, 283);
		frmPianoApplication.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("New button");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
try {
					
					AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\M.wav")    );
					
					Clip c =AudioSystem.getClip();
					
					c.open(input);
					
					c.start();
					
				}
				
				catch(Exception ee) {}
			
			}
		});
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(277, 0, 56, 283);
		frmPianoApplication.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("New button");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
                     try {
					
					AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\O.wav")    );
					
					Clip c =AudioSystem.getClip();
					
					c.open(input);
					
					c.start();
					
				}
				
				catch(Exception ee) {}
			
			}
		});
		button_5.setBackground(Color.WHITE);
		button_5.setBounds(401, 0, 56, 283);
		frmPianoApplication.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("New button");
		button_6.setBackground(Color.WHITE);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
try {
					
					AudioInputStream input = AudioSystem.getAudioInputStream( new File("C:\\Users\\RehanUsmani\\Desktop\\Eureka Java Basic Course\\CODE OF AUDIO_STREAM IN JAVA\\Music_Note\\N.wav")    );
					
					Clip c =AudioSystem.getClip();
					
					c.open(input);
					
					c.start();
					
				}
				
				catch(Exception ee) {}
			}
		});
		button_6.setBounds(343, 0, 56, 283);
		frmPianoApplication.getContentPane().add(button_6);
	}
}
