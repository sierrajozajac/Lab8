public enum Color {
	RED(255, 0, 0),
	GREEN(0, 255, 0),
	BLUE(0, 0, 255), 
	YELLOW(255, 255, 0), 
	CYAN(0, 255, 255), 
	MAGENTA(255, 0, 255);
	
	private int r;
	private int g;
	private int b;

	private Color(int red, int green, int blue) {
		r = red;
		g = green;
		b = blue;
	}
	
	public int getR() {
		return r;
	}
	
	public int getG() {
		return g;
	}
	
	public int getB() {
		return b;
	}
	
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
