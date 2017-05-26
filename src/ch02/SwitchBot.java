package ch02;
import becker.robots.*;

public class SwitchBot extends Robot {

	public SwitchBot(City city, int street, int avenue, Direction direction) {
		super(city, street, avenue, direction);
	}
	
	public void switchLights() {
		this.move();
		this.examineLights().next().turnOff();
		this.move();
		this.examineLights().next().turnOn();
		this.move();
		this.examineLights().next().turnOff();
		this.move();
		this.examineLights().next().turnOn();
		this.move();
	}
}
