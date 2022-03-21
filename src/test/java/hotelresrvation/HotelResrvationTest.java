package hotelresrvation;

import org.junit.Assert;

import org.junit.Test;

import hotelreservation.HotelReservation;

public class HotelResrvationTest {

	// @Test
	// public void test() {
	// fail("Not yet implemented");
	// }

	@Test
	public void addedHotelInHotelReservationSystem_() {
		HotelReservation hotelReservation = new HotelReservation();
		boolean result = hotelReservation.add(null, 0, 0);
		Assert.assertEquals(true, result);
	}

}
