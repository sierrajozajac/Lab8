/***
 * This enumeration represents all colors necessary for game pieces
 * @author Sierra Jo Sallee
 * @version 03/26/2019
 */
public enum Color {
	// All possible enumerations for colors and their values
	RED(255, 0, 0),
	GREEN(0, 255, 0),
	BLUE(0, 0, 255), 
	YELLOW(255, 255, 0), 
	CYAN(0, 255, 255), 
	MAGENTA(255, 0, 255);
	
	// Private integers that represent the RGB values for each color
	private int r;
	private int g;
	private int b;

	/***
	 * The constructor for all color enumerations.
	 * @param red Represents the integer red value.
	 * @param green Represents the integer green value.
	 * @param blue Represents the integer blue value.
	 */
	private Color(int red, int green, int blue) {
		r = red;
		g = green;
		b = blue;
	}
	
	/***
	 * This accessor method returns the integer red value for the color
	 * @return Returns the integer red value.
	 */
	public int getR() {
		return r;
	}
	
	/***
	 * This accessor method returns the integer green value for the color
	 * @return Returns the integer green value.
	 */
	public int getG() {
		return g;
	}
	
	/***
	 * This accessor method returns the integer blue value for the color
	 * @return Returns the integer blue value.
	 */
	public int getB() {
		return b;
	}
	
	/***
	 * This method wasn't originally called for, but I added it as the game piece appearance toString
	 * method would return weird values otherwise.
	 * @return Returns the string for each color enumeration.
	 */
	public String toString() {
		switch(this) {
		case RED: return "red";
		case GREEN: return "green";
		case BLUE: return "blue";
		case YELLOW: return "yellow";
		case CYAN: return "cyan";
		case MAGENTA: return "magenta";
		default: throw new IllegalArgumentException();
		}
	}
}
