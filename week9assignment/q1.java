import java.util.*;

abstract class Ticket {
    static final int fee = 20;
    abstract int price();
}

class Regular extends Ticket {
    int price() {
        return 150;
    }
}

class Premium extends Ticket {
    int price() {
        return 250;
    }
}

class Recliner extends Ticket {
    int price() {
        return 400;
    }
}

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String seat = sc.next();
            int count = sc.nextInt();
            Ticket t;

            if (seat.equals("REGULAR"))
                t = new Regular();
            else if (seat.equals("PREMIUM"))
                t = new Premium();
            else
                t = new Recliner();

            double amount = (t.price() + Ticket.fee) * count;
            System.out.printf("%s: %.2f%n", seat, amount);
            total += amount;
        }

        System.out.printf("Total: %.2f%n", total);
    }
}