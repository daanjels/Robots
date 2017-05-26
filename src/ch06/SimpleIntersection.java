package ch06;

import java.awt.*;
import java.awt.geom.*;


/** An intersection paints its roads and the grass around them.
 *
 * @author Byron Weber Becker */
public class SimpleIntersection extends Paintable
{
	// where this intersection is located
	private int avenue;
	private int street;
	
	public static final int SIZE = 50;
	public static final int ROAD_WIDTH = SIZE * 4 / 10;
	public static final int ROAD_OFFSET = (SIZE - ROAD_WIDTH) / 2;
	
	/** Construct a new intersection at the given location. 
	* @param anAvenue the avenue where it is located
	* @param aStreet the street where it is located */
	public SimpleIntersection(int anAvenue, int aStreet)
	{
		super();
		this.avenue = anAvenue;
		this.street = aStreet;
	}
	
	/** Paint the intersection */
	public void paint(Graphics2D g)
	{
		// Paint the "grass"
		g.setColor(Color.GREEN);
		g.fillRect(this.avenue * SIZE, this.street * SIZE, SIZE, SIZE);
		
		// Paint the "roads"
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(this.avenue * SIZE + ROAD_OFFSET, this.street * SIZE,
				ROAD_WIDTH, SIZE);
		g.fillRect(this.avenue * SIZE, this.street * SIZE + ROAD_OFFSET, SIZE,
				ROAD_WIDTH);
	}
}
