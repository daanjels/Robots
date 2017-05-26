package ch06;

import becker.util.Test;

/** Test the SimpleBot class.
 *
 * NOTE:  This class will not work until the constructor is rewritten and
 * the accessor methods are completed in SimpleBot.  Most of the class has
 * been commented out to prevent compilation errors in some environments.
 *
 * @author Byron Weber Becker */
public class TestHarness extends Object
{
	public static void main(String[] args)
	{	// Set up a known situation (an empty city; a robot on (4, 2) facing east).
		SimpleCity c = new SimpleCity();
/*
		SimpleBot karel = new SimpleBot(c, 4, 2, Constants.EAST);
	
		// Execute the move method.
		karel.move();
	
		// Verify the results -- robot on intersection (3,4).
		Test tester = new Test();
		tester.ckEquals("same str", 4, karel.getStreet());
		tester.ckEquals("new ave", 3, karel.getAvenue());
		tester.ckEquals("same dir", Constants.EAST,
						 				  karel.getDirection());
*/					
	}
}
