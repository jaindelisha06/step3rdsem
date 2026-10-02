import java.util.*;

class Transport {
    double distance;

    Transport(double distance) {
        this.distance = distance;
    }

    double fare() {
        return 0;
    }
}

class Bus extends Transport {
    Bus(double distance) {
        super(distance);
    }

    double fare() {
        double f = 2 + 0.10 * distance;

        if (f > 10)
            f = 10;

        return f;
    }
}

class Train extends Transport {
    Train(double distance) {
        super(distance);
    }

    double fare() {
        return 3 + 0.15 * distance;
    }
}

class Metro extends Transport {
    double factor;

    Metro(double distance, double factor) {
        super(distance);
        this.factor = factor;
    }

    double fare() {
        return (1.50 + 0.20 * distance) * factor;
    }
}

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            double distance = sc.nextDouble();

            Transport t;

            if (type.equals("BUS")) {
                t = new Bus(distance);
            }
            else if (type.equals("TRAIN")) {
                t = new Train(distance);
            }
            else {
                double factor = sc.nextDouble();
                t = new Metro(distance, factor);
            }

            double result = t.fare();

            System.out.printf("%s: %.2f%n", type, result);
            total += result;
        }

        System.out.printf("Total: %.2f", total);
    }
}
