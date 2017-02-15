package ch04;

import becker.robots.*;

	/**	one bot karel will distribute piled op things in columns * 
	 * 	@author arq
	 */

public class Histogrammer {
	public static void main(String[] args) {
		City chart = new City("Chart.txt");
		HistogramBot karel = new HistogramBot(chart, 9, 0, Direction.EAST, 0);
		
		while (karel.getAvenue() < 9) {
			karel.findPile();
			karel.distributeThings();
			karel.move();
		}
		// this while loop doesn't seem to work, I wonder why...
	}
}