package finalProject;

/**
 * @author KR131457
 *
 */
import java.awt.Container;
import java.awt.Dimension; 

import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class FirstClass 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Snake");
		int userInput = Integer.parseInt(JOptionPane.showInputDialog(null, "What size board would you like? \n(1)40x40 \n(2)60x60 \n(3)80x80"));
		if(userInput == 1)
		{
			frame.setContentPane(GamePanel.GamePanel1());
		}
		if(userInput == 2)
		{
			frame.setContentPane(GamePanel.GamePanel2());
		}
		else
		{
			frame.setContentPane(GamePanel.GamePanel3());
		}
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setPreferredSize(new Dimension(GamePanel.WIDTH, GamePanel.HEIGHT));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}



	    