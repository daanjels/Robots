package ch06;

import javax.swing.*;
import java.awt.*;

/** A Thermometer component to use in Graphical User Interfaces.
 *  It can display temperatures from MIN_TEMP to MAX_TEMP, inclusive.
 *
 *  @author Byron Weber Becker */
public class Thermometer extends JComponent
{
   public final int MIN_TEMP = 0;
   public final int MAX_TEMP = 50;
   private int temp = MIN_TEMP;

   /** Construct a new Thermometer. */
   public Thermometer()
   {  super();
      this.setPreferredSize(new Dimension(50, 350));
   }

   /** Paint the thermometer to show the current temperature. */
   public void paintComponent(Graphics g)
   {  super.paintComponent(g);

		final int w = this.getWidth();
		final int h = this.getHeight();
		
		final int bulbDia = h/10;
		final int bulbLeft = w/2 - bulbDia/2;
		final int bulbTop = h - bulbDia;
		
		final int stemWidth = bulbDia/3;
		final int stemLeft = w/2 - stemWidth/2;
		final int stemHeight = h - bulbDia;

		final int fluidHeight = stemHeight * (this.temp - MIN_TEMP) / (MAX_TEMP - MIN_TEMP);
		final int fluidTop = stemHeight - fluidHeight;
		
		// paint the fluid
		g.setColor(Color.RED);
		g.fillOval(bulbLeft, bulbTop, bulbDia, bulbDia);
		g.fillRect(stemLeft, fluidTop, stemWidth, fluidHeight);

		// paint the stem above the fluid
		g.setColor(Color.BLUE);
		g.fillRect(stemLeft, 0, stemWidth, fluidTop);
   }

   /** Set the thermometer's temperature.
    *  @newTemp The new temperature. */
   public void setTemperature(int newTemp)
   {  this.temp = newTemp;
      this.repaint();
   }

   /** Get the thermometer's current temperature.
    *  @returns The thermometer's current temperature. */
   public int getTemperature()
   {  return this.temp;
   }
}