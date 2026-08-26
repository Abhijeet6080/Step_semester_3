package control_flow.assigment_problems;

public class VotingEligibilityChecker {

    public void checkVotingEligibility(int age) {
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String[] args) {
        VotingEligibilityChecker checker = new VotingEligibilityChecker();
        checker.checkVotingEligibility(20);
        checker.checkVotingEligibility(16);
    }
}