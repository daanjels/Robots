package ch06;

import java.awt.Graphics2D;


/** Subclasses of Paintable can be displayed in the City.  Each subclass
 *  should override the paint method to paint an image of itself. 
 * 
 * @author Byron Weber Becker */
public class Paintable extends Object
{
	public Paintable()
	{
		super();
	}
	
	/** Each subclass should override paint to paint an image of itself. */
	public void paint(Graphics2D g)
	{}
}
