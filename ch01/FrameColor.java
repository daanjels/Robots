package ch01;
import javax.swing.*;

public class FrameColor {
	public static void main(String[] args) {
		//	declare objects to show
		JFrame venster = new JFrame();
		JPanel inhoud = new JPanel();
		JColorChooser kiezer = new JColorChooser();

		//	set up the contents
		inhoud.add(kiezer);
		
		//	set the panel as content of the frame
		venster.setContentPane(inhoud);
		
		//	set up and show the frame
		venster.setTitle("Zinnetjes");
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setLocation(300, 200);
		venster.setSize(900, 800);
		venster.setVisible(true);	
	}
}
