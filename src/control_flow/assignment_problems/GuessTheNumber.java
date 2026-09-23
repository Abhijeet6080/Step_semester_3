package control_flow.assignment_problems;

public class GuessTheNumber {
    public void guessTheNumber(int secretNumber, int maxTries, int[] guesses) {
        int tryCount = 0;
        boolean guessed = false;

        while (tryCount < maxTries && tryCount < guesses.length && !guessed) {
            int currentGuess = guesses[tryCount];
            if (currentGuess > secretNumber) {
                System.out.print("Too high ");
            } else if (currentGuess < secretNumber) {
                System.out.print("Too low ");
            } else {
                System.out.print("Correct! You guessed it");
                guessed = true;
                break;
            }
            tryCount++;
        }

        if (!guessed) {
            System.out.print("Out of tries the number was " + secretNumber);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        GuessTheNumber game = new GuessTheNumber();
        
        System.out.println("Test 1:");
        int[] guesses1 = {20, 60, 42};
        game.guessTheNumber(42, 4, guesses1);

        System.out.println("\nTest 2:");
        int[] guesses2 = {10, 15};
        game.guessTheNumber(42, 2, guesses2);
    }
}