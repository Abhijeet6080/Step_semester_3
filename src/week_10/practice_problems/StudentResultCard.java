package week_10.practice_problems;

class Student {
    private String name;
    private int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public double getAverage() {
        double sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

    public String getGrade() {
        double avg = getAverage();
        if (avg >= 75) return "B";
        if (avg >= 60) return "C"; 
        if (avg >= 40) return "D";
        return "F";
    }

    public void printCard() {
        System.out.printf("%s: Average %.1f, Grade %s\n", 
            name.toUpperCase(), getAverage(), getGrade());
    }
}

public class StudentResultCard {
    public static void main(String[] args) {
        Student s1 = new Student("Asha", new int[]{80, 90, 70});
        s1.printCard();
        
        Student s2 = new Student("Ravi", new int[]{60, 55, 50});
        s2.printCard();
    }
}
