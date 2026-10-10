package week_9.assignment_problems;

abstract class Ticket {
    protected int count;
    private static final double CONVENIENCE_FEE = 20.0;

    public Ticket(int count) { this.count = count; }
    protected abstract double getSeatPrice();
    public abstract String getType();

    public double getAmount() {
        return (getSeatPrice() + CONVENIENCE_FEE) * count;
    }
}

class RegularTicket extends Ticket {
    public RegularTicket(int count) { super(count); }
    @Override
    protected double getSeatPrice() { return 150.0; }
    @Override
    public String getType() { return "REGULAR"; }
}

class PremiumTicket extends Ticket {
    public PremiumTicket(int count) { super(count); }
    @Override
    protected double getSeatPrice() { return 250.0; }
    @Override
    public String getType() { return "PREMIUM"; }
}

class ReclinerTicket extends Ticket {
    public ReclinerTicket(int count) { super(count); }
    @Override
    protected double getSeatPrice() { return 400.0; }
    @Override
    public String getType() { return "RECLINER"; }
}

public class MovieTicketCounter {
    public static void main(String[] args) {
        Ticket[] bookings = {
            new RegularTicket(3),
            new PremiumTicket(2),
            new ReclinerTicket(1)
        };

        double total = 0;
        for (Ticket t : bookings) {
            double amount = t.getAmount();
            total += amount;
            System.out.printf("%s: %.2f\n", t.getType(), amount);
        }
        System.out.printf("Total: %.2f\n", total);
    }
}
