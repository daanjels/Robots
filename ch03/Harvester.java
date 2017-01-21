package ch03;
import becker.robots.*;

/**
 * 
 * @author arq
 *
 */
public class Harvester extends RobotSE {
	/** Construct a Hervester Robot
	 * 
	 */
	public Harvester(City aCity, int str, int ave, Direction dir) {
		super(aCity, str, ave, dir);
	}
	
	/** Harvest a field of things, The robot is on the northwest corner of the field. */
	public void harvestField() {
		this.harvestTwoRows();
		this.positionForNextRow();
		this.harvestTwoRows();
		this.positionForNextRow();
		this.harvestTwoRows();
	}
	
	/** Harvest two rows of the field */
	public void harvestTwoRows() {
		this.harvestOneRow();
		this.goToNextRow();
		this.harvestOneRow();
	}
	
	/** Go one row south and face east */
	public void positionForNextRow() {
		this.turnLeft();
		this.move();
		this.turnLeft();
	}
	
	/** Harvest one row of five things */
	public void harvestOneRow() {
		this.harvestIntersection();
		this.move();
		this.harvestIntersection();
		this.move();
		this.harvestIntersection();
		this.move();
		this.harvestIntersection();
		this.move();
		this.harvestIntersection();
	}
	
	/** Harvest one intersection */
	public void harvestIntersection() {
		this.pickThing();
	}
	
	/** Go one row south and face west */
	public void goToNextRow() {
		this.turnRight();
		this.move();
		this.turnRight();
	}

}
