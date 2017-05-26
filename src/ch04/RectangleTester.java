package ch04;
import becker.robots.*;

	/**	A program to test the RectanglePlanter
	 * 	@author arq
	 */
	public class RectangleTester {
		public static void main(String[] args) {
			City cairo = new City();
			RectanglePlanter planterOne = new RectanglePlanter(cairo, 6, 6, Direction.WEST, 40);
			planterOne.plantRect(5, 4);
		}
	}
