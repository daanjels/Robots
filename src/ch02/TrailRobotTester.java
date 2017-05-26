package ch02;
import becker.robots.*;

/**	A program to test the TrailBot
 * 	@author arq
 */
public class TrailRobotTester {
	public static void main(String[] args) {
		City cairo = new City();
		TrailBot humpty = new TrailBot(cairo, 2, 1, Direction.EAST);
				
		humpty.move();
		humpty.trailMove();
		humpty.move();
		humpty.trailMove();
		humpty.move();
		humpty.trailMove();
		humpty.move();
		humpty.trailMove();
		humpty.move();
	}
}
