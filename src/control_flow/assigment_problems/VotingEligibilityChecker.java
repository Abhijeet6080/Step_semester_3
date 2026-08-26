package control_flow.assigment_problems;

public class VotingEligibilityChecker {

    public void checkVotingEligibility(int age) {
        // Build your boolean expression here
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String[] args) {
        VotingEligibilityChecker checker = new VotingEligibilityChecker();
        
        // Sample Input 1
        System.out.print("Input age = 20 | Output: ");
        checker.checkVotingEligibility(20);
        
        // Sample Input 2
        System.out.print("Input age = 16 | Output: ");
        checker.checkVotingEligibility(16);
    }
}