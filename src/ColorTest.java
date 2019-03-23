import org.junit.*;

public class ColorTest {

	public ColorTest() {
		Assert.assertEquals(Color.RED , Color.valueOf("RED"));
		Assert.assertEquals(Color.GREEN , Color.valueOf("GREEN"));
		Assert.assertEquals(Color.BLUE , Color.valueOf("BLUE"));
		Assert.assertEquals(Color.YELLOW , Color.valueOf("YELLOW"));
		Assert.assertEquals(Color.CYAN , Color.valueOf("CYAN"));
		Assert.assertEquals(Color.MAGENTA , Color.valueOf("MAGENTA"));

		Assert.assertEquals(Color.RED.getR(), 255);
		Assert.assertEquals(Color.GREEN.getR(), 0);
		Assert.assertEquals(Color.BLUE.getR(), 0);
		Assert.assertEquals(Color.YELLOW.getR(), 255);
		Assert.assertEquals(Color.CYAN.getR(), 0);
		Assert.assertEquals(Color.MAGENTA.getR(), 255);
		
		Assert.assertEquals(Color.RED.getG(), 0);
		Assert.assertEquals(Color.GREEN.getG(), 255);
		Assert.assertEquals(Color.BLUE.getG(), 0);
		Assert.assertEquals(Color.YELLOW.getG(), 255);
		Assert.assertEquals(Color.CYAN.getG(), 255);
		Assert.assertEquals(Color.MAGENTA.getG(), 0);
		
		Assert.assertEquals(Color.RED.getB(), 0);
		Assert.assertEquals(Color.GREEN.getB(), 0);
		Assert.assertEquals(Color.BLUE.getB(), 255);
		Assert.assertEquals(Color.YELLOW.getB(), 0);
		Assert.assertEquals(Color.CYAN.getB(), 255);
		Assert.assertEquals(Color.MAGENTA.getB(), 255);
	}

}
