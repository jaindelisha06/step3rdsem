import java.util.Arrays;

class q5 implements Comparable<q5> {

    private String name;
    private double cgpa;
    private int codingScore;

    public q5(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
    }

    static boolean isEligible(double cgpa) {
        return cgpa >= 7.5;
    }

    static boolean isEligible(double cgpa, int codingScore) {
        return cgpa >= 6.0 && codingScore >= 60;
    }

    @Override
    public int compareTo(q5 other) {
        double thisScore = cgpa * 10 + codingScore;
        double otherScore = other.cgpa * 10 + other.codingScore;

        return Double.compare(otherScore, thisScore);
    }

    static String shortlistAndRank(q5[] candidates) {

        q5[] shortlisted = new q5[candidates.length];
        int count = 0;

        for (q5 c : candidates) {

            if (isEligible(c.cgpa) ||
                isEligible(c.cgpa, c.codingScore)) {

                shortlisted[count] = c;
                count++;
            }
        }

        q5[] result = Arrays.copyOf(shortlisted, count);

        Arrays.sort(result);

        String output = "";

        for (int i = 0; i < result.length; i++) {

            double score = result[i].cgpa * 10
                         + result[i].codingScore;

            output += (i + 1) + ". "
                    + result[i].name
                    + " (" + score + ")";

            if (i < result.length - 1) {
                output += " | ";
            }
        }

        return output;
    }

    public static void main(String[] args) {

        q5[] candidates = {
            new q5("Aisha", 8.2, 40),
            new q5("Rohit", 6.8, 65),
            new q5("Meena", 6.0, 90),
            new q5("Karan", 7.5, 20)
        };

        System.out.println(shortlistAndRank(candidates));
    }
}