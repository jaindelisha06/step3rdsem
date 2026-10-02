import java.util.*;

class Room {
    double units;

    Room(double units) {
        this.units = units;
    }

    double bill() {
        return 0;
    }
}

class Single extends Room {
    Single(double units) {
        super(units);
    }

    double bill() {
        return units * 8;
    }
}

class Shared extends Room {
    int occupants;

    Shared(double units, int occupants) {
        super(units);
        this.occupants = occupants;
    }

    double bill() {
        return (units * 6) / occupants;
    }
}

class AC extends Room {
    AC(double units) {
        super(units);
    }

    double bill() {
        return units * 10 + 200;
    }
}

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double units = sc.nextDouble();

            Room r;

            if (type.equals("SINGLE")) {
                r = new Single(units);
            }
            else if (type.equals("SHARED")) {
                int occupants = sc.nextInt();
                r = new Shared(units, occupants);
            }
            else {
                r = new AC(units);
            }

            double result = r.bill();

            System.out.printf("%s: %.2f%n", type, result);
            total += result;
        }

        System.out.printf("Total: %.2f", total);
    }
}