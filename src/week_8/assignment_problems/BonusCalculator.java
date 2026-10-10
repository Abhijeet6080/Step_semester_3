package week_8.assignment_problems;

abstract class Employee {
    protected String name;
    protected double monthlySalary;
    public Employee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }
    public abstract double getBonus();
    public String getName() { return name; }
}

class FullTime extends Employee {
    public FullTime(String name, double monthlySalary) { super(name, monthlySalary); }
    @Override
    public double getBonus() { return monthlySalary * 0.10; }
}

class PartTime extends Employee {
    public PartTime(String name, double monthlySalary) { super(name, monthlySalary); }
    @Override
    public double getBonus() { return monthlySalary * 0.05; }
}

class Intern extends Employee {
    public Intern(String name, double monthlySalary) { super(name, monthlySalary); }
    @Override
    public double getBonus() { return 2000.0; }
}

public class BonusCalculator {
    public static void main(String[] args) {
        Employee[] employees = {
            new FullTime("Asha", 50000),
            new PartTime("Ravi", 30000),
            new Intern("Neha", 15000)
        };

        double grandTotal = 0;
        for (Employee e : employees) {
            double bonus = e.getBonus();
            grandTotal += bonus;
            System.out.printf("%s: %.2f\n", e.getName(), bonus);
        }
        System.out.printf("Total Bonus: %.2f\n", grandTotal);
    }
}
