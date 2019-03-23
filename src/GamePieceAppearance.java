/***
 * This class represents the appearance for game pieces. This object uses colors and shapes to represent the
 * game piece. 
 * @author Sierra Jo Sallee
 * @version 03/26/2019
 */
public class GamePieceAppearance{
	// All necessary information for any game piece appearance object.
	private Color color;
	private Shape shape;
	
	/***
	 * This constructor initializes all information for the game piece.
	 * @param color Represents the color enumeration for the game piece appearance.
	 * @param shape Represents the shape enumeration for the game piece appearance.
	 */
	public GamePieceAppearance(Color color, Shape shape) {
		this.color = color;
		this.shape = shape;
	}
	
	/***
	 * This accessor method returns the color enumeration of the given game piece appearance.
	 * @return Returns the color enumeration.
	 */
	public Color getColor() {
		return color;
	}
	
	/***
	 * This accessor method returns the shape enumeration of the given game piece appearance.
	 * @return Returns the shape enumeration.
	 */
	public Shape getShape() {
		return shape;
	}
}