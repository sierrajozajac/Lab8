import org.junit.*;

public class ShapeTest {

	public ShapeTest() {
		Assert.assertEquals(Shape.BOOT , Shape.valueOf("BOOT"));
		Assert.assertEquals(Shape.THIMBLE , Shape.valueOf("THIMBLE"));
		Assert.assertEquals(Shape.RACECAR , Shape.valueOf("RACECAR"));
		
		Assert.assertEquals(Shape.BOOT.toString(), "boot");
		Assert.assertEquals(Shape.THIMBLE.toString() , "thimble");
		Assert.assertEquals(Shape.RACECAR.toString() , "racecar");
	}

}
