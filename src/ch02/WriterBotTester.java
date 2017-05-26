package ch02;
import becker.robots.*;

/**	A program to test the FastTurnBot
 * 	@author arq
 */
public class WriterBotTester {
	public static void main(String[] args) {
		City paper = new City(8, 21);
//		WriterBot stylus = new WriterBot(paper, 5, 0, Direction.EAST, 50);
//		stylus.setSpeed(5);
//		stylus.letterH();
//		stylus.letterE();
//		stylus.letterL();
//		stylus.letterL();
//		stylus.letterO();
		WriterBot one = new WriterBot(paper, 5, 0, Direction.EAST, 15);
		WriterBot two = new WriterBot(paper, 5, 4, Direction.EAST, 15);
		WriterBot three = new WriterBot(paper, 5, 8, Direction.EAST, 15);
		WriterBot four = new WriterBot(paper, 5, 12, Direction.EAST, 15);
		WriterBot five = new WriterBot(paper, 5, 16, Direction.EAST, 15);
		one.letterH();
		two.letterE();
		three.letterL();
		four.letterL();
		five.letterO();
	}
}
