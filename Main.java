package src;


//This "Main" class runs the game. 

//Imports
import javax.swing.*;
import java.awt.*;

//Class definition
public class Main extends JFrame implements Constants {
	//Variables
	private static JFrame frame;
	private static Board board;
	private static Container pane;
	private static Dimension dim;

	//Build and run the game
	public static void main(String[] args) {
		frame = new JFrame("Brick Breaker 1.1.1");
		frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		board = new Board(WINDOW_WIDTH, WINDOW_HEIGHT);

		pane = frame.getContentPane();
		pane.add(board);

		//Place frame in the middle of the screen
		dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
		
		
		frame.setVisible(true);
	}
}