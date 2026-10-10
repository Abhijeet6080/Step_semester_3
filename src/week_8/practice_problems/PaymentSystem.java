package week_8.practice_problems;

abstract class Payment {
    protected double amount;
    public Payment(double amount) { this.amount = amount; }
    public abstract double getAdjustedAmount();
    public abstract String getType();
}

class CardPayment extends Payment {
    public CardPayment(double amount) { super(amount); }
    @Override
    public double getAdjustedAmount() { return amount + (amount * 0.02); }
    @Override
    public String getType() { return "CARD"; }
}

class WalletPayment extends Payment {
    public WalletPayment(double amount) { super(amount); }
    @Override
    public double getAdjustedAmount() { return amount + (amount * 0.01); }
    @Override
    public String getType() { return "WALLET"; }
}

class BankTransferPayment extends Payment {
    public BankTransferPayment(double amount) { super(amount); }
    @Override
    public double getAdjustedAmount() { return amount; }
    @Override
    public String getType() { return "BANKTRANSFER"; }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Payment[] transactions = {
            new CardPayment(1000),
            new WalletPayment(500),
            new BankTransferPayment(2000)
        };

        double grandTotal = 0;
        for (Payment p : transactions) {
            double adjusted = p.getAdjustedAmount();
            grandTotal += adjusted;
            System.out.printf("%s: %.2f\n", p.getType(), adjusted);
        }
        System.out.printf("Total: %.2f\n", grandTotal);
    }
}
