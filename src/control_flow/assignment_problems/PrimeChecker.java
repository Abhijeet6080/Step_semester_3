package control_flow.assignment_problems;

public class PrimeChecker {
    public void checkPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime && number > 1) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    public static void main(String[] args) {
        PrimeChecker checker = new PrimeChecker();
        System.out.print("Test 1 (17): ");
        checker.checkPrime(17);
        System.out.print("Test 2 (18): ");
        checker.checkPrime(18);
    }
}