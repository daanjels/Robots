package ch03;
import becker.robots.*;

public class PlantingTask {
	public static void main(String[] args) {
		City garden = new City("Garden.txt");
//		Planter mark = new Planter(garden, 0, 0, Direction.EAST, 10);
//		mark.plantStuff();
		
//		CornerPlanter one = new CornerPlanter(garden, 0, 3, Direction.SOUTH, 5);
//		CornerPlanter two = new CornerPlanter(garden, 3, 5, Direction.WEST, 5);
//		CornerPlanter three = new CornerPlanter(garden, 5, 2, Direction.NORTH, 5);
//		CornerPlanter four = new CornerPlanter(garden, 2, 0, Direction.EAST, 5);
//		one.plantCorner();
//		one.turnLeft();
//		one.move();
//		two.plantCorner();
//		two.turnLeft();
//		two.move();
//		three.plantCorner();
//		three.turnLeft();
//		three.move();
//		four.plantCorner();
//		four.turnLeft();
//		four.move();

		ThreadedPlanter draad1 = new ThreadedPlanter(garden, 0, 3, Direction.SOUTH, 5);
		ThreadedPlanter draad2 = new ThreadedPlanter(garden, 3, 5, Direction.WEST, 5);
		ThreadedPlanter draad3 = new ThreadedPlanter(garden, 5, 2, Direction.NORTH, 5);
		ThreadedPlanter draad4 = new ThreadedPlanter(garden, 2, 0, Direction.EAST, 5);
		Thread thread1 = new Thread(draad1);
		thread1.start();
		Thread thread2 = new Thread(draad2);
		thread2.start();
		Thread thread3 = new Thread(draad3);
		thread3.start();
		Thread thread4 = new Thread(draad4);
		thread4.start();
		
	}
}