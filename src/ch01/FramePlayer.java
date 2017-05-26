package ch01;
import javax.swing.*;

public class FramePlayer {
	public static void main(String[] args) {
		//	declare objects to show
		JFrame venster = new JFrame();
		JPanel inhoud = new JPanel();
		JTextArea tekst = new JTextArea(5, 10);
		JButton knop = new JButton("Quit");
		
		tekst.setLineWrap(true);
		tekst.setText("Dit is een zinnetje van het programma.\n");
		tekst.append("En hier volgt een tweede zinnetje.\n");

		//	set up the contents
		inhoud.add(tekst);
		inhoud.add(knop);
		
		//	set the panel as content of the frame
		venster.setContentPane(inhoud);
		
		//	set up and show the frame
		venster.setTitle("Zinnetjes");
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setLocation(300, 200);
		venster.setSize(300, 200);
		venster.setVisible(true);	
	}
}
