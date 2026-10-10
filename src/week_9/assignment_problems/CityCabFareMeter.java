package week_9.assignment_problems;

interface NightServiceCapable {}

abstract class Cab {
    protected double km;
    public Cab(double km) { this.km = km; }
    protected abstract double getRate();
    public abstract String getType();
    
    public double getBaseFare() {
        return Math.max(100.0, km * getRate());
    }
}

class MiniCab extends Cab {
    public MiniCab(double km) { super(km); }
    @Override
    protected double getRate() { return 10.0; }
    @Override
    public String getType() { return "MINI"; }
}

class SedanCab extends Cab implements NightServiceCapable {
    public SedanCab(double km) { super(km); }
    @Override
    protected double getRate() { return 14.0; }
    @Override
    public String getType() { return "SEDAN"; }
}

class SUVCab extends Cab implements NightServiceCapable {
    public SUVCab(double km) { super(km); }
    @Override
    protected double getRate() { return 18.0; }
    @Override
    public String getType() { return "SUV"; }
}

public class CityCabFareMeter {
    public static void main(String[] args) {
        Object[][] trips = {
            {new MiniCab(8), "DAY"},
            {new SedanCab(10), "NIGHT"},
            {new SUVCab(20), "DAY"},
            {new MiniCab(5), "NIGHT"}
        };

        double grandTotal = 0;
        for (Object[] trip : trips) {
            Cab cab = (Cab) trip[0];
            String time = (String) trip[1];

            if (time.equals("NIGHT") && !(cab instanceof NightServiceCapable)) {
                System.out.printf("%s: night service not available\n", cab.getType());
                continue;
            }

            double fare = cab.getBaseFare();
            if (time.equals("NIGHT")) {
                fare *= 1.20; 
            }
            
            grandTotal += fare;
            System.out.printf("%s: %.2f\n", cab.getType(), fare);
        }
        System.out.printf("Total: %.2f\n", grandTotal);
    }
}
