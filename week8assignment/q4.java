import java.util.*;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double bonus() {
        return 0;
    }
}

class FullTime extends Employee {
    FullTime(String name, double salary) {
        super(name, salary);
    }

    double bonus() {
        return salary * 0.10;
    }
}

class PartTime extends Employee {
    PartTime(String name, double salary) {
        super(name, salary);
    }

    double bonus() {
        return salary * 0.05;
    }
}

class Intern extends Employee {
    Intern(String name, double salary) {
        super(name, salary);
    }

    double bonus() {
        return 2000;
    }
}

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            double salary = sc.nextDouble();

            Employee e;

            if (type.equals("FULLTIME"))
                e = new FullTime(name, salary);
            else if (type.equals("PARTTIME"))
                e = new PartTime(name, salary);
            else
                e = new Intern(name, salary);

            double result = e.bonus();

            System.out.printf("%s: %.2f%n", name, result);
            total += result;
        }

        System.out.printf("Total Bonus: %.2f", total);
    }
}
