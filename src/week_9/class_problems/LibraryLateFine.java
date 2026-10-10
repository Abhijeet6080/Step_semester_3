package week_9.class_problems;

abstract class LibraryItem {
    protected String title;
    protected int daysLate;
    public LibraryItem(String title, int daysLate) {
        this.title = title;
        this.daysLate = daysLate;
    }
    public abstract double calculateFine();
    public String getTitle() { return title; }
}

class Book extends LibraryItem {
    public Book(String title, int daysLate) { super(title, daysLate); }
    @Override
    public double calculateFine() { return daysLate * 2.0; }
}

class DVD extends LibraryItem {
    public DVD(String title, int daysLate) { super(title, daysLate); }
    @Override
    public double calculateFine() { return Math.min(50.0, daysLate * 5.0); }
}

class Magazine extends LibraryItem {
    public Magazine(String title, int daysLate) { super(title, daysLate); }
    @Override
    public double calculateFine() { return daysLate * 1.0; }
}

public class LibraryLateFine {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book("Algebra", 4),
            new DVD("Inception", 12),
            new Magazine("Sports", 3)
        };

        double totalFines = 0;
        for (LibraryItem item : items) {
            double fine = item.calculateFine();
            totalFines += fine;
            System.out.printf("%s: %.2f\n", item.getTitle(), fine);
        }
        System.out.printf("Total Fines: %.2f\n", totalFines);
    }
}
