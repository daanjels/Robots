package ch06;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


/** A frame that displays the city (and all it contains) and a start 
 * button.
 *
 * @author Byron Weber Becker */
public class SimpleCityFrame extends Object
{
	private JButton start = new JButton("Start");
	private JFrame frame = new JFrame("Simplified Robots");
	private View view;
	
	public SimpleCityFrame(Paintable[][] layers)
	{
		super();
		// Set up the two things that get displayed -- the view of the city
		// and the start button
		this.view = new View(layers);
		this.start.addActionListener(new StartListener());
		
		// Arrange the view and start button in a JPanel
		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());
		content.add(this.view, BorderLayout.CENTER);
		content.add(this.start, BorderLayout.EAST);
		// Set up the frame to display the view.
		this.frame.setSize(600, 600);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setContentPane(content);
		this.frame.setVisible(true);
	}
	
	public synchronized void waitForStart()
	{
		try
		{
			this.wait();
		} catch (InterruptedException e)
		{}
	}
	
	private synchronized void start()
	{
		this.notifyAll();
	}
	
	private class StartListener implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			SimpleCityFrame.this.start();
		}
	}
}
