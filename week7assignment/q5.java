class q5 {

    private double[] prices;
    private int itemCount;
    private final String cartId;

    q5(String cartId, int maxItems) {

        this.cartId = cartId;
        prices = new double[maxItems];
        itemCount = 0;
    }

    void addItem(double price) {

        if (itemCount < prices.length) {

            prices[itemCount] = price;
            itemCount++;
        }
    }

    double getTotal() {

        double total = 0;

        for (int i = 0; i < itemCount; i++) {

            total += prices[i];
        }

        return total;
    }

    int getItemCount() {

        return itemCount;
    }

    public static void main(String[] args) {

        q5 cart = new q5("CART-5", 20);

        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);

        System.out.println(
            "Total: " + cart.getTotal()
        );

        System.out.println(
            "Item count: " + cart.getItemCount()
        );
    }
}