/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;
/**
 *
 * @author RehanUsmani
 */
public class work extends JPanel implements ActionListener {
    // these are our global variable with private access modifier
    private int space; //space between the oponent cars
    private int speed; //speed of cars opponent cars
    private int WIDTH=500; //width of the frame
    private int HEIGHT=700; // heigh of the frame

    private int width=80;
    private int height=70;
    
    
// creating cars for opponent
    private ArrayList<Rectangle> ocars  ;
   
// creating random numbers
private Random rand;    

//creating car for player
    private  Rectangle car;
    
    //adding timer
    Timer t;
    
    //make a constructor
    public work()
    {
        //creating instance of timer
        t=new Timer(20,this);//(this ) keyword refers to the action listiner that we created
        
        // initializing new random value object variable
        rand = new Random();
        
        
        //initializing Array list of Opponent cars over here
        ocars= new ArrayList<Rectangle/*letting it empty will not give you error nor it is wrong*/>();
        
        /*here we initialize the values for our player car*/
        car = new Rectangle(WIDTH/2-90/*x cordinate*/,HEIGHT -100/*y cordinate*/,width/*width*/,height/*height*/);
    space = 100;
    
    speed =2;
    addocars(true);
    addocars(true);
    addocars(true);
    addocars(true);
    t.start();
    }
    
    public void addocars(boolean first)
    {
        int positionx=rand.nextInt()%2;
    int x=0;   
    int y=0;
    int Width=width;// this is the width of our oponent cars which is equal to our global variable
    int Height=height;
    
    //defining logic
    if(positionx==0)
    {
        //WIDTH = width of our frame
    x=WIDTH/2 - 90; // starting from the same point from where our player car is situated it is the opponent cordinate position
    }
    else
    {
    x=WIDTH/2 +10;// here it will define the opponent cordinate position
    }
    // start video from 4th tuotorial
    if(first)
    {
    ocars.add(new Rectangle(x,y-100-(ocars.size()  * space    )  ,Width ,Height )   ); // remember ocars is our ArrayList and we are using Array list to add oponent cars
    }
    else{
    ocars.add(new Rectangle ( x,ocars.get(ocars.size()-1).x+space,Width,Height  ) );
    }
    
    }
    
    public void paintComponent(Graphics g)
    {
    super.paintComponent(g);
    // building the main back ground and assining color to it 
    g.setColor(Color.cyan); // setting color for background
    g.fillRect(0, 0, WIDTH, HEIGHT);
    
    // now making the path or track on which cars will be moving
    g.setColor(Color.orange); // setting color for the race track
    g.fillRect(WIDTH/2 -100, 0, 200, HEIGHT);
   
    //set things up for our car
    g.setColor(Color.red);
    g.fillRect(car.x, car.y, car.width , car.height);/*these are the value that we created in our work constructor */
    
    g.setColor(Color.blue);
    
    
    //making line to devide our path in two ways 
    g.drawLine(WIDTH/2, 0, WIDTH/2, HEIGHT);
    
    g.setColor(Color.MAGENTA);
    
    for(Rectangle rect : ocars)
    {
    g.fillRect(rect.x, rect.y, rect.width, rect.height);
    }
    }
    
    
    public void actionPerformed(ActionEvent e){
    
    Rectangle rect;
    
    for(int i=0;i<ocars.size();i++)
    {
   
       rect = ocars.get(i);
       rect.y= rect.y + speed;
    }
    
    repaint();
    
    } // ya action listener ka interface ka ander contract sign ha k ya method zaroor lga ga ha jub tk ya implement nai ho ga tub tak class pa error ata reha ga
    
    
    
}
