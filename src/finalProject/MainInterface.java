package finalProject;

import javax.swing.JOptionPane;
public class MainInterface 
{
	public static int choice3 = 0;
	public static String[] choice2 = {"Yes","No"};

	public static void main(String[] args) 
	{
		String[] games = {"Snake", "Minesweeper", "Tetris"};
		String[] choice = {"Yes","No"};
		int choice1;
		choice1 = JOptionPane.showOptionDialog(null, "Would you like to play a game?", "GAMES", JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.QUESTION_MESSAGE, null, choice, choice[1]);
		if(choice1 == 0)
		{
	do {
		int variable = JOptionPane.showOptionDialog(null, "What game would you like to play?", "GAMES", JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.QUESTION_MESSAGE, null, games, games[0]);
		if(variable == 0)
		{
			Snake.main(args);
		}
		if(variable == 1)
		{
			MineSweeper.main(args);
		}
		if(variable == 2)
		{
			
		}
	}while(choice3 == 0);
	}
		else
		{
			JOptionPane.showMessageDialog(null, "Okay :)");
		}
	}

}
