package ch04;
import becker.robots.*;

/** 
 * Putting a missing thing
 * @author arq
 * Class used in PlanterTask (plantertask has the main class, run from there
 */

public class MissingPlanter extends RobotSE {
	public MissingPlanter (City aCity, int aStreet, int anAvenue, Direction aDir, int numThings) {
		super (aCity, aStreet, anAvenue, aDir, numThings);
	}

	/** these predicates make it easier to change the length of the rows */
	protected boolean atRowsEastEnd() {
		if (this.getAvenue() == 5) {
			return true;
		} else {
			return false;
		}
	}

	protected boolean atRowsWestEnd() {
		if (this.getAvenue() == 1) {
			return true;
		} else {
			return false;
		}
	}

	/** Plant a field of things, The robot is on the northwest corner of the field. */
	public void plantField() {
		this.harvestIntersection();
		this.plantTwoRows();
//		this.positionForNextRow();
		this.goToNextRow();
		this.plantTwoRows();
//		this.positionForNextRow();
		this.goToNextRow();
		this.plantTwoRows();
	}
	
	/** Plant two rows of the field */
	public void plantTwoRows() {
		this.plantOneRow();
		this.goToNextRow();
		this.plantOneRow();
	}
	
	/** Go one row south and face east */
//	public void positionForNextRow() {
//		this.turnLeft();
//		this.move();
//		this.turnLeft();
//	}
	
	/** Plant one row of five things */
	public void plantOneRow() {
		this.plantIntersection();
		this.move();
		this.plantIntersection();
		this.move();
		this.plantIntersection();
		this.move();
		this.plantIntersection();
		this.move();
		this.plantIntersection();
	}
	
	/** harvest one intersection */
	public void harvestIntersection() {
		while (this.canPickThing()) {
			this.pickThing();
		}
	}

	/** plant one intersection */
	public void plantIntersection() {
		if (!this.canPickThing()) {
			this.putThing();
		}
	}
	
	/** Go one row south and face west */
	public void goToNextRow() {
//		if (this.getAvenue() == 5) { // at the east end of the row
		if (this.atRowsEastEnd()) { // self documenting code
			this.turnRight();
			this.move();
			this.turnRight();
		}
//		if (this.getAvenue() == 1) { // at the west end of the row
		if (this.atRowsWestEnd()) { // self documenting code
			this.turnLeft();
			this.move();
			this.turnLeft();
		}
//		this.turnRight();
//		this.move();
//		this.turnRight();
	}
}
