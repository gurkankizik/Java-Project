package project;

public abstract class CarConsumption {
	public double distanceTraveled, consumption, price, kmCost, cost, total;
	public int fuelType;
	
	//Default
	public CarConsumption() {
		
	}
	//Parameterized
	public CarConsumption(double distanceTraveled, double consumption, int fuelType) {
		this.distanceTraveled = distanceTraveled;
		this.consumption = consumption;
		this.fuelType = fuelType;
	}
	//Abstract methods
	public abstract void setConsumption(double distanceTraveled, double consumption, int fuelType);
	public abstract void calculateConsumption();
	public abstract void show();
	
}