package project;

public class VehicleEV extends CarConsumption{

	final protected double priceAC = 6.5;
	final protected double priceDC = 7.7;
	final protected double priceFast = 8.2;
	
	//Default
	public VehicleEV() {
		
	}
	
	//Parameterized
	public VehicleEV(double distanceTraveled, double consumption, int fuelType) {
		super(distanceTraveled, consumption, fuelType);
	}
	
	public void setConsumption(double distanceTraveled, double consumption, int fuelType) {
		this.distanceTraveled = distanceTraveled;
		this.consumption = consumption;
		this.fuelType = fuelType;
	}
	
	public void calculateConsumption() {
		//To determine fuelType and or operator is to get input from user without crashing the code
		if(fuelType == 1) 
			total = consumption * priceAC;
		else if(fuelType == 2) 
			total = consumption * priceDC;
		else if(fuelType == 3)
			total = consumption * priceFast;
		//To Calculate Costs
		kmCost = total / 100;
		cost = distanceTraveled * kmCost;
	}
	
	public void show() {
		System.out.println("---------------");
		System.out.println("Consumption: " + consumption + " km/kWh");
		System.out.println("Distance Traveled: " + distanceTraveled + " km");
		System.out.println("Cost per Km: " + kmCost + " $");
		System.out.println("Total Cost: " + cost + " $");
		System.out.println("---------------");
	}
}
