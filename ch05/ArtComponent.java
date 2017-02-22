package ch05;

import javax.swing.*;

import java.awt.*;

/**	Create a component that paints our 'art'
 * 
 * @author arq
 *
 */

public class ArtComponent extends JComponent {
	public ArtComponent() {
		super();
		this.setPreferredSize(new Dimension(500,500));
	}
	
	/**	Paint the component with our 'art' */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// Standard stuff to scale teh image.
		Graphics2D g2 = (Graphics2D) g;
		g2.scale(this.getWidth()/100, this.getHeight()/100);
		g2.setStroke(new BasicStroke(1.0F/this.getWidth()));
		g2.setColor(Color.ORANGE);
		g2.fillRect(-5, -5, 100, 100);

		// draw our 'art'
		g2.setColor(Color.BLUE);
		g2.drawOval(5, 5, 1, 1);
//		for (int left = 1; left <= 10; left += 1) {
//			if (left % 2 == 0) {
//				g2.setColor(Color.YELLOW);
//			} else {
//				g2.setColor(Color.BLUE);
//			}
//			
//			for (int right = 1; right <= 10; right += 1) {
//				g2.drawLine(1, left, 10, right);
//			}
//		}

//		for (int left = 1; left <= 10; left += 1) {
//			for (int right = 1; right <= 10; right += 1) {
//				if (left + right > 10) {
//					g2.setColor(Color.RED);
//				} else {
//					g2.setColor(Color.BLUE);
//				}
//				
//				g.drawLine(1, left, 10, right);
//			}
//		}

//		for (int left = 1; left <= 10; left += 1) {
//			if (left <= 5) {
//				g2.setColor(Color.WHITE);
//			} else {
//				g2.setColor(Color.BLACK);
//			}
//			
//			for (int right = 1; right <= 10; right += 1) {
//				g.drawLine(1, left, 10, right);
//			}
//		}

//		for (int left = 1; left <= 5; left = left + 1) {
//			for (int right = 1; right <= 10; right = right + 1) {
//				g.drawLine(1, left, 10, right);
//			}
//		}

//		for (int left = 3; left <= 7; left += 1) {
//			for (int right = 1; right <=10; right += 1) {
//			g2.drawLine(1, left, 10, right);
//			}
//		}

//		for (int left = 1; left <= 10; left = left + 1) {
//			for (int right = 1; right <= left; right = right + 1) {
//				g.drawLine(1, left, 10, right);
//			}
//		}
	}
}
