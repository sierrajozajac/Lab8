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
		
		Assert.assertEquals(GamePiece.BLUE_BOOT.movesFirst(GamePiece.RED_RACER, GamePiece.BLUE_RACER), GamePiece.RED_RACER);
		Assert.assertEquals(GamePiece.BLUE_BOOT.movesFirst(GamePiece.BLUE_RACER, GamePiece.MAGENTA_RACER), GamePiece.BLUE_RACER);
		Assert.assertEquals(GamePiece.BLUE_BOOT.movesFirst(GamePiece.MAGENTA_RACER, GamePiece.RED_THIMBLE), GamePiece.MAGENTA_RACER);
		Assert.assertEquals(GamePiece.BLUE_BOOT.movesFirst(GamePiece.RED_THIMBLE, GamePiece.BLUE_BOOT), GamePiece.RED_THIMBLE);
		Assert.assertEquals(GamePiece.BLUE_BOOT.movesFirst(GamePiece.BLUE_BOOT, GamePiece.GREEN_BOOT), GamePiece.BLUE_BOOT);
		Assert.assertEquals(GamePiece.BLUE_BOOT.movesFirst(GamePiece.GREEN_BOOT, GamePiece.YELLOW_BOOT), GamePiece.GREEN_BOOT);
	}

}
