package ch02;
import becker.robots.*;
import becker.robots.icons.*;     // CircleIcon
import java.awt.*;                // Color

public class LampIcon extends Thing
{
	// Construct a new lamp object.
	public LampIcon(City aCity, int aStreet, int anAvenue)
	{ super(aCity, aStreet, anAvenue);
	}

	// Turn the lamp on.
	public void turnOff()
	{ Color offColor = new Color(20, 20, 20);
		CircleIcon offIcon = new CircleIcon(offColor, 0.20);
		this.setIcon(offIcon);
	}

	// Turn the lamp off.
	public void turnOn()
	{ Color offColor = new Color(50, 50, 50);
		Color onColor = new Color(255, 255, 200);
		CircleIcon onIcon = new CircleIcon(onColor, 1.00);
		CircleIcon offIcon = new CircleIcon(offColor, 0.20);
		CompositeIcon lampIcon = new CompositeIcon(onIcon, offIcon);
		this.setIcon(lampIcon);
	}
}