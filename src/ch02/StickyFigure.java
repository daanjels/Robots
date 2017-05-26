package ch02;
import javax.swing.*;
import java.awt.*;

/** A new kind of component that displays a stick figure.
 * 
 * @author arq
 *
 */

public class StickyFigure extends JComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel contents = new JPanel();
		StickyFigure stickFig = new StickyFigure();
		
		contents.add(stickFig);
		
		frame.setContentPane(contents);
		frame.setTitle("Stick Figure");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(250, 100);
		frame.pack();
		frame.setVisible(true);
	}
	public StickyFigure() {
		super();
		
		Dimension prefSize = new Dimension(180, 270);
		this.setPreferredSize(prefSize);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//	Paint the head
		g.setColor(Color.YELLOW);
		g.fillOval(60, 0, 60, 60);
		
		//	Paint the shirt
		g.setColor(Color.RED);
		g.fillRect(0, 60, 180, 30);
		g.fillRect(60,  60,  60, 90);
		
		//	Paint the pants
		g.setColor(Color.BLUE);
		g.fillRect(60, 150, 60, 120);
		g.setColor(Color.BLACK);
		g.fillRect(90, 180, 2, 90);
	}
}
