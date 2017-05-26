package ch05;
import becker.robots.*;

public class DeliveryBot extends RobotSE {

	public DeliveryBot(City magazijn, int street, int avenue, Direction dir, int things) {
		super(magazijn, street, avenue, dir, things);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City magazijn = new City();
		DeliveryBot karel = new DeliveryBot(magazijn, 0, 0, Direction.EAST, 50);
		
		karel.deliverThings(7);
	}

	public void deliverThings(int things) {
		int count = 0;
		while (things > 1 && things > count) {
			this.move();
			count += 1;
			for (int i = 0; i < count; i += 1) {
				this.putThing();
				things -= 1;
			}
		}
		this.move(2);
		for (int i = 0; i < things; i += 1) {
			this.putThing();
			this.move();
		}
	}
}
