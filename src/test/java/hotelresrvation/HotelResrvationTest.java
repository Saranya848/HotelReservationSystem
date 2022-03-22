package hotelresrvation;

import java.text.ParseException;

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

	@Test
	public void cheapestHotel() throws ParseException {
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.add("BridgeWood", 160, 60);
		hotelReservation.add("LikeWood", 110, 90);
		hotelReservation.add("RidgeWood", 220, 150);
		String cheapestHotel = hotelReservation.findCheapestHotel("10sep2020", "11sep2020");
		Assert.assertEquals("LikeWood", cheapestHotel);

	}
}
