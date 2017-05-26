package ch06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/** Paint all the things in the city's PaintablesManager on the screen.
 *
 * @author Byron Weber Becker */
public class View extends JComponent
{
	private Paintable[][] layers;
	private Timer timer;
	
	/** Construct the view.
	* @thePMgr the stuff to paint */
	public View(Paintable[][] layers)
	{
		super();
		this.layers = layers;
		this.timer = new Timer(50, new TimerListener());
		this.timer.start();
	}
	
	/** What we do to paint this component -- paint all the things in
	* the manager.
	* @param g the graphics context where painting takes place. */
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.black);
		
		for (int r = 0; r < this.layers.length; r++)
		{
			Paintable[] layer = this.layers[r];
			for (int c = 0; c < layer.length; c++)
			{
				layer[c].paint(g2);
			}
		}
	}
	
	/** Trigger a repaint of the entire component periodically so that
	* robots appear to move. */
	private class TimerListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			View.this.repaint();
		}
	}
}
