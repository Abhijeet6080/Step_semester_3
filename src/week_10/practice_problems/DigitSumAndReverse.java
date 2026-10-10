package week_10.practice_problems;

public class DigitSumAndReverse {
    public static void processNumber(int number) {
        int sum = 0;
        int reversed = 0;
        
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            reversed = (reversed * 10) + digit;
            number /= 10;
        }
        
        System.out.println("Sum of digits: " + sum);
        System.out.println("Reverse: " + reversed);
    }

    public static void main(String[] args) {
        processNumber(4721);
    }
}
