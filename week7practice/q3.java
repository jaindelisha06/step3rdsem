class q3 {

    private final String firstName;
    private final String lastName;

    q3(String fullName) {

        String[] parts = fullName.split(" ");

        firstName = parts[0];
        lastName = parts[1];
    }

    String getNickname() {

        return firstName + " "
             + lastName.charAt(0) + ".";
    }

    public static void main(String[] args) {

        q3 tag = new q3("Maria Gomez");

        System.out.println(
            tag.getNickname()
        );
    }
}