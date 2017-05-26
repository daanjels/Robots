package ch05;

import becker.robots.*;

/**	prospector bot checks interscetions for things
 * depending on the number of things it turns in a given direction
 * then walks on to the next intersection
 * 
 * @author arq
 *
 */
public class ProspectorBot extends RobotSE {

	public ProspectorBot(City aChart, int aColumn, 
			int aRow, Direction aDir, int numThings) {
		super(aChart, aColumn, aRow, aDir, numThings);
	}
	
	public void followTrail() {
		int count = 0;
		while (this.canPickThing()) {
			count += 1;
			this.pickThing();
		}
		if (count == 4) {
			while (this.getDirection() != Direction.NORTH) {
				this.turnRight();
			}
			this.putThing();
			this.putThing();
			this.putThing();
			this.putThing();
		}
		if (count == 3) {
			while (this.getDirection() != Direction.WEST) {
				this.turnRight();
			}
			this.putThing();
			this.putThing();
			this.putThing();
		}
		if (count == 2) {
			while (this.getDirection() != Direction.SOUTH) {
				this.turnRight();
			}
			this.putThing();
			this.putThing();
		}
		if (count == 1) {
			while (this.getDirection() != Direction.EAST) {
				this.turnRight();
			}			
			this.putThing();
		}
	}
}