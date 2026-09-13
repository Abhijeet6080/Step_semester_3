package classes_and_objects.assignment_problems;

public class Course {
    String code;
    String title;
    int credits;
    int labCredits;

    // Four-argument constructor
    public Course(String code, String title, int credits, int labCredits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.labCredits = labCredits;
    }

    // Three-argument constructor for theory-only courses
    public Course(String code, String title, int credits) {
        this(code, title, credits, 0); // Chains to the 4-arg constructor
    }

    public int totalCredits() {
        return credits + labCredits;
    }

    public static void main(String[] args) {
        Course theoryOnly = new Course("21CSC201J", "Data Structures", 4);
        System.out.println(theoryOnly.code + " total credits: " + theoryOnly.totalCredits());

        Course withLab = new Course("21CSC205L", "DSA Lab", 3, 1);
        System.out.println(withLab.code + " total credits: " + withLab.totalCredits());
    }
}