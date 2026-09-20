import java.util.Arrays;

class q5 implements Comparable<q5> {

    private String name;
    private int matchesPlayed;
    private double battingAverage;
    private boolean injured;

    public q5(String name, int matchesPlayed,
              double battingAverage, boolean injured) {

        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }

    static boolean isDraftable(int matchesPlayed) {

        return matchesPlayed >= 10;
    }

    static boolean isDraftable(int matchesPlayed,
                               boolean injured) {

        return matchesPlayed >= 5 && !injured;
    }

    @Override
    public int compareTo(q5 other) {

        return Double.compare(
            other.battingAverage,
            this.battingAverage
        );
    }

    static String draftAndRank(q5[] players) {

        q5[] draftable = new q5[players.length];

        int count = 0;

        for (q5 player : players) {

            if (isDraftable(player.matchesPlayed) ||
                isDraftable(player.matchesPlayed, player.injured)) {

                draftable[count] = player;
                count++;
            }
        }

        q5[] result = Arrays.copyOf(draftable, count);

        Arrays.sort(result);

        String output = "";

        for (int i = 0; i < result.length; i++) {

            output += (i + 1) + ". " + result[i].name;

            if (i < result.length - 1) {
                output += " | ";
            }
        }

        return output;
    }

    public static void main(String[] args) {

        q5[] players = {
            new q5("Virat", 15, 48.0, false),
            new q5("Rahul", 7, 55.0, false),
            new q5("Sameer", 3, 60.0, false),
            new q5("Dev", 12, 20.0, true)
        };

        System.out.println(draftAndRank(players));
    }
}