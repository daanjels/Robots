package ch01;
import becker.robots.*;

public class roadBlock {

	public static void main(String[] args) {
		//	set up initial situation
		City	ny			= new City();
		Wall	blockAve0	= new Wall(ny, 0, 2, Direction.WEST);
		Wall	blockAve1	= new Wall(ny, 1, 2, Direction.WEST);
		Robot	mark		= new Robot(ny, 0, 2, Direction.WEST);
		Robot	ann			= new Robot(ny, 0, 1, Direction.EAST);
		
		//	mark goes around the roadblock
		mark.turnLeft();
		mark.move();
		mark.move();
		mark.turnLeft();
		mark.turnLeft();
		mark.turnLeft();
		mark.move();
		
		//	ann goes to meet mark
		ann.turnLeft();
		ann.turnLeft();
		ann.turnLeft();
		ann.move();
		ann.move();
		ann.turnLeft();
	}

}
