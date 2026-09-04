import java.util.*;

public class q5 {

    static void printFilteredWordFrequency(String feedback) {

        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};

        feedback = feedback.toLowerCase();

        feedback = feedback.replace(".", "");
        feedback = feedback.replace(",", "");

        String[] words = feedback.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {

            boolean stopWord = false;

            for (int j = 0; j < stopWords.length; j++) {

                if (words[i].equals(stopWords[j])) {
                    stopWord = true;
                    break;
                }
            }

            if (!stopWord) {

                if (map.containsKey(words[i])) {
                    map.put(words[i], map.get(words[i]) + 1);
                }
                else {
                    map.put(words[i], 1);
                }
            }
        }

        ArrayList<Map.Entry<String, Integer>> list =
                new ArrayList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {

                return b.getValue() - a.getValue();
            }
        });

        for (Map.Entry<String, Integer> entry : list) {

            System.out.println(entry.getKey() + ": "
                    + entry.getValue());
        }
    }


    public static void main(String[] args) {

        String feedback =
                "The mentor was great, the session was great and clear.";

        printFilteredWordFrequency(feedback);
    }
}