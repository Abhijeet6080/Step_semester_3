package week_9.assignment_problems;

interface BusUser {
    double TRANSPORT_FEE = 12000.0;
}

abstract class Student {
    protected String name;
    public Student(String name) { this.name = name; }
    public abstract double getTuition();
    public String getName() { return name; }
}

class DayScholar extends Student implements BusUser {
    public DayScholar(String name) { super(name); }
    @Override
    public double getTuition() { return 40000.0; }
}

class Hosteller extends Student {
    public Hosteller(String name) { super(name); }
    @Override
    public double getTuition() { return 40000.0 + 60000.0; }
}

class Scholar extends Student implements BusUser {
    public Scholar(String name) { super(name); }
    @Override
    public double getTuition() { return 20000.0; }
}

public class CollegeFeeCounter {
    public static void main(String[] args) {
        Student[] students = {
            new DayScholar("Asha"),
            new Hosteller("Ravi"),
            new Scholar("Neha")
        };

        double totalCollected = 0;
        for (Student s : students) {
            double fee = s.getTuition();
            if (s instanceof BusUser) {
                fee += BusUser.TRANSPORT_FEE;
            }
            totalCollected += fee;
            System.out.printf("%s: %.2f\n", s.getName(), fee);
        }
        System.out.printf("Total Collected: %.2f\n", totalCollected);
    }
}
