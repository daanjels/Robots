package ch05;

import javax.swing.*;
import java.awt.*;

/**	Create a component that paints our 'art'
 * 
 * @author arq
 *
 */

public class ArtContent extends JComponent {
	public ArtContent() {
		super();
		this.setPreferredSize(new Dimension(600,600));
	}
	
	/**	Paint the component with our 'art' */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// Standard stuff to scale teh image.
		Graphics2D g2 = (Graphics2D) g;
		g2.scale(this.getWidth()/200, this.getHeight()/200);
		g2.setStroke(new BasicStroke(1.0F/this.getWidth()));
		g2.setColor(Color.ORANGE);
		g2.fillRect(0, 0, 200, 200);

		// draw our 'art'
		g2.setColor(Color.BLUE);
		for (int i = 1; i < 100; i += 1) {
			int x = i*7/3;
			int y = i*2;
			g2.fillOval(x, y, 2, 2);
		}
		g2.setColor(Color.RED);
		for (int i = 1; i < 100; i += 1) {
			int x = i*5;
			int y = (i*i)/5;
			g2.fillOval(x, y, 2, 2);
		}
	}
}
