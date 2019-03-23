import org.junit.*;

public class LocationTest {

	public LocationTest() {
		Assert.assertEquals(Location.KITCHEN , Location.valueOf("KITCHEN"));
		Assert.assertEquals(Location.CONSERVATORY , Location.valueOf("CONSERVATORY"));
		Assert.assertEquals(Location.DINING_ROOM , Location.valueOf("DINING_ROOM"));
		Assert.assertEquals(Location.BALLROOM , Location.valueOf("BALLROOM"));
		Assert.assertEquals(Location.STUDY , Location.valueOf("STUDY"));
		Assert.assertEquals(Location.HALL , Location.valueOf("HALL"));
		Assert.assertEquals(Location.LOUNGE , Location.valueOf("LOUNGE"));
		Assert.assertEquals(Location.LIBRARY , Location.valueOf("LIBRARY"));
		Assert.assertEquals(Location.BILLIARD_ROOM , Location.valueOf("BILLIARD_ROOM"));
	}

}
