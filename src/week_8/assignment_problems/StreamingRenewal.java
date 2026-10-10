package week_8.assignment_problems;
import java.time.LocalDate;

abstract class Subscription {
    protected String name;
    protected LocalDate startDate;
    public Subscription(String name, LocalDate startDate) {
        this.name = name;
        this.startDate = startDate;
    }
    public abstract int getValidityDays();
    
    public LocalDate getRenewalDate() {
        return startDate.plusDays(getValidityDays());
    }
    public String getName() { return name; }
}

class BasicPlan extends Subscription {
    public BasicPlan(String name, LocalDate startDate) { super(name, startDate); }
    @Override
    public int getValidityDays() { return 30; }
}

class StandardPlan extends Subscription {
    public StandardPlan(String name, LocalDate startDate) { super(name, startDate); }
    @Override
    public int getValidityDays() { return 90; }
}

class PremiumPlan extends Subscription {
    public PremiumPlan(String name, LocalDate startDate) { super(name, startDate); }
    @Override
    public int getValidityDays() { return 365; }
}

public class StreamingRenewal {
    public static void main(String[] args) {
        Subscription[] subscribers = {
            new BasicPlan("Asha", LocalDate.parse("2024-01-15")),
            new StandardPlan("Ravi", LocalDate.parse("2024-02-01")),
            new PremiumPlan("Neha", LocalDate.parse("2024-03-10")),
            new BasicPlan("Kiran", LocalDate.parse("2024-12-20"))
        };

        for (Subscription sub : subscribers) {
            System.out.println(sub.getName() + ": " + sub.getRenewalDate());
        }
    }
}
