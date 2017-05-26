package ch06;
import javax.swing.*;

import becker.util.Utilities;

public class MainTemp extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thermometer t0 = new Thermometer();
		Thermometer t1 = new Thermometer();
		Thermometer t2 = new Thermometer();
		
		JPanel contents = new JPanel();
		contents.add(t0);
		contents.add(t1);
		contents.add(t2);
		
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setContentPane(contents);
		f.pack();
		f.setVisible(true);
		
		t0.setTemperature(0);
		t1.setTemperature(30);
		t2.setTemperature(50);
		
		for(int temp = t0.MIN_TEMP; temp <= t0.MAX_TEMP; temp += 1) {
			t0.setTemperature(temp);
			Utilities.sleep(50);
		}
	}
}
