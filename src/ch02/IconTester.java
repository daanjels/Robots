package ch02;
import becker.robots.*;
/**	A program to test the FastTurnBot
 * 	@author arq
 */
public class IconTester {
	public static void main(String[] args) {
		City cairo = new City();
		Robot car = new Robot(cairo, 3, 4, Direction.WEST);
	    car.setIcon(new IconCar());
		Thing tree = new ThingTree(cairo, 2, 2, Direction.NORTH);
//		tree.setIcon(new IconTree());
		Thing lake = new Thing(cairo, 4, 3);
		lake.setIcon(new IconLake());
		Wall building = new Wall(cairo, 0, 0, Direction.NORTH);
		building.setIcon(new IconBuilding());
		Wall detour = new Wall(cairo, 5, 1, Direction.WEST);
		detour.setIcon(new IconDetour());
		Robot robo = new Robot(cairo, 4, 1, Direction.SOUTH);
		robo.setIcon(new IconR10());
		car.move();
		car.turnLeft();
		car.turnLeft();
		car.move();
		car.turnLeft();
		car.turnLeft();
		car.move();
		car.move();
		car.turnLeft();
		car.turnLeft();
		car.turnLeft();
		car.move();
		car.pickThing();
		robo.move();
		robo.turnLeft();
	}
}