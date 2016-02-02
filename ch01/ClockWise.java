package ch01;

import becker.robots.*;

public class ClockWise {

	public static void main(String[] args) {
		//	set up initial situation
		City	london	= new City(0, 0, 4, 4, 60);
		Wall	wall1	= new Wall(london, 1, 1, Direction.NORTH);
		Wall	wall2	= new Wall(london, 1, 2, Direction.NORTH);
		Wall	wall3	= new Wall(london, 1, 2, Direction.EAST);
		Wall	wall4	= new Wall(london, 2, 2, Direction.EAST);
		Wall	wall5	= new Wall(london, 2, 2, Direction.SOUTH);
		Wall	wall6	= new Wall(london, 2, 1, Direction.SOUTH);
		Wall	wall7	= new Wall(london, 2, 1, Direction.WEST);
		Wall	wall8	= new Wall(london, 1, 1, Direction.WEST);
		Robot	karel	= new Robot(london, 0, 2, Direction.WEST);
		
		//	direct the robot to the final situation
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.move();

	}

}
