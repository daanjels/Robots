package ch02;
import becker.robots.*;

/**	A FastTurnBot turns left very quickly relative to its normal speed.
 * 
 * @author arq
 */
public class ThingTree extends Thing {
	/**	Construct a new ThingTree
	 * 
	 * @param aCity			The City where things happen
	 * @param aStreet		The Street where the thing appears
	 * @param anAvenue		The Avenue where the thing appears
	 * @param aDirection	The direction the thing initially faces
	 */

	public ThingTree(City aCity, int aStreet, int anAvenue, Direction aDirection) {
		super(aCity, aStreet, anAvenue, aDirection);
		super.setIcon(new IconTree());
		super.setCanBeCarried(false);
	}	

}
