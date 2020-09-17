import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.lang.Thread;





public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DateThread();
	}

}


class DateThread extends Frame implements Runnable
{
    private Label lblOne;
    private Date dd;
    private Thread th;

    public DateThread()
    {
        setTitle("Current time");
        setSize(200,150);
        setVisible(true);
        setLayout(new FlowLayout());
        addWindowListener(new WindowAdapter() {
            public void windowClose(WindowEvent we){
                System.exit(0);
            }
        });
        lblOne = new Label("00:00:00");
        add(lblOne);

        th = new Thread(this);
        th.start(); // here thread starts
    }

    public void run()
    {
        try
        {
            do
            {
                dd = new Date();
                lblOne.setText(dd.getHours() + " : " + dd.getMinutes() + " : " + dd.getSeconds());
                Thread.sleep(1000);  // 1000 = 1 second
            }while(th.isAlive());
        }
        catch(Exception e)
        {

        }
    }}
