package hotelreservation;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class HotelReservation {
	public static HashMap<String, Hotel> listOfHotels = new HashMap<String, Hotel>();
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws ParseException {
		HotelReservation hr = new HotelReservation();
		System.out.println("Welcome to Hotel Reservation System");
		hr.add(null, 0, 0);
		hr.findCheapestHotel(null, null);
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
    public String findCheapestHotel(String startDate, String endDate) throws ParseException {
        Date date1=new SimpleDateFormat("ddMMMyyyy").parse(startDate);
        Date date2=new SimpleDateFormat("ddMMMyyyy").parse(endDate);
        long diff = TimeUnit.MILLISECONDS.toDays(date2.getTime()-date1.getTime())+1;
        
        int minimumPrice = listOfHotels.get("BridgeWood").getRateRegularCustomer();
        String hotelName = "BridgeWood";
        for(Hotel p: listOfHotels.values()){
            if(minimumPrice>p.getRateRegularCustomer() ){
                minimumPrice = p.getRateRegularCustomer();
                hotelName = p.getName();
            }
        }
        long totalRates = diff*minimumPrice;
        System.out.println(hotelName+", Total Rates: "+totalRates);
        return hotelName;
    }
}
