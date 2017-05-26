package ch02;

import becker.robots.*;

public class LampTester {
	public static void main(String[] args) {
		// Construct the initial situation.
		City paris = new City();
		// put a lamp in the second street for the robot to pick up
		SimpleLamp lamp1 = new SimpleLamp(paris, 2, 2);
		// create a robot to pick up the lamp
		Robot lampMover = new Robot(paris, 2, 1, Direction.EAST);
		// create a subclass robot to turn lights on and off
		SwitchBot lampSwitcher = new SwitchBot(paris, 4, 0, Direction.EAST);
		// put a flasherlight on the first intersection
		Flasher flash1 = new Flasher(paris, 0, 0, true);
		// define four streetlights
		LampIcon sL1 = new LampIcon(paris, 4, 1);
		LampIcon sL2 = new LampIcon(paris, 4, 2);
		LampIcon sL3 = new LampIcon(paris, 4, 3);
		LampIcon sL4 = new LampIcon(paris, 4, 4);

		// turn the flasher on
		flash1.turnOn();

		// turn the streetlights off
		sL1.turnOff();
		sL2.turnOff();
		sL3.turnOff();
		sL4.turnOff();

		// Turn the lamp off.
		lamp1.turnOff();

		// Use the robot to move the lamp.
		lampMover.move();
		lampMover.pickThing();
		lampMover.move();
		lampMover.putThing();
		lampMover.move();

		sL1.turnOn();
		sL2.turnOn();
		sL3.turnOn();
		sL4.turnOn();
		// Use the subclass robot to switch four streetlights on and off
//		lampSwitcher.switchLights();
	}
}