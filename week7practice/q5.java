class q5 {

    private String[] students;
    private int presentCount;

    q5(int maxStudents) {

        students = new String[maxStudents];
        presentCount = 0;
    }

    void markPresent(String name) {

        if (isPresent(name)) {
            return;
        }

        if (presentCount < students.length) {

            students[presentCount] = name;
            presentCount++;
        }
    }

    int getPresentCount() {

        return presentCount;
    }

    boolean isPresent(String name) {

        for (int i = 0; i < presentCount; i++) {

            if (students[i].equals(name)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        q5 sheet = new q5(30);

        sheet.markPresent("Ana");
        sheet.markPresent("Ben");
        sheet.markPresent("Ana");

        System.out.println(
            "Present count: " +
            sheet.getPresentCount()
        );

        System.out.println(
            "Ben present: " +
            sheet.isPresent("Ben")
        );

        System.out.println(
            "Chen present: " +
            sheet.isPresent("Chen")
        );
    }
}