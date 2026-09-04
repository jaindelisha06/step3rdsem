public class q4 {

    static void analyzeInventory(int[] sectionA, int[] sectionB) {

        int totalA = 0;
        int totalB = 0;

        
        for (int i = 0; i < sectionA.length; i++) {
            totalA = totalA + sectionA[i];
        }

        
        for (int i = 0; i < sectionB.length; i++) {
            totalB = totalB + sectionB[i];
        }

        
        int highest = sectionA[0];
        int section = 1;
        int index = 0;

        for (int i = 0; i < sectionA.length; i++) {
            if (sectionA[i] > highest) {
                highest = sectionA[i];
                section = 1;
                index = i;
            }
        }

        for (int i = 0; i < sectionB.length; i++) {
            if (sectionB[i] > highest) {
                highest = sectionB[i];
                section = 2;
                index = i;
            }
        }

        // Check balanced or not
        String status;

        if (totalA == totalB) {
            status = "Balanced";
        } else {
            status = "Not Balanced";
        }

        System.out.println("Section A Total: " + totalA
                + " | Section B Total: " + totalB
                + " | Status: " + status);

        System.out.println("Highest Quantity: " + highest
                + " (Section " + (section == 1 ? "A" : "B")
                + ", Item " + (index + 1) + ")");
    }

    public static void main(String[] args) {

        int[] sectionA = {20, 15, 30};
        int[] sectionB = {25, 10, 30};

        analyzeInventory(sectionA, sectionB);
    }
}
