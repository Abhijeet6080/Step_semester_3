package control_flow.assignment_problems;

public class NumberPyramid {
    public void printNumberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NumberPyramid pyramid = new NumberPyramid();
        System.out.println("Input: n = 4");
        pyramid.printNumberPyramid(4);
    }
}