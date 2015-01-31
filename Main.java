import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;


public final class Main{
	public static final int screenW = 1400;
	public static final int screenH = 900;

	
	
	public static void main(String[] args) throws InterruptedException{		
		
		
		
	
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setSize(screenW, screenH);
		
		frame.setVisible(true);
		
		frame.add(drawer);
		
		
	}
}