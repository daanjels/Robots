package ch03;

import becker.robots.*;

public class HarvestTask3 {
	public static void main(String[] args) {
		City havana = new City("Field.txt");
		Harvester mark = new Harvester(havana, 1, 0, Direction.EAST);
		Harvester lucy = new Harvester(havana, 3, 0, Direction.EAST);
		Harvester greg = new Harvester(havana, 5, 0, Direction.EAST);
		mark.move();
		mark.harvestTwoRows();
		mark.move();
		lucy.move();
		lucy.harvestTwoRows();
		lucy.move();
		greg.move();
		greg.harvestTwoRows();
		greg.move();
	}
}
