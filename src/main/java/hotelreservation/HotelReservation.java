package hotelreservation;

import java.util.Scanner;

import java.util.HashMap;

public class HotelReservation {
	public static HashMap<String, Hotel> listOfHotels = new HashMap<String, Hotel>();
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HotelReservation hr = new HotelReservation();
		System.out.println("Welcome to Hotel Reservation System");
		hr.add(null, 0, 0);
	}

	public boolean add(String hotelName, int rateRegular, double regularWeekend) {
		System.out.println("Enter hotel name:");
		hotelName = sc.next();
		System.out.println("Enter hotel rating:");
		rateRegular = sc.nextInt();
		System.out.println("Enter regular customer rate:");
		regularWeekend = sc.nextDouble();
		Hotel hotel = new Hotel(hotelName, rateRegular, regularWeekend);
		listOfHotels.put(hotelName, hotel);
		return false;
	}

}
