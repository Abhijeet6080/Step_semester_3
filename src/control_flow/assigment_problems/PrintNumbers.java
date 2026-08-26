package control_flow.assigment_problems;

public class PrintNumbers {

    public void printNumbersUpToN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        PrintNumbers printer = new PrintNumbers();
        printer.printNumbersUpToN(5);
    }
}