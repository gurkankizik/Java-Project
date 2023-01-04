package project;

public class ElectricConsumption extends Consumption{

	public double watt;
	public double hour;
	
	//Final and private to protect Electric price
	final private double below240kWh = 1.75;
	final private double after240kWh = 2.60;
	
	//Default
	public ElectricConsumption() {
		
	}
	//Parameterized
	public ElectricConsumption(double lastMonth, double currentMonth, double hour) {
		super(lastMonth, currentMonth);
		this.hour = hour;
	}
	
	public void setConsumption(double lastMonth, double currentMonth, double hour) {
		this.lastMonth = lastMonth;
		this.currentMonth = currentMonth;
		this.hour = hour;
	}
	
	public double getConsumption() {
		return currentMonth - lastMonth;
	}
	
	public void calculateTotal() {
		//Calculating kWh
		watt = currentMonth - lastMonth;
		consumption = (watt * hour) / 1000;
		
		//Checking the consumption if below 240 to define the price
		if (consumption <= 240) total = consumption * below240kWh;
		else total = consumption * after240kWh;
	}

	public void calculateTax() {
		tax = total * 8 / 100;
	}
	
	public void showReceipt() {
		System.out.println("----------------");
		System.out.println("Used Electric: " + getConsumption());
		System.out.println("Hour: " + hour);
		System.out.println("kWh: " + consumption);
		System.out.println("Tax: " + tax + " $");
		System.out.println("Total: " + (total + tax) + " $");
		System.out.println("----------------");
	}
}
