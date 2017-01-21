package ch02;
import javax.swing.*;

public class ColorPickerFrame extends JFrame {
	public ColorPickerFrame() {
		//100, 100, 750, 450
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setLocation(100, 100);
		super.setSize(750, 450);
		JPanel inhoud = new JPanel();
		JColorChooser kiezer = new JColorChooser();
		inhoud.add(kiezer);
		this.setContentPane(inhoud);
		super.setVisible(true);
	}
}
