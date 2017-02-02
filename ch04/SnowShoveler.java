package ch04;

import becker.robots.*;

/**	two bots karel and tina will shovel snow from the driveways and sidewalk
 * 
 * 	@author arq
 */

public class SnowShoveler {
	public static void main(String[] args) {
		City snowstreet = new City("SnowStreet.txt");
		ShovelBot karel = new ShovelBot(snowstreet, 0, 2, Direction.SOUTH, 40);
		karel.move();
	}
	
}