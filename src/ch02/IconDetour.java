package ch02;
import becker.robots.icons.*;
import java.awt.*;

/** Create a robot icon that has arms
 * 
 * @author arq
 *
 */

public class IconDetour extends Icon {
	/** Create a new icon for a robot. */
	public IconDetour() {
		super();
	}
	/** Paint the icon. */
	public void paintIcon(Graphics g) {
		//	wheels
		g.setColor(Color.BLACK);
	    int xpoints[] = {10, 30, 30};
	    int ypoints[] = {20, 0, 40};
	    int npoints = 3;
	    g.fillPolygon(xpoints, ypoints, npoints);
//		g.fillPolygon({10, 30, 30}, {20, 0, 40}, 3);
	    xpoints[0] = 70;
	    xpoints[1] = 90;
	    xpoints[2] = 70;
	    ypoints[0] = 0;
	    ypoints[1] = 20;
	    ypoints[2] = 40;
	    g.fillPolygon(xpoints, ypoints, npoints);
	    g.fillRect(30, 10, 41, 20);
	    g.setColor(Color.WHITE);
	    g.drawString("detour", 32, 20);
	}

}
