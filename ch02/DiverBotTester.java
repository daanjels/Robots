package ch02;
import becker.robots.*;

/**	A program to test the FastTurnBot
 * 	@author arq
 */
public class DiverBotTester {
	public static void main(String[] args) {
		City pool = new City(5, 3);
		DiverBot speedy = new DiverBot(pool, 1, 1, Direction.NORTH);
		Wall board = new Wall(pool, 2, 1, Direction.NORTH);
		Wall stair3 = new Wall(pool, 2, 0, Direction.EAST);
		Wall stair2 = new Wall(pool, 3, 0, Direction.EAST);
		Wall stair1 = new Wall(pool, 4, 0, Direction.EAST);
		Wall pool1 = new Wall(pool, 4, 1, Direction.WEST);
		Wall pool2 = new Wall(pool, 4, 1, Direction.SOUTH);
		Wall pool3 = new Wall(pool, 4, 2, Direction.SOUTH);
		Wall pool4 = new Wall(pool, 4, 2, Direction.EAST);
		
		speedy.dive();
	}
}
