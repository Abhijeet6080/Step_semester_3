package control_flow.assigment_problems;

public class NumberClassifier {

    public void classifyNumber(int number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {
        NumberClassifier classifier = new NumberClassifier();
        classifier.classifyNumber(15);
        classifier.classifyNumber(-4);
        classifier.classifyNumber(0);
    }
}