package classes_and_objects.assignment_problems;

public class Student {
    String name;
    int attendance;
    
    // Shared static fields
    static String collegeName = "SRM Institute of Science and Technology";
    static int studentCount = 0;

    public Student(String name, int attendance) {
        this.name = name;
        this.attendance = attendance;
        studentCount++; // Increment count every time a new student is created
    }

    // Static method: can only access static fields
    public static void printCollegeInfo() {
        System.out.println(collegeName);
        System.out.println("Students created: " + studentCount);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 85);
        Student s2 = new Student("Bob", 92);
        
        // Now we are actually using s1 and s2!
        System.out.println("Created students: " + s1.name + " and " + s2.name);
        System.out.println("---");
        
        System.out.println("2 Student objects created");
        // Calling a static method through the Class name, not the object
        Student.printCollegeInfo(); 
    }
}