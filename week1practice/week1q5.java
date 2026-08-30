public class week1q5 {

    static String reverseCustomerName(String customerName) {

        String reverse = "";

        for (int i = customerName.length() - 1; i >= 0; i--) {
            reverse = reverse + customerName.charAt(i);
        }

        return reverse;
    }


    public static void main(String[] args) {

        String name = "Sunil";

        String reversed = reverseCustomerName(name);

        System.out.println("Original Name: " + name);
        System.out.println("Reversed Name: " + reversed);
    }
}