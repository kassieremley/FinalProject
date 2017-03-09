package finalProject;

import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.JFrame;


public class Snake extends JFrame {

    public Snake() throws IOException {
	
        add(new Board());
        
        setResizable(false);
        pack();
        
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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





	    