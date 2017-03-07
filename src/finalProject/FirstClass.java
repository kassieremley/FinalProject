package finalProject;

/**
 * @author KR131457
 *
 */
import java.awt.Dimension;
import javax.swing.JFrame;
public class FirstClass 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Snake");
		frame.setContentPane(new GamePanel());
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setPreferredSize(new Dimension(GamePanel.WIDTH, GamePanel.HEIGHT));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);



public class FirstClass {

	public static void main(String[] args){
	private int Board() {
			// TODO Auto-generated method stub
			return 0;
			{
		int[] Board;
		int[] y;
		double movingUp;
		
		
		

	}

		private int joints = 0; 
		private int[] x;
		private int[] y;

		public int getSnakeX(int index) {
			return x[index];
		}

		public int getSnakeY(int index) {
		    int[] y = null;
			return y[index];
		}

		public void setSnakeX(int i) {
		    x[0] = i;
		}

		public void setSnakeY(int i) {
		    y[0] = i;
		}

		public boolean isMovingLeft() {
		    return movingLeft;
		}

		public void setMovingLeft(boolean movingLeft) {
		    this.movingLeft = movingLeft;
		}

		public boolean isMovingRight() {
		    return movingRight;
		}

		public void setMovingRight(boolean movingRight) {
		    this.movingRight = movingRight;
		}

		public boolean isMovingUp() {
		    return movingUp;
		}

		public void setMovingUp(boolean movingUp) {
		    this.movingUp = movingUp;
		}

		public boolean isMovingDown() {
		    return movingDown;
		}

		public void setMovingDown(boolean movingDown) {
		    this.movingDown = movingDown;
		}

		public int getJoints() {
		    return joints;
		}

	

		}
	
}      




	    