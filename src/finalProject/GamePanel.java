package finalProject;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class  GamePanel extends JPanel implements Runnable, KeyListener 
{
	int[] boardHEIGHT = {400, 600, 800};
	int[] boardWIDTH = {400, 600, 800};

	private Thread thread;
	private boolean running; 
	
	
	public static Container GamePanel1(int[] boardHEIGHT, int[] boardWIDTH) 
	{
		new Dimension(boardWIDTH[0], boardHEIGHT[0]);
		setFocusable(true);
		requestFocus();
		addKeyListener(this);
		
	}
	public static Container GamePanel2(int[] boardHEIGHT, int[] boardWIDTH) 
	{
		new Dimension(boardWIDTH[1], boardHEIGHT[1]);
		setFocusable(true);
		requestFocus();
		addKeyListener(this);
	}
	public static Container GamePanel3(int [] boardHEIGHT, int[] boardWIDTH) 
	{
		new Dimension(boardWIDTH[2], boardHEIGHT[2]);
		setFocusable(true);
		requestFocus();
		addKeyListener(this);
	}
	public void addNotify() {
		super.addNotify();
		thread = new Thread(this);
		thread.start();
	}
	@Override
	public void keyPressed(KeyEvent arg0) 
	{

	}

	@Override
	public void keyReleased(KeyEvent arg0) 
	{

	}

	@Override
	public void keyTyped(KeyEvent arg0) 
	{

	}

	@Override
	public void run() 
	{
		if(running) return;
		init();
		while(running){
			
		}
	}
	private void init() 
	{
		running = true;
		setFPS(10);	
	}


}
