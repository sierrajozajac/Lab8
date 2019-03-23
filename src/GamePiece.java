/***
 * This enumeration represents all game pieces available for players in the board game.
 * @author Sierra Jo Sallee
 * @version 03/26/2018
 */
public enum GamePiece {
	// All enumerations available and their constructors
	RED_RACER(new GamePieceAppearance(Color.RED, Shape.RACECAR), 1),
	BLUE_RACER(new GamePieceAppearance(Color.BLUE, Shape.RACECAR), 2),
	MAGENTA_RACER(new GamePieceAppearance(Color.MAGENTA, Shape.RACECAR), 3),
	RED_THIMBLE(new GamePieceAppearance(Color.RED, Shape.THIMBLE), 4),
	BLUE_BOOT(new GamePieceAppearance(Color.BLUE, Shape.BOOT), 5),
	GREEN_BOOT(new GamePieceAppearance(Color.GREEN, Shape.BOOT), 6),
	YELLOW_BOOT(new GamePieceAppearance(Color.YELLOW, Shape.BOOT), 7);

	// The properties necessary for any game piece.
	private GamePieceAppearance appearance;
	private int priority;
	
	/***
	 * The constructor for game piece objects.
	 * @param appearance Represents the game piece appearance for the game piece.
	 * @param priority Represents the priority for the game piece. Priorities will be used to determine which 
	 * game piece moves first. This lower the number, the higher the priority.
	 */
	private GamePiece(GamePieceAppearance appearance, int priority) {
		this.appearance = appearance;
		this.priority = priority;
	}
	
	/***
	 * This accessor method returns the color enumeration for the given game piece.
	 * @return Returns the color enumeration for the game piece.
	 */
	public Color getColor() {
		return appearance.getColor();
	}
	
	/***
	 * This accessor method returns the shape enumeration for the given game piece.
	 * @return Returns the shape enumeration for the game piece.
	 */
	public Shape getShape() {
		return appearance.getShape();
	}
	
	/***
	 * This method determines which game piece moves first whenever two game pieces are trying to move
	 * at the same time. This is based upon the priority of the given game pieces.
	 * @param a Represents one of the game pieces.
	 * @param b Represents one of the game pieces.
	 * @return Returns the game piece with the higher priority.
	 */
	public GamePiece movesFirst(GamePiece a, GamePiece b) {
		if (a.priority > b.priority) {
			return b;
		}
		else if (a.priority < b.priority) {
			return a;
		}
		// This loop should never run
		else {
			return null;
		}
	}
	
	/***
	 * This method returns the string representing the game piece.
	 */
	public String toString() {
		return appearance.getColor() + " " + appearance.getShape().toString();
	}
}
