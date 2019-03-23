/***
 * This enumeration represents all shapes necessary for game pieces.
 * @author Sierra Jo Sallee
 * @version 03/26/2019
 */
public enum Shape {
	// All enumerations of shapes available
	THIMBLE, BOOT, RACECAR;
	
	/***
	 * This returns the string representing each of the shape enumerations.
	 */
	public String toString() {
	    switch(this) {
	      case THIMBLE: return "thimble";
	      case BOOT: return "boot";
	      case RACECAR: return "racecar";
	      default: throw new IllegalArgumentException();
	    }
	}
}