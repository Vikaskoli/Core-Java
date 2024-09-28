package OOPs.abstraction;

// Abstract class representing a generic vehicle
abstract class VehicleTwo {
    // Abstract method to be implemented by subclasses
    abstract void start();

    // Abstract method to be implemented by subclasses
    abstract void stop();

    // Concrete method that is common for all vehicles
    void fuel() {
        System.out.println("Filling fuel...");
    }
}

// Subclass representing a Car
class Car extends VehicleTwo {
    @Override
    void start() {
        System.out.println("Car is starting with a key ignition.");
    }

    @Override
    void stop() {
        System.out.println("Car is stopping with brake pedals.");
    }
}

// Subclass representing a Bike
class Bike extends VehicleTwo {
    @Override
    void start() {
        System.out.println("Bike is starting with a kick or electric start.");
    }

    @Override
    void stop() {
        System.out.println("Bike is stopping using hand brakes.");
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        // Creating instances of different types of vehicles
        VehicleTwo myCar = new Car();
        VehicleTwo myBike = new Bike();

        // Starting and stopping the car
        myCar.start();  // Output: Car is starting with a key ignition.
        myCar.fuel();   // Output: Filling fuel...
        myCar.stop();   // Output: Car is stopping with brake pedals.

        System.out.println("-----------------------------");

        // Starting and stopping the bike
        myBike.start(); // Output: Bike is starting with a kick or electric start.
        myBike.fuel();  // Output: Filling fuel...
        myBike.stop();  // Output: Bike is stopping using hand brakes.
    }
}
