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
		g2.scale(this.getWidth()/11, this.getHeight()/11);
		g2.setStroke(new BasicStroke(1.0F/this.getWidth()));
		g2.setColor(Color.ORANGE);
		g2.fillRect(0, 0, 11, 11);

		// draw our 'art'
		g2.setColor(Color.BLACK);

//		Checkerboard first try
//		for (int x = 0; x <= 10; x += 2) {
//			for (int y = 0; y <= 10; y += 2) {
//				g2.setColor(Color.BLACK);
//				g2.fillRect(x, y, 1, 1);
//				g2.setColor(Color.WHITE);
//				g2.fillRect(x, y+1, 1, 1);
//				g2.fillRect(x+1, y, 1, 1);
//				g2.setColor(Color.BLACK);
//				g2.fillRect(x+1, y+1, 1, 1);
//			}
//		}
		
//		Checkerboard more intelligent
		for (int x = 0; x <= 10; x += 1) {
			for (int y = 0; y <= 10; y += 1) {
				if ((x+y)%2 == 0) {
					g2.setColor(Color.BLACK);
				} else {
					g2.setColor(Color.WHITE);
				}
				g2.fillRect(x, y, 1, 1);
			}
		}

//		a square of dots with a cross
//		for (int i = 0; i <= 10; i += 1) {
//			for (int j = 0; j <= 10; j += 1) {
//				g2.fillOval(i, j, 1, 1);
//			}
//		}
//		for (int i = 1; i < 10; i += 1) {
//			g2.setColor(Color.WHITE);
//			g2.fillOval(5, i, 1, 1);
//			g2.fillOval(i, 5, 1, 1);
//		}

//		a bull's eye
//		for (int bull = 1; bull <= 6; bull += 1) {
//			g2.setColor(Color.RED);
//			g2.fillOval(bull, bull, 11-bull*2, 11-bull*2);
//			g2.setColor(Color.WHITE);
//			bull += 1;
//			g2.fillOval(bull, bull, 11-bull*2, 11-bull*2);
//		}

//		diagonal of colored dots
//		for (int dots = 0; dots <= 10; dots += 2) {
//			g2.setColor(Color.BLUE);
//			g2.fillOval(dots, dots, 1, 1);
//			g2.setColor(Color.RED);
//			g2.fillOval(dots+1, dots+1, 1, 1);
//		}

//		Cornerstar
//		for (int bottom = 1; bottom <= 10; bottom +=1) {
//			g2.drawLine(1, 1, 10, bottom);
//			g2.drawLine(1, 1, bottom, 10);
//		}

		//		for (int top = 1; top <= 10; top += 2) {
//			for (int bottom = 1; bottom <= 10; bottom += 1) {
//				g2.drawLine(top, 1, bottom, 10);
//			}
//		}

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
