package ch02;

import becker.robots.*;

public class StreetLightTester {
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
		Streetlight sL1 = new Streetlight(paris, 4, 1, Direction.SOUTHWEST);
		Streetlight sL2 = new Streetlight(paris, 4, 2, Direction.NORTHWEST);
		Streetlight sL3 = new Streetlight(paris, 4, 3, Direction.SOUTHWEST);
		Streetlight sL4 = new Streetlight(paris, 4, 4, Direction.NORTHWEST);

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

		// Use the subclass robot to switch four streetlights on and off
		lampSwitcher.switchLights();
	}
}