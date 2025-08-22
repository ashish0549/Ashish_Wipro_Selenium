//4. Extended Interface Hierarchy
//
//•	Define interface BaseVehicle with method void start().
//•	Define interface AdvancedVehicle that extends BaseVehicle, adding method void stop() and boolean refuel(int amount).
//•	Implement Car to satisfy both interfaces; include a constructor initializing fuel level.
//•	In Main, manipulate the object via both interface types.


package Day_5_Assignment;
interface BaseVehicle {
    void start();
}
interface AdvancedVehicle extends BaseVehicle {
    void stop();
    boolean refuel(int amount);
}
class Car implements AdvancedVehicle {
    private int fuel;

    public Car(int initialFuel) {
        this.fuel = initialFuel;
    }

    @Override
    public void start() {
        if (fuel > 0) {
            System.out.println("Car started. Fuel level: " + fuel);
            fuel--;
        } else {
            System.out.println("Cannot start. No fuel.");
        }
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }

    @Override
    public boolean refuel(int amount) {
        if (amount > 0) {
            fuel += amount;
            System.out.println("Refueled " + amount + " units. Total fuel: " + fuel);
            return true;
        } else {
            System.out.println("Invalid refuel amount.");
            return false;
        }
    }
}

public class Interface_4 {

	public static void main(String[] args) {
        BaseVehicle base = new Car(1);
        base.start(); 
       
        AdvancedVehicle adv = (AdvancedVehicle) base;
        adv.refuel(5);
        adv.start();
        adv.stop();
    }
}


