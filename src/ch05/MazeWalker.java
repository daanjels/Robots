package ch05;
import becker.robots.*;

public class MazeWalker extends RobotSE {

	public MazeWalker(City maze, int street, int avenue, Direction dir, int numThings) {
		super(maze, street, avenue, dir, numThings);
	}

	public static void main(String[] args) {
		MazeCity maze = new MazeCity(6, 6);
		Thing exit = new Thing(maze, 2, 5);
		MazeWalker wally = new MazeWalker(maze, 0, 0, Direction.SOUTH, 10);
		
		while (!wally.canPickThing()) {
			wally.followWallRight();
		}
		wally.pickThing(exit);
	}

	public void followWallRight() {
		while (this.frontIsClear() && !this.canPickThing()) {
			this.move();
			this.turnRight();
		}		
		while (!this.frontIsClear()) {
			this.turnLeft();
		}
	}
}
