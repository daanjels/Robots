package ch06;


/** The city keeps a list of all the things in the city.  
 * 
 * @author Byron Weber Becker */
public class SimpleCity extends Object
	{
	public static final int NUM_AVENUES = 10;
	public static final int NUM_STREETS = 10;
	
	/* The list of things in the city is really a list of all the things that
	* need to be painted. */
	private Paintable[][] layers = new Paintable[3][0];
	private SimpleCityFrame frame;
	
	
	/** Create the city, including the intersections within it. */
	public SimpleCity()
	{
		super();
	
		for (int a = 0; a < NUM_AVENUES; a++)
		{
			for (int s = 0; s < NUM_STREETS; s++)
			{
				SimpleIntersection i = new SimpleIntersection(a, s);
				this.add(i, 0);
			}
		}
		
		// display the city
		this.frame = new SimpleCityFrame(layers);
	}
	
   /** Add a new thing to the list of things in the city.
    * @param p the thing to add to the city
    * @param layer the layer in which it should be painted 
    *     (0=background/intersections,
    *      1=things on intersections, 
    *      2=robots) */
	public void add(Paintable p, int layer)
	{
		// make a new array one longer than the old layer
		int len = this.layers[layer].length;
		Paintable[] newLayer = new Paintable[len + 1];
		
		// copy existing paintables and add the new one
		for (int i=0; i<len; i++)
		{
			newLayer[i] = this.layers[layer][i];
		}
		newLayer[newLayer.length-1] = p;
		
		// replace the layer
		this.layers[layer] = newLayer;
	}
	
	/** Wait for the user to press the start button. */
	public void waitForStart()
	{
		this.frame.waitForStart();
	}
}
