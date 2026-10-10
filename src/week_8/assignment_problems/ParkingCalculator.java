package week_8.assignment_problems;

abstract class Vehicle {
    protected int hours;
    public Vehicle(int hours) { this.hours = hours; }
    public abstract double getCharge();
    public abstract String getType();
}

class Bike extends Vehicle {
    public Bike(int hours) { super(hours); }
    @Override
    public double getCharge() { return 10.0 * hours; }
    @Override
    public String getType() { return "BIKE"; }
}

class Car extends Vehicle {
    public Car(int hours) { super(hours); }
    @Override
    public double getCharge() { 
        return hours == 0 ? 0 : 30.0 + (20.0 * (hours - 1)); 
    }
    @Override
    public String getType() { return "CAR"; }
}

class Truck extends Vehicle {
    public Truck(int hours) { super(hours); }
    @Override
    public double getCharge() { 
        return Math.max(100.0, 50.0 * hours); 
    }
    @Override
    public String getType() { return "TRUCK"; }
}

public class ParkingCalculator {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Bike(3),
            new Car(4),
            new Truck(1),
            new Car(1)
        };

        double grandTotal = 0;
        for (Vehicle v : vehicles) {
            double charge = v.getCharge();
            grandTotal += charge;
            System.out.printf("%s: %.2f\n", v.getType(), charge);
        }
        System.out.printf("Total: %.2f\n", grandTotal);
    }
}
