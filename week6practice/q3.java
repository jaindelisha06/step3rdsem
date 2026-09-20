class q3 {

    String code;
    String title;
    int credits;
    int labCredits;

    public q3(String code, String title,
              int credits, int labCredits) {

        this.code = code;
        this.title = title;
        this.credits = credits;
        this.labCredits = labCredits;
    }

    public q3(String code, String title, int credits) {

        this(code, title, credits, 0);
    }

    int totalCredits() {

        return credits + labCredits;
    }

    public static void main(String[] args) {

        q3 theory =
            new q3(
                "21CSC201J",
                "Data Structures",
                4
            );

        q3 lab =
            new q3(
                "21CSC205L",
                "DSA Lab",
                3,
                1
            );

        System.out.println(
            theory.code +
            " total credits: " +
            theory.totalCredits()
        );

        System.out.println(
            lab.code +
            " total credits: " +
            lab.totalCredits()
        );
    }
}
