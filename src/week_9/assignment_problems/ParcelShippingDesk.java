package week_9.assignment_problems;

interface Insurable {
    double getInsurance();
}

abstract class Parcel {
    protected double weight;
    protected double declaredValue;
    
    public Parcel(double weight, double declaredValue) {
        this.weight = weight;
        this.declaredValue = declaredValue;
    }
    public abstract double getCharge();
    public abstract String getType();
}

class StandardParcel extends Parcel {
    public StandardParcel(double weight, double declaredValue) { super(weight, declaredValue); }
    @Override
    public double getCharge() { return 40.0 + (10.0 * weight); }
    @Override
    public String getType() { return "STANDARD"; }
}

class ExpressParcel extends Parcel implements Insurable {
    public ExpressParcel(double weight, double declaredValue) { super(weight, declaredValue); }
    @Override
    public double getCharge() { return 80.0 + (15.0 * weight); }
    @Override
    public double getInsurance() { return declaredValue * 0.02; }
    @Override
    public String getType() { return "EXPRESS"; }
}

class FragileParcel extends Parcel implements Insurable {
    public FragileParcel(double weight, double declaredValue) { super(weight, declaredValue); }
    @Override
    public double getCharge() { return 40.0 + (10.0 * weight) + 50.0; }
    @Override
    public double getInsurance() { return declaredValue * 0.02; }
    @Override
    public String getType() { return "FRAGILE"; }
}

public class ParcelShippingDesk {
    public static void main(String[] args) {
        Parcel[] parcels = {
            new StandardParcel(3, 500),
            new ExpressParcel(2, 1000),
            new FragileParcel(4, 2000)
        };

        double grandTotal = 0;
        for (Parcel p : parcels) {
            double charge = p.getCharge();
            double insurance = (p instanceof Insurable) ? ((Insurable) p).getInsurance() : 0.0;
            double total = charge + insurance;
            grandTotal += total;
            
            System.out.printf("%s: Charge=%.2f Insurance=%.2f Total=%.2f\n", 
                p.getType(), charge, insurance, total);
        }
        System.out.printf("Grand Total: %.2f\n", grandTotal);
    }
}
