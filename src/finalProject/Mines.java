package finalProject;

import java.awt.BorderLayout;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;


public class Mines extends JFrame {
	
	private final int FRAME_WIDTH = 250;
	private final int FRAME_HEIGHT = 250;
	
	private final JLabel statusbar;
	
	public Mines() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setLocationRelativeTo(null);
		setTitle("Minesweeper");
		
		statusbar = new JLabel("");
		add(statusbar, BorderLayout.SOUTH);
		
		add(new MinesweeperBoard());
		
		setResizable(false);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
		
			@Override
			public void run() {
				JFrame ex = null;
				try {
					ex = new Mines();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ex.setVisible(true);
			}
		});
	}
	}

