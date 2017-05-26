package ch05;
import becker.robots.*;

/**	HominBot uses a simple algorhythm to go to a homing position
 * 
 * @author arq
 *
 */
public class HomingBot extends RobotSE {
	public HomingBot(City aChart, int aColumn, 
			int aRow, Direction aDir, int numThings) {
		super(aChart, aColumn, aRow, aDir, numThings);
	}

	public void faceNorth() {
		if (this.getDirection() == Direction.EAST) {
			this.turnRight();
		}
		if (this.getDirection() == Direction.SOUTH) {
			this.turnRight();
		}
		if (this.getDirection() == Direction.WEST) {
			this.turnRight();
		}
	}
	
	public void goHome() {
		while (!this.atHome()) {
			this.faceHome();
			this.move();
		}
	}
	
	public boolean atHome() {
		if ((this.getStreet() == 4) && (this.getAvenue() == 3)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void faceHome() {
		if (this.getStreet() > 4 && this.getDirection() != Direction.NORTH) {
			this.turnLeft();
		}
//		if (this.getStreet() > 4 && this.getDirection() != Direction.NORTH) {
//			this.turnLeft();
//		}
//		if (this.getStreet() > 4 && this.getDirection() != Direction.NORTH) {
//			this.turnLeft();
//		}
		if (this.getStreet() < 4 && this.getDirection() != Direction.SOUTH) {
			this.turnLeft();
		}
		if (this.getStreet() < 4 && this.getDirection() != Direction.SOUTH) {
			this.turnLeft();
		}
//		if (this.getStreet() < 4 && this.getDirection() != Direction.SOUTH) {
//			this.turnLeft();
//		}
//		if (this.getStreet() == 4 && this.getDirection() == Direction.SOUTH) {
//			this.turnLeft();
//		}
		if (this.getStreet() == 4 && this.getDirection() == Direction.NORTH) {
			this.turnLeft();
		}
	}
}