package abstraction_interfaces.assignment_problems;

abstract class Connection {
    protected int units;
    public Connection(int units) { this.units = units; }
    public abstract double calculateBill();
    public abstract String getType();
}

class HomeConnection extends Connection {
    public HomeConnection(int units) { super(units); }
    @Override
    public double calculateBill() {
        if (units <= 100) return units * 5.0;
        return (100 * 5.0) + ((units - 100) * 7.0);
    }
    @Override
    public String getType() { return "HOME"; }
}

class ShopConnection extends Connection {
    public ShopConnection(int units) { super(units); }
    @Override
    public double calculateBill() { return (units * 8.0) + 100.0; }
    @Override
    public String getType() { return "SHOP"; }
}

class FactoryConnection extends Connection {
    public FactoryConnection(int units) { super(units); }
    @Override
    public double calculateBill() { return Math.max(1000.0, units * 6.0); }
    @Override
    public String getType() { return "FACTORY"; }
}

public class ElectricityBilling {
    public static void main(String[] args) {
        Connection[] connections = {
            new HomeConnection(150),
            new ShopConnection(90),
            new FactoryConnection(120)
        };

        double grandTotal = 0;
        for (Connection c : connections) {
            double bill = c.calculateBill();
            grandTotal += bill;
            System.out.printf("%s: %.2f\n", c.getType(), bill);
        }
        System.out.printf("Total: %.2f\n", grandTotal);
    }
}
