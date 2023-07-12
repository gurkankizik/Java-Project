package project;


public abstract class CarConsumption extends Menu {
	public double distanceTraveled, consumption, kmCost, cost, total, averageSpeed, consumedFuel;
	public int fuelType;
	double price = 26.62;
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
	
	public void TripComputer(double distanceTraveled, double consumption, double averageSpeed) {
		System.out.println(" ");
		System.out.println("-------- Trip Computer --------");
		System.out.println("Fuel Consumption " + consumption + " 100km/l");
		System.out.println("Distance Traveled " + distanceTraveled + " km");
		System.out.println("Average Speed " + averageSpeed + " km/h");
		consumedFuel = (distanceTraveled / 100 * consumption);
		System.out.println("Consumed Fuel " + Math.round(consumedFuel*100.0)/100.0 + " l");
		kmCost = price * consumption / 100;

		System.out.println("Cost Per KM " + Math.round(kmCost*100.0)/100.0 + " $");
		System.out.println("-------------------------------");
	}
	
}