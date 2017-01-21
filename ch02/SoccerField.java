package ch02;

import becker.robots.*;

public class SoccerField extends City {
	public SoccerField() {
		super(5, 9);
		Wall homeborder1 = new Wall(this, 0, 0, Direction.WEST);
		Wall homeborder2 = new Wall(this, 1, 0, Direction.WEST);
		Wall homeborder3 = new Wall(this, 3, 0, Direction.WEST);
		Wall homeborder4 = new Wall(this, 4, 0, Direction.WEST);
		Wall guestborder1 = new Wall(this, 0, 8, Direction.EAST);
		Wall guestborder2 = new Wall(this, 1, 8, Direction.EAST);
		Wall guestborder3 = new Wall(this, 3, 8, Direction.EAST);
		Wall guestborder4 = new Wall(this, 4, 8, Direction.EAST);
		
	}
}
