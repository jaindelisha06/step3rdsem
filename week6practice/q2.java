class q2 {

    private double balance;

    public q2(double balance) {

        if (balance < 0) {

            System.out.println(
                "Warning: Negative balance. Starting at 0."
            );

            this.balance = 0;

        } else {

            this.balance = balance;
        }
    }

    void topUp(double amount) {

        if (amount <= 0) {

            System.out.println("Invalid top-up amount");

        } else {

            balance += amount;

            System.out.println(
                "Balance after top-up: " + balance
            );
        }
    }

    void deduct(double amount) {

        if (amount > balance) {

            System.out.println(
                "Deduct rejected: insufficient balance"
            );

        } else if (amount <= 0) {

            System.out.println(
                "Invalid deduction amount"
            );

        } else {

            balance -= amount;
        }
    }

    double getBalance() {

        return balance;
    }

    public static void main(String[] args) {

        q2 wallet = new q2(500);

        wallet.topUp(200);

        wallet.deduct(1000);

        System.out.println(
            "Final balance: " + wallet.getBalance()
        );
    }
}