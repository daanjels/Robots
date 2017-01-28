package ch04;
import becker.robots.*;

public class PlanterTask {
	public static void main(String[] args) {
		City stLouis = new City("/Users/arq/Documents/XcodeProjects/Eclipse/Robots-workspace/Robots/Field.txt");
		MissingPlanter mark = new MissingPlanter(stLouis, 1, 0, Direction.EAST, 0);
		mark.move();
		mark.plantField();
		mark.move();
	}

}
