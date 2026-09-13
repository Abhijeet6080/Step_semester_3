package classes_and_objects.assignment_problems;

public class MessWallet {
    private double balance; // Read-only from outside

    public MessWallet(double openingBalance) {
        if (openingBalance < 0) {
            System.out.println("Warning: Opening balance cannot be negative. Setting to 0.");
            this.balance = 0;
        } else {
            this.balance = openingBalance;
        }
    }

    public void topUp(double amount) {
        if (amount <= 0) {
            System.out.println("Top-up rejected: Amount must be greater than 0");
        } else {
            this.balance += amount;
            System.out.println("Balance after top-up: " + this.balance);
        }
    }

    public void deduct(double amount) {
        if (amount > this.balance) {
            System.out.println("Deduct rejected: insufficient balance");
        } else {
            this.balance -= amount;
            System.out.println("Final balance: " + this.balance);
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public static void main(String[] args) {
        System.out.println("opening = 500");
        MessWallet wallet = new MessWallet(500);
        
        System.out.println("\ntopUp (200)");
        wallet.topUp(200);
        
        System.out.println("\ndeduct (1000)");
        wallet.deduct(1000);
    }
}