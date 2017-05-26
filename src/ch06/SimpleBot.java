package ch06;

import java.awt.Graphics2D;
import java.awt.Color;
import becker.util.Utilities;

/** A first try at the SimpleBot class.  These robots are always constructed
 * on street 4, avenue 2.  There is no way to tell which way they are
 * facing and they can only move east.
 *
 * @author Byron Weber Becker */
public class SimpleBot extends Paintable
{
	private int street;
	private int avenue;
	private int direction;
	private float speed;
	
	/** Construct a new Robot in a given city at the given location. 
	 * @param aCity			The city in chich the robot appears.
	 * @param aStreet		The robot's initial street.
	 * @param anAvenue		The robot's initial avenue.
	 * @param aDirection	The robot's initial direction. */
	public SimpleBot(SimpleCity aCity, int aStreet, int anAvenue, int aDirection, float aSpeed)
	{
		super();
		this.street = aStreet;
		this.avenue = anAvenue;
		this.direction = aDirection;
		this.speed = aSpeed;
		aCity.add(this, 2);	// add this robot to the given city in the top level.
	}
	
	/** Paint the robot at its current location. */
//	public void paint(Graphics2D g)
//	{
//		g.setColor(Color.BLACK);
//		g.fillOval(this.avenue * Constants.INTERSECTION_SIZE, 
//				this.street * Constants.INTERSECTION_SIZE, 
//				Constants.INTERSECTION_SIZE, 
//				Constants.INTERSECTION_SIZE);
//	}
	public void paint(Graphics2D g)
	{
		g.setColor(Color.BLACK);
		
		// Draw the robot's body
		g.fillOval(this.avenue * 50 + 50/2 - 15,
				this.street * 50 + 50/2 - 15,
				2*15, 2*15);
		
		// Draw the robot's sensor
		g.fillOval(
				this.avenue * 50 + 50/2 + this.aveOffset() * 15 - 5,
				this.street * 50 + 50/2 + this.strOffset() * 15 - 5,
				2*5, 2*5);
	}
	
	/** Move the robot 1 intersection. */
	public void move()
	{
		this.street= this.street + this.strOffset();
		this.avenue = this.avenue + this.aveOffset();
		Utilities.sleep((long) this.speed);
	}
	
	/** Turn the robot 90 degrees to the left. */
	public void turnLeft()
	{
		if (this.direction == Constants.FIRST_DIR)
		{ this.direction = Constants.LAST_DIR;
		} else
		{ this.direction = this.direction - 1;
		}
		Utilities.sleep((long) this.speed);
	}
	
	/** Turn the robot 90 degrees to the right. */
	public void turnRight()
	{
		if (this.direction == Constants.LAST_DIR)
		{ this.direction = Constants.FIRST_DIR;
		} else
		{ this.direction = this.direction + 1;
		}
		Utilities.sleep((long) this.speed);
	}
	
	public void goFaster()
	{
		this.speed = (float) (this.speed * 0.80);
	}
	public void goSlower()
	{
		this.speed = (float) (this.speed / 0.80);
	}
	
	public void goToOrigin()
	{
		this.street = 0;
		this.avenue = 0;
		this.direction = Constants.EAST;
	}
	
	public void teleport(int aStreet, int anAvenue)
	{
		this.street = aStreet;
		this.avenue = anAvenue;
	}
	
	public void speed(float aSpeed)
	{
		this.speed = aSpeed;
	}
	
//	Getters
	/** Get this robot's street.
	 * @return The street this robot is currently on. */
	public int getStreet()
	{
		return this.street;
	}

	/** Get this robot's avenue.
	 * @return The avenue this robot is currently on. */
	public int getAvenue()
	{
		return this.avenue;
	}

	/** Get this robot's direction.
	 * @return The direction this robot is currently facing. */
	public int getDirection()
	{
		return this.direction;
	}
	
	/** Calculate how far the robot should move along the avenue.
	 * @return {-1, 0 or 1}
	 */
	private int aveOffset()
	{
		int offset = 0;
		if (this.direction == Constants.EAST)
		{
			offset = 1;
		} else if (this.direction == Constants.WEST)
		{
			offset = -1;
		}
		return offset;
	}
	/** Calculate how far the robot should move along the street.
	 * @return {-1, 0 or 1}
	 */
	private int strOffset()
	{
		int offset = 0;
		if (this.direction == Constants.NORTH)
		{
			offset = -1;
		} else if (this.direction == Constants.SOUTH)
		{
			offset = 1;
		}
		return offset;
	}
}
