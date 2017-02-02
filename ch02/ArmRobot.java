package ch02;

import becker.robots.*;

/** A robot with an icon that shows arms.
*
* @author Arq */
public class ArmRobot extends Robot
{
	/** Construct a new ArmRobot.
		@param aCity The City where the robot will reside.
		@param aStreet The robot's initial street.
		@param anAvenue The robot's initial avenue.
		@param aDirection The robot's initial direction. */
	public ArmRobot(City aCity, int aStreet, int anAvenue, Direction aDirection)
	{	super(aCity, aStreet, anAvenue, aDirection);
		this.setIcon(new ArmRobotIcon());
	}
}
 