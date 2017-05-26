package ch02;
import becker.robots.*;
/**	A program to test the FastTurnBot
 * 	@author arq
 */
public class BackupBotTester {
	public static void main(String[] args) {
		City cairo = new City();
		BackupBot backupper = new BackupBot(cairo, 3, 4, Direction.EAST);
		
		backupper.turnLeft();
		backupper.move();
		backupper.turnLeft();
		backupper.turnLeft();
		backupper.setSpeed(5);
		backupper.move();
		backupper.turnLeft();
		backupper.turnLeft();
		backupper.turnLeft();
		backupper.move();
		backupper.move();
		backupper.move();
		//	turnaround uses the method turnLeft. 
		//	As that is defined as this.turnLeft, the turnLeft method of FatsTurnBot is used
		backupper.backup();
	}
}