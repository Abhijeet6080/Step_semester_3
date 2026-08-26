package control_flow.assigment_problems;

public class NaturalNumberSum {

    public void sumOfNaturalNumbers(int n) {
        int sum = 0;
        int counter = 1;
        
        while (counter <= n) {
            sum += counter;
            counter++;
        }
        
        System.out.println("Sum of numbers from 1 to " + n + " = " + sum);
    }

    public static void main(String[] args) {
        NaturalNumberSum sumCalculator = new NaturalNumberSum();
        sumCalculator.sumOfNaturalNumbers(5);
    }
}