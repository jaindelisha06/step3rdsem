class q3 {

    private final String password;

    q3(String password) {

        this.password = password;
    }

    String getStrength() {

        if (password.length() < 6) {
            return "Weak";
        }
        else if (password.length() <= 9) {
            return "Medium";
        }
        else {
            return "Strong";
        }
    }

    public static void main(String[] args) {

        q3 pc = new q3("abcd");

        System.out.println(pc.getStrength());

        q3 pc2 = new q3("abcdefghij");

        System.out.println(pc2.getStrength());
    }
}