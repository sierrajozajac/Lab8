import org.junit.*;

public class GamePieceTest {

	public GamePieceTest() {
		Assert.assertEquals(GamePiece.BLUE_BOOT.getColor(), Color.BLUE);
		Assert.assertEquals(GamePiece.BLUE_RACER.getColor(), Color.BLUE);
		Assert.assertEquals(GamePiece.GREEN_BOOT.getColor(), Color.GREEN);
		Assert.assertEquals(GamePiece.MAGENTA_RACER.getColor(), Color.MAGENTA);
		Assert.assertEquals(GamePiece.RED_RACER.getColor(), Color.RED);
		Assert.assertEquals(GamePiece.RED_THIMBLE.getColor(), Color.RED);
		Assert.assertEquals(GamePiece.YELLOW_BOOT.getColor(), Color.YELLOW);
		
		Assert.assertEquals(GamePiece.BLUE_BOOT.getShape(), Shape.BOOT);
		Assert.assertEquals(GamePiece.BLUE_RACER.getShape(), Shape.RACECAR);
		Assert.assertEquals(GamePiece.GREEN_BOOT.getShape(), Shape.BOOT);
		Assert.assertEquals(GamePiece.MAGENTA_RACER.getShape(), Shape.RACECAR);
		Assert.assertEquals(GamePiece.RED_RACER.getShape(), Shape.RACECAR);
		Assert.assertEquals(GamePiece.RED_THIMBLE.getShape(), Shape.THIMBLE);
		Assert.assertEquals(GamePiece.YELLOW_BOOT.getShape(), Shape.BOOT);
		
		Assert.assertEquals(GamePiece.BLUE_BOOT.toString(), "blue boot");
		Assert.assertEquals(GamePiece.BLUE_RACER.toString(), "blue racecar");
		Assert.assertEquals(GamePiece.GREEN_BOOT.toString(), "green boot");
		Assert.assertEquals(GamePiece.MAGENTA_RACER.toString(), "magenta racecar");
		Assert.assertEquals(GamePiece.RED_RACER.toString(), "red racecar");
		Assert.assertEquals(GamePiece.RED_THIMBLE.toString(), "red thimble");
		Assert.assertEquals(GamePiece.YELLOW_BOOT.toString(), "yellow boot");
		
		// TODO: finish moves first testing
	}

}
