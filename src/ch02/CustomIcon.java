package ch02;
import becker.robots.icons.*;
import java.awt.*;

/** Create a robot icon that has arms
 * 
 * @author arq
 *
 */

public class CustomIcon extends Icon {
	/** Create a new icon for a robot. */
	public CustomIcon() {
		super();
	}
	
	/** Paint the icon. */
	public void paintIcon(Graphics g) {
		g.setColor(Color.BLACK);
		//	body
		g.fillRoundRect(35, 35, 30, 30, 10, 10);
		//	shoulders
		g.fillRect(24, 45, 10, 10);
		g.fillRect(65, 45, 10, 10);
		//	arms
		g.fillOval(25, 25, 10, 30);
		g.fillOval(65, 25, 10, 30);
	}

}
