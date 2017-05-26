package ch02;
import javax.swing.*;

public class ClosemyFrame extends JFrame {
	public ClosemyFrame(int xPos, int yPos, int width, int height) {
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setLocation(xPos, yPos);
		super.setSize(width, height);
		super.setVisible(true);
	}
}
