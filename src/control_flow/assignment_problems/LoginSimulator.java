package control_flow.assignment_problems;

public class LoginSimulator {
    public void simulateLogin(String correctCode, String[] attempts) {
        boolean granted = false;
        for (int i = 0; i < attempts.length; i++) {
            if (attempts[i].equals(correctCode)) {
                System.out.println("Access granted on attempt " + (i + 1));
                granted = true;
                break;
            }
        }
        if (!granted) {
            System.out.println("Access denied all attempts used");
        }
    }

    public static void main(String[] args) {
        LoginSimulator simulator = new LoginSimulator();
        System.out.println("Test 1:");
        simulator.simulateLogin("1234", new String[]{"0000", "1234", "9999"});
        System.out.println("Test 2:");
        simulator.simulateLogin("1234", new String[]{"1111", "2222", "3333"});
    }
}