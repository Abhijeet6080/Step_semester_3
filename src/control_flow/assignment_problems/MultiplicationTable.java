package control_flow.assignment_problems;

public class MultiplicationTable {
    public void generateFirstValidTable(int[] candidates) {
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i] < 1) {
                System.out.println("Skipping invalid number: " + candidates[i]);
                continue;
            }
            
            for (int j = 1; j <= 10; j++) {
                System.out.print(candidates[i] + " x " + j + " = " + (candidates[i] * j) + " ");
            }
            System.out.println();
            break;
        }
    }

    public static void main(String[] args) {
        MultiplicationTable table = new MultiplicationTable();
        int[] candidates = {-3, 0, 7, 9};
        System.out.println("Input: {-3, 0, 7, 9}");
        table.generateFirstValidTable(candidates);
    }
}