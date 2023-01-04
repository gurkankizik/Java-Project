package project;

public class WaterConsumption extends Consumption {

	public double tax1;
	
	//Final and private to protect the Water Price
	final private double waterPrice = 21.95;
	
	//Default
	public WaterConsumption() {
		
	}
	
	//Parameterized
	public WaterConsumption(double lastMonth, double currentMonth) {
		super(lastMonth, currentMonth);
	}
	
	public void setConsumption(double lastMonth, double currentMonth, double hour) {
		this.lastMonth = lastMonth;
		this.currentMonth = currentMonth;
	}
	
	public double getConsumption() {
		return currentMonth - lastMonth;
	}
	
	public void calculateTotal() {
		consumption = currentMonth - lastMonth;
		total = consumption * waterPrice;
	}
	public void calculateTax() {
		//First tax is VAT
		tax = total * 1 / 100;
		//Second tax is environmental tax
		tax1 = tax * 1 / 100;
	}
	public void showReceipt() {	
		System.out.println("----------------");
		System.out.println("Used Water: " + getConsumption());
		System.out.println("Tax: " + (tax + tax1) + " $");
		System.out.println("Total: " + (total + tax + tax1) + " $");
		System.out.println("----------------");
	}
}