package ch05;
import javax.swing.*;
import java.awt.*;

public class DrawWindow extends JComponent {

	public static void main(String[] args) {
		JFrame venster = new JFrame();
		JPanel inhoud = new JPanel();
//		ArtComponent kunst = new ArtComponent();
		ArtContent kunst = new ArtContent();
		
		inhoud.add(kunst);
		
		venster.setContentPane(inhoud);
		venster.setTitle("Galerij");
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setLocation(250, 100);
		venster.pack();
		venster.setVisible(true);
	}
}
