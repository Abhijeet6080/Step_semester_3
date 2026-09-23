package control_flow.assignment_problems;

public class TrafficSignal {
    public void simulateTrafficSignal(int cycles) {
        for (int i = 0; i < cycles; i++) {
            int state = i % 3;
            switch (state) {
                case 0:
                    System.out.print("Red - Stop ");
                    break;
                case 1:
                    System.out.print("Green - Go ");
                    break;
                case 2:
                    System.out.print("Yellow - Prepare to stop ");
                    break;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TrafficSignal signal = new TrafficSignal();
        System.out.println("Input: cycles = 3");
        signal.simulateTrafficSignal(3);
    }
}