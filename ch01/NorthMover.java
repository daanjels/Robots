package ch01;

import becker.robots.*;

public class NorthMover {

	public static void main(String[] args) {
		//	set up initial situation
		City	prague	= new City();
		Robot	karel	= new Robot(prague, 1, 1, Direction.NORTH);
		
		//	direct the robot to the final situation
		karel.move();
		karel.move();
		karel.move();
		karel.move();
		karel.move();
		karel.turnLeft();	//	start turning right as three turns left
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.move();
		karel.move();
		karel.move();
	}

}
