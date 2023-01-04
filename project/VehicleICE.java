package project;

public class VehicleICE extends CarConsumption {

	final protected double priceGas = 19.52;
	final protected double priceDiesel= 22.07;
	final protected double priceLPG= 22.07;

	//Default
	public VehicleICE() {
		
	}
	
	//Parameterized
	public VehicleICE(double distanceTraveled, double consumption, int fuelType) {
		super(distanceTraveled, consumption, fuelType);
	}
	
	public void setConsumption(double distanceTraveled, double consumption, int fuelType) {
		this.distanceTraveled = distanceTraveled;
		this.consumption = consumption;
		this.fuelType = fuelType;
	}
	
	public void calculateConsumption() {
		//To determine fuelType and using or operator to get input from user without crashing while
		if(fuelType == 1) 
			total = consumption * priceGas;
		else if(fuelType == 2)
			total = consumption * priceDiesel;
		else if(fuelType == 3)
			total = consumption * priceLPG;
		//To calculate costs
		kmCost = total / 100;
		cost = distanceTraveled * kmCost;
	}
	
	public void show() {
		System.out.println("---------------");
		System.out.println("Consumption: " + consumption + " km/lt");
		System.out.println("Distance Traveled: " + distanceTraveled + " km");
		System.out.println("Cost per Km: " + kmCost + " $");
		System.out.println("Total Cost: " + cost + " $");
		System.out.println("---------------");
	}
}
