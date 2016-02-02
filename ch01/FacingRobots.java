package ch01;

import becker.robots.*;

public class FacingRobots {

	public static void main(String[] args) {
		//	set up city
		City	town	= new City(0, 0, 3, 3, 50);
		Wall	wall1	= new Wall(town, 0, 1, Direction.WEST);
		Wall	wall2	= new Wall(town, 1, 1, Direction.WEST);
		Wall	wall3	= new Wall(town, 1, 1, Direction.SOUTH);
		Robot	karel	= new Robot(town, 0, 0, Direction.SOUTH);
		Robot	dirk	= new Robot(town, 0, 1, Direction.SOUTH);
		//	start moving
		dirk.move();
		karel.move();
		dirk.turnLeft();
		karel.move();
		dirk.move();
		karel.turnLeft();
		dirk.turnLeft();
		dirk.turnLeft();
		dirk.turnLeft();
		dirk.move();
		karel.move();
		dirk.turnLeft();
		dirk.turnLeft();
		dirk.turnLeft();
		dirk.move();
	}

}
