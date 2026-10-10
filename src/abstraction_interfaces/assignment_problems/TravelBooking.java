package abstraction_interfaces.assignment_problems;

abstract class Booking {
    protected double distance;
    private static final double BOOKING_FEE = 50.0;
    
    public Booking(double distance) { this.distance = distance; }
    
    // Mode-specific fare
    protected abstract double getBaseFare();
    public abstract String getMode();
    
    // Centralized total calculation combining base + fixed fee
    public double calculateTotal() {
        return getBaseFare() + BOOKING_FEE;
    }
}

class BusBooking extends Booking {
    public BusBooking(double distance) { super(distance); }
    @Override
    protected double getBaseFare() { return distance * 2.0; }
    @Override
    public String getMode() { return "BUS"; }
}

class TrainBooking extends Booking {
    public TrainBooking(double distance) { super(distance); }
    @Override
    protected double getBaseFare() { return distance * 1.5; }
    @Override
    public String getMode() { return "TRAIN"; }
}

class FlightBooking extends Booking {
    public FlightBooking(double distance) { super(distance); }
    @Override
    protected double getBaseFare() { return 2500.0 + (distance * 4.0); }
    @Override
    public String getMode() { return "FLIGHT"; }
}

public class TravelBooking {
    public static void main(String[] args) {
        Booking[] bookings = {
            new BusBooking(200),
            new TrainBooking(300),
            new FlightBooking(500)
        };

        for (Booking b : bookings) {
            System.out.printf("%s: %.2f\n", b.getMode(), b.calculateTotal());
        }
    }
}