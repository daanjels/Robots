package ch02;
import becker.robots.*;

/**	A program to test the SoccerBot
 * 	@author arq
 */
public class SoccerBotTester {
	public static void main(String[] args) {
//		City field = new City(5, 9);
		SoccerField field = new SoccerField();
		SoccerBot playerOne = new SoccerBot(field, 3, 8, Direction.WEST);
		Thing football = new Thing(field, 3, 8);
		playerOne.advanceRight();
		playerOne.advanceRight();
		playerOne.advance();
		playerOne.advanceLeft();
	}
}
