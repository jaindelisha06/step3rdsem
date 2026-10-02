import java.util.*;

class Question {
    String correct, student;
    double points;

    Question(String correct, String student, double points) {
        this.correct = correct;
        this.student = student;
        this.points = points;
    }

    double grade() {
        return 0;
    }
}

class MCQ extends Question {
    MCQ(String c, String s, double p) {
        super(c, s, p);
    }

    double grade() {
        if (student.equals(correct))
            return points;
        return 0;
    }
}

class TF extends Question {
    TF(String c, String s, double p) {
        super(c, s, p);
    }

    double grade() {
        if (student.equals(correct))
            return points;
        return 0;
    }
}

class Essay extends Question {
    Essay(String c, String s, double p) {
        super(c, s, p);
    }

    double grade() {
        String[] keywords = correct.split(",");
        int count = 0;

        for (String word : keywords) {
            if (student.toLowerCase().contains(word.trim().toLowerCase())) {
                count++;
            }
        }

        if (count >= 2)
            return points * 0.75;
        else if (count == 1)
            return points * 0.50;
        else
            return 0;
    }
}

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        double total = 0;

        for (int i = 0; i < n; i++) {

            String line = sc.nextLine();
            String[] a = line.split("\"");

            String type = a[0].trim();
            String correct = a[3];
            String student = a[5];
            double points = Double.parseDouble(a[6].trim());

            Question q;

            if (type.equals("MCQ"))
                q = new MCQ(correct, student, points);
            else if (type.equals("TF"))
                q = new TF(correct, student, points);
            else
                q = new Essay(correct, student, points);

            double score = q.grade();

            System.out.printf("%s: %.2f%n", type, score);
            total += score;
        }

        System.out.printf("Total Score: %.2f", total);
    }
}