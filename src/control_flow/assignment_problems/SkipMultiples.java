package control_flow.assignment_problems;

public class SkipMultiples {
    public void printSkippingMultiplesOfThree() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SkipMultiples printer = new SkipMultiples();
        printer.printSkippingMultiplesOfThree();
    }
}