package hotelreservation;

public class Hotel {

	public static int length;

	public Hotel(String hotelName, int rateRegularWeekdays, double regularWeekend) {
		super();
		this.hotelName = hotelName;
		this.rateRegularWeekdays = rateRegularWeekdays;
		this.rateRegularWeekend = regularWeekend;
	}

	// variables
	private String hotelName;
	private int rateRegularWeekdays;
	private double rateRegularWeekend;

	// constructor
	// to get attributes
	public String getName() {
		return hotelName;
	}

	public void setName(String name) {
		this.hotelName = name;
	}

	public int getRateRegularCustomer() {
		return rateRegularWeekdays;
	}

	public void setRateRegularCustomer(int rateRegularCustomer) {
		this.rateRegularWeekdays = rateRegularCustomer;
	}

	public double getRateRegularWeekend() {
		return rateRegularWeekend;
	}

	public void setRateRegularWeekend(double rateRegularWeekend) {
		this.rateRegularWeekend = rateRegularWeekend;
	}

	public int getRateRegularWeekdays() {
		return rateRegularWeekdays;
	}

	public void setRateRegularWeekdays(int rateRegularWeekdays) {
		this.rateRegularWeekdays = rateRegularWeekdays;
	}

	@Override
	public String toString() {
		return "Hotel{" + "name='" + hotelName + '\'' + ", rates=" + rateRegularWeekend + ", weekendRates="
				+ rateRegularWeekdays + '}';
	}
}
