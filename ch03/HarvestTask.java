package ch03;
import becker.robots.*;

public class HarvestTask {
	public static void main(String[] args) {
		City stLouis = new City("Field.txt");
		Harvester mark = new Harvester(stLouis, 1, 0, Direction.EAST);
		mark.move();
		mark.harvestField();
		mark.move();
	}

}
