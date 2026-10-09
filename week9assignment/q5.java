import java.util.*;

abstract class Appliance {
    double hours;

    Appliance(double h) {
        hours = h;
    }

    abstract double power();

    double units() {
        return power() * hours / 1000;
    }

    double cost() {
        return units() * 8;
    }
}

interface Saver {
    double savedUnits();
    double savedCost();
}

class Fridge extends Appliance {
    Fridge(double h) {
        super(h);
    }

    double power() {
        return 150;
    }
}

class AC extends Appliance implements Saver {
    AC(double h) {
        super(h);
    }

    double power() {
        return 1500;
    }

    public double savedUnits() {
        return units() * 0.75;
    }

    public double savedCost() {
        return savedUnits() * 8;
    }
}

class TV extends Appliance {
    TV(double h) {
        super(h);
    }

    double power() {
        return 100;
    }
}

class Washer extends Appliance implements Saver {
    Washer(double h) {
        super(h);
    }

    double power() {
        return 500;
    }

    public double savedUnits() {
        return units() * 0.75;
    }

    public double savedCost() {
        return savedUnits() * 8;
    }
}

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double h = sc.nextDouble();
            boolean saver = sc.hasNext("SAVER");

            if (saver)
                sc.next();

            Appliance a;

            if (type.equals("FRIDGE"))
                a = new Fridge(h);
            else if (type.equals("AC"))
                a = new AC(h);
            else if (type.equals("TV"))
                a = new TV(h);
            else
                a = new Washer(h);

            if (saver && !(a instanceof Saver)) {
                System.out.println(type + ": saver mode not supported");
                continue;
            }

            double u, c;

            if (saver) {
                Saver s = (Saver) a;
                u = s.savedUnits();
                c = s.savedCost();
            } else {
                u = a.units();
                c = a.cost();
            }

            System.out.printf(
                "%s: Units=%.2f Cost=%.2f%n", type, u, c
            );

            total += c;
        }

        System.out.printf("Total Cost: %.2f%n", total);
    }
}