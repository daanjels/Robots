package ch01;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

public class Supermarket {

	public static void main(String[] args) {
		//	set up initial situation
		City	smalltown	= new City(0, 0, 4, 4, 60);
		Wall	wall1		= new Wall(smalltown, 2, 3, Direction.WEST);
		Wall	wall2		= new Wall(smalltown, 2, 3, Direction.NORTH);
		Wall	wall3		= new Wall(smalltown, 2, 3, Direction.EAST);
		Wall	wall4		= new Wall(smalltown, 3, 3, Direction.EAST);
		Wall	wall5		= new Wall(smalltown, 3, 3, Direction.SOUTH);
		Robot	maria		= new Robot(smalltown, 0, 1, Direction.WEST);
		maria.setLabel("M");
		Robot	karel		= new Robot(smalltown, 3, 3, Direction.EAST);
		karel.setLabel("K");
		Thing	grocery1	= new Thing(smalltown, 0, 0);
		Thing	grocery2	= new Thing(smalltown, 1, 0);
		Thing	grocery3	= new Thing(smalltown, 1, 1);
		Thing	grocery4	= new Thing(smalltown, 1, 2);
		Thing	grocery5	= new Thing(smalltown, 2, 2);
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		maria.move();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		maria.pickThing(grocery1);
		karel.move();
		maria.turnLeft();
		maria.move();
		karel.pickThing(grocery5);
		maria.pickThing();
		karel.move();
		maria.turnLeft();
		karel.pickThing(grocery4);
		maria.move();
		karel.turnLeft();
		maria.pickThing();
	}
}
