package ch03;
import becker.robots.*;

public class PinsetTask {
	public static void main(String[] args) {
		City stLouis = new City("Alley.txt");
		Pinsetter mark = new Pinsetter(stLouis, 3, 0, Direction.EAST, 10);
		mark.setPins();
	}

}
