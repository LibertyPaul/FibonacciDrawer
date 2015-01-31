import java.awt.Color;
import java.awt.Graphics;

enum Direction{
	RIGHT,
	UP,
	LEFT,
	DOWN;
	
	public static int getValue(Direction direction) throws Exception{
		switch(direction){
		case RIGHT:
			return 0;
		case UP:
			return 1;
		case LEFT:
			return 2;
		case DOWN:
			return 3;
		default:
			throw new Exception("incorrect enum value");
		}
	}
	
	public static Direction rotateForward(Direction direction)
}

public class Square {
	private Coord vertex;
	private int width, height;
	private Direction currentDirection = Direction.RIGHT;
	
	private int value;
	private Color borderColor = Color.black;
	private Color fillColor = Color.black;
	

	public Square(Coord vertex, int width, int height, int value, Direction direction){
		this.vertex = new Coord(vertex);
		this.width = width;
		this.height = height;
		
		this.value = value;
		this.currentDirection = direction;
	}
	
	public Square(Coord vertex1, Coord vertex2, int value, Direction direction){
		this(vertex1, vertex2.getX() - vertex1.getX(), vertex2.getY() - vertex1.getY(), value, direction);
	}
	
	
	
	private void rotate1time() throws Exception{
		int t = 0;
		switch(currentDirection){
		case RIGHT:
			t = width;
			width = height;
			height = t;
			break;
		
		case UP:
			t = width;
			width = height;
			height = -t;
			break;
		
		case LEFT:
			t = width;
			width = -height;
			height = t;
			break;
		
		case DOWN:
			t = width;
			width = -height;
			height = -t;
			break;
		
		default:
			throw new Exception("unknown enum value");
		}
	}
	
	public void rotate(Direction direction) throws Exception{
		int turnCount = Direction.getValue(direction) - Direction.getValue(currentDirection);
		if(turnCount > 3)
			turnCount %= 4;
		if(turnCount < 0)
			turnCount = 4 - (turnCount % 4);
		
		for(int i = 0; i < turnCount; ++i)
			rotate1time();
	}
	
	public void draw(Graphics g){
		g.setColor(fillColor);
		g.fillRect(vertex.getX(), vertex.getY(), width, height);
		g.setColor(borderColor);
		g.drawRect(vertex.getX(), vertex.getY(), width, height);
	}
	
	
	
}
