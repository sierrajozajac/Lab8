import org.junit.*;

public class GamePieceAppearanceTest {

	public GamePieceAppearanceTest() {
		GamePieceAppearance redThimble = new GamePieceAppearance(Color.RED, Shape.THIMBLE);
		GamePieceAppearance blueThimble = new GamePieceAppearance(Color.BLUE, Shape.THIMBLE);
		GamePieceAppearance cyanThimble = new GamePieceAppearance(Color.CYAN, Shape.THIMBLE);
		GamePieceAppearance greenThimble = new GamePieceAppearance(Color.GREEN, Shape.THIMBLE);
		GamePieceAppearance magentaThimble = new GamePieceAppearance(Color.MAGENTA, Shape.THIMBLE);
		GamePieceAppearance yellowThimble = new GamePieceAppearance(Color.YELLOW, Shape.THIMBLE);
		
		Assert.assertEquals(redThimble.getColor(), Color.RED);
		Assert.assertEquals(blueThimble.getColor(), Color.BLUE);
		Assert.assertEquals(cyanThimble.getColor(), Color.CYAN);
		Assert.assertEquals(greenThimble.getColor(), Color.GREEN);
		Assert.assertEquals(magentaThimble.getColor(), Color.MAGENTA);
		Assert.assertEquals(yellowThimble.getColor(), Color.YELLOW);
		
		Assert.assertEquals(redThimble.getShape(), Shape.THIMBLE);
		Assert.assertEquals(blueThimble.getShape(), Shape.THIMBLE);
		Assert.assertEquals(cyanThimble.getShape(), Shape.THIMBLE);
		Assert.assertEquals(greenThimble.getShape(), Shape.THIMBLE);
		Assert.assertEquals(magentaThimble.getShape(), Shape.THIMBLE);
		Assert.assertEquals(yellowThimble.getShape(), Shape.THIMBLE);


		GamePieceAppearance redBoot = new GamePieceAppearance(Color.RED, Shape.BOOT);
		GamePieceAppearance blueBoot = new GamePieceAppearance(Color.BLUE, Shape.BOOT);
		GamePieceAppearance cyanBoot = new GamePieceAppearance(Color.CYAN, Shape.BOOT);
		GamePieceAppearance greenBoot = new GamePieceAppearance(Color.GREEN, Shape.BOOT);
		GamePieceAppearance magentaBoot = new GamePieceAppearance(Color.MAGENTA, Shape.BOOT);
		GamePieceAppearance yellowBoot = new GamePieceAppearance(Color.YELLOW, Shape.BOOT);
		
		Assert.assertEquals(redBoot.getColor(), Color.RED);
		Assert.assertEquals(blueBoot.getColor(), Color.BLUE);
		Assert.assertEquals(cyanBoot.getColor(), Color.CYAN);
		Assert.assertEquals(greenBoot.getColor(), Color.GREEN);
		Assert.assertEquals(magentaBoot.getColor(), Color.MAGENTA);
		Assert.assertEquals(yellowBoot.getColor(), Color.YELLOW);
		
		Assert.assertEquals(redBoot.getShape(), Shape.BOOT);
		Assert.assertEquals(blueBoot.getShape(), Shape.BOOT);
		Assert.assertEquals(cyanBoot.getShape(), Shape.BOOT);
		Assert.assertEquals(greenBoot.getShape(), Shape.BOOT);
		Assert.assertEquals(magentaBoot.getShape(), Shape.BOOT);
		Assert.assertEquals(yellowBoot.getShape(), Shape.BOOT);
		
		
		GamePieceAppearance redRacecar = new GamePieceAppearance(Color.RED, Shape.RACECAR);
		GamePieceAppearance blueRacecar = new GamePieceAppearance(Color.BLUE, Shape.RACECAR);
		GamePieceAppearance cyanRacecar = new GamePieceAppearance(Color.CYAN, Shape.RACECAR);
		GamePieceAppearance greenRacecar = new GamePieceAppearance(Color.GREEN, Shape.RACECAR);
		GamePieceAppearance magentaRacecar = new GamePieceAppearance(Color.MAGENTA, Shape.RACECAR);
		GamePieceAppearance yellowRacecar = new GamePieceAppearance(Color.YELLOW, Shape.RACECAR);

		Assert.assertEquals(redRacecar.getColor(), Color.RED);
		Assert.assertEquals(blueRacecar.getColor(), Color.BLUE);
		Assert.assertEquals(cyanRacecar.getColor(), Color.CYAN);
		Assert.assertEquals(greenRacecar.getColor(), Color.GREEN);
		Assert.assertEquals(magentaRacecar.getColor(), Color.MAGENTA);
		Assert.assertEquals(yellowRacecar.getColor(), Color.YELLOW);
		
		Assert.assertEquals(redRacecar.getShape(), Shape.RACECAR);
		Assert.assertEquals(blueRacecar.getShape(), Shape.RACECAR);
		Assert.assertEquals(cyanRacecar.getShape(), Shape.RACECAR);
		Assert.assertEquals(greenRacecar.getShape(), Shape.RACECAR);
		Assert.assertEquals(magentaRacecar.getShape(), Shape.RACECAR);
		Assert.assertEquals(yellowRacecar.getShape(), Shape.RACECAR);
	}

}
