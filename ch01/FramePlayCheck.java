package ch01;
import javax.swing.*;

public class FramePlayCheck {

	public static void main(String[] args) {
		// 	declare objects to show
		JFrame frame = new JFrame();
		JPanel contents = new JPanel();
		JButton saveButton = new JButton("Save");
		JTextArea textDisplay = new JTextArea(5, 10);
		JCheckBox checkBox = new JCheckBox("Show all items");
		
		//	set up the contents
		contents.add(saveButton);
		contents.add(textDisplay);
		contents.add(checkBox);
		
		//	set the frame's contents to display
		frame.setContentPane(contents);
		
		//	set up and show the panel
		frame.setTitle("FramePlay");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(500, 250);
		frame.setSize(200, 300);
		frame.setVisible(true);

	}

}
