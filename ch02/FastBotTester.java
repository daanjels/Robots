package ch02;
import becker.robots.*;

/**	A program to test the FastTurnBot
 * 	@author arq
 */
public class FastBotTester {
	public static void main(String[] args) {
		City cairo = new City();
		FastTurnBot speedy = new FastTurnBot(cairo, 3, 4, Direction.EAST);
		
		speedy.turnLeft();
		speedy.move();
		speedy.turnLeft();
		speedy.turnLeft();
		speedy.setSpeed(5);
		speedy.move();
		speedy.turnLeft();
		speedy.turnLeft();
		speedy.turnLeft();
		speedy.move();
		//	turnaround uses the method turnLeft. 
		//	As that is defined as this.tunrLeft, the turnLeft method of FatsTurnBot is used
		speedy.turnAround();
	}
}
