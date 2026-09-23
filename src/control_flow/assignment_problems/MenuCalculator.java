package control_flow.assignment_problems;

public class MenuCalculator {
    public void calculate(double a, double b, char operator) {
        switch (operator) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println("Result: " + (a / b));
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }

    public static void main(String[] args) {
        MenuCalculator calc = new MenuCalculator();
        System.out.print("Test 1 (10, 4, '+'): ");
        calc.calculate(10, 4, '+');
        System.out.print("Test 2 (10, 0, '/'): ");
        calc.calculate(10, 0, '/');
        System.out.print("Test 3 (10, 4, '^'): ");
        calc.calculate(10, 4, '^');
    }
}