class q3 {

    String empId;
    String empName;
    double salary;
    boolean isIntern;

    public q3(String empId, String empName, double salary) {

        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }

    public q3(String empId, String empName) {

        this(empId, empName, 0);

        this.isIntern = true;
    }

    void printProfile() {

        System.out.println(
            empId + " | " +
            empName + " | Rs " +
            salary + " | Intern: " +
            isIntern
        );
    }

    public static void main(String[] args) {

        q3 permanent =
            new q3("E-101", "Divya", 65000);

        q3 intern =
            new q3("E-102", "Arjun");

        permanent.printProfile();
        intern.printProfile();
    }
}