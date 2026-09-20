class q4 {

    private String color;
    private final String id;

    q4(String id) {

        this.id = id;
        this.color = "RED";
    }

    void next() {

        if (color.equals("RED")) {

            color = "GREEN";

        } else if (color.equals("GREEN")) {

            color = "YELLOW";

        } else {

            color = "RED";
        }
    }

    String getColor() {

        return color;
    }

    public static void main(String[] args) {

        q4 t = new q4("TL-9");

        System.out.println(t.getColor());

        t.next();
        System.out.println(t.getColor());

        t.next();
        System.out.println(t.getColor());

        t.next();
        System.out.println(t.getColor());
    }
}