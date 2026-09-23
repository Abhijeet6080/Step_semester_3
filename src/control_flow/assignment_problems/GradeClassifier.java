package control_flow.assignment_problems;

public class GradeClassifier {
    public void classifyWithAttendance(int marks, int attendance) {
        if (attendance >= 75 && marks >= 40) {
            if (marks >= 90) {
                System.out.println("Grade: A");
            } else if (marks >= 75) {
                System.out.println("Grade: B");
            } else if (marks >= 50) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: D");
            }
        } else {
            System.out.println("Detained");
        }
    }

    public static void main(String[] args) {
        GradeClassifier classifier = new GradeClassifier();
        System.out.print("Test 1 (82, 80): ");
        classifier.classifyWithAttendance(82, 80);
        System.out.print("Test 2 (91, 60): ");
        classifier.classifyWithAttendance(91, 60);
    }
}