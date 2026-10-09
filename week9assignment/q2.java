import java.util.*;

abstract class Parcel {
    double weight, value;

    Parcel(double w, double v) {
        weight = w;
        value = v;
    }

    abstract double charge();
}

interface Insurable {
    double insurance();
}

class Standard extends Parcel {
    Standard(double w, double v) {
        super(w, v);
    }

    double charge() {
        return 40 + 10 * weight;
    }
}

class Express extends Parcel implements Insurable {
    Express(double w, double v) {
        super(w, v);
    }

    double charge() {
        return 80 + 15 * weight;
    }

    public double insurance() {
        return value * 0.02;
    }
}

class Fragile extends Parcel implements Insurable {
    Fragile(double w, double v) {
        super(w, v);
    }

    double charge() {
        return 40 + 10 * weight + 50;
    }

    public double insurance() {
        return value * 0.02;
    }
}

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double grand = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double w = sc.nextDouble();
            double v = sc.nextDouble();

            Parcel p;
            double ins = 0;

            if (type.equals("STANDARD"))
                p = new Standard(w, v);
            else if (type.equals("EXPRESS")) {
                Express e = new Express(w, v);
                p = e;
                ins = e.insurance();
            } else {
                Fragile f = new Fragile(w, v);
                p = f;
                ins = f.insurance();
            }

            double total = p.charge() + ins;

            System.out.printf(
                "%s: Charge=%.2f Insurance=%.2f Total=%.2f%n",
                type, p.charge(), ins, total
            );

            grand += total;
        }

        System.out.printf("Grand Total: %.2f%n", grand);
    }
}