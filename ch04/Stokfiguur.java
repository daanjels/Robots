package ch04;

import javax.swing.*;
import java.awt.*;

/** A new kind of component that displays a stick figure.
 * 
 * @author arq
 *
 */

public class Stokfiguur extends JComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel contents = new JPanel();
		Stokfiguur stickFig = new Stokfiguur();
		
		contents.add(stickFig);
		
		frame.setContentPane(contents);
		frame.setTitle("Stick Figure");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(250, 100);
		frame.pack();
		frame.setVisible(true);
	}
	public Stokfiguur() {
		super();
		
		Dimension prefSize = new Dimension(180, 270);
		this.setPreferredSize(prefSize);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//	Standard stuff to scale the image
		Graphics2D g2 = (Graphics2D)g; // expand capabilities of the graphics component
		g2.scale(this.getWidth()/6, this.getHeight()/9); // set the scaling values
		g2.setStroke(new BasicStroke(1.0F/this.getWidth())); // set the stroke size
		
		//	Paint the head
		g2.setColor(Color.YELLOW);
		g2.fillOval(2, 0, 2, 2);
		
		//	Paint the shirt
		g2.setColor(Color.RED);
		g2.fillRect(0, 2, 6, 1);
		g2.fillRect(2, 2, 2, 3);
		
		//	Paint the pants
		g2.setColor(Color.BLUE);
		g2.fillRect(2, 5, 2, 4);
		g2.setColor(Color.BLACK);
		g2.drawLine(3, 6, 3, 9);
	}
}