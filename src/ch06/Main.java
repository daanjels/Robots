package ch06;


/** A main method to test the SimpleBot and related classes.
 *
 * @author Byron Weber Becker */
public class Main
{
	public static void main(String[] args)
	{	SimpleCity newYork = new SimpleCity();
		SimpleBot karel = new SimpleBot(newYork, 4, 2, Constants.EAST, 400);
		SimpleBot sue = new SimpleBot(newYork, 4, 2, Constants.NORTH, 400);
		
		//	Wait for the user to press the start button.
		newYork.waitForStart();
		
		for(int i=0; i<4; i = i+1)
		{
			karel.speed(800);
			karel.goSlower();
			karel.move();
			karel.move();
			karel.turnLeft();
		}
		
		for(int i=0; i<4; i = i+1)
		{
			sue.goFaster();
			sue.move();
			sue.move();
			sue.turnRight();
		}
		
		karel.goToOrigin();
		sue.teleport(6, 8);
	}
}
