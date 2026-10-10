package week_10.practice_problems;

public class FactorialCalculation {
    public static void calculateFactorial(int n) {
        long factorial = 1; 
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }

    public static void main(String[] args) {
        calculateFactorial(5);
        calculateFactorial(0);
    }
}
