import java.util.*;

abstract class Travel {
    double distance;
    static final int fee = 50;

    Travel(double d) {
        distance = d;
    }

    abstract double fare();

    double total() {
        return fare() + fee;
    }
}

class Bus extends Travel {
    Bus(double d) {
        super(d);
    }

    double fare() {
        return distance * 2;
    }
}

class Train extends Travel {
    Train(double d) {
        super(d);
    }

    double fare() {
        return distance * 1.5;
    }
}

class Flight extends Travel {
    Flight(double d) {
        super(d);
    }

    double fare() {
        return 2500 + distance * 4;
    }
}

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double distance = sc.nextDouble();

            Travel t;

            if (type.equals("BUS"))
                t = new Bus(distance);
            else if (type.equals("TRAIN"))
                t = new Train(distance);
            else
                t = new Flight(distance);

            System.out.printf("%s: %.2f%n", type, t.total());
        }
    }
}