import java.util.*;

class Delivery {
    double weight, distance, customs;

    Delivery(double weight, double distance, double customs) {
        this.weight = weight;
        this.distance = distance;
        this.customs = customs;
    }

    double fee() {
        return 0;
    }
}

class Standard extends Delivery {
    Standard(double w, double d) {
        super(w, d, 0);
    }

    double fee() {
        return 5 + 0.5 * weight + 0.1 * distance;
    }
}

class Express extends Delivery {
    Express(double w, double d) {
        super(w, d, 0);
    }

    double fee() {
        return 15 + weight + 0.2 * distance;
    }
}

class International extends Delivery {
    International(double w, double d, double c) {
        super(w, d, c);
    }

    double fee() {
        return 25 + 2 * weight + 0.5 * distance + customs;
    }
}

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();

            double weight = sc.nextDouble();
            double distance = sc.nextDouble();

            Delivery d;

            if (type.equals("STANDARD")) {
                d = new Standard(weight, distance);
            } 
            else if (type.equals("EXPRESS")) {
                d = new Express(weight, distance);
            } 
            else {
                double customs = sc.nextDouble();
                d = new International(weight, distance, customs);
            }

            double result = d.fee();

            System.out.printf("%s: %.2f%n", type, result);
            total += result;
        }

        System.out.printf("Total: %.2f", total);
    }
}