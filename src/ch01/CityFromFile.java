package ch01;

import becker.robots.*;

public class CityFromFile {

	public static void main(String[] args) {
		//	set up initial situation
		City	prague	= new City("lib/prague.txt");
		Robot	karel	= new Robot(prague, 1,0, Direction.EAST);
		
		//	direct the robot to the final situation
		karel.move();
		karel.move();
		karel.move();
		karel.move();
		karel.move();
		karel.turnLeft();	//	start turning right as three turns left
		karel.turnLeft();
		karel.turnLeft();	//	finished turning right
		karel.move();
		karel.move();
		karel.move();
		karel.move();
		karel.move();
		karel.move();
		karel.turnLeft();	//	finished turning right
		karel.move();
		karel.move();
		karel.move();
		karel.move();
		karel.pickThing();
		karel.turnLeft();	//	finished turning right
		karel.turnLeft();	//	finished turning right
		karel.move();
		karel.move();
		karel.move();
		karel.move();
		karel.move();
		karel.move();
		karel.move();
		karel.putThing();
		karel.move();
		karel.move();
	}

}
