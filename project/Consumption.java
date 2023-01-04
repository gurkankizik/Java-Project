package project;

public abstract class Consumption {
	public double total, consumption, lastMonth, currentMonth, price, tax;
	
	//Default
	public Consumption() {
		
	}
	
	//Parameterized
	public Consumption(double lastMonth, double currentMonth){
		this.lastMonth = lastMonth;
		this.currentMonth = currentMonth;
	}
	
	//Abstract methods
	public abstract void setConsumption(double lastMonth, double currentMonth, double hour);
	public abstract double getConsumption();
	public abstract void calculateTotal();
	public abstract void calculateTax();
	public abstract void showReceipt();
}
