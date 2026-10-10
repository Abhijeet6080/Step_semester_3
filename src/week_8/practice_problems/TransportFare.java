package week_8.practice_problems;

abstract class Transport {
    protected double distance;
    public Transport(double distance) { this.distance = distance; }
    public abstract double calculateFare();
    public abstract String getType();
}

class Bus extends Transport {
    public Bus(double distance) { super(distance); }
    @Override
    public double calculateFare() {
        double fare = 2.0 + (0.10 * distance);
        return Math.min(fare, 10.0); // Max fare is $10
    }
    @Override
    public String getType() { return "BUS"; }
}

class Train extends Transport {
    public Train(double distance) { super(distance); }
    @Override
    public double calculateFare() { return 3.0 + (0.15 * distance); }
    @Override
    public String getType() { return "TRAIN"; }
}

class Metro extends Transport {
    private double peakHourFactor;
    public Metro(double distance, double peakHourFactor) {
        super(distance);
        this.peakHourFactor = peakHourFactor;
    }
    @Override
    public double calculateFare() {
        return (1.50 + (0.20 * distance)) * peakHourFactor;
    }
    @Override
    public String getType() { return "METRO"; }
}

public class TransportFare {
    public static void main(String[] args) {
        Transport[] journeys = {
            new Bus(15),
            new Train(50),
            new Metro(10, 1.5)
        };

        double grandTotal = 0;
        for (Transport t : journeys) {
            double fare = t.calculateFare();
            grandTotal += fare;
            System.out.printf("%s: %.2f\n", t.getType(), fare);
        }
        System.out.printf("Total: %.2f\n", grandTotal);
    }
}
