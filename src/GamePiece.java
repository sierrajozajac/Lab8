public enum GamePiece {
	RED_RACER(new GamePieceAppearance(Color.RED, Shape.RACECAR), 1),
	BLUE_RACER(new GamePieceAppearance(Color.BLUE, Shape.RACECAR), 2),
	MAGENTA_RACER(new GamePieceAppearance(Color.MAGENTA, Shape.RACECAR), 3),
	RED_THIMBLE(new GamePieceAppearance(Color.RED, Shape.THIMBLE), 4),
	BLUE_BOOT(new GamePieceAppearance(Color.BLUE, Shape.BOOT), 5),
	GREEN_BOOT(new GamePieceAppearance(Color.GREEN, Shape.BOOT), 6),
	YELLOW_BOOT(new GamePieceAppearance(Color.YELLOW, Shape.BOOT), 7);

	private GamePieceAppearance appearance;
	private int priority;
	
	private GamePiece(GamePieceAppearance appearance, int priority) {
		this.appearance = appearance;
		this.priority = priority;
	}
	
	public Color getColor() {
		return appearance.getColor();
	}
	
	public Shape getShape() {
		return appearance.getShape();
	}
	
	public GamePiece movesFirst(GamePiece a, GamePiece b) {
		if (a.priority > b.priority) {
			return b;
		}
		else if (a.priority < b.priority) {
			return a;
		}
		else {
			return null;
		}
	}
	
	public String toString() {
		return appearance.getColor() + " " + appearance.getShape().toString();
	}
}
