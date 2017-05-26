package ch05;
import becker.robots.*;

/**	mainclass to test robotclasses *
 * 
 * @author arq
 *
 */

public class MyBot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		City chart = new City("Chart.txt");
//		HomingBot karel = new HomingBot(chart, 9, 9, Direction.WEST, 0);
//		karel.faceNorth();
//		karel.goHome();

//		ProspectorBot prosper = new ProspectorBot(chart, 5, 5, Direction.EAST, 0);
//		
//		while (prosper.canPickThing()) {
//			prosper.followTrail();
//			prosper.move();
//		}

//		City room = new City("Room1.txt");
//		CleanBot proper = new CleanBot(room, 0, 0, Direction.EAST, 0);
//		
//		proper.cleanRoom();

		City room = new City("lib/Escape Room.txt");
		EscapeBot houdini = new EscapeBot(room, 2, 2, Direction.SOUTH, 0);
		
		houdini.escape();
}

}