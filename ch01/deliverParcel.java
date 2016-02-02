package ch01;
import becker.robots.*;

public class deliverParcel {

	public static void main(String[] args) {
		//	set up initial situation
		City	prague	= new City(3, 5, 7, 9, 60);
		Thing	parcel	= new Thing(prague, 1,2);
		Robot	karel	= new Robot(prague, 1,0, Direction.EAST);
		
		//	direct the robot to the final situation
		karel.move();
		karel.move();
		karel.pickThing();
		karel.move();
		karel.turnLeft();	//	start turning right as three turns left
		karel.turnLeft();
		karel.turnLeft();	//	finished turning right
		karel.move();
		karel.putThing();
		karel.move();
	}
}
