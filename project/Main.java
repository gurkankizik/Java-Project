package project;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner s = new Scanner(System. in );
    Menu m = new Menu();
    double lastMonth = 0, currentMonth = 0, hour = 0, distanceTraveled = 0, consumption = 0;
    int fuelType = 0, input = 0;
    boolean isTrue = true;

    do {
      m.showMenu();

      //Write this try-catch to prevent wrong input from the user
      do {
        try {
          input = s.nextInt();
          if(input == 1 || input == 2 || input == 3) {
        	  System.out.println("Enter last month's consumption: ");
        	  lastMonth = s.nextDouble();
        	  System.out.println("Enter current month's consumption: ");
        	  currentMonth = s.nextDouble();
        	  if(input == 1)  {
        		  System.out.println("Enter current hour usage: ");
        		  hour = s.nextDouble();
    		  }
          }
          else if(input == 4 || input == 5) {
              System.out.println("Enter Distance Traveled: ");
              distanceTraveled = s.nextDouble();
              System.out.println("Enter Consumption: ");
              consumption = s.nextDouble();
              System.out.println("Enter Fuel Type (Gas-AC: 1 - Diesel-DC: 2 - LPG-Fast: 3)");
              fuelType = s.nextInt();
              //Write this to prevent wrong fuelType from user
              while(fuelType != 1 && fuelType != 2 && fuelType != 3) {
            	  System.out.println("Wrong fuel type.");
                  fuelType = s.nextInt();
              }
          }
          isTrue = false;
        }
        catch(InputMismatchException ex) {
          System.out.println("Please enter an integer.");
          s.next();
        }
      } while (isTrue);

      switch (input) {
      case 1:
        ElectricConsumption e = new ElectricConsumption(lastMonth, currentMonth, hour);
        e.calculateTotal();
        e.calculateTax();
        e.showReceipt();
        break;
      case 2:
        WaterConsumption w = new WaterConsumption();
        w.setConsumption(lastMonth, currentMonth, 1);
        w.calculateTotal();
        w.calculateTax();
        w.showReceipt();
        break;
      case 3:
        GasConsumption g = new GasConsumption(lastMonth, currentMonth);
        g.calculateTotal();
        g.calculateTax();
        g.showReceipt();
        break;
      case 4:
        VehicleICE ice = new VehicleICE();
        ice.setConsumption(distanceTraveled, consumption, fuelType);
        ice.calculateConsumption();
        ice.show();
        break;
      case 5:
        VehicleEV ev = new VehicleEV();
        ev.setConsumption(distanceTraveled, consumption, fuelType);
        ev.calculateConsumption();
        ev.show();
        break;
      }
    } while (input != 0);
  }
}