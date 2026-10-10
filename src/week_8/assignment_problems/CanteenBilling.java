package week_8.assignment_problems;

abstract class Customer {
    protected double amount;
    public Customer(double amount) { this.amount = amount; }
    public abstract double getFinalAmount();
    public abstract String getType();
}

class Student extends Customer {
    public Student(double amount) { super(amount); }
    @Override
    public double getFinalAmount() { return amount * 0.90; }
    @Override
    public String getType() { return "STUDENT"; }
}

class Staff extends Customer {
    public Staff(double amount) { super(amount); }
    @Override
    public double getFinalAmount() { return amount * 0.95; }
    @Override
    public String getType() { return "STAFF"; }
}

class Guest extends Customer {
    public Guest(double amount) { super(amount); }
    @Override
    public double getFinalAmount() { return amount + 10.0; }
    @Override
    public String getType() { return "GUEST"; }
}

public class CanteenBilling {
    public static void main(String[] args) {
        Customer[] bills = {
            new Student(200),
            new Staff(300),
            new Guest(150)
        };

        double grandTotal = 0;
        for (Customer c : bills) {
            double finalAmount = c.getFinalAmount();
            grandTotal += finalAmount;
            System.out.printf("%s: %.2f\n", c.getType(), finalAmount);
        }
        System.out.printf("Total: %.2f\n", grandTotal);
    }
}
