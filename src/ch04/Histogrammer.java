package ch04;

import becker.robots.*;

	/**	one bot karel will distribute piled op things in columns * 
	 * 	@author arq
	 */

public class Histogrammer {
	public static void main(String[] args) {
		City chart = new City("lib/Chart.txt");
		HistogramBot karel = new HistogramBot(chart, 9, 5, Direction.EAST, 0);
		
		do {
			karel.findPile();
			karel.distributeThings();
			karel.move();
		} while (karel.getAvenue() < 9);
		// this while loop doesn't seem to work, I wonder why...
	}
}