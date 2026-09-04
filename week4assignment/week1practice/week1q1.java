import java.util.Scanner;

public class week1q1 {

    static String playRound(String player, String computer) {

        if (player.equals(computer)) {
            return "Draw";
        }

        if ((player.equals("Rock") && computer.equals("Scissors")) ||
            (player.equals("Paper") && computer.equals("Rock")) ||
            (player.equals("Scissors") && computer.equals("Paper"))) {
            return "Player Wins";
        }

        return "Computer Wins";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int wins = 0, losses = 0, draws = 0;

        String[] players = new String[5];
        String[] computers = new String[5];
        String[] results = new String[5];

        String[] moves = {"Rock", "Paper", "Scissors"};

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter Rock, Paper or Scissors: ");
            players[i] = sc.next();

            int random = (int)(Math.random() * 3);
            computers[i] = moves[random];

            results[i] = playRound(players[i], computers[i]);
            if (results[i].equals("Player Wins"))
                wins++;
            else if (results[i].equals("Computer Wins"))
                losses++;
            else
                draws++;
        }

        System.out.println("\nRound | Player | Computer | Result");

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + " | " + players[i] + " | "
                    + computers[i] + " | " + results[i]);
        }

        double winPercent = (wins * 100.0) / 5;

        System.out.println("\nWins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        System.out.println("Win Percentage: " + winPercent + "%");
    }
}