package control_flow.assigment_problems;

public class AtmPinRetrySystem {

    public void atmPinRetry(String correctPin, String[] attempts) {
        int attempt = 0;
        boolean success = false;

        while (attempt < 3 && success == false) {
            if (attempt < attempts.length && attempts[attempt].equals(correctPin)) {
                success = true;
                System.out.println("PIN accepted");
                break;
            }
            attempt++;
        }

        if (success == false) {
            System.out.println("Card blocked — too many incorrect attempts");
        }
    }

    public static void main(String[] args) {
        AtmPinRetrySystem atm = new AtmPinRetrySystem();

        System.out.println("--- Test 1 ---");
        String[] attempts1 = {"1111", "4821"};
        atm.atmPinRetry("4821", attempts1);

        System.out.println("\n--- Test 2 ---");
        String[] attempts2 = {"1111", "2222", "3333"};
        atm.atmPinRetry("4821", attempts2);
    }
}