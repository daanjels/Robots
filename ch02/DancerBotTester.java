	package ch02;
	import becker.robots.*;

	/**	A program to test the FastTurnBot
	 * 	@author arq
	 */
	public class DancerBotTester {
		public static void main(String[] args) {
			City cairo = new City();
			LeftDancer dancer = new LeftDancer(cairo, 2, 1, Direction.EAST);
				
			dancer.move();
			dancer.move();
			dancer.move();
			dancer.move();
			dancer.move();
		}
	}
