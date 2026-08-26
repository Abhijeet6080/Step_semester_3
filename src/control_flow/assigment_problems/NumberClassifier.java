package control_flow.assigment_problems;

public class NumberClassifier {

    public void classifyNumber(int number) {
        // Use an if / else if / else ladder here to check the number
        // Print "Positive", "Negative", or "Zero"[cite: 3]
        
    }

    public static void main(String[] args) {
        NumberClassifier classifier = new NumberClassifier();
        
        System.out.print("Input number = 15 | Output: ");
        classifier.classifyNumber(15);
        
        System.out.print("Input number = -4 | Output: ");
        classifier.classifyNumber(-4);
        
        System.out.print("Input number = 0 | Output: ");
        classifier.classifyNumber(0);
    }
}
