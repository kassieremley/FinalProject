package finalProject;

import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Snake extends JFrame {

    public Snake() throws IOException {
	
        add(new Board());
        
        setResizable(false);
        pack();
        
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainInterface.choice3 = JOptionPane.showOptionDialog(null, "Would you like to play another game?", "GAMES", JOptionPane.YES_NO_CANCEL_OPTION, 
    			JOptionPane.QUESTION_MESSAGE, null, MainInterface.choice2, MainInterface.choice2[1]);
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {                
                JFrame ex = null;
				try {
					ex = new Snake();
				} catch (IOException e) {
					e.printStackTrace();
				}
                ex.setVisible(true);                
            }
            
        });
        
    }
}





	    