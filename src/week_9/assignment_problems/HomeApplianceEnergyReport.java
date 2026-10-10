package week_9.assignment_problems;

interface SaverModeSupported {}

abstract class Appliance {
    protected double hours;
    public Appliance(double hours) { this.hours = hours; }
    public abstract double getPower();
    public abstract String getType();
    
    public double getUnits() {
        return (getPower() * hours) / 1000.0;
    }
}

class Fridge extends Appliance {
    public Fridge(double hours) { super(hours); }
    @Override
    public double getPower() { return 150.0; }
    @Override
    public String getType() { return "FRIDGE"; }
}

class AirConditioner extends Appliance implements SaverModeSupported {
    public AirConditioner(double hours) { super(hours); }
    @Override
    public double getPower() { return 1500.0; }
    @Override
    public String getType() { return "AC"; }
}

class Television extends Appliance {
    public Television(double hours) { super(hours); }
    @Override
    public double getPower() { return 100.0; }
    @Override
    public String getType() { return "TV"; }
}

class Washer extends Appliance implements SaverModeSupported {
    public Washer(double hours) { super(hours); }
    @Override
    public double getPower() { return 500.0; }
    @Override
    public String getType() { return "WASHER"; }
}

public class HomeApplianceEnergyReport {
    public static void main(String[] args) {
        Object[][] usages = {
            {new Fridge(24), false},
            {new AirConditioner(8), true},
            {new Television(5), false},
            {new Washer(2), true}
        };

        double grandTotalCost = 0;
        for (Object[] usage : usages) {
            Appliance app = (Appliance) usage[0];
            boolean saverRequested = (Boolean) usage[1];

            if (saverRequested && !(app instanceof SaverModeSupported)) {
                System.out.printf("%s: saver mode not supported\n", app.getType());
                continue;
            }

            double units = app.getUnits();
            if (saverRequested) {
                units *= 0.75;
            }
            
            double cost = units * 8.0;
            grandTotalCost += cost;
            
            System.out.printf("%s: Units=%.2f Cost=%.2f\n", app.getType(), units, cost);
        }
        System.out.printf("Total Cost: %.2f\n", grandTotalCost);
    }
}
