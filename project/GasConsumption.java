package project;

public class GasConsumption extends Consumption{

	//Final and private to protect Gas Price
	final private double gasPrice = 5.209;
	
	//Default
	public GasConsumption(){
		
	}
	//Parameterized
	public GasConsumption(double lastMonth, double currentMonth){
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
		total = consumption * gasPrice;
	}
	public void calculateTax() {
		tax = total * 18 / 100;		
	}
	public void showReceipt() {	
		System.out.println("----------------");
		System.out.println("Used Gas: " + getConsumption());
		System.out.println("Tax: " + tax + " $");
		System.out.println("Total: " + (total + tax) + " $");
		System.out.println("----------------");
	}
}
