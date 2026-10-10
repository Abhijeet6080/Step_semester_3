package encapsulation.assignment_problems;

public class Cart {
    private final String cartId;
    private double[] prices;
    private int count;

    public Cart(String cartId, int capacity) {
        this.cartId = cartId;
        this.prices = new double[capacity];
        this.count = 0;
    }

    public void addItem(double price) {
        if (count < prices.length) {
            prices[count] = price;
            count++;
        }
    }

    public double getTotal() {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += prices[i];
        }
        return sum;
    }

    public int getItemCount() {
        return this.count;
    }

    // Added this getter to use the cartId field!
    public String getCartId() {
        return this.cartId;
    }

    public static void main(String[] args) {
        Cart cart = new Cart("CART-5", 20);
        
        // Now we are actually using the ID
        System.out.println("Cart ID: " + cart.getCartId());
        
        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);
        
        System.out.println("cart.getTotal() -> " + (int)cart.getTotal());
        System.out.println("cart.getItemCount() -> " + cart.getItemCount());
    }
}