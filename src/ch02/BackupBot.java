package ch02;

import becker.robots.*;

/**	A robot that can back up one intersection	
 * 
 * @author arq  */
/*public class BackupBot extends Robot {
	public BackupBot(City aCity, int aStreet, int anAvenue, Direction aDirection) {
		super(aCity, aStreet, anAvenue, aDirection);
	}

	public void backup() {
		double snelheid = this.getSpeed();
		this.setSpeed(snelheid * 5);
		this.turnLeft();
		this.turnLeft();
		this.move();
		this.turnLeft();
		this.turnLeft();
		this.setSpeed(snelheid);
	}

}
*/
public class BackupBot extends RobotSE {
	/** Construct a new ArmRobot.
	@param aCity The City where the robot will reside.
	@param aStreet The robot's initial street.
	@param anAvenue The robot's initial avenue.
	@param aDirection The robot's initial direction. */
	public BackupBot(City aCity, int aStreet, int anAvenue, Direction aDirection) {
		super(aCity, aStreet, anAvenue, aDirection);
	}

	public void backup() {
		double snelheid = this.getSpeed();
		this.setSpeed(snelheid * 3);
		this.turnAround();
		this.move();
		this.turnAround();
		this.setSpeed(snelheid);
	}
}
