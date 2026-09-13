package classes_and_objects.assignment_problems;

public class PlacementRecord {
    // Instance fields
    String studentName;
    String company;
    double packageLpa;

    // Constructor to set all three fields
    public PlacementRecord(String studentName, String company, double packageLpa) {
        this.studentName = studentName;
        this.company = company;
        this.packageLpa = packageLpa;
    }

    // Instance method to print the formatted line
    public void printRecord() {
        System.out.println(studentName + " -> " + company + " @ " + packageLpa + " LPA");
    }

    public static void main(String[] args) {
        // Create an array to store PlacementRecord objects
        PlacementRecord[] records = new PlacementRecord[3];

        // Create three objects and store them in the array
        records[0] = new PlacementRecord("Ravi", "TCS", 4.5);
        records[1] = new PlacementRecord("Anitha", "Zoho", 6.2);
        records[2] = new PlacementRecord("Karthik", "Infosys", 4.0);

        // Print each record using a loop
        for (int i = 0; i < records.length; i++) {
            records[i].printRecord();
        }
    }
}