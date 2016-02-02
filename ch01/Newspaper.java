package ch01;

import becker.robots.*;

public class Newspaper {

	public static void main(String[] args) {
		//	set up initial situation
		City	london		= new City(0, 0, 4, 4, 60);
		Wall	wall1		= new Wall(london, 1, 1, Direction.NORTH);
		Wall	wall2		= new Wall(london, 1, 2, Direction.NORTH);
		Wall	wall3		= new Wall(london, 1, 2, Direction.EAST);
		Wall	wall4		= new Wall(london, 1, 2, Direction.SOUTH);
		Wall	wall5		= new Wall(london, 1, 1, Direction.WEST);
		Wall	wall7		= new Wall(london, 2, 1, Direction.WEST);
		Wall	wall8		= new Wall(london, 2, 1, Direction.SOUTH);
		Robot	karel		= new Robot(london, 1, 2, Direction.SOUTH);
		Thing	newspaper	= new Thing(london, 2, 2);
		//	direct the robot to the final situation
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.pickThing();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
	}

}
