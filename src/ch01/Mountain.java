package ch01;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

public class Mountain {

	public static void main(String[] args) {
		//	set up initial situation
		City	mountain	= new City(0, 0, 4, 6, 60);
		Wall	wall1		= new Wall(mountain, 3, 2, Direction.WEST);
		Wall	wall2		= new Wall(mountain, 3, 2, Direction.NORTH);
		Wall	wall3		= new Wall(mountain, 2, 3, Direction.WEST);
		Wall	wall4		= new Wall(mountain, 1, 3, Direction.WEST);
		Wall	wall5		= new Wall(mountain, 1, 3, Direction.NORTH);
		Wall	wall7		= new Wall(mountain, 1, 3, Direction.EAST);
		Wall	wall8		= new Wall(mountain, 2, 4, Direction.NORTH);
		Wall	wall9		= new Wall(mountain, 2, 4, Direction.EAST);
		Wall	wall10		= new Wall(mountain, 3, 4, Direction.EAST);
		Robot	karel		= new Robot(mountain, 3, 0, Direction.EAST);
		Thing	flag		= new Thing(mountain, 3, 1);
		//	start moving
		karel.move();
		karel.pickThing();
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.putThing();
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.turnLeft();		
	}

}
