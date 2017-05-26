package ch04;

import becker.robots.*;

/**	two bots karel and tina will shovel snow from the driveways and sidewalk
 * 
 * 	@author arq
 */

public class SnowShoveler {
	public static void main(String[] args) {
		City snowstreet = new City("lib/SnowStreet.txt");
		ShovelBot karel = new ShovelBot(snowstreet, 0, 2, Direction.SOUTH, 0);
		ShovelBot tina = new ShovelBot(snowstreet, 0, 2, Direction.SOUTH, 0);
		while (karel.frontIsClear()) {
			karel.findDriveway();
			karel.clearDriveway();
			karel.move();
		}
		tina.clearSidewalk();
	}
	
}