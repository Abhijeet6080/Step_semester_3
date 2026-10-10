package week_8.practice_problems;

abstract class Delivery {
    protected double weight;
    protected double distance;
    public Delivery(double weight, double distance) {
        this.weight = weight;
        this.distance = distance;
    }
    public abstract double calculateFee();
    public abstract String getType();
}

class StandardDelivery extends Delivery {
    public StandardDelivery(double weight, double distance) { super(weight, distance); }
    @Override
    public double calculateFee() { return 5.0 + (0.50 * weight) + (0.10 * distance); }
    @Override
    public String getType() { return "STANDARD"; }
}

class ExpressDelivery extends Delivery {
    public ExpressDelivery(double weight, double distance) { super(weight, distance); }
    @Override
    public double calculateFee() { return 15.0 + (1.00 * weight) + (0.20 * distance); }
    @Override
    public String getType() { return "EXPRESS"; }
}

class InternationalDelivery extends Delivery {
    private double customsFee;
    public InternationalDelivery(double weight, double distance, double customsFee) {
        super(weight, distance);
        this.customsFee = customsFee;
    }
    @Override
    public double calculateFee() { return 25.0 + (2.00 * weight) + (0.50 * distance) + customsFee; }
    @Override
    public String getType() { return "INTERNATIONAL"; }
}

public class DeliverySystem {
    public static void main(String[] args) {
        Delivery[] deliveries = {
            new StandardDelivery(10, 50),
            new ExpressDelivery(5, 20),
            new InternationalDelivery(20, 100, 30)
        };

        double totalFee = 0;
        for (Delivery d : deliveries) {
            double fee = d.calculateFee();
            totalFee += fee;
            System.out.printf("%s: %.2f\n", d.getType(), fee);
        }
        System.out.printf("Total: %.2f\n", totalFee);
    }
}