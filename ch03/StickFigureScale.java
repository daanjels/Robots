package ch03;
import java.awt.*;

import javax.swing.*;

public class StickFigureScale extends JComponent {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel contents = new JPanel();
		StickFigureScale stickFig = new StickFigureScale();
		
		contents.add(stickFig);
		
		frame.setContentPane(contents);
		frame.setTitle("Stick Figure");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(250, 100);
		frame.pack();
		frame.setVisible(true);
	}

	public StickFigureScale() {
		super ();
		Dimension prefSize = new Dimension(170, 270);
		this.setPreferredSize(prefSize);
	}

	public void paintComponent(Graphics g)
	{ super.paintComponent(g);

	// Standard stuff to scale the image
	// in this case based on a 6 X 9 grid
	   Graphics2D g2 = (Graphics2D)g;
	   g2.scale(this.getWidth()/6, this.getHeight()/9);
	   g2.setStroke(new BasicStroke(1.0F/this.getWidth()));
	
	 // head
	   g2.setColor(Color.YELLOW);
	   g2.fillOval(2, 0, 2, 2);
	  
	 // shirt
	   g2.setColor(Color.RED);
	   g2.fillRect(0, 2, 6, 1);
	   g2.fillRect(2, 2, 2, 3);
	  
	 // pants
	   g2.setColor(Color.BLUE);
	   g2.fillRect(2, 5, 2, 4);
	   g2.setColor(Color.BLACK);
	   g2.drawLine(3, 6, 3, 9);
	}
}
