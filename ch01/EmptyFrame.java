package ch01;

import javax.swing.*;

public class EmptyFrame {

	public static void main(String[] args) {
		//	declare the object
		JFrame venster = new JFrame();
		
		//	invoke its services
		venster.setTitle("Leeg Venster");
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setLocation(250, 100);
		venster.setSize(150, 200);
		venster.setVisible(true);
	}
}
