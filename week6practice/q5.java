class q5 {

    String name;
    double attendance;

    static String collegeName =
        "SRM Institute of Science and Technology";

    static int studentCount = 0;

    q5(String name, double attendance) {

        this.name = name;
        this.attendance = attendance;

        studentCount++;
    }

    static void printCollegeInfo() {

        System.out.println(collegeName);

        System.out.println(
            "Students created: " + studentCount
        );
    }

    public static void main(String[] args) {

        q5 s1 = new q5("A", 90);
        q5 s2 = new q5("B", 85);

        System.out.println("2 Student objects created");

        q5.printCollegeInfo();
    }
}