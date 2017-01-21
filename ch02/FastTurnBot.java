package ch02;
import becker.robots.*;

/**	A FastTurnBot turns left very quickly relative to its normal speed.
 * 
 * @author arq
 */
public class FastTurnBot extends RobotSE {
	/**	Construct a new FastTurnBot
	 * 
	 * @param aCity			The City where things happen
	 * @param aStreet		The Street where the robot appears
	 * @param anAvenue		The Avenue where the robot appears
	 * @param aDirection	The direction the robot initially faces
	 */

	public FastTurnBot(City aCity, int aStreet, int anAvenue, Direction aDirection) {
		super(aCity, aStreet, anAvenue, aDirection);
	}
	
	/**	Turn 90 degrees to the left, quicker than normal. */
	public void turnLeft() {
		this.setSpeed(this.getSpeed()*10);
		super.turnLeft();
		this.setSpeed(this.getSpeed()/10);
	}
	

}
