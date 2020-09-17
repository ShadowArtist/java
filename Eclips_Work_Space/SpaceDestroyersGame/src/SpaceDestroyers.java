import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class SpaceDestroyers extends JFrame implements KeyListener,MouseMotionListener{

	//this holds the components
	Container cont;
	
	
	//this is the current level:
	int currentLevel = 1;
	//this is the number of enemies:
	int numOfEnemies = 1;
	
	
	
	
	//this is the bullet’s image:
	ImageIcon shipBullet = new ImageIcon ("shipBullet.PNG");
	//this holds the player’s bullets
	ArrayList playerBullets = new ArrayList();
	//this holds the enemies
	ArrayList enemies = new ArrayList();
	
	
	
	
	
	//these are the ship’s images
	//ship images dalna folder main
	//yehan pa bilkul aishe nam pngfile dalo aur same name yehan pa likh do 
	//SpaceDestroyersGame ka folder k ander images dlain ge 
	//aur nam string main he aye ga ku ka parameter k ander define ha
	ImageIcon shipImg = new ImageIcon("ship.PNG");
	ImageIcon shipHit = new ImageIcon("shipHit.PNG");
	//this is the player’s ship
	JLabel ship = new JLabel(shipImg);
	
	
	
	
	
	//these are the images of the enemies
	ImageIcon enemyImg = new ImageIcon ("enemy.PNG");
	ImageIcon enemyHit = new ImageIcon ("enemyHit.PNG");
	
	
	
	
	
	
	
	
	
	public SpaceDestroyers()
	{
	super("Space Destroyers");
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(500,700);
	cont = getContentPane();
	cont.setLayout(null);
	//set the background color
	cont.setBackground(Color.BLACK);
	cont.add(ship);
	ship.setBounds(225, 550,50,50);
	addMouseMotionListener(this);
	setContentPane(cont);
	}
	
	
	public void populateEnemies()
	{
	for(int i = 0; i <= numOfEnemies; i++)
	{
	JLabel tempEnemy = new JLabel(enemyImg);
	int randLocation = (int)(Math.random()*500);
	enemies.add(tempEnemy);
	cont.add((JLabel)(enemies.get(i)));
	tempEnemy.setBounds(randLocation,10,30,30);
	cont.setComponentZOrder(((JLabel)(enemies.get(i))),0);
	}
	}
	
	
	public class Play extends Thread
	{
	public void run()
	{
	while(true)
	{
	try
	{
	for(int i = 0; i < enemies.size(); i++)
	{
	JLabel tempEnemy = (JLabel)(enemies.get(i));
	int distance = (int)(Math.random()*2);
	tempEnemy.setBounds(tempEnemy.getX(),tempEnemy.getY()+distance,30,30);
	if(tempEnemy.getBounds().intersects(ship.getBounds()))
	{
	cont.remove(tempEnemy);
	}
	if(tempEnemy.getY()>550)tempEnemy.setBounds(tempEnemy.getX(), 10, 30, 30);
	}
	//chack if the player’s bullets hit the aliens
	boolean breakAll = false;
	for(int i = 0; i < playerBullets.size(); i++)
	{
	JLabel temp = ((JLabel)(playerBullets.get(i)));
	
	int tempY=temp.getY();
	int tempYMinus=tempY-8;
	temp.setBounds(temp.getX(),tempYMinus,10,20);
	
	if(temp.getY()<0)
	{
	cont.remove(temp);
	playerBullets.remove(i);
//	ι− −;
	}
	for(int j = 0; j < enemies.size(); j++)
	{
	JLabel tempEnemy = (JLabel)(enemies.get(j));
	
	if(temp.getBounds().intersects(tempEnemy.getBounds()))
	{
	tempEnemy.setIcon(enemyHit);
	Thread.sleep(100);
	enemies.remove(j);
	cont.remove(tempEnemy);
	numOfEnemies--;
	
	if(numOfEnemies<=0)
	{
	currentLevel++;
	numOfEnemies = currentLevel * currentLevel;
	populateEnemies();
	breakAll = true;
	break;
	}
	}
	}
	if(breakAll)
	break;
	}
	
	
	cont.repaint();
	Thread.sleep(10);
	}
	catch(Exception e){ }
	}
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void mouseMoved(MouseEvent event)
	{
		int a=event.getX();
		int aMinus= a-25;
		
		int b=event.getY();
		int bMinus=b-40;
		
	ship.setBounds(aMinus, bMinus , 50 ,50);
	}
	
	
	
	
	public void mouseDragged(MouseEvent event){ }
	
	
	
	public void keyPressed(KeyEvent event)
	{
	if(event.getKeyChar()==' ')
	{
	JLabel tempBullet = new JLabel(shipBullet);
	
	
	int shipY=ship.getY();
	int shipYMinus=shipY-20;
	tempBullet.setBounds(ship.getX()+20,shipYMinus,10,20);
	playerBullets.add(tempBullet);
	
	
	int playerBuletSize=playerBullets.size();
	
	int playerBuletSizeMinus=playerBuletSize-1;
	
	cont.add((JLabel)(playerBullets.get(playerBuletSizeMinus)));
	cont.setComponentZOrder((JLabel)(playerBullets.get(playerBuletSizeMinus)),0);
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main (String[ ] args)
	{
	new SpaceDestroyers();
	}


	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	}
	

