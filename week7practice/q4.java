class q4 {

    private String combination;
    private final int lockerNumber;

    q4(int lockerNumber, String combination) {

        this.lockerNumber = lockerNumber;
        this.combination = combination;
    }

    void changeCode(String currentCode,
                    String newCode) {

        if (combination.equals(currentCode)) {

            combination = newCode;

            System.out.println("Code changed successfully");

        } else {

            System.out.println("Code change rejected");
        }
    }

    public static void main(String[] args) {

        q4 l = new q4(101, "1234");

        l.changeCode("1234", "5678");

        l.changeCode("0000", "9999");
    }
}