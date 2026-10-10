package week_8.practice_problems;
import java.time.LocalDate;

abstract class LibraryItem {
    protected String title;
    public LibraryItem(String title) { this.title = title; }
    public abstract int getDaysToBorrow();
    
    public LocalDate getDueDate(LocalDate checkoutDate) {
        return checkoutDate.plusDays(getDaysToBorrow());
    }
    public String getTitle() { return title; }
}

class Book extends LibraryItem {
    public Book(String title) { super(title); }
    @Override
    public int getDaysToBorrow() { return 14; }
}

class DVD extends LibraryItem {
    public DVD(String title) { super(title); }
    @Override
    public int getDaysToBorrow() { return 7; }
}

class Magazine extends LibraryItem {
    public Magazine(String title) { super(title); }
    @Override
    public int getDaysToBorrow() { return 3; }
}

public class LibraryCalculator {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book("1984"),
            new DVD("The Matrix"),
            new Magazine("Forbes Issue 500")
        };

        LocalDate currentDate = LocalDate.of(2023, 10, 26);
        for (LibraryItem item : items) {
            System.out.println(item.getTitle() + ": " + item.getDueDate(currentDate));
        }
    }
}