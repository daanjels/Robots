package ch02;

import java.awt.*;

import becker.robots.*;
import becker.robots.icons.*;

public class SimpleLamp extends Thing {

	//	construct a new lamp object
	public SimpleLamp(City aCity, int aStreet, int anAvenue) {
		super(aCity, aStreet, anAvenue);
		this.turnOff();
	}
	
	//	Turn the lamp on
	public void turnOn() {
		Color onColor = new Color(255, 255, 50);
		CircleIcon onIcon = new CircleIcon(onColor);
		onIcon.setSize(0.75);
		onIcon.setTransparency(0.5);
		this.setIcon(onIcon);		
	}
	
	//	Turn the lamp off
	public void turnOff() {
		Color offColor = new Color(0, 0, 0);
		CircleIcon offIcon = new CircleIcon(offColor);
		offIcon.setSize(0.25);
		this.setIcon(offIcon);
	}

}
