package week_8.assignment_problems;

abstract class Room {
    protected int units;
    public Room(int units) { this.units = units; }
    public abstract double getBill();
    public abstract String getType();
}

class SingleRoom extends Room {
    public SingleRoom(int units) { super(units); }
    @Override
    public double getBill() { return 8.0 * units; }
    @Override
    public String getType() { return "SINGLE"; }
}

class SharedRoom extends Room {
    private int occupants;
    public SharedRoom(int units, int occupants) { 
        super(units); 
        this.occupants = occupants; 
    }
    @Override
    public double getBill() { return (6.0 * units) / occupants; }
    @Override
    public String getType() { return "SHARED"; }
}

class ACRoom extends Room {
    public ACRoom(int units) { super(units); }
    @Override
    public double getBill() { return (10.0 * units) + 200.0; }
    @Override
    public String getType() { return "AC"; }
}

public class ElectricityBill {
    public static void main(String[] args) {
        Room[] rooms = {
            new SingleRoom(120),
            new SharedRoom(150, 3),
            new ACRoom(100)
        };

        double grandTotal = 0;
        for (Room r : rooms) {
            double bill = r.getBill();
            grandTotal += bill;
            System.out.printf("%s: %.2f\n", r.getType(), bill);
        }
        System.out.printf("Total: %.2f\n", grandTotal);
    }
}
