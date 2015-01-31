import java.awt.Canvas;
import java.awt.Graphics;


public class FibonacciDrawer extends Canvas {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final int sequenceLength = 100;
	private final int barSize = 5;
	
	
	public void paint(Graphics g){
		Coord currentCoord = new Coord((int)(Main.screenW / 2), (int)(Main.screenH / 2));
		Direction currentDirection = Direction.RIGHT;
		
		int lower = 1, higher = 1;
		
		Square first = new Square(currentCoord, barSize * lower, barSize, lower, currentDirection);
		first.rotate(Direct)
		
		for(int i = 0; i < sequenceLength; ++i){
			
		}
	}
	

}
